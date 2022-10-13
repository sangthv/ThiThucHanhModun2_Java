package cotroller;

import IOStudent.IOStudent;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerStudent {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Student> students = new ArrayList<>();

    public Student inPut(){
        System.out.println("Nhập mã sinh viên : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ tên: ");
        String fullName = scanner.nextLine();
       int age =0;
        do {
            try {
                System.out.println("Nhập tuổi ");
                age =Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println(" bạn đã nhập sai định dạng , phải nhập số");
            }
        }while (age ==0);
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ ");
        String adress = scanner.nextLine();
        double average = 0;
        do {
            try {
                System.out.println("Nhập điểm trung bình  ");
                average = Double.parseDouble(scanner.nextLine());
            }catch (Exception e){
                System.out.println("bạn đã nhâ sai định dạng , phải nhập số vào");
            }
        }while (average==0);
        return new Student(id, fullName,age,gender,adress,average);
    }
    public void showStudent(){
        for (Student sp:students) {
            System.out.println("danh sách sản phẩm " + sp.toString());
        }
    }
    public void addStudent(){
        Student student = inPut();
        students.add(student);
    }
    public void editProduct(){
        System.out.println(" nhập mã sinh viên cần sửa:");
        int id= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i<students.size(); i++){
            if(students.get(i).getId()==id){
                students.set(i,inPut());
            }
        }
    }
    public void deleteStudent(){
        System.out.println(" nhập mã sinh viên muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId()==id) {
                System.out.println("bạn có muốn xóa không: Yes/No? ");
                if (scanner.nextLine().equalsIgnoreCase("y")) {
                    students.remove(students.get(i));
                    System.out.println("Xóa thành công!");
                    return;
                } else {
                    return;
                }
            }else {
                System.out.println("không tìm được sinh viên với mã sinh viên");
            }
        }
    }
    public void sortMintoMax() {
        Comparator<Student> com1 = (o1, o2) -> {
            if (o1.getAverage() < o2.getAverage()) {
                return -1;
            } else if (o1.getAverage() == o2.getAverage()) {
                return 0;
            } else {
                return 1;
            }

        };
        Collections.sort(students, com1);
    }
    public void sortMaxtoMin() {
        Comparator<Student> com1 = (o1, o2) -> {
            if (o1.getAverage() > o2.getAverage()) {
                return -1;
            } else if (o1.getAverage() == o2.getAverage()) {
                return 0;
            } else {
                return 1;
            }

        };
        Collections.sort(students, com1);
    }
    public void readFromFile() {
        students = IOStudent.read();
    }
    public void writeToFile() {
        IOStudent.write(students);
    }
}
