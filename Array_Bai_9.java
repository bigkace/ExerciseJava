import java.util.Scanner;

public class XuLy04 {

	public XuLy04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a[] = { 2, 3, -5, 7, 10, 2, 3, 3, 4 };
		// b[] = {3, -5, 7, 10, 3, 3, 4}
		xuatMang(a);
		a = xoaPhanTu(a, scan);
		xuatMang(a);

	}

	public static void xuatMang(int a[]) {
		System.out.println("Xuất mảng: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public static int demPhanTu(int a[], int value) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				count++;
			}
		}
		return count;
	}

	public static int[] xoaPhanTu(int a[], Scanner scan) {
		System.out.println("\nVui lòng nhập giá trị muốn xoá: ");
		int value = Integer.parseInt(scan.nextLine());
		int soLuong = demPhanTu(a, value);
		int b[] = new int[a.length - soLuong];
		if (soLuong > 0) {
			int j = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != value) {
					b[j++] = a[i];
				}
			}
			a = b;
		} else {
			System.out.println("Không tồn tại giá trị " + value + " trong mảng.");
		}
		return a;
	}

}
