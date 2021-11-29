import java.util.Scanner;

public class XuLy07 {

	public XuLy07() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int soHangCot = nhapSoHangCot(scan);
		int a[][] = nhapMaTran(soHangCot, scan);
		xuatMaTran(a, soHangCot);
		int sumDCC = tinhTongPTTamGiacTrenDCC(a, soHangCot);
		System.out.println("\nTổng các phần tử tam giác trên đường chéo chính: " + sumDCC);
		int sumDCP = tinhTongPTTamGiacTrenDCP(a, soHangCot);
		System.out.println("Tổng các phần tử tam giác trên đường chéo phụ: " + sumDCP);

	}
	
	public static int nhapSoHangCot(Scanner scan) {
		int soHangCot;
		do {
			System.out.println("Nhập số hàng (= cột) > 1: ");
			soHangCot = Integer.parseInt(scan.nextLine());
		} while (soHangCot <= 1);
		return soHangCot;
	}
	
	public static int[][] nhapMaTran(int soHangCot, Scanner scan) {
		int a[][] = new int[soHangCot][soHangCot];
		System.out.println("Nhập ma trận: ");
		for (int i = 0; i < soHangCot; i++) {
			for (int j = 0; j < soHangCot; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		return a;
	}
	
	public static void xuatMaTran(int a[][], int soHangCot) {
		System.out.println("Xuất mảng: ");
		for (int i = 0; i < soHangCot; i++) {
			for (int j = 0; j < soHangCot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public static int tinhTongPTTamGiacTrenDCC(int a[][], int soHangCot) {
		int sum = 0;
		for (int i = 0; i < soHangCot; i++) {
			for (int j = i + 1; j < soHangCot; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}
	
	public static int tinhTongPTTamGiacTrenDCP(int a[][], int soHangCot) {
		int sum = 0;
		for (int i = 0; i < soHangCot - 1; i++) {
			for (int j = 0; j < soHangCot - 1 - i; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

}
