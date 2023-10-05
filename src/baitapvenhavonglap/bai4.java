package baitapvenhavonglap;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// Code đầu vào
		double x;
		int n, tong =0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập vào số x:");
		x = scan.nextDouble();
		System.out.println("Vui lòng nhập vào số n:");
		n = scan.nextInt();
		
		// Code xử lý
		for(int i = 1; i <= n; i++) {
			tong += Math.pow(x, i);
		}
		
		// Code dầu ra
		System.out.println("Sn = " + tong);

	}

}
