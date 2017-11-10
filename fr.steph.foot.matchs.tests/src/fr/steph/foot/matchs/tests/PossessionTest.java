/**
 */
package fr.steph.foot.matchs.tests;

import fr.steph.foot.matchs.MatchsFactory;
import fr.steph.foot.matchs.Possession;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Possession</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PossessionTest extends TestCase {

	/**
	 * The fixture for this Possession test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Possession fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PossessionTest.class);
	}

	/**
	 * Constructs a new Possession test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossessionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Possession test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Possession fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Possession test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Possession getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MatchsFactory.eINSTANCE.createPossession());
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

} //PossessionTest
