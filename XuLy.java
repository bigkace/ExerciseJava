import java.util.Scanner;

public class XuLy {

	static final byte MIN = -30;
	static final byte MAX = 30;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int soPhanTu = nhapSoPhanTu(scan);
		int a[] = taoMang(soPhanTu);
		xuatMang(a);
		a = insertionSort(a);
		xuatMang(a);

	}

	public static int nhapSoPhanTu(Scanner scan) {
		int soPhanTu;
		do {
			System.out.println("Nhập số phần tử > 1: ");
			soPhanTu = Integer.parseInt(scan.nextLine());
		} while (soPhanTu < 2);
		return soPhanTu;
	}

	public static int[] taoMang(int soPhanTu) {
		int a[] = new int[soPhanTu];
		for (int i = 0; i < soPhanTu; i++) {
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

	public static int[] interchangeSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
			}
		}
		return a;
	}

	public static int[] bubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					int tam = a[j - 1];
					a[j - 1] = a[j];
					a[j] = tam;
				}
			}
		}
		return a;
	}

	public static int timViTriMin(int a[], int k) {
		int viTriMin = k;
		for (int i = k + 1; i < a.length; i++) {
			if (a[i] < a[viTriMin]) {
				viTriMin = i;
			}
		}
		return viTriMin;
	}

	public static int[] selectionSort(int a[]) {
		int viTriMin;
		for (int i = 0; i < a.length - 1; i++) {
			viTriMin = timViTriMin(a, i);
			int temp = a[i];
			a[i] = a[viTriMin];
			a[viTriMin] = temp;
		}
		return a;
	}

	public static int[] insertionSort(int a[]) {
		int pos;
		int x;
		for (int i = 1; i < a.length; i++) {
			x = a[i];
			pos = i - 1;
			while ((pos >= 0) && (a[pos] > x)) {
				a[pos + 1] = a[pos];
				pos--;
			}
			a[pos + 1] = x;
		}
		return a;
	}

}
