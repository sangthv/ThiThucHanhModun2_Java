package views;

import cotroller.ManagerStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuStudent {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        ManagerStudent  managerStudent = new ManagerStudent();
        while (true) {
            int choice = -1;
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN----");
            System.out.println("chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. cập nhập");
            System.out.println("4. xóa");
            System.out.println("5. sắp xếp");
            System.out.println("6. đọc từ file");
            System.out.println("7. ghi từ file");
            System.out.println("8. thoát");
            System.out.println("chọn chức năng: ");
            while (choice == -1) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println(" bạn chọn sai định dạng phải chọn số ? ");
                }
            }
            switch (choice) {
                case 1:
                    managerStudent.showStudent();
                    break;
                case 2:
                    managerStudent.addStudent();
                    break;
                case 3:
                    managerStudent.editProduct();
                    break;
                case 4:
                    managerStudent.deleteStudent();
                    break;
                case 5:
                    try {
                        System.out.println("1. Sắp xếp điểm trung bình tăng dần");
                        System.out.println("2.  Sắp xếp điểm trung bình giảm dần");
                        System.out.println("3. thoát");
                        int case5 = Integer.parseInt(scanner.nextLine());
                        switch (case5){
                            case 1:
                                    managerStudent.sortMintoMax();
                                break;
                            case 2:
                                    managerStudent.sortMaxtoMin();
                                break;
                            case 3:
                                menu();
                                break;
                        }
                        break;
                    } catch (Exception e){
                        System.out.println("Bạn đã nhập sai định dạng");
                    }
                    break;
                case 6:
                    managerStudent.readFromFile();
                    break;
                case 7:
                    managerStudent.writeToFile();
                    break;
                case 8:
                    System.out.println("thoát chương trình");
                    return;
            }
        }
    }
}

