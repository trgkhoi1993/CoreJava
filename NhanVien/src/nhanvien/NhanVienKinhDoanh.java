/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;
import java.util.*;

/**
 *
 * @author hv
 */
public class NhanVienKinhDoanh extends NhanVien1 {
    private static int doanhSo, luongKinhDoanh, luongThuong;
    Scanner sc = new Scanner (System.in);
    NhanVien1 NhanVien = new NhanVien1();
    public int luongKinhDoanh()
    {
        System.out.println ("Nhap Luong Kinh Doanh: ");
        return luongKinhDoanh;       
    } 
    public int doanhSo ()
    {
        System.out.println ("Nhap vao doanh so cua NVKD: ");
        return doanhSo;
    }
    
    @Override
    public int luongThuong ()
    {
        luongThuong = NhanVienKinhDoanh.luongKinhDoanh * NhanVienKinhDoanh.doanhSo;
        return luongThuong;
    }
            
}
