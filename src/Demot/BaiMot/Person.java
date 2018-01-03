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
public class Person {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
    public void hienThiThongTin(){
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Gioi tinh: " + this.gioiTinh);
    }
    
}
