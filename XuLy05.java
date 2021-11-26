import java.util.Scanner;

public class XuLy05 {

	static final int MIN = -100;
	static final int MAX = 100;

	public XuLy05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		int n = nhapN(scan);
//		int a[] = nhapMang(n, scan);
		int a[] = { 1, 2, 3, 4, 5, 6 };
		xuatMang(a);
//		kiemTraDoiXung(a);
		//Cách 1
//		dichTrai(a, scan);
		//Cách 2
		dichTrai(a, scan);

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

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		System.out.println("Nhập mảng: ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.print("\n");
	}

	public static void kiemTraDoiXung(int a[]) {
		boolean flag = true;
		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[a.length - 1 - i]) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Mảng đối xứng.");
		} else {
			System.out.println("Mảng không đối xứng.");
		}
	}

	//Cách 1
//	public static void dichTrai(int a[], Scanner scan) {
//		int k;
//		System.out.println("Nhập k > 0: ");
//		k = Integer.parseInt(scan.nextLine());
//		if (k % a.length == 0) {
//			k = 0;
//			xuatMang(a);
//		} else if (k > a.length) {
//			k %= a.length;
//		}
//		while (k != 0) {
//			int b[] = new int[a.length];
//			b[b.length - 1] = a[0];
//			int j = 0;
//			for (int i = 1; i < a.length; i++) {
//				b[j++] = a[i];
//			}
//			a = b;
//			xuatMang(a);
//			k--;
//		}
//	}
	
	//Cách 2
	public static void dichTrai(int a[], Scanner scan) {
		int k;
		int tam;
		do {
			System.out.println("Nhập k > 0: ");
			k = Integer.parseInt(scan.nextLine());
		} while (k < 0);
		k %= a.length;
		
		for (int i = 0; i < k; i++) {
			tam = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = tam;
		}
		xuatMang(a);
	}

}
