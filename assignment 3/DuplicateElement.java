package assignment3;
public class DuplicateElement {
    public static void ArrayElement(){
    	int [] arr= {12,7,4,7,0,3,6,5,12};
    	for(int i=0;i<arr.length-1;i++) {
    	     for(int j=i+1;j<arr.length;j++) {
    	    	 if(arr[i]==arr[j]) 
    	    		 System.out.println(arr[j]);
    	     }
    	}
    }
	public static void main(String[] args) {
		ArrayElement();	
  }

}
