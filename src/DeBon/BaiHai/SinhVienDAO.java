/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeBon.BaiHai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenmanh
 */
public class SinhVienDAO {
    List<Student> studentList = new ArrayList();
    File f = new File("sinhvien.dat");
    public List<Student> getAll(){
        this.loadFile();
        return this.studentList;
    }
    
    public void loadFile(){
        BufferedReader bfr = null;
        FileReader fr = null;
        this.studentList = new ArrayList<>();
        
        // neu khong tim thay file thi tao ra file moi
        if(this.f.exists() == false){
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                fr = new FileReader(f);
                bfr = new BufferedReader(fr);
                            
                String strInfo;
                while((strInfo = bfr.readLine()) != null){
                    String strArr[] = strInfo.split("\t");
                    
                    
                    Student st = new Student();
                    System.out.println(strArr[6]);
                    st.setMaSV(strArr[0]);
                    st.setHoTen(strArr[1]);
                    st.setGioiTinh(strArr[2]);
                    st.setNgaySinh(strArr[3]);
                    st.setEmail(strArr[4]);
                    st.setDiemTongKet(Float.parseFloat(strArr[5]));
                    st.setDiaChi(strArr[6]);
                    
                    this.studentList.add(st);
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
