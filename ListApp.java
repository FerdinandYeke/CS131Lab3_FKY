/**
 * 
 */
package arraylist;

/**
 * @author Ferdinand K. Yeke
 *
 */
public class ListApp{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square square1 = new Square(9.3);
		PointThreeD pointer1 = new PointThreeD(1.1,2.2,3.3);
		String s;
		s = "s";
		
		ArrayList<Square> squareList = new ArrayList<Square>();
		ArrayList<PointThreeD> point3DList = new ArrayList<PointThreeD>();
		ArrayList<String> stringList = new ArrayList<String>();
		
		System.out.println("Square List item addition: "+squareList.addItem(square1));
		System.out.println("Point3D List item addtion: "+point3DList.addItem(pointer1));
		System.out.println("String list item addtion: "+stringList.addItem(s));
		squareList = square1;
		point3DList = pointer1;
		
		System.out.println(squareList.toString());
		System.out.println(point3DList.toString());
		System.out.println(stringList.toString());

		
		
	}

}
