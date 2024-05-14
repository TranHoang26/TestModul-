import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class ThemBenhAn {
    private static int soThuTuBenhAn = 1;
    public static void themMoiBenhAn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã bệnh án:");
        String maBenhAn = scanner.nextLine();
        System.out.println("Nhập mã bệnh nhân:");
        String maBenhNhan = scanner.nextLine();
        System.out.println("Nhập tên bệnh nhân:");
        String tenBenhNhan = scanner.nextLine();
        System.out.println("Nhập ngày nhập viện (dd/MM/yyyy):");
        LocalDate ngayNhapVien = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập ngày ra viện (dd/MM/yyyy):");
        LocalDate ngayRaVien = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập lý do nhập viện:");
        String lyDoNhapVien = scanner.nextLine();
        System.out.println("Nhập chi phí nằm viện");
        String phiNamVien = scanner.nextLine();

        if (!kiemTraDuLieuHopLe(maBenhAn, maBenhNhan, ngayNhapVien, ngayRaVien, phiNamVien)) {
            System.out.println("Dữ liệu nhập vào không hợp lệ.");
            return;
        }

        BenhAn benhAnMoi = new BenhAn(soThuTuBenhAn++, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien) {
            @Override
            public boolean validateData() {
                return false;
            }
            @Override
            public void printInfo() {
            }
        };
        luuVaoFileCSV(benhAnMoi);
        System.out.println("Thêm mới bệnh án thành công.");
    }
    private static boolean kiemTraDuLieuHopLe(String maBenhAn, String maBenhNhan, LocalDate ngayNhapVien, LocalDate ngayRaVien, String phiNamVien) {
        return true;
    }
    private static void luuVaoFileCSV(BenhAn benhAn) {
        try {
            FileWriter writer = new FileWriter("BenhAnThuong", true);
            writer.append(String.join(",", String.valueOf(benhAn.soThuTuBenhAn), benhAn.maBenhAn, benhAn.maBenhNhan, benhAn.tenBenhNhan, benhAn.ngayNhapVien.toString(), benhAn.ngayRaVien.toString(), benhAn.lyDoNhapVien, benhAn.phiNamVien));
            writer.append("\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}




