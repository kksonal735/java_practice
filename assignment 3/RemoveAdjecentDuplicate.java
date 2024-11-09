package assignment3;

public class RemoveAdjecentDuplicate {

	public static void main(String[] args) {
	   String str="ABBACA";
	   StringBuffer sb=new StringBuffer();

	   for(int i=0;i<str.length();i++) {
		   char c=str.charAt(i);
		   if(sb.length()>0 && sb.charAt(sb.length()-1)==c) {
			   sb.deleteCharAt(sb.length()-1);
		   }
		   else {
			   sb.append(c);
		   }
	  }
	   System.out.println(" "+sb);
	}
}
