package first;

public class D2Array2 {
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[][]= {{1,2,3,4},{5,6,7},{8,9,10,11}};
     //System.out.println(a.length);
    int sum = 0;
          for (int i=0;i<a.length;i++)
          {
        	  for(int j=0;j<a[i].length;j++)
        	  {
        		   sum += a[i][j];
        	  }
        	  
        	  System.out.println(sum);
        	  sum=0;
          }
	}

}
