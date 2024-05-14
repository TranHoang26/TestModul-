import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DanhSachBenhAn {
    public static void xemDanhSachBenhAn() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("BenhAnThuong"));
            String line;

            System.out.println("Danh sách bệnh án:");
            while ((line = reader.readLine()) != null) {
                String[] benhAnData = line.split(",");
                int soThuTuBenhAn = Integer.parseInt(benhAnData[0]);
                String maBenhAn = benhAnData[1];
                String maBenhNhan = benhAnData[2];
                String tenBenhNhan = benhAnData[3];
                String ngayNhapVien = benhAnData[4];
                String ngayRaVien = benhAnData[5];
                String lyDoNhapVien = benhAnData[6];
                String phiNamVien = benhAnData[7];

                System.out.println("Số thứ tự bệnh án: " + soThuTuBenhAn);
                System.out.println("Mã bệnh án: " + maBenhAn);
                System.out.println("Mã bệnh nhân: " + maBenhNhan);
                System.out.println("Tên bệnh nhân: " + tenBenhNhan);
                System.out.println("Ngày nhập viện: " + ngayNhapVien);
                System.out.println("Ngày ra viện: " + ngayRaVien);
                System.out.println("Lý do nhập viện: " + lyDoNhapVien);
                System.out.println("Phí nằm viện: " + phiNamVien);
                System.out.println("------------------------");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
