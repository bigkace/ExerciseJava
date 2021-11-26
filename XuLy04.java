import java.util.Scanner;

public class XuLy04 {

	static final int MIN = -100;
	static final int MAX = 100;

	public XuLy04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//      int n = nhapN(scan);
//      int a[] = taoMang(n);
		int a[] = { 3, -4, 2, -5, -8, -2, -4, -10, -2 }; // test
		xuatMang(a);
		lietKeChiSo(a);

	}

	public static int nhapN(Scanner scan) {
		int n;
		System.out.print("Vui lòng nhập n: ");
		boolean flag = true;
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n < 1) {
				System.out.print("Vui lòng nhập lại n: ");
			} else {
				flag = false;
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
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static int searchMinPositiveIndex(int a[]) {
		int index = -1;
		int min = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				index = i;
				min = a[i];
				break;
			}
		}
		if (index != -1) {
			for (int i = index + 1; i < a.length; i++) {
				if (a[i] > 0 && a[i] < min) {
					index = i;
					min = a[i];
				}
			}
		}
		return index;
	}

	public static void lietKeChiSo(int a[]) {
		int index = searchMinPositiveIndex(a);
		if (index == -1) {
			System.out.print("\nMảng không tồn tại số dương.");
		} else {
			System.out.print("\nChỉ số: ");
			int count = 0;
			for (int i = index + 1; i < a.length; i++) {
				if (a[index] == a[i]) {
					count++;
					System.out.print(i + "\t");
				}
			}
			if (count == 0) {
				System.out.print("Không tồn tại chỉ số cần tìm.");
			}
		}
	}

}
