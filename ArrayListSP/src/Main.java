import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SanPham> dsSanPham = new ArrayList<SanPham>();
        //SanPham sp1 = new SanPham(0, "Kem", null, null);
        SanPham sp2 = new SanPham(1, "Cơm", null, null);
        SanPham sp3 = new SanPham(2, "Phỏ", null, null);

        dsSanPham.add(new SanPham(0, "Kem", "Giải khát", null));
        dsSanPham.add(sp2);
        dsSanPham.add(sp3);

        for (SanPham x : dsSanPham) {
            System.out.println(x.toString());
        }

        for (int i = 0; i < dsSanPham.size(); i++) {
            SanPham sp = dsSanPham.get(i);
            System.out.println(sp.toString());
        }
    }
}