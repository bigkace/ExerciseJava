import java.util.Scanner;

public class XuLy05 {
	
	static final int MIN = -10;
	static final int MAX = 10;

	public XuLy05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row = nhapRow(scan);
		int col = nhapCol(scan);
		int a[][] = taoMang(row, col);
		int b[][] = taoMang(row, col);
		System.out.println("Xuất ma trận a: ");
		xuatMang(a, row, col);
		System.out.println("Xuất ma trận b: ");
		xuatMang(b, row, col);
		int c[][] = maTranTong(a, b, row, col);
		System.out.println("Xuất ma trận tổng: ");
		xuatMang(c, row, col);

	}
	
	public static int nhapRow(Scanner scan) {
		int row;
		do {
			System.out.println("Nhập row > 1: ");
			row = Integer.parseInt(scan.nextLine());
		} while (row <= 1);
		return row;
	}
	
	public static int nhapCol(Scanner scan) {
		int col;
		do {
			System.out.println("Nhập col > 1: ");
			col = Integer.parseInt(scan.nextLine());
		} while (col <= 1);
		return col;
	}
	
	public static int[][] taoMang(int row, int col) {
		int a[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = MIN + (int)(Math.random() * ((MAX - MIN) + 1));
			}
		}
		return a;
	}
	
	public static void xuatMang(int a[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public static int[][] maTranTong(int a[][], int b[][], int row, int col) {
		int c[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

}
