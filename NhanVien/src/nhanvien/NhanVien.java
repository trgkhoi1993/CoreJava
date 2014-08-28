/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;
import java.util.*;
import java.io.*;
/**
 *
 * @author hv
 */
public class NhanVien  {

     static Scanner sc = new Scanner (System.in);
      static int a;
  
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         NhanVien1 NhanVien = new NhanVien1 ();
         NhanVien.hoTen();
         NhanVien.HeSoLuong();
         NhanVien.PhuCap();
         NhanVien.giamTruGiaCanh();
         System.out.println ("Nhap so 1 de chon NVKD: ");
         a=sc.nextInt();
         NhanVien.HeSoLuong();
         NhanVien.LuongCoban();
         NhanVien.luongThuong();
         
        
    }
}
