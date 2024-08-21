/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt5;

/**
 *
 * @author ADMIN
 */
public class ThiSinhKhoiA extends ThiSinh {
    private final String monThi = "Toán, Lý, Hoá";

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khối thi: A");
        System.out.println("Môn thi: " + monThi);
    }
}
