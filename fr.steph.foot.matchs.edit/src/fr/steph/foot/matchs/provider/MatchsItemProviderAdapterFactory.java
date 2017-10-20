/**
 */
package fr.steph.foot.matchs.provider;

import fr.steph.foot.matchs.util.MatchsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchsItemProviderAdapterFactory extends MatchsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.Saison} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaisonItemProvider saisonItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.Saison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSaisonAdapter() {
		if (saisonItemProvider == null) {
			saisonItemProvider = new SaisonItemProvider(this);
		}

		return saisonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.Match} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchItemProvider matchItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatchAdapter() {
		if (matchItemProvider == null) {
			matchItemProvider = new MatchItemProvider(this);
		}

		return matchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.Joueur} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoueurItemProvider joueurItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.Joueur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoueurAdapter() {
		if (joueurItemProvider == null) {
			joueurItemProvider = new JoueurItemProvider(this);
		}

		return joueurItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.Passe} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PasseItemProvider passeItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.Passe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPasseAdapter() {
		if (passeItemProvider == null) {
			passeItemProvider = new PasseItemProvider(this);
		}

		return passeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.Remplacement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemplacementItemProvider remplacementItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.Remplacement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRemplacementAdapter() {
		if (remplacementItemProvider == null) {
			remplacementItemProvider = new RemplacementItemProvider(this);
		}

		return remplacementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.Execution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionItemProvider executionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.Execution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionAdapter() {
		if (executionItemProvider == null) {
			executionItemProvider = new ExecutionItemProvider(this);
		}

		return executionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.But} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButItemProvider butItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.But}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButAdapter() {
		if (butItemProvider == null) {
			butItemProvider = new ButItemProvider(this);
		}

		return butItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.InteractionUse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseItemProvider interactionUseItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.InteractionUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInteractionUseAdapter() {
		if (interactionUseItemProvider == null) {
			interactionUseItemProvider = new InteractionUseItemProvider(this);
		}

		return interactionUseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.ActionEnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionEndItemProvider actionEndItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.ActionEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionEndAdapter() {
		if (actionEndItemProvider == null) {
			actionEndItemProvider = new ActionEndItemProvider(this);
		}

		return actionEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.ExecutionEnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionEndItemProvider executionEndItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.ExecutionEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionEndAdapter() {
		if (executionEndItemProvider == null) {
			executionEndItemProvider = new ExecutionEndItemProvider(this);
		}

		return executionEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.ButEnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButEndItemProvider butEndItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.ButEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButEndAdapter() {
		if (butEndItemProvider == null) {
			butEndItemProvider = new ButEndItemProvider(this);
		}

		return butEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.InteractionUseEnd} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseEndItemProvider interactionUseEndItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.InteractionUseEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInteractionUseEndAdapter() {
		if (interactionUseEndItemProvider == null) {
			interactionUseEndItemProvider = new InteractionUseEndItemProvider(this);
		}

		return interactionUseEndItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.steph.foot.matchs.Participant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantItemProvider participantItemProvider;

	/**
	 * This creates an adapter for a {@link fr.steph.foot.matchs.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParticipantAdapter() {
		if (participantItemProvider == null) {
			participantItemProvider = new ParticipantItemProvider(this);
		}

		return participantItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (saisonItemProvider != null) saisonItemProvider.dispose();
		if (matchItemProvider != null) matchItemProvider.dispose();
		if (joueurItemProvider != null) joueurItemProvider.dispose();
		if (passeItemProvider != null) passeItemProvider.dispose();
		if (remplacementItemProvider != null) remplacementItemProvider.dispose();
		if (executionItemProvider != null) executionItemProvider.dispose();
		if (butItemProvider != null) butItemProvider.dispose();
		if (interactionUseItemProvider != null) interactionUseItemProvider.dispose();
		if (actionEndItemProvider != null) actionEndItemProvider.dispose();
		if (executionEndItemProvider != null) executionEndItemProvider.dispose();
		if (butEndItemProvider != null) butEndItemProvider.dispose();
		if (interactionUseEndItemProvider != null) interactionUseEndItemProvider.dispose();
		if (participantItemProvider != null) participantItemProvider.dispose();
	}

}
