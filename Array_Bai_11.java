import java.util.Scanner;

public class XuLy04 {

	static final int MIN = -100;
	static final int MAX = 100;

	public XuLy04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//    int n = nhapN(scan);
//    int a[] = taoMang(n);
		int a[] = { 1, 4, 6, -16, 26, 36, 5, 7, 8, 11 };
		xuatMang(a);
		int soPhanTu = demPhanTu(a);
		System.out.println("\nSố phần tử chia hết cho 4 và có chữ số tận cùng là 6: " + soPhanTu);
		a = thayThePhanTu(a);
		xuatMang(a);

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

	public static int demPhanTu(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(a[i]) % 10 == 6 && a[i] % 4 == 0) {
				count++;
			}
		}
		return count;
	}

	public static int[] thayThePhanTu(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				a[i] *= 2;
			}
		}
		return a;
	}

}
