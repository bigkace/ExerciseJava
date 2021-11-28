import java.util.Scanner;

public class XuLy04 {

	public XuLy04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row = nhapN(scan);
		int col = nhapN(scan);
		int a[][] = nhapMang(row, col, scan);
		xuatMang(a, row, col);
		lietKeHangGiamDan(a, row, col);

	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 1: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 1);
		return n;
	}
	
	public static int[][] nhapMang(int row, int col, Scanner scan) {
		int a[][] = new int[row][col];
		System.out.println("Nhập mảng: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		return a;
	}
	
	public static void xuatMang(int a[][], int row, int col) {
		System.out.println("Xuất mảng: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public static void lietKeHangGiamDan(int a[][], int row, int col) {
		boolean flag;
		for (int i = 0; i < row; i++) {
			flag = true;
			for (int j = 0; j < col - 1; j++) {
				if (a[i][j] <= a[i][j+1]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Hàng " + i + " giảm dần.");
			}
		}
	}

}
