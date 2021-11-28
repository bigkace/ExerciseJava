import java.util.Scanner;

public class XuLy03 {
	
	static final int MIN = -50;
	static final int MAX = 50;

	public XuLy03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row = nhapN(scan);
		int col = nhapN(scan);
		int a[][] = taoMang(row, col);
		xuatMang(a, row, col);
		lietKe(a, row, col);
		
	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập giá trị > 1: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 1);
		return n;
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
		System.out.println("Xuất mảng: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public static void lietKe(int a[][], int row, int col) {
		boolean flag;
		for (int i = 0; i < row; i++) {
			flag = false;
			for (int j = 0; j < col; j++) {
				if (a[i][j] % 2 == 0) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("Hàng " + i + " có chứa phần tử chẵn.");
			}
		}
	}

}
