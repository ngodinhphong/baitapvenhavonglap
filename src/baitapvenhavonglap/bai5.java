package baitapvenhavonglap;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		
		// Code đầu vào
		double fv = 0; // giá trị dòng tiền tương lai
		double pv; // giá trị dòng tiền hiện tại
		double r; // tỉ suất lợi nhuận
		int n = 1; // Số kỳ (năm)
		int oTo; // số tiền cần để mua ô tô
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập số tiền cần để mua được ô tô: ");
		oTo = scan.nextInt();
		System.out.println("Vui lòng nhập số tiền tiết kiệm: ");
		pv = scan.nextDouble();
		System.out.println("Vui lòng nhập lãi suất tiết kiệm: ");
		r = scan.nextDouble();
		
		// Code xử lý
		while(fv < oTo) {
			// Côn tức tính: FV = PV * (1 + r)^n
			fv = pv * Math.pow((1 + r), n);
			n++;
		}
		
		// Code đầu ra
		System.out.printf("Giả sử kỳ hạn gởi là 1 năm thì Anh X phải chờ ít nhất là %d năm để có đủ tiền mua ô tô", n - 1);

	}

}
