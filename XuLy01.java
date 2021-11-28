import java.util.Scanner;

public class XuLy01 {

	public XuLy01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row = nhapN(scan);
		int col = nhapN(scan);
		int a[][] = nhapMang(row, col, scan);
		xuatMang(a, row, col);
		int sum = tinhTong(a, row, col);
		System.out.println("Tổng các phần tử trong mảng: " + sum);

	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập giá trị > 1: ");
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
	
	public static int tinhTong(int a[][], int row, int col) {
		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

}
