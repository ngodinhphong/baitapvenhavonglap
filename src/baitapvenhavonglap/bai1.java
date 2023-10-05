package baitapvenhavonglap;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		
		//Code đầu vào
		
		int soNhap;
		int ramdom;
		int diemNC = 0, diemMay = 0;
		String nguoiChon = null , mayChon = null ;
		Scanner scan = new Scanner(System.in);
		
		//Code xử lý
		
		do {
			System.out.println("Hãy nhập vào lựa chọn của bạn (");
			System.out.println("1. kéo");
			System.out.println("2. búa");
			System.out.println("3. bao");
			soNhap = scan.nextInt();
			ramdom = (int)(Math.random() * 3 + 1);
			
			if(soNhap == 1) {
				nguoiChon = "kéo";
			}else if(soNhap == 2) {
				nguoiChon = "búa";
			}else if(soNhap == 3) {
				nguoiChon = "bao";
			}
			
			if(ramdom == 1) {
				mayChon = "kéo";
			}else if(ramdom == 2) {
				mayChon = "búa";
			}else if(ramdom == 3) {
				mayChon = "bao";
			}
			
			if(soNhap < 0 || soNhap >3) {
				System.out.println("Vui lòng chọn lại ");
			}else if(soNhap > 0 && soNhap <=3) {
				if(soNhap == ramdom) {
					System.out.println("Bạn chọn " + nguoiChon + " - " + "Máy chọn " + mayChon);
					System.out.println("Bạn và máy hòa nhau");
				}else if(soNhap == 1 && ramdom == 3 || soNhap == 2 && ramdom == 1 || soNhap == 3 && ramdom == 2) {
					System.out.println("Bạn chọn " + nguoiChon + " - " + "Máy chọn " + mayChon);
					System.out.println("Bạn thắng");
					diemNC++;
				}else {
					System.out.println("Bạn chọn " + nguoiChon + " - " + "Máy chọn " + mayChon);
					System.out.println("Máy Thắng");
					diemMay++;
				}
			}
			
		}while(soNhap != 0);
		
		//Code đầu ra
		
		System.out.println("Trò chơi kết thúc");
		if(diemNC == diemMay) {
			System.out.println("Bạn và máy hòa nhau với tỉ số: " + diemNC + " - " + diemMay);
		}else if(diemNC > diemMay) {
			System.out.println("Bạn thắng nhiều hơn với tỉ số: " + diemNC + " - " + diemMay);
		}else if(diemNC < diemMay) {
			System.out.println("Máy thắng nhiều hơn với tỉ số: " + diemMay + " - " + diemNC);
		}
		
		
	}

}
