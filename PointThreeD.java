package arraylist;

/**
 * @author Ferdinand K. Yeke
 *
 */
public class PointThreeD extends ArrayList{
	
	private double xPoint, yPoint, zPoint;
	
	//Default Constructor starts here
	public PointThreeD()
	{
		xPoint = 0.0;
		yPoint = 0.0;
		zPoint = 0.0;
	}//Default Constructor ends here
	
	//Preferred Constructor starts here
	public PointThreeD(double x, double y, double z)
	{
		this.xPoint = x;
		this.yPoint = y;
		this.zPoint = z;
	}//Preferred Constructor ends here

	//toString methods starts here
	@Override
	public String toString() {
		return "PointThreeD [xPoint= " + xPoint + ", yPoint= " + yPoint + ", zPoint= " + zPoint + "]";
	}//toString method ends here
	
}//Class ends here
