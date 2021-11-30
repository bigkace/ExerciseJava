import java.util.Scanner;

public class XuLy04 {
	
	static final int MIN = -100;
	static final int MAX = 100;

	public XuLy04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = enterN(scan);
		int a[] = createArray(n);
		outputArray(a);
		int indexLastEvenNum = searchLastEvenNum(a);
		if (indexLastEvenNum != -1) {
			System.out.println("\nSố chẵn cuối cùng " + a[indexLastEvenNum] + " thuộc chỉ số " + indexLastEvenNum);
		} else {
			System.out.println("\nMảng không tồn tại số chẵn.");
		}

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
	
	public static int searchLastEvenNum(int a[]) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] % 2 == 0) {
				return i;
			}
		}
		return -1;
	}

}
