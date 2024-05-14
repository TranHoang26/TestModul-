import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void Menu(){
        while (true){
            try{
                System.out.println("Chọn chức năng");
                System.out.println("1 : Thêm Mới");
                System.out.println("2 : Xóa Bệnh Án");
                System.out.println("3 : Xem Danh Sách Bệnh Án");
                System.out.println("4 : Thoát");
                Scanner scanner = new Scanner(System.in);
                int luaChon = scanner.nextInt();
                switch (luaChon){
                    case 1:
                        ThemBenhAn.themMoiBenhAn();
                        break;
                    case 2:
                        XoaBenhAn.xoaBenhAnTheoMa(scanner.nextLine());
                        break;
                    case 3:
                        DanhSachBenhAn.xemDanhSachBenhAn();
                        break;
                    case 4:
                        return;
                }
            }catch (Exception e){
                System.out.println("Không có chức năng này, vui lòng chọn lại");

            }
        }

    }
}
