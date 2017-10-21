package fr.steph.foot.matchs.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;

import fr.steph.foot.matchs.AbstractEnd;
import fr.steph.foot.matchs.Action;
import fr.steph.foot.matchs.ActionEnd;
import fr.steph.foot.matchs.ButEnd;
import fr.steph.foot.matchs.Joueur;
import fr.steph.foot.matchs.Match;
import fr.steph.foot.matchs.Participant;
import fr.steph.foot.matchs.Passe;
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
    public EObject getSendingContext(Passe msg) {
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
    public EObject getReceivingContext(Passe msg) {
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

                if (isFinishingStateEnd(end)) {
                	ButEnd execEnd = (ButEnd) end;
                    ancestors.pop();
                    result.add(new EventContext(ancestors.peek(), execEnd.getState(), false, ancestors.size() + 1));
                }
            }
            return result;
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
}
