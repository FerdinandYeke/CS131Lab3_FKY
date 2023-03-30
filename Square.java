package arraylist;
/**
 * @author Ferdinand K. Yeke
 *
 */
public class Square extends ArrayList {

	private double side;
	
	//Default Constructor starts here
	public Square()
	{
		side = 0.0;
	}//Default Constructor ends here
	
	//Preferred Constructor starts here
	public Square(double s)
	{
		this.side = s;
	}//Preferred Constructor ends here
	
	//getArea method starts here
	/*getArea method calculates the
	 * area given the sides. After that,
	 * it returns the Area.
	 * @return Area returns the area.
	 */
	public double getArea()
	{
		double Area = side * side;
		return Area;
	}//getArea method ends here.

	//toString method starts here
	@Override
	public String toString() {
		return "Square [side= " + side + ", getArea()= " + getArea() + "]";
	}//toString method ends here

}//Class ends here
