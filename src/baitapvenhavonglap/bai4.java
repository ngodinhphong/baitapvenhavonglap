package baitapvenhavonglap;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// Code đầu vào
		double x, kq;
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập vào số x:");
		x = scan.nextDouble();
		System.out.println("Vui lòng nhập vào số n:");
		n = scan.nextInt();
		
		// Code xử lý
		kq = tinhTong(x, n);
		
		// Code dầu ra
		System.out.println("Sn = " + kq);

	}
	
	public static double tinhTong(double x, double n) {
		double tong = 0;
		for(int i = 1; i <= n; i++) {
			tong += Math.pow(x, i);
		}return tong;
		
	}

}
