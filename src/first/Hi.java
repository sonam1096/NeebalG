package first;

import java.util.Arrays;
import java.util.Scanner;

public class Hi {
    public static void printJava() {
    	System.out.println("Hello java");
    	System.out.println("hiii");
    }
    public static void printName(String name) {
    	System.out.println(name);
    }
    public static void printSum(int a,int b) {
    	int sum=a+b;
    	System.out.println(sum);
    }
	public static void main(String[] args) {
		
		
	//	printJava();
	//	printName("sonam");
		printSum(3,72);
		
		// TODO Auto-generated method stub
    /*  System.out.println("Hello JAva");
      //Variables
      String a="Aman";
      int age=30;
      System.out.println(a.substring(2));
     
      int physics=89;
      int math=65;
      int che=90;
     int []marks=new int[3];
      marks[0]=78;
      marks[1]=55;
      marks[2]=22;
      Arrays.sort(marks);
      System.out.println(marks[0] );*/
	/*	
		int[]marks= {97,98,99};
		int[][]finalMarks= {{97,98,99},{95,33,55}};
		System.out.println(finalMarks[0][0]);*/
		
//		casting: implicit/explicit
	/*	
		int a=7;
		int b=4;
		System.out.println((int)(Math.random()*10));
      */
		
		
		
		//conditional
		
		Scanner sc=new Scanner(System.in);
		//int Day=sc.nextInt();
		/*if(a<10)
			System.out.println("Can not buy");
		else if(a>10&&a<40)
			System.out.println("can get 1 buy");
		else
			System.out.println("both buy");
      */
		//switch
	/*	switch(Day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("sunday");
			break;
			default:
				System.out.println("wed-sat");
		}*/
		
		//Loops
		
	/*	for(int i=0;i<10;i=i+2)
		{
		System.out.print(i);	
		}
		*/
//		int i=1;
//		
//		while(i!=6) {
//			if(i%2!=0)
//			System.out.println(i);
//			i++;
//		}
      /*int i=0;
		
 
		while(i<10) {
			System.out.print(i);
			i++;
			if(i==5)
			break;
		}*/
	/*	
		int[]marks= {1,2,3};
		try {
			
			System.out.println(marks[5]);
		}
		catch(Exception e) {
			//System.out.println(e);
		}
      System.out.println("Aman");*/
	}

}
