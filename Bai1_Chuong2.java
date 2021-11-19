import java.util.Scanner;

public class Bai1_Chuong2 {

	public Bai1_Chuong2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
final int SO_LUONG_SO = 5;
		
		int num;					//Lưu trữ số nhập từ keyboard
		int sum = 0;				//Lưu trữ tổng các số
		float trungBinhCong;		//Giá trị trung bình cộng
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập số thứ nhất: ");
		num = Integer.parseInt(scan.nextLine());
		sum += num;
		System.out.println("Vui lòng nhập số thứ hai: ");
		num = Integer.parseInt(scan.nextLine());
		sum += num;
		System.out.println("Vui lòng nhập số thứ ba: ");
		num = Integer.parseInt(scan.nextLine());
		sum += num;
		System.out.println("Vui lòng nhập số thứ tư: ");
		num = Integer.parseInt(scan.nextLine());
		sum += num;
		System.out.println("Vui lòng nhập số thứ năm: ");
		num = Integer.parseInt(scan.nextLine());
		sum += num;
		
		trungBinhCong = (float) sum / SO_LUONG_SO;
		System.out.println("Giá trị trung bình cộng = " + trungBinhCong);

	}

}
