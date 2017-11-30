/**
 */
package fr.steph.foot.matchs.tests;

import fr.steph.foot.matchs.MatchsFactory;
import fr.steph.foot.matchs.MixEnd;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mix End</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MixEndTest extends ActionEndTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MixEndTest.class);
	}

	/**
	 * Constructs a new Mix End test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixEndTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mix End test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MixEnd getFixture() {
		return (MixEnd)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MatchsFactory.eINSTANCE.createMixEnd());
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

} //MixEndTest
