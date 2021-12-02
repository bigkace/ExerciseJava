import java.util.Scanner;

public class XuLy03 {

	public XuLy03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = nhapN(scan);
		int sum = tinhTong(num);
		System.out.println("Tổng = " + sum);

	}
	
	public static int nhapN(Scanner scan) {
		int num;
		do {
			System.out.println("Nhập giá trị n > 1: ");
			num = Integer.parseInt(scan.nextLine());
		} while (num < 1);
		return num;
	}
	
	public static int tinhGiaiThua(int num) {
		if (num == 1) {
			return 1;
		}
		return num * tinhGiaiThua(num - 1);
	}
	
	public static int tinhTong(int num) {
		if (num == 1) {
			return 1;
		}
		return tinhGiaiThua(num) + tinhTong(num - 1);
	}

}
