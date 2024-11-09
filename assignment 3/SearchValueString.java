package assignment3;

public class SearchValueString {

	public static void main(String[] args) {
		String str1="sonal";
		String str2="amruta";
		char ch=str2.charAt(0);
		for(int i=0;i<str1.length();i++) {
			if(ch==str1.charAt(i)) {
				System.out.println(ch+" is at first string at location  "+ (i+1));
			}
		}
	}
}
