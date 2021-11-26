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
		int a[] = nhapMang(n);
		xuatMang(a);
		xuatViTri(a);

	}

	public static int nhapN(Scanner scan) {
		int n;
		System.out.print("Vui lòng nhập số lượng phần tử (n): ");
		boolean flag = true;
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n < 1) {
				System.out.print("Vui lòng nhập lại số lượng phần tử (n): ");
			} else {
				flag = false;
			}
		} while (flag);
		return n;
	}

	public static int[] nhapMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.print("Xuất mảng: ");
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}

	public static void xuatViTri(int a[]) {
		int indexNegativeFirst = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				indexNegativeFirst = i;
				break;
			}
		}
		if (indexNegativeFirst == -1) {
			System.out.println("Mảng không tồn tại số âm.");
		} else {
			int count = 0;
			System.out.print("\nCác chỉ số tại đó giá trị = " + a[indexNegativeFirst] + ": ");
			for (int i = indexNegativeFirst + 1; i < a.length; i++) {
				if (a[indexNegativeFirst] == a[i]) {
					count++;
					System.out.print(i + "\t");
				}
			}
			if (count == 0) {
				System.out.print(0);
			}
		}
	}

}
