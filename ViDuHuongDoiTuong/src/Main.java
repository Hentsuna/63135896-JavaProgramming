public class Main {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham(2, "Bánh chuối", "Đồ ăn nhanh", "bc.jpg");
        sp1.setMaSanPham(1);
        sp1.setTenSanPham("Bia SG");
        sp1.setLoaiSanPham("Đồ uống có cồn");
        sp1.setAnhSanPham("sg.png");

        String thongtinSP1 = sp1.toString();
        String thongtinSP2 = "Mã SP2 là " + sp2.getMaSanPham();
        thongtinSP2 += "Tên SP2 là " + sp2.getTenSanPham();

        System.out.println(thongtinSP1);
        System.out.println(thongtinSP2);
    }
}