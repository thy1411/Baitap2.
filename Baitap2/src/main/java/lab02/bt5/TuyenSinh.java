/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class TuyenSinh {
    private List<ThiSinh> danhSachThiSinh;

    public TuyenSinh() {
        danhSachThiSinh = new ArrayList<>();
    }

    public void themThiSinh(ThiSinh thiSinh) {
        danhSachThiSinh.add(thiSinh);
    }

    public void hienThiThongTinThiSinh() {
        for (ThiSinh thiSinh : danhSachThiSinh) {
            thiSinh.hienThiThongTin();
            System.out.println("-------------------------");
        }
    }

    public ThiSinh timKiemThiSinhTheoSoBaoDanh(String soBaoDanh) {
        for (ThiSinh thiSinh : danhSachThiSinh) {
            if (thiSinh.getSoBaoDanh().equals(soBaoDanh)) {
                return thiSinh;
            }
        }
        return null;
    }
}