import java.util.Scanner;

public class XuLy04 {

	static final int MIN = -1000;
	static final int MAX = 1000;

	public XuLy04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
//    int a[] = {2, 32, 42, 64, 82, 26, 23}; //test
		xuatMang(a);
		int sum = tinhTongLienKe(a);
		System.out.print("\nTổng: " + sum);

	}

	public static int nhapN(Scanner scan) {
		int n;
		System.out.print("Vui lòng nhập n (n > 0): ");
		boolean flag = true;
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n > 0) {
				flag = false;
			} else {
				System.out.print("Vui lòng nhập lại n (n > 0): ");
			}
		} while (flag);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.print("Xuất mảng: ");
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}

	public static int tinhTongLienKe(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] > a[i]) {
				sum += a[i + 1];
			}
		}
		return sum;
	}

}
