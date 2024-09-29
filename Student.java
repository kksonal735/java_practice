package assignment_2;
import java.util.Hashtable;
class StudentData{
    String name;
	String DOB;
	String course;

	public StudentData(String name, String dOB, String course) {
		this.name = name;
		this.DOB = dOB;
		this.course = course;
	}
	public void Display() {
		System.out.println("name:"+name +" date of birth:"+DOB+" course:"+course);
	}
}
public class Student {
	public static void main(String[] args) {
		String name, DOB,course;
		Hashtable<Integer,StudentData> hashtable=new Hashtable<>();
		hashtable.put(1,new StudentData("sonal","3/3/2005","java"));
		hashtable.put(2,new StudentData("sanika","18/3/2013","python"));
		hashtable.put(3,new StudentData("gayatri","11/3/2005","SqL"));
		for(Integer rollNo:hashtable.keySet()) {
			StudentData s=hashtable.get(rollNo);
			System.out.println("Roll no:"+ rollNo);
			s.Display();
		}	
	}
}
