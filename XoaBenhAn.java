import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class XoaBenhAn {
    public static void xoaBenhAnTheoMa(String maBenhAnXoa) {
        try {
            System.out.println("Nhập Mã Bệnh Án Muốn Xóa : ");
            Scanner scanner = new Scanner(System.in);
            maBenhAnXoa = scanner.nextLine();
            List<String> danhSachBenhAn = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("BenhAnThuong"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] benhAnData = line.split(",");
                    String maBenhAn = benhAnData[1];
                    if (!maBenhAn.equals(maBenhAnXoa)) {
                        danhSachBenhAn.add(line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try (PrintWriter writer = new PrintWriter(new FileWriter("BenhAnThuong"))) {
                for (String benhAn : danhSachBenhAn) {
                    writer.println(benhAn);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Bệnh án có mã " + maBenhAnXoa + " đã được xóa thành công.");
        }catch (Exception e){
            System.out.println("Vui Lòng Nhập Lại");
        }

    }
}
