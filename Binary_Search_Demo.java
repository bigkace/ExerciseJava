import java.util.Scanner;

public class XuLy01 {

	public XuLy01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a[] = {1, 3, 4, 8, 11, 18, 22};
		System.out.println("Nhập giá trị x cần tìm kiếm: ");
		int x = Integer.parseInt(scan.nextLine());
//		boolean found = binarySearch(a, x);
//		if (found) {
//			System.out.println("Tìm thấy giá trị x = " + x + " trong mảng");
//		} else {
//			System.out.println("Không tìm thấy giá trị x = " + x + " trong mảng");
//		}
		int index = binarySearch1(a, x);
		if (index != -1) {
			System.out.println("Tìm thấy giá trị x = " + x + " trong mảng tại chỉ số " + index);
		} else {
			System.out.println("KHÔNG Tìm thấy giá trị x = " + x + " trong mảng.");
		}

	}
	
	public static boolean binarySearch(int a[], int x) {
		int left = 0;
		int right = a.length - 1;
		int mid;
		do {
			mid = (left + right)/2;
			if (a[mid] == x) {
				return true; //tìm thấy
			} else if (a[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		} while (left <= right);
		return false;
	}
	
	public static int binarySearch1(int a[], int x) {
		int left = 0;
		int right = a.length - 1;
		int mid;
		do {
			mid = (left + right)/2;
			if (a[mid] == x) {
				return mid; //tìm thấy
			} else if (a[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		} while (left <= right);
		return -1;
	}

}
