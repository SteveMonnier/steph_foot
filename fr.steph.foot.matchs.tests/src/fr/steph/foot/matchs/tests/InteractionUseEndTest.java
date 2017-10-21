/**
 */
package fr.steph.foot.matchs.tests;

import fr.steph.foot.matchs.InteractionUseEnd;
import fr.steph.foot.matchs.MatchsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interaction Use End</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionUseEndTest extends AbstractEndTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InteractionUseEndTest.class);
	}

	/**
	 * Constructs a new Interaction Use End test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionUseEndTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interaction Use End test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InteractionUseEnd getFixture() {
		return (InteractionUseEnd)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MatchsFactory.eINSTANCE.createInteractionUseEnd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InteractionUseEndTest
