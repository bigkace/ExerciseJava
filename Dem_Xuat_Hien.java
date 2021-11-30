import java.util.Scanner;

public class XuLy06 {
	
	static final int MIN = -100;
	static final int MAX = 100;

	public XuLy06() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		demXuatHien(a, scan);

	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập giá trị > 0: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 0);
		return n;
	}
	
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int)(Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	
	public static void xuatMang(int a[]) {
		System.out.println("Xuất mảng: ");
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}
	
	public static void demXuatHien(int a[], Scanner scan) {
		int x;
		System.out.println("\nMời nhập x để tìm kiếm và đếm số lần xuất hiện: ");
		x = Integer.parseInt(scan.nextLine());
		int count = 0;
		for (int item : a) {
			if (item == x) {
				count++;
			}
		}
		System.out.println("\nGiá trị x = " + x + " xuất hiện " + count + " (lần) trong mảng");
	}

}
