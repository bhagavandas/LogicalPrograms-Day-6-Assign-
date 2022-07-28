package Programs.LogicalPrograms;

import java.util.Scanner;

public class fibonacciSeries {
	public static void main(String[] args) {
		 int a=1,b=2,c,i;
	     int count=10;    
		     
		 for(i=0;i<count;i++)    
		 {    
		  c=a+b; //c=3   
		  System.out.print(" "+c);    
		 a=b;//a=2    
		  b=c; // b=3  
		 }    
	}

}
