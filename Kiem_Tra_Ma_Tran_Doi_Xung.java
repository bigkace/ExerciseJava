import java.util.Scanner;

public class XuLy06 {

	public XuLy06() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int soHangCot = nhapSoHangCot(scan);
		int a[][] = nhapMaTran(soHangCot, scan);
		xuatMaTran(a, soHangCot);
		kiemTraDoiXung(a, soHangCot);

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
	
	public static void kiemTraDoiXung(int a[][], int soHangCot) {
		boolean flag = true;
		for (int i = 0; i < soHangCot; i++) {
			for (int j = 0; j < soHangCot; j++) {
				if (a[i][j] != a[j][i]) {
					flag = false;
					break;
				}
				if (!flag) {
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Mảng đối xứng.");
		} else {
			System.out.println("Mảng không đối xứng.");
		}
	}

}
