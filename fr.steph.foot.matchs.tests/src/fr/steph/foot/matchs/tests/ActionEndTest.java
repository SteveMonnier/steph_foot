/**
 */
package fr.steph.foot.matchs.tests;

import fr.steph.foot.matchs.ActionEnd;
import fr.steph.foot.matchs.MatchsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action End</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionEndTest extends AbstractEndTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionEndTest.class);
	}

	/**
	 * Constructs a new Action End test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEndTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Action End test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActionEnd getFixture() {
		return (ActionEnd)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MatchsFactory.eINSTANCE.createActionEnd());
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

} //ActionEndTest
