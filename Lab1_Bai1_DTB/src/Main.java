import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String hoTen;
        Double dTB;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên sinh viên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        dTB = sc.nextDouble();

        System.out.println("Sinh viên " + hoTen + " có điểm trung bình là: " + dTB);

    }
}
