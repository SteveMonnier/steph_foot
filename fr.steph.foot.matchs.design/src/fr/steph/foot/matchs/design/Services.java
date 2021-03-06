package fr.steph.foot.matchs.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Lists;

import fr.steph.foot.matchs.AbstractEnd;
import fr.steph.foot.matchs.Action;
import fr.steph.foot.matchs.ActionEnd;
import fr.steph.foot.matchs.But;
import fr.steph.foot.matchs.ButEnd;
import fr.steph.foot.matchs.Joueur;
import fr.steph.foot.matchs.Match;
import fr.steph.foot.matchs.Participant;
import fr.steph.foot.matchs.Possession;
import fr.steph.foot.matchs.PossessionEnd;
import fr.steph.foot.matchs.Saison;

/**
 * The services class used by VSM.
 */
public class Services {

    /**
     * Helper class to keep track of who "contains" who depending on the
     * interleaving of the start/finish ends.
     * 
     * @author pcdavid
     * @see InteractionOrderingServices#computeContainmentStructure(Participant)
     */
    private static final class EventContext {
        private final EObject parent;

        private final boolean start;

        private final EObject element;

        private final int level;

        public EventContext(EObject parent, EObject element, boolean start, int level) {
            this.parent = parent;
            this.element = element;
            this.level = level;
            this.start = start;
        }

        public boolean isStart() {
            return start;
        }

        public EObject getParent() {
            return parent;
        }

        public EObject getElement() {
            return element;
        }

        public int getLevel() {
            return level;
        }

        @Override
        public String toString() {
            return String.format("%02d\t%s\t%s", getLevel(), element, parent);
        }
    }

    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }

    /**
     * Returns the semantic element corresponding to the source of a message.
     * This can be a participant or an execution.
     * 
     * @param msg
     *            the message.
     * @return the semantic elements corresponding to the source of the message.
     */
    public EObject getSendingContext(Action msg) {
        ActionEnd sendingEnd = msg.getSendingEnd();
        if (sendingEnd != null) {
            Participant p = sendingEnd.getContext();
            List<EventContext> structure = computeContainmentStructure(p);
            for (EventContext ec : structure) {
                if (ec.getElement().equals(msg) && ec.isStart()) {
                    EObject parent = ec.getParent();
                    if (parent != null) {
                        return parent;
                    } else {
                        return p;
                    }
                }
            }
        }
        return msg;
    }

    /**
     * Returns the semantic element corresponding to the target of a message.
     * This can be a participant, execution or an instance role.
     * 
     * @param msg
     *            the message.
     * @return the semantic elements corresponding to the target of the message.
     */
    public EObject getReceivingContext(Action msg) {
        ActionEnd receivingEnd = msg.getReceivingEnd();
        if (receivingEnd != null) {
            Participant p = receivingEnd.getContext();
            if (p != null) {
                List<EventContext> structure = computeContainmentStructure(p);
                for (EventContext ec : structure) {
                    if (ec.getElement().equals(msg) && !ec.isStart()) {
                        EObject parent = ec.getParent();
                        if (parent != null) {
                            return parent;
                        } else {
                            return p;
                        }
                    }
                }
            }
        }
        return msg;
    }

    public List<EventContext> computeContainmentStructure(Participant owner) {
        if (owner == null || !(owner.eContainer() instanceof Match)) {
            return Collections.emptyList();
        } else {
        	Match interaction = (Match) owner.eContainer();
            Stack<EObject> ancestors = new Stack<EObject>();
            ancestors.push(owner);
            List<EventContext> result = new ArrayList<EventContext>();
            for (fr.steph.foot.matchs.AbstractEnd end : interaction.getEnds()) {
                if (end.getContext() != owner) {
                    continue;
                }

                if (isStartingPossessionEnd(end)) {
                    PossessionEnd execEnd = (PossessionEnd) end;
                    result.add(new EventContext(ancestors.peek(), execEnd.getExecution(), true, ancestors.size() + 1));
                    ancestors.push(execEnd.getExecution());
                }

                if (isStartingStateEnd(end)) {
                    ButEnd execEnd = (ButEnd) end;
                    result.add(new EventContext(ancestors.peek(), execEnd.getState(), true, ancestors.size() + 1));
                    ancestors.push(execEnd.getState());
                }

                if (end instanceof ActionEnd) {
                	ActionEnd msgEnd = (ActionEnd) end;
                    Action msg = msgEnd.getMessage();
                    if (msg != null) {
                        result.add(new EventContext(ancestors.peek(), msgEnd.getMessage(), msgEnd.equals(msg.getSendingEnd()), ancestors.size()));
                    }
                }


                if (isFinishingPossessionEnd(end)) {
                	PossessionEnd execEnd = (PossessionEnd) end;
                    ancestors.pop();
                    result.add(new EventContext(ancestors.peek(), execEnd.getExecution(), false, ancestors.size() + 1));
                }
                if (isFinishingStateEnd(end)) {
                	ButEnd execEnd = (ButEnd) end;
                    ancestors.pop();
                    result.add(new EventContext(ancestors.peek(), execEnd.getState(), false, ancestors.size() + 1));
                }
            }
            return result;
        }
    }

    public boolean isStartingPossessionEnd(AbstractEnd end) {
        if (end instanceof PossessionEnd) {
        	PossessionEnd ee = (PossessionEnd) end;
            return ee.getExecution() != null && ee.getExecution().getStart() == end;
        } else {
            return false;
        }
    }

    public boolean isFinishingPossessionEnd(AbstractEnd end) {
        if (end instanceof PossessionEnd) {
        	PossessionEnd ee = (PossessionEnd) end;
            return ee.getExecution() != null && ee.getExecution().getEnd() == end;
        } else {
            return false;
        }
    }

    public boolean isStartingStateEnd(AbstractEnd end) {
        if (end instanceof ButEnd) {
        	ButEnd ee = (ButEnd) end;
            return ee.getState() != null && ee.getState().getStart() == end;
        } else {
            return false;
        }
    }

    public boolean isFinishingStateEnd(AbstractEnd end) {
        if (end instanceof ButEnd) {
        	ButEnd ee = (ButEnd) end;
            return ee.getState() != null && ee.getState().getEnd() == end;
        } else {
            return false;
        }
    }
    
    public Joueur selectJoueur(Participant p) {
    	Saison saison = (Saison) p.eContainer().eContainer();
    	Joueur joueur = saison.getJoueurs().get(0);
    	System.out.println("aaaa");
    	return joueur;
    }
    
    public Collection<EObject> butsDuParticipant(Participant p) {
    	Match match = (Match) p.eContainer();
    	List<EObject> buts = Lists.newArrayList();
    	for (But but : match.getStates()) {
    		if (but.getOwner().equals(p)) {
				buts.add(but);
			}
		}
    	return buts;
    }

    public Collection<EObject> getDirectEventsOnCurrentParticipant(EObject self) {
        return getDirectEventsOn(currentParticipant(self), self);
    }

    /**
     * Computes the semantic elements corresponding to the events directly below
     * the specified parent on a given lifelines. This is necessary because the
     * VSM expects a tree-like structure for mappings, but in an 'Interactions'
     * model, the events corresponding to the start/finish of
     * execution/messages/etc. are stored in a linear structure.
     * 
     * @param context
     *            the participant/lifeline on which to look.
     * @param parent
     *            the semantic element of the parent event.
     * @return the semantic elements of all the direct sub-events of
     *         <code>parent</code> on the given participant. The order is not
     *         specified.
     */
    public Collection<EObject> getDirectEventsOn(Participant context, EObject parent) {
        List<EventContext> structure = computeContainmentStructure(context);
        LinkedHashSet<EObject> events = new LinkedHashSet<EObject>();
        for (EventContext ec : structure) {
            if (ec.getParent().equals(parent)) {
                events.add(ec.getElement());
            }
        }
        List<EObject> result = new ArrayList<EObject>();
        for (EObject event : events) {
            if (event != parent) {
                result.add(event);
            }
        }
        return result;
    }

    public Participant currentParticipant(EObject self) {
        if (self instanceof Participant) {
            return (Participant) self;
        } else if (self instanceof AbstractEnd) {
            return ((AbstractEnd) self).getContext();
        } else if (self instanceof Possession) {
            return ((Possession) self).getOwner();
        } else if (self instanceof But) {
            return ((But) self).getOwner();
        } else {
            return null;
        }
    }

    public Collection<EObject> interceptionPerteSemanticCandidates(Match m) {
        Collection<EObject> result = Lists.newArrayList();
        for (Action msg : m.getMessages()) {
            if ((msg.getSendingEnd() == null && msg.getReceivingEnd() != null) || (msg.getSendingEnd() != null && msg.getReceivingEnd() == null)) {
                result.add(msg);
            }
        }
        return result;
    }
}
