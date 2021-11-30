import java.util.Scanner;

public class XuLy02 {
	
	static final int MIN = -100;
	static final int MAX = 100;

	public XuLy02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int soPhanTu = nhapSoPhanTu(scan);
		int a[] = taoMang(soPhanTu);
		xuatMang(a);
		int index = timPTDuongDauTien(a);
		if (index != -1) {
			System.out.println("\nPhần tử dương đầu tiên có giá trị bằng " + a[index] + " tại chỉ số " + index);
		} else {
			System.out.println("\nMảng không tồn tại phần tử dương");
		}

	}
	
	public static int nhapSoPhanTu(Scanner scan) {
		int soPhanTu;
		do {
			System.out.println("Nhập số phần tử > 1: ");
			soPhanTu = Integer.parseInt(scan.nextLine());
		} while (soPhanTu <= 1);
		return soPhanTu;
	}
	
	public static int[] taoMang(int soPhanTu) {
		int a[] = new int[soPhanTu];
		for (int i = 0; i < a.length; i++) {
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
	
	public static int timPTDuongDauTien(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				return i;
			}
		}
		return -1;
	}

}
