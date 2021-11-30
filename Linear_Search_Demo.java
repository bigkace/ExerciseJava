import java.util.Scanner;

public class XuLy01 {

	public XuLy01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a[] = {1, 4, -3, 5, -2, -6, 8, 9, 11};
		System.out.println("Nhập giá trị x cần tìm kiếm: ");
		int x = Integer.parseInt(scan.nextLine());
		int index = linearSearch1(a, x);
		if (index != -1) {
			System.out.println("Tìm thấy giá trị x = " + x + " trong mảng tại chỉ số " + index);
		} else {
			System.out.println("KHÔNG Tìm thấy giá trị x = " + x + " trong mảng.");
		}

	}
	
	public static boolean linearSearch(int a[], int x) {
		int i = 0;
		while (i < a.length && a[i] != x) {
			i++;
		}
		if (i == a.length) {
			return false;
		} else {
			return true;
		}
	}
	
	public static int linearSearch1(int a[], int x) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return index;
	}

}
