import java.util.Scanner;

public class XuLy04 {

	static final int A = -100;
	static final int B = 100;

	public XuLy04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(n);
		xuatMang(a);
		System.out.print("\nVui lòng nhập X: ");
		int x = nhapDoan(scan);
		System.out.print("Vui lòng nhập Y: ");
		int y = nhapDoan(scan);
		xuatDoan(a, x, y);
		xuatDoanChan(a, x, y);

	}

	public static int nhapN(Scanner scan) {
		int n;
		System.out.print("Vui lòng nhập số lượng phần tử (n): ");
		boolean flag = true;
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n < 1 || n % 2 != 0) {
				System.out.print("Vui lòng nhập lại số lượng phần tử (n): ");
			} else {
				flag = false;
			}
		} while (flag);
		return n;
	}

	public static int[] nhapMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = A + (int) (Math.random() * ((B - A) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.print("Xuất mảng: ");
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}

	public static int nhapDoan(Scanner scan) {
		int a;
		a = Integer.parseInt(scan.nextLine());
		return a;
	}

	public static void xuatDoan(int a[], int x, int y) {
		System.out.print("Xuất đoạn [" + x + "," + y + "]: ");
		for (int item : a) {
			if (item >= x && item <= y) {
				System.out.print(item + "\t");
			}
		}
	}

	public static void xuatDoanChan(int a[], int x, int y) {
		System.out.print("\nCác số chẵn trong đoạn [" + x + "," + y + "]: ");
		for (int item : a) {
			if (item % 2 == 0 && item >= x && item <= y) {
				System.out.print(item + "\t");
			}
		}
	}

}
