package first;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="Hi Hello Sonam Hi Vishwa Hiii Ishan Ishan";
     String s0=str.toLowerCase();
     String s1[]=s0.split(" ");
     int count;
     for(int i=0;i<s1.length;i++) {
    	 count=1;
    	 
    	 for(int j=i+1;j<s1.length;j++) {
    		if(s1[i].equals(s1[j]))
    				count++;
    		s1[j]="0";
    		
    	 }
    	 if(count>1&&s1[i]!="0")
    		 System.out.println(s1[i]);
     }
	}

}
