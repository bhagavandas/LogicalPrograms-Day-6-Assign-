package Programs.LogicalPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class couponNumber {
	  public static void main(String[] args) {
	        System.out.println("Enter value of N to generate N coupon Numbers");
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        List<Integer> coupons = new ArrayList<>();

	        while (coupons.size() < n){
	            Integer coupon = (int)Math.floor(Math.random() * 100000);
	            if(!coupons.contains(coupon) && coupon.toString().length() == 5) coupons.add(coupon);
	        }

	        System.out.println(coupons);
	    }

}
