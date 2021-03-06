/**
 */
package fr.steph.foot.matchs.tests;

import fr.steph.foot.matchs.MatchsFactory;
import fr.steph.foot.matchs.PossessionEnd;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Possession End</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PossessionEndTest extends AbstractEndTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PossessionEndTest.class);
	}

	/**
	 * Constructs a new Possession End test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossessionEndTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Possession End test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PossessionEnd getFixture() {
		return (PossessionEnd)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MatchsFactory.eINSTANCE.createPossessionEnd());
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

} //PossessionEndTest
