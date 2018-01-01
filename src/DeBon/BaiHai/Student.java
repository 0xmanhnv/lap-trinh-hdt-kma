/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeBon.BaiHai;

import java.util.Scanner;

/**
 *
 * @author nguyenmanh
 */
public class Student extends Person{
   private String maSV;
   private String email;
   private float diemTongKet;

    public Student() {
        super();
    }

    public Student(String maSV, String email, float diemTongKet, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(float diemTongKet) {
        this.diemTongKet = diemTongKet;
    }
    
    public void nhapThongTin(){
        Scanner input = new Scanner(System.in);
        
        super.nhapThongTin();
        System.out.print("Ma sinh vien: ");
        this.maSV = input.nextLine();
        
        System.out.print("Email: ");
        this.email = input.nextLine();
        
        System.out.print("Diem tong ket: ");
        this.diemTongKet = input.nextFloat();
    }
    
    public void inThongTin(){
        super.inThongTin();
        
        System.out.println("Ma SV: " + this.maSV);
        System.out.println("Email: " + this.email);
        System.out.println("Diem tong ket: " + this.diemTongKet);
    }
}
