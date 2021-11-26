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
		int b[] = a;
		xuatMang(a);
//    a = perfectShuffle(a);
//    xuatMang(a);
		int count = countPerfectShuffle(a, b);
		System.out.println("\nSố lần perfect shuffle trở lại mảng đầu: " + count);

	}

	public static int nhapN(Scanner scan) {
		int n;
		System.out.print("Vui lòng nhập n (n > 2, n chẵn): ");
		boolean flag = true;
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n > 2 && n % 2 == 0) {
				flag = false;
			} else {
				System.out.print("Vui lòng nhập lại n (n > 2, n chẵn): ");
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
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.print("\n");
	}

	public static int[] perfectShuffle(int a[]) {
		int indexMid = (a.length - 1) / 2;
		int b[] = new int[a.length];
		int k = 0;
		for (int i = 0, j = indexMid + 1; j < a.length; i++, j++) {
			b[k] = a[i];
			b[++k] = a[j];
			k++;
		}
		a = b;
		return a;
	}

	public static boolean isEqual(int a[], int b[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static int countPerfectShuffle(int a[], int b[]) {
		int count = 0;
		do {
			b = perfectShuffle(b);
			xuatMang(b);
			count++;
		} while (!isEqual(a, b));
		return count;
	}

}
