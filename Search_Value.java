import java.util.Scanner;

public class XuLy05 {
	
	static final int MIN = -100;
	static final int MAX = 100;

	public XuLy05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = enterN(scan);
//		int a[] = createArray(n);
		int a[] = {3, 1, 5, -40, 5, 50, 2, -40};
		outputArray(a);
		searchValue(a, scan);

	}
	
	public static int enterN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập giá trị n > 1: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}
	
	public static int[] createArray(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int)(Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}
	
	public static void outputArray(int a[]) {
		System.out.println("Xuất mảng: ");
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}
	
	public static int searchFurthestDistance(int a[], int x) {
		int furthestDistance = Math.abs(a[0] - x);
		for (int i = 1; i < a.length; i++) {
			if (Math.abs(a[i] - x) > furthestDistance) {
				furthestDistance = Math.abs(a[i] - x);
			}
		}
		return furthestDistance;
		
	}
	
	public static void searchValue(int a[], Scanner scan) {
		System.out.println("\nNhập giá trị x: ");
		int x = Integer.parseInt(scan.nextLine());
		
		int furthestDistance = searchFurthestDistance(a, x);
		System.out.println("Các phần tử cách xa x = " + x + " nhất: ");
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(a[i] - x) == furthestDistance) {
				System.out.print("(" + i + "," + a[i] + ")\t");
			}
		}
	}

}
