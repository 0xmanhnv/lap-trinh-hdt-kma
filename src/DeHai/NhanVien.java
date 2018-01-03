/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeHai;

/**
 *
 * @author nguyenmanh
 */
public class NhanVien extends Person{
    private String phongBan;
    private int heSoLuong;
    private int thamNien;
    private Double luongCoBan;

    public NhanVien() {
        super();
    }

    public NhanVien(String phongBan, int heSoLuong, int thamNien, Double luongCoBan, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public Double tienLuong(){
        Double tienLuongThucLinh;
        float heSo = this.heSoLuong + (float)this.thamNien / 100;
        
        tienLuongThucLinh = this.luongCoBan * heSo;
        
        return tienLuongThucLinh;
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Phong ban: " + this.phongBan);
        System.out.println("He so luong: " + this.heSoLuong);
        System.out.println("Tham nien: " + this.thamNien);
        System.out.println("Luong co ban: " + this.luongCoBan);
        System.out.println("Luong thuc linh: " + this.tienLuong());
    }
    
}
