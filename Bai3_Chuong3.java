import java.util.Scanner;

public class Bai3_Chuong3 {

	public Bai3_Chuong3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		float xC;
		float yC;
		float r;
		float xM;
		float yM;
		float distance;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập hoành độ xC của (C): ");
		xC = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập tung độ yC của (C): ");
		yC = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập bán kính của (C): ");
		r = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập hoành độ xM của điểm M: ");
		xM = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập tung độ yM của điểm M: ");
		yM = Float.parseFloat(scan.nextLine());
		
		distance = (float) Math.sqrt(Math.pow(xM - xC, 2) + Math.pow(yM - yC, 2));
		if (distance == r) {
			System.out.println("M nằm trên (C)");
		}
		else if (distance > r) {
			System.out.println("M nằm ngoài (C)");
		}
		else {
			System.out.println("M nằm trong (C)");
		}

	}

}
