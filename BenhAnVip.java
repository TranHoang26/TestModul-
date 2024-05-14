import java.time.LocalDate;

public class BenhAnVip extends BenhAn {
    private String loaiVIP;
    private LocalDate thoiHanVIP;

    public BenhAnVip(int soThuTuBenhAn, String maBenhAn, String maBenhNhan, String tenBenhNhan,
                          LocalDate ngayNhapVien, LocalDate ngayRaVien, String lyDoNhapVien, String phiNamVien) {
        super(soThuTuBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
        this.loaiVIP = loaiVIP;
        this.thoiHanVIP = thoiHanVIP;
    }

    @Override
    public boolean validateData() {
        return true;
    }

    @Override
    public void printInfo() {
    }
}

