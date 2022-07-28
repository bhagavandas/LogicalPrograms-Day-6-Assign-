package Programs.LogicalPrograms;

import java.util.Scanner;

public class stopWatch {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);

	System.out.println("Type 0 to start the stopWatch");
	String srt = sc.next();
	long start = System.currentTimeMillis();
	System.out.println(start);
	
	if(srt.equals("0")) {
		System.out.println("Type 1 to stop the stopWatch");
		String stp = sc.next();
		while(!stp.equals("1")) {	
		}
		long stop = System.currentTimeMillis();
		long time = stop - start;
		System.out.println("Elapsed Time in ms = "+time);
		System.out.println("Elapsed Time in sec = "+time/1000);
		System.out.println("Elapsed Time in min = "+time/10000);
	}
	else {
		System.out.println("Incorrect Input");
	}
	}	
	}