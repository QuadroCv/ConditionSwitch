package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
/**
 * 10.1 Viet chuong trinh nhap vao so nguyen va kiem tra nguyen am hay duong
 */
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Nhap so nguyen");
		int soNguyen = sc.nextInt();
		String kiemTra = soNguyen < 0 ? "am" : "duong" ; 
		switch (kiemTra) {
			case "duong":
				System.out.println("So nguyen duong");
				break;
			case "am":
				System.out.println("So nguyen am");
				break;
			}
		System.out.println("--------------------");
/**
 * 10.2 Nhap so nguyen va kiem tra chi het cho 5 hay 3
 */
		System.out.println("Nhap so nguyen n = ");
		int n = sc.nextInt();
		int y = 0 ;
		if(n % 3 == 0 && n % 5 == 0) {
			y = 1;
		}else {
			if(n % 3 == 0) {
				y = 2 ;
			}else {
				if(n % 5 == 0) y = 3 ;
			}
		}
		switch (y) {
			case 1:
				System.out.printf("%d chia het cho 3 va 5", n);
				break;
			case 2:
				System.out.printf("%d chia het cho 3 ", n);
				break;
			case 3:
				System.out.printf("%d chia het cho 5", n);
				break;
			default:
				System.out.printf("%d khong chia het cho 3 va 5 \n", n);
				break;
		}
		System.out.println("--------------------");
/**
 * 10.3 Nhap thang vao in ra so ngay thang do 
 */
		System.out.println("Nhap thang muon kiem tra");
		int month = sc.nextInt();
		switch (month) {
			case 1,3,5,7,8,10,12:
				System.out.println("Thang co 31 ngay");
				break;
			case 4,6,9,11:
				System.out.println("Thang co 30 ngay");
				break;
			case 2:
				System.out.println("Thang co 28 ngay");
				break;
			default:
				System.out.println("Thang khong hop le ");
				break;
			}
			System.out.println("--------------------");
/**
 * 10.4 Viet chuong trinh giai phuong trinh bac 2
 */
		System.out.println("Nhap a, b, c = ");
		float a = sc.nextInt();
		float b = sc.nextInt();
		float c = sc.nextInt();
		float x1 = 0 ;
		float x2 = 0;
		String result = "";
		if(a == 0) {
			System.out.println("phuong trinh bac nhat");
		}else {
			float delta = (b * b) - (4 * a * c);
			if(delta < 0) {
				result = "vo nghiem";
			}else {
				if(delta == 0)	{
					result = "Nghiem kep";
				}else {
					x1 = (float) ((-b) + Math.sqrt(delta)) / (2 * a) ;
					x2 = (float) ((-b) - Math.sqrt(delta)) / (2 * a) ;
					result = "2 nghiem";
				}
			}
		}
		switch (result) {
			case "vo nghiem":
				System.out.println("Phuong trinh vo nghiem");
				break;
			case "Nghiem kep":
				System.out.printf("phuong trinh co nghiem kep x = %.1f",-b/(2*a));
				break;
			case "2 nghiem":
				System.out.printf("Phuong trinh co nghiem kep x1 = %.1f ; x2 = %.1f", x1, x2);
				break;
			default:
				break;
		}
/**
 * 10.5 Viet phuong trinh nhap vào 3 so va kiem tra co phai canh cua 1 tam giac
 */
		int m = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		String res = "";
		if(m > 0 && k > 0 && l > 0)
		res = ((m + k > l) && (m + l > k) && (k + l > m)) ? "true" : "flase" ;
		switch (res) {
			case "true":
				System.out.println("So vua nhap la 3 canh cua tam giac !");
				break;
			case "flase":
				System.out.println("So vua nhap la 3 canh cua tam giac !");
				break;
			default:
				System.out.println("So nhap khong hop le");
				break;
		}
	}
}
