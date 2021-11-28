import java.util.Scanner;

public class XuLy02 {
	
	static final int MIN = -50;
	static final int MAX = 50;

	public XuLy02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row = nhapN(scan);
		int col = nhapN(scan);
		int a[][] = taoMang(row, col);
		xuatMang(a, row, col);
		printAllElementMax(a, row, col);

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
	
	public static int findMax(int a[][], int row, int col) {
		int rowMax = 0;
		int colMax = 0;
		int max = a[rowMax][colMax];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (a[i][j] > max) {
					rowMax = i;
					colMax = j;
					max = a[rowMax][colMax];
				}
			}
		}
		return max;
	}
	
	public static void printAllElementMax(int a[][], int row, int col) {
		int max = findMax(a, row, col);
		System.out.println("\nGiá trị max = " + max + " tại các phần tử: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (a[i][j] == max) {
					System.out.print("(" + i + "," + j + ")\t");
				}
			}
		}
	}

}
