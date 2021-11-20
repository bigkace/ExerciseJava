import java.util.Scanner;

public class XuLy {
	
	static final int GRAB_CAR_1KM = 8000;
	static final int GRAB_SUV_1KM = 9000;
	static final int GRAB_BLACK_1KM = 10000;
	
	static final int GRAB_CAR_1TO_19 = 7500;
	static final int GRAB_SUV_1TO_19 = 8500;
	static final int GRAB_BLACK_1TO_19 = 9500;
	
	static final int GRAB_CAR_UPPER_19 = 7000;
	static final int GRAB_SUV_UPPER_19 = 8000;
	static final int GRAB_BLACK_UPPER_19 = 9000;
	
	static final int GRAB_CAR_WAIT = 2000;
	static final int GRAB_SUV_WAIT = 3000;
	static final int GRAB_BLACK_WAIT = 3500;
	
	static final int STANDARD_WAIT_TIME = 3;
	
	static final int STANDARD_KM_1 = 1;
	static final int STANDARD_KM_2 = 19;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	
	public static int chonGrab() {
		
		int loai;
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời bạn chọn loại grab");
		System.out.println("1. GRAB CAR\n2. GRAB SUV\n3. GRAB BLACK");
		loai = Integer.parseInt(scan.nextLine());
		return loai;
		
	}
	
	public static float tinhTienKM1(int loaiGrab) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM;
		} else {
			tien = GRAB_BLACK_1KM;
		}
		return tien;
	}
	
	public static float tinhTienKM1To19(float soKM, int loaiGrab) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM + (soKM - STANDARD_KM_1) * GRAB_CAR_1TO_19;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM + (soKM - STANDARD_KM_1) * GRAB_SUV_1TO_19;
		} else {
			tien = GRAB_BLACK_1KM + (soKM - STANDARD_KM_1) * GRAB_BLACK_1TO_19;
		}
		return tien;
	}
	
	public static float tinhTienKMUpper19(float soKM, int loaiGrab) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM + (STANDARD_KM_2 - 1) * GRAB_CAR_1TO_19 + (soKM - STANDARD_KM_2) * GRAB_CAR_UPPER_19;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM + (STANDARD_KM_2 - 1) * GRAB_SUV_1TO_19 + (soKM - STANDARD_KM_2) * GRAB_SUV_UPPER_19;
		} else {
			tien = GRAB_BLACK_1KM + (STANDARD_KM_2 - 1) * GRAB_BLACK_1TO_19 + (soKM - STANDARD_KM_2) * GRAB_BLACK_UPPER_19;
		}
		return tien;
	}
	
	public static float tinhTienCho(int thoiGianCho, int loaiGrab) {
		float tien = 0;
		if (thoiGianCho >= STANDARD_WAIT_TIME) {
			int soLanTinh = Math.round((thoiGianCho * 1.0f) / 3);
			if (loaiGrab == 1) {
				tien = soLanTinh * GRAB_CAR_WAIT;
			} else if (loaiGrab == 2) {
				tien = soLanTinh * GRAB_SUV_WAIT;
			} else {
				tien = soLanTinh * GRAB_BLACK_WAIT;
			}
		}
		return tien;
	}
	
	public static float thanhTien(float soKM, int loaiGrab, int thoiGianCho) {
		float thanhTien = 0;
		if (soKM <= STANDARD_KM_1) {
			thanhTien = tinhTienKM1(loaiGrab) + tinhTienCho(thoiGianCho, loaiGrab);
		} else if (soKM > STANDARD_KM_2) {
			thanhTien = tinhTienKMUpper19(soKM, loaiGrab) + tinhTienCho(thoiGianCho, loaiGrab);
		} else {
			thanhTien = tinhTienKM1To19(soKM, loaiGrab) + tinhTienCho(thoiGianCho, loaiGrab);
		}
		return thanhTien;
	}
	
	public static float nhapSoKM(Scanner scan) {
		float soKM;
		System.out.println("Vui lòng nhập số KM đi được: ");
		soKM = Float.parseFloat(scan.nextLine());
		return soKM;
	}
	
	public static int nhapThoiGianCho(Scanner scan) {
		int thoiGianCho;
		System.out.println("Vui lòng nhập thời gian chờ: ");
		thoiGianCho = Integer.parseInt(scan.nextLine());
		return thoiGianCho;
	}
	
	public static void inDeMuc() {
		String text = String.format("%52s", "CHI TIẾT HOÁ ĐƠN");
		System.out.println(text + "\n");
		text = String.format("%-20s", "CHI TIẾT");
		System.out.print(text);
		text = String.format("%-20s", "SỬ DỤNG");
		System.out.print(text);
		text = String.format("%-30s", "ĐƠN GIÁ (1000đ)");
		System.out.print(text);
		text = String.format("%-20s", "THÀNH TIỀN (1000đ)");
		System.out.println(text);
	}
	
	public static void inKM1(float soKM, int loaiGrab) {
		String text = String.format("%-20s", "KM ĐẦU TIÊN");
		System.out.print(text);
		if (soKM > STANDARD_KM_1) {
			soKM = STANDARD_KM_1;
		}
		text = String.format("%-20s", soKM);
		System.out.print(text);
		int grabKM1;
		if (loaiGrab == 1) {
			grabKM1 = GRAB_CAR_1KM;
		} else if (loaiGrab == 2) {
			grabKM1 = GRAB_SUV_1KM;
		} else {
			grabKM1 = GRAB_BLACK_1KM;
		}
		text = String.format("%-30s", grabKM1);
		System.out.print(text);
		text = String.format("%-20s", grabKM1);
		System.out.println(text);
	}
	
	public static void inKM1To19(float soKM, int loaiGrab) {
		float soKM2;
		if (soKM > STANDARD_KM_2) {
			soKM2 = STANDARD_KM_2 - 1;
		} else {
			soKM2 = soKM - STANDARD_KM_1;
		}
		String text = String.format("%-20s", "Từ " + STANDARD_KM_1 +" đến " + (soKM2 + 1));
		System.out.print(text);
		text = String.format("%-20s", soKM2);
		System.out.print(text);
		int grabKM2;
		if (loaiGrab == 1) {
			grabKM2 = GRAB_CAR_1TO_19;
		} else if (loaiGrab == 2) {
			grabKM2 = GRAB_SUV_1TO_19;
		} else {
			grabKM2 = GRAB_BLACK_1TO_19;
		}
		text = String.format("%-30s", grabKM2);
		System.out.print(text);
		float thanhTien2 = soKM2 * grabKM2;
		text = String.format("%-20s", thanhTien2);
		System.out.println(text);
		
	}
	
	public static void inKMUpper19(float soKM, int loaiGrab) {
		String text = String.format("%-20s", "Từ " + STANDARD_KM_2 + " đến " + soKM);
		System.out.print(text);
		text = String.format("%-20s", (soKM - STANDARD_KM_2));
		System.out.print(text);
		int grabKM3;
		if (loaiGrab == 1) {
			grabKM3 = GRAB_CAR_UPPER_19;
		} else if (loaiGrab == 2) {
			grabKM3 = GRAB_SUV_UPPER_19;
		} else {
			grabKM3 = GRAB_BLACK_UPPER_19;
		}
		text = String.format("%-30s", grabKM3);
		System.out.print(text);
		float thanhTien3 = (soKM - STANDARD_KM_2) * grabKM3;
		text = String.format("%-20s", thanhTien3);
		System.out.println(text);
		
	}
	
	public static void inThoiGianCho(int thoiGianCho, int loaiGrab) {
		String text = String.format("%-20s", "Thời gian chờ");
		System.out.print(text);
		text = String.format("%-20s", thoiGianCho);
		System.out.print(text);
		int grabWait;
		if (loaiGrab == 1) {
			grabWait = GRAB_CAR_WAIT;
		} else if (loaiGrab == 2) {
			grabWait = GRAB_SUV_WAIT;
		} else {
			grabWait = GRAB_BLACK_WAIT;
		}
		text = String.format("%-30s", grabWait);
		System.out.print(text);
		float tienCho = tinhTienCho(thoiGianCho, loaiGrab);
		text = String.format("%-20s", tienCho);
		System.out.println(text);
	}
	
	public static void inTongTien(float soKM, int loaiGrab, int thoiGianCho) {
		float thanhTien = thanhTien(soKM, loaiGrab, thoiGianCho);
		String text = String.format("%78s", "TỔNG TIỀN: " + thanhTien);
		System.out.println(text);
	}
	
	public static void inTong(float soKM, int loaiGrab, int thoiGianCho) {
		inDeMuc();
		inKM1(soKM, loaiGrab);
	    if (soKM > STANDARD_KM_2){
			inKM1To19(soKM, loaiGrab);
			inKMUpper19(soKM, loaiGrab);
		} else if (soKM > STANDARD_KM_1 && soKM <= STANDARD_KM_2) {
			inKM1To19(soKM, loaiGrab);
		}
	    if (thoiGianCho >= STANDARD_WAIT_TIME) {
	    	inThoiGianCho(thoiGianCho, loaiGrab);
	    }
		inTongTien(soKM, loaiGrab, thoiGianCho);
	}

	public static void main(String[] args) {
		
		int loaiGrab = chonGrab();
		Scanner scan = new Scanner(System.in);
		float soKM = nhapSoKM(scan);
		int thoiGianCho = nhapThoiGianCho(scan);
		float thanhTien = thanhTien(soKM, loaiGrab, thoiGianCho);
		System.out.println("Số tiền phải trả là: " + thanhTien);
		inTong(soKM, loaiGrab, thoiGianCho);
		
	}

}
