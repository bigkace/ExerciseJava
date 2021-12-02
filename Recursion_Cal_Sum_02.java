import java.util.Scanner;

public class XuLy02 {

	public XuLy02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int sum = recursionCalSum(n);
		System.out.println("Tổng = " + sum);

	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập giá trị n > 0: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}
	
	public static int recursionCalSum(int n) {
		if (n == 1) {
			return 1;
		}
		return n * n + recursionCalSum(n - 1);
	}

}
