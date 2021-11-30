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
		timDoanChuaTatCaPT(a);

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
	
	public static void timDoanChuaTatCaPT(int a[]) {
		int indexMin = 0;
		int indexMax = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[indexMin]) {
				indexMin = i;
			}
			if (a[i] > a[indexMax]) {
				indexMax = i;
			}
		}
		System.out.println("\nĐoạn chứa tất cả phần tử: [" + a[indexMin] + "," + a[indexMax] + "]");
	}

}
