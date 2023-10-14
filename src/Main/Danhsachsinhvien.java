package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Danhsachsinhvien {
    private List<Sinhvien> danhSach;

    public Danhsachsinhvien(List<Sinhvien> danhSach) {
        this.danhSach = danhSach;
    }

    public Danhsachsinhvien() {
        this.danhSach = new ArrayList<>();
    }

    //1.thêm sinh viên vào danh sách
    public void addSinhvien(Sinhvien sv) {
        this.danhSach.add(sv); // thêm thì thông thường thêm vào cuối danh sách
    }

    //2.In danh sách sinh viên ra màn hình
    public void inDanhSach() {
        for (Sinhvien sv :
                danhSach) {
            System.out.println(sv);
        }
    }

    //3.Kiểm tra danh sách sinh viên có rỗng hay không
    public boolean kiemTraDanhSachRong() {
        return danhSach.isEmpty();
    }

    //4.Lấy ra số lượng sinh viên trong danh sách
    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    //5.làm rỗng danh sách
    public void lamRongDanhSach() {
        this.danhSach.clear();
    }

    //6.Kiểm tra sinh viên có tồn tại trong danh sách hay không
    public boolean kiemTraSinhVien(Sinhvien sv) {
        return this.danhSach.contains(sv);
    }

    //7.Xoá 1 sinh viên dựa trên danh sách
    public boolean xoaSịnhVien(Sinhvien sv) {
        return this.danhSach.remove(sv);
    }

    //8. Tìm tất cả sinh viên dựa trên tên nhập từ bàn phím
    public void timSinhVien(String ten) {
        for (Sinhvien sv :
                danhSach) {
            if (sv.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sv);
            }

        }
    }

    //9.Xuất ra danh sách sinh viên có điểm từ cao đến thấp
    public void sapXepGiamdan() {
        Collections.sort(this.danhSach, new Comparator<Sinhvien>() {
            @Override
            public int compare(Sinhvien o1, Sinhvien o2) {
                if (o1.getDiemTrungbinh() < o2.getDiemTrungbinh()) {
                    return -1;
                } else if (o1.getDiemTrungbinh() > o2.getDiemTrungbinh()) {
                    return 1;
                } else
                    return 0;
            }
        });
    }

    //10.Ghi đối tượng xuống file
    public void ghiDulieuxuongfile(File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (Sinhvien sv : danhSach) {
                oos.writeObject(sv);
            }
            oos.flush();
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 11.Đọc đối tượng từ file
    public void docDuLieuTuFile(File file) {
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            Sinhvien sv =null;
            while (true){
                Object oj = ois.readObject();
              if (oj!=null){
                  sv = (Sinhvien) oj;
                this.danhSach.add(sv);
              }else {
                  break;
              }
            }

            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
