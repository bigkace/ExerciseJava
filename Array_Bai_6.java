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
		lietKeSo(a);

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

	public static boolean kiemTraChuSoDauTien(int num) {
		boolean flag = true;
		while (flag) {
			if (num >= -9 && num <= 9) {
				flag = false;
			} else {
				num /= 10;
			}
		}
		if (num % 2 != 0) {
			flag = true;
		}
		return flag;
	}

	public static void lietKeSo(int a[]) {
		int count = 0;
		System.out.print("\nLiệt kê số: ");
		for (int item : a) {
			if (kiemTraChuSoDauTien(item)) {
				count++;
				System.out.print(item + "\t");
			}
		}
		if (count == 0) {
			System.out.print("Không tồn tại số thoả mãn.");
		}
	}

}
