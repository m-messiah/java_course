import junit.framework.TestCase;
public class TestVector extends TestCase {
	public void testScalar() {
		Vector3D A = new Vector3D( 1, 2, 3 );
		Vector3D B = new Vector3D(1, 15, 14 );
		assertTrue(A.scalar(B) == 73);
	}
	public void testDimension() {
		Vector3D A = new Vector3D( 1, 2, 3);
		assertTrue(A.dimension() == 3);
	}
}
