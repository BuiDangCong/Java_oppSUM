package Main;

import java.io.Serializable;
import java.util.Objects;

public class Sinhvien implements Comparable<Sinhvien> , Serializable {
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private Float diemTrungbinh;

    public Sinhvien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public Sinhvien(String maSinhVien, String hoVaTen, int namSinh, Float diemTrungbinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungbinh = diemTrungbinh;
    }

    public Sinhvien() {

    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public Float getDiemTrungbinh() {
        return diemTrungbinh;
    }

    public void setDiemTrungbinh(Float diemTrungbinh) {
        this.diemTrungbinh = diemTrungbinh;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTrungbinh=" + diemTrungbinh +
                '}';
    }

    @Override
    public int compareTo(Sinhvien o) {
        return  this.maSinhVien.compareTo(o.maSinhVien);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sinhvien sinhvien = (Sinhvien) o;
        return  Objects.equals(maSinhVien, sinhvien.maSinhVien); }

    @Override
    public int hashCode() {
        return Objects.hash(maSinhVien, hoVaTen, namSinh, diemTrungbinh);
    }
}
