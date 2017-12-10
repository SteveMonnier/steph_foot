/**
 */
package fr.steph.foot.matchs.tests;

import fr.steph.foot.matchs.MatchsFactory;
import fr.steph.foot.matchs.Remplacement;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remplacement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemplacementTest extends TimedEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RemplacementTest.class);
	}

	/**
	 * Constructs a new Remplacement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemplacementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Remplacement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Remplacement getFixture() {
		return (Remplacement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MatchsFactory.eINSTANCE.createRemplacement());
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

} //RemplacementTest
