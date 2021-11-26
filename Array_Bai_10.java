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
		a = xoaPhanTu(a, scan);
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

	public static int[] xoaPhanTu(int a[], Scanner scan) {
		int index;
		do {
			System.out.println("\nMời nhập chỉ số muốn xoá (0 <= index <= " + (a.length - 1) + "): ");
			index = Integer.parseInt(scan.nextLine());
		} while (index < 0 || index >= a.length);

		int b[] = new int[a.length - 1];
		// Cách 1
//    int j = 0;
//    for (int i = 0; i < a.length; i++) {
//      if (i != index) {
//        b[j++] = a[i];
//      }
//    }

		// Cách 2: Chạy 2 mảng song song
		for (int i = 0, j = 0; j < a.length - 1; i++, j++) {
			if (j == index) {
				j++;
			}
			b[i] = a[j];
		}
		a = b;
		return a;
	}

}
