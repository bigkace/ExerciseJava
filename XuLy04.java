import java.util.Scanner;

public class XuLy04 {

	static final int MIN = -100;
	static final int MAX = 100;

	public XuLy04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		a = themPhanTu(a, scan);
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

	public static int[] themPhanTu(int a[], Scanner scan) {
		int position, value;
		do {
			System.out.print("\nVui lòng nhập vị trí muốn thêm từ 0 đến " + a.length + " : ");
			position = Integer.parseInt(scan.nextLine());
		} while (position < 0 || position > a.length);

		System.out.print("Vui lòng nhập giá trị muốn thêm: ");
		value = Integer.parseInt(scan.nextLine());

		int b[] = new int[a.length + 1]; // tạo mảng tạm với kích thước tăng thêm 1
		for (int i = 0; i < b.length; i++) {
			if (i < position) {
				b[i] = a[i];
			} else if (i == position) {
				b[i] = value;
			} else { // (i > position)
				b[i] = a[i - 1];
			}
		}

		a = b; // gán mảng tạm về cho mảng gốc
		return a;
	}

}
