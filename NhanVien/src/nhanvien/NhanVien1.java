
package nhanvien;
import java.util.*;
import java.io.*;

public class NhanVien1 {

    private String hoTen;
    protected int heSoLuong, SNGTru, phuCap, luongThuong, ThuNhapThue, Thue,ThucLinh, LuongCoBan,ThuNhap;
    static Scanner sc =  new Scanner (System.in);
    BufferedReader dataIn = new BufferedReader(new
              InputStreamReader( System.in) );

    public NhanVien1() {
        this.hoTen = "";
        this.heSoLuong = 0;
        this.SNGTru = 0;
        this.phuCap = 0;        
    }
    
    public String hoTen () throws IOException
    {
        System.out.print (" Nhap Ho Ten Nhan Vien : ");
        hoTen = dataIn.readLine();
        return hoTen;
    }
    public int HeSoLuong ()
    {
        System.out.println (" Nhap He So Luong");
        heSoLuong = sc.nextInt();
        return heSoLuong;
    }
    
    public int LuongCoban ()
    {
        System.out.println ("Nhap So Luong Co Ban: ");
        LuongCoBan = sc .nextInt();
        return LuongCoBan;
    }

     public int giamTruGiaCanh ()
     {
         System.out.println ("So Nguoi Giam Tru Gia Canh");
         SNGTru = sc.nextInt();
         return SNGTru;
     }
     public int PhuCap ()
     {
         System.out.println (" Phu Cap Trong Thang : ");
         phuCap = sc.nextInt();
         return phuCap;
     }
     
     public int TinhThuNhap (int heSoLuong, int LuongCoBan, int luongThuong)
     {
         ThuNhap = heSoLuong*LuongCoBan + luongThuong;
         return ThuNhap;
     }
     public int ThuNhapChiuThue (int ThuNhap, int SoNguoiTruGiaCanh )
     {
         ThuNhapThue = ThuNhap - 4000000 - SoNguoiTruGiaCanh*1600000;
         return ThuNhapThue;
     }
     public int ThueTNCN (int ThuNhapChiuThue)
     {
//         switch (ThuNhapChiuThue)
//             case (0 <= ThuNhapChiuThue && ThuNhapChiuThue <= 5000000):
          if ( 0 <= ThuNhapChiuThue && ThuNhapChiuThue < 5000000) {
             Thue = ThuNhapChiuThue *5/100;
         }
          else if (5000000 <= ThuNhapChiuThue && ThuNhapChiuThue < 10000000) {
             Thue = ThuNhapChiuThue *10/100;
         }
          else if ( 10000000 <= ThuNhapChiuThue && ThuNhapChiuThue < 18000000) {
             Thue = ThuNhapChiuThue *15/100;
         }
          else if (18000000<= ThuNhapChiuThue && ThuNhapChiuThue < 32000000) {
             Thue = ThuNhapChiuThue *20/100;
         }
                     else if (32000000<= ThuNhapChiuThue && ThuNhapChiuThue < 52000000) {
             Thue = ThuNhapChiuThue *25/100;
         }
          else if (52000000<= ThuNhapChiuThue && ThuNhapChiuThue < 80000000) {
             Thue = ThuNhapChiuThue *30/100;
         }
          else if (ThuNhapChiuThue > 80000000) {
             Thue = ThuNhapChiuThue *35/100;
         }
          else {
             Thue =0;
         }
          return Thue;
     }
     public int ThucLinh (int ThuNhap, int Thue)
     {
         ThucLinh = ThuNhap - Thue;
         return ThucLinh;
     }
    public int luongThuong ()
     
    {
        luongThuong = 0;
        return luongThuong;
    }
}
