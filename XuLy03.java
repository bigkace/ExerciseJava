
public class XuLy03 {

	public XuLy03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int a[] = {1, 8, 2, 9, 12, 9, -6};
		lietKeSoAmNhoNhat(a);

	}
	
	public static int timSoAmDauTien(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				return i;
			}
		}
		return -1;
	}
	
	public static int timSoAmNhoNhat(int a[]) {
		int indexSoAmNhoNhat = timSoAmDauTien(a);
		if (indexSoAmNhoNhat == -1) {
			return -1;
		} else {
			for (int i = indexSoAmNhoNhat + 1; i < a.length; i++) {
				if (a[i] < a[indexSoAmNhoNhat]) {
					indexSoAmNhoNhat = i;
				}
			}
			return indexSoAmNhoNhat;
		}
	}
	
	public static void lietKeSoAmNhoNhat(int a[]) {
		int indexSoAmNhoNhat = timSoAmNhoNhat(a);
		if (indexSoAmNhoNhat == -1) {
			System.out.println("Mảng không tồn tại số âm");
		} else {
			System.out.println("Số âm nhỏ nhất " + a[indexSoAmNhoNhat] + " tồn tại tại chỉ số: ");
			for (int i = 0; i < a.length; i++) {
				if (a[i] == a[indexSoAmNhoNhat]) {
					System.out.print(i + "\t");
				}
			}
		}
	}

}
