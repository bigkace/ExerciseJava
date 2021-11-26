import java.util.Scanner;

public class XuLy04 {

	public XuLy04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập n: ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = nhapMang(n, scan);
		xuatMang(a);
		int sumEven = sumEven(a);
		System.out.println("\nTổng các số chẵn trong mảng: " + sumEven);
		int countNegative = countNegative(a);
		System.out.println("\nCác số âm trong mảng: " + countNegative);
		int sumNegative = sumNegative(a);
		System.out.println("\nTổng các số âm trong mảng: " + sumNegative);

	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		System.out.println("Nhập mảng: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.print("Xuất mảng: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static int sumEven(int a[]) {
		int sum = 0;
		// Cách 1: For...I
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			}
		}
		// Cách 2: For...Each
//    for (int item : a) {
//      if (item % 2 == 0) {
//        sum += item;
//      }
//    }
		return sum;
	}

	public static int countNegative(int a[]) {
		int count = 0;
		// Cách 1: For...I
//    for (int i = 0; i < a.length; i++) {
//      if (a[i] < 0) {
//        count++;
//      }
//    }
		// Cách 2: For...Each
		for (int item : a) {
			if (item < 0) {
				count++;
			}
		}
		return count;
	}

	public static int sumNegative(int a[]) {
		int sum = 0;
		// Cách 1: For...I
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				sum += a[i];
			}
		}
		// Cách 2: For...Each
		for (int item : a) {
			if (item < 0) {
				sum += item;
			}
		}
		return sum;
	}

}
