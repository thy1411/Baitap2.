/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt2;

/**
 *
 * @author duyne
 */
public class chuongtrinh {
    public static void main(String[] args) {
        
        SinhVien itStudent = new SinhVienIT("Nguyen Van A", 8.0, 7.5, 6.5);
        itStudent.xuat();

    
        SinhVien bizStudent = new SinhVienBiz("Le Thi B", 7.0, 8.5);
        bizStudent.xuat();
    }
}
