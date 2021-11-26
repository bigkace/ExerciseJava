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
		printMaxRun(a);

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
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.print("\n");
	}

	public static void printMaxRun(int a[]) {
		int indexHead = 0;
		int maxIndexHead = 0;
		int maxLength = 0;
		do {
			int length = 1;
			int i;
			for (i = indexHead; i < a.length - 1 && a[i] < a[i + 1]; i++) {
				length++;
			}
			if (length > maxLength) {
				maxLength = length;
				maxIndexHead = indexHead;
			}
			indexHead = i + 1;
		} while (indexHead < a.length);

		for (int i = 0; i < maxLength; i++) {
			System.out.print(a[maxIndexHead + i] + "\t");
		}
	}

}
