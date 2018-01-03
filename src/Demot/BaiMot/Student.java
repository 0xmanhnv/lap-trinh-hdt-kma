/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demot.BaiMot;

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
    
    
    public Student(String maSV, String email, float diemTongKet, String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.maSV = maSV;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Ma sinh vien: " + this.maSV);
        System.out.println("Email: " + this.email);
        System.out.println("Diem tong ket: " + this.diemTongKet);
    }
}
