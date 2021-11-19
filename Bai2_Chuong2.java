import java.util.Scanner;

public class Bai2_Chuong2 {

	public Bai2_Chuong2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		final int TI_GIA = 23500;
		
		int tienUSD;
		long tienVND;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập số tiền (USD): ");
		tienUSD = Integer.parseInt(scan.nextLine());
		
		tienVND = tienUSD * TI_GIA;
		System.out.println("Số tiền " + tienUSD + " USD sau khi quy đổi sang VND: " + tienVND + " VND");

	}

}
