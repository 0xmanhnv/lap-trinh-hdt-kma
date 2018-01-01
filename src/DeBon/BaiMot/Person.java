/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeBon.BaiMot;

import java.util.Scanner;

/**
 *
 * @author nguyenmanh
 */
public class Person {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh; // có thể để int nhập 0.nữ 1.nam , 2 orther
    // Mình để string cho dễ
    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
    public void nhapThongTin(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhập Thông tin!");
        System.out.print("Họ tên: ");
        this.hoTen = input.nextLine();
        System.out.print("Ngay sinh ( dd/mm/yyyy): ");
        this.ngaySinh = input.nextLine();
        
        // check gioi tinh khi nhap
        int checkGender;
        do{
            System.out.print("Gioi tinh (0.nu , 1.nam, 2.orther) : ");
            checkGender = input.nextInt();
            
            if(checkGender != 1 && checkGender != 0 && checkGender != 2){
                System.err.println("Nhap dung voi huong dan!");
            }
        }while(checkGender != 1 && checkGender != 0 && checkGender != 2);
        
        if(checkGender == 2){
            this.gioiTinh = "orther";
        }else {
           this.gioiTinh = checkGender == 1 ? "Nam" : "Nu";
        }
        
        // khoi tao lai input, xoa bo dem
        input = new Scanner(System.in);
        System.out.print("Dia chi: ");
        this.diaChi = input.nextLine();
    }
    
    // function in ra thong tin
    public void inThongTin(){
        System.out.println("Thong tin ban nhap");
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("Gioi tinh: " + this.gioiTinh);
        System.out.println("Dia chi: " + this.diaChi);
    }
    
}
