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
		int a[] = { 1, 2, 2, 3, 4, 3, 2, 5, 5, 3};
		xuatMang(a);
		//Cách 1
//		int b[] = tachMang(a);
//		statistical(a, b);
		//Cách 2
		printStatistical(a);
		
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

	//Cách 1
//	public static int demPhanTu(int a[], int value, int head) {
//		int count = 0;
//		for (int i = head; i < a.length; i++) {
//			if (a[i] == value) {
//				count++;
//			}
//		}
//		return count;
//	}
//
//	public static int[] tachMang(int a[]) {
//		int k = 0;
//		do {
//			int value = a[k];
//			int head = k + 1;
//			int soLuong = demPhanTu(a, value, head);
//			int b[] = new int[a.length - soLuong];
//			if (soLuong > 0) {
//				int j = 0;
//				for (int i = 0; i < a.length; i++) {
//					if (a[i] != value || i == head - 1) {
//						b[j++] = a[i];
//					}
//				}
//			} else {
//				b = a;
//			}
//			a = b;
//			k++;
//		} while (k < a.length);
//		return a;
//	}
//	
//	public static void statistical(int a[], int b[]) {
//		for (int i = 0; i < b.length; i++) {
//			int count = 0;
//			for (int j = 0; j < a.length; j++) {
//				if (b[i] == a[j]) {
//					count++;
//				}
//			}
//			System.out.print(b[i] + "[" + count + "]\t");
//		}
//	}
	
	//Cách 2
	public static int[] countElement(int a[]) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (j < i) {
						break;
					} else {
						b[i]++;
					}
				}
			}
		}
		return b;
	}
	
	public static void printStatistical(int a[]) {
		int b[] = countElement(a);
		for (int i = 0; i < a.length; i++) {
			if (b[i] != 0) {
				System.out.print(a[i] + "[" + b[i] + "]\t");
			}
		}
	}
	
}
