import java.util.Scanner;

public class XuLy {

	static final byte MIN = -30;
	static final byte MAX = 30;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		quickSort(a, 0, a.length - 1);
		xuatMang(a);

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 0: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.println("\n");
	}

	public static int[] quickSort(int a[], int left, int right) {
		int i, j, x;
		x = a[(left + right) / 2];
		i = left;
		j = right;
		do {
			while (a[i] < x) {
				i++;
			}
			while (a[j] > x) {
				j--;
			}
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		} while (i < j);
		if (j > left) {
			quickSort(a, left, j);
		}
		if (i < right) {
			quickSort(a, i, right);
		}
		return a;
	}

}
