/**
 */
package fr.steph.foot.matchs.provider;


import fr.steph.foot.matchs.Match;
import fr.steph.foot.matchs.MatchsFactory;
import fr.steph.foot.matchs.MatchsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.steph.foot.matchs.Match} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEquipeAdversePropertyDescriptor(object);
			addParticipantsPropertyDescriptor(object);
			addVideoUrlPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Equipe Adverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEquipeAdversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_equipeAdverse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_equipeAdverse_feature", "_UI_Match_type"),
				 MatchsPackage.Literals.MATCH__EQUIPE_ADVERSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Participants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParticipantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_participants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_participants_feature", "_UI_Match_type"),
				 MatchsPackage.Literals.MATCH__PARTICIPANTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Video Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVideoUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Match_videoUrl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Match_videoUrl_feature", "_UI_Match_type"),
				 MatchsPackage.Literals.MATCH__VIDEO_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MatchsPackage.Literals.MATCH__PARTICIPANTS);
			childrenFeatures.add(MatchsPackage.Literals.MATCH__MESSAGES);
			childrenFeatures.add(MatchsPackage.Literals.MATCH__EXECUTIONS);
			childrenFeatures.add(MatchsPackage.Literals.MATCH__STATES);
			childrenFeatures.add(MatchsPackage.Literals.MATCH__INTERACTION_USES);
			childrenFeatures.add(MatchsPackage.Literals.MATCH__ENDS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Match.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Match"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Match)object).getEquipeAdverse();
		return label == null || label.length() == 0 ?
			getString("_UI_Match_type") :
			getString("_UI_Match_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Match.class)) {
			case MatchsPackage.MATCH__EQUIPE_ADVERSE:
			case MatchsPackage.MATCH__VIDEO_URL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MatchsPackage.MATCH__PARTICIPANTS:
			case MatchsPackage.MATCH__MESSAGES:
			case MatchsPackage.MATCH__EXECUTIONS:
			case MatchsPackage.MATCH__STATES:
			case MatchsPackage.MATCH__INTERACTION_USES:
			case MatchsPackage.MATCH__ENDS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__PARTICIPANTS,
				 MatchsFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__MESSAGES,
				 MatchsFactory.eINSTANCE.createPasse()));

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__MESSAGES,
				 MatchsFactory.eINSTANCE.createRemplacement()));

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__EXECUTIONS,
				 MatchsFactory.eINSTANCE.createPossession()));

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__STATES,
				 MatchsFactory.eINSTANCE.createBut()));

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__INTERACTION_USES,
				 MatchsFactory.eINSTANCE.createInteractionUse()));

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__ENDS,
				 MatchsFactory.eINSTANCE.createActionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__ENDS,
				 MatchsFactory.eINSTANCE.createPossessionEnd()));

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__ENDS,
				 MatchsFactory.eINSTANCE.createButEnd()));

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__ENDS,
				 MatchsFactory.eINSTANCE.createInteractionUseEnd()));

		newChildDescriptors.add
			(createChildParameter
				(MatchsPackage.Literals.MATCH__ENDS,
				 MatchsFactory.eINSTANCE.createMixEnd()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MatchsEditPlugin.INSTANCE;
	}

}
