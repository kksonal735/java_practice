package java_practice;

public class Calculate_area {
	int radius;
	final static float PI=3.14f;
	public float cal_area(float radius) {
		return PI*radius*radius;
	}
 public static void main(String arg[]) {
	 Calculate_area a=new Calculate_area();
	 System.out.println( "area of rectangle: "+a.cal_area(2));
 }
}
