import java.time.LocalDate;

public class BenhAnThuong extends BenhAn{
    private double phiNamVien;

    public BenhAnThuong(int soThuTuBenhAn, String maBenhAn, String maBenhNhan, String tenBenhNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, double phiNamVien) {
        super(soThuTuBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, String.valueOf(phiNamVien));
        this.phiNamVien = phiNamVien;
    }

    @Override
    public boolean validateData() {
        return true;
    }

    @Override
    public void printInfo() {
    }
}
