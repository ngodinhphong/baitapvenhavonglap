package baitapvenhavonglap;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// Code đầu vào
		int n;
		int tong = 0;
		Scanner scan = new Scanner(System.in);
		
		// Code xử lý
		do {
			System.out.println("Vui lòng nhập một số nguyên dương");
			n = scan.nextInt();
				
		}while(n < 0);
		
		for(int i = 1; i < n; i += 2) {
			tong+= i;
		}
		
		// Code đầu ra
		System.out.println("Tổng các số lẻ nhỏ hơn " + n + " là: " + tong);
	}

}
