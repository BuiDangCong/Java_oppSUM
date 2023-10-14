package Test;

import Main.Danhsachsinhvien;
import Main.Sinhvien;

import java.io.*;
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.OutputStream;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Danhsachsinhvien ddsv = new Danhsachsinhvien();
        int luaChon = 0;


        do {
            System.out.println("MENU______________________");
            System.out.println("Vui lòng lựa chọn chức năng:");
            System.out.println(
                    "1.	Thêm sinh viên vào danh sách.\n"
                            + "2.	In danh sách sinh viên ra màn hình.\n"
                            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                            + "5.	Làm rỗng danh sách sinh viên.\n"
                            + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                            + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "10.	Lưu danh sách sinh viên xuống tập tin.\n"
                            + "11.	Đọc danh sách sinh viên từ tập tin.\n"
                            + "12.   Thoát khỏi chương trình"
            );
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhập mã sinh viên :");
                String masinhVien = sc.nextLine();
                System.out.println("Nhập họ và tên :");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhập năm sinh :");
                int namSinh = sc.nextInt();
                System.out.println("Nhập điểm trung bình :");
                Float diemTrungBinh = sc.nextFloat();
                Sinhvien sinhvien = new Sinhvien(masinhVien, hoVaTen, namSinh, diemTrungBinh);
                ddsv.addSinhvien(sinhvien);

            } else if (luaChon == 2) {
                ddsv.inDanhSach();
            } else if (luaChon == 3) {
                System.out.println(ddsv.kiemTraDanhSachRong());
            } else if (luaChon == 4) {
                System.out.println(ddsv.laySoLuongSinhVien());
            } else if (luaChon == 5) {
                ddsv.lamRongDanhSach();
            } else if (luaChon == 6) {
                System.out.println("Nhập mã sinh viên :");
                String masinhVien = sc.nextLine();
                System.out.println(ddsv.kiemTraSinhVien(new Sinhvien(masinhVien)));
            } else if (luaChon == 7) {
                System.out.println("Nhập mã sinh viên :");
                String masinhVien = sc.nextLine();
                System.out.println(ddsv.xoaSịnhVien(new Sinhvien(masinhVien)));
            } else if (luaChon == 8) {
                System.out.println("Nhập họ và tên :");
                String hoVaTen = sc.nextLine();
                ddsv.timSinhVien(hoVaTen);
            } else if (luaChon == 9) {
                ddsv.sapXepGiamdan();
                ddsv.inDanhSach();
            } else if (luaChon == 10) {
                System.out.println("nhập tên file");
                String tenFile = sc.nextLine();
                File f = new File(tenFile);
                ddsv.ghiDulieuxuongfile(f);
            } else if (luaChon == 11) {
                System.out.println("nhập tên file");
                String tenFile = sc.nextLine();
                File f = new File(tenFile);
                ddsv.docDuLieuTuFile(f);
            } else if (luaChon == 12) {
                luaChon = 1;
            }

        } while (luaChon != 0);
    }
}
