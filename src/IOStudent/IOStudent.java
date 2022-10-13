package IOStudent;

import models.Student;

import java.io.*;
import java.util.ArrayList;

public class IOStudent {
   static File file = new File("E:\\modun2_java\\ThiThucHanhModun2\\src\\fileCSV\\CSV.txt");

    public static void write (ArrayList<Student> students) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : students) {
                bufferedWriter.write(student.getId()+ "," + student.getFullname() + "," + student.getAge()+ ","+ student.getGender()+ "," + student.getAdress() + "," + student.getAverage());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //đọc file
    public static ArrayList<Student> read (){
        ArrayList<Student> students =new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String str = bufferedReader.readLine();
            while (str != null) {
                String[] arr = str.split(",");
                int id = Integer.parseInt(arr[0]);
                String fullname = arr[1];
                int age = Integer.parseInt(arr[2]);
                String gender = arr[3];
                String adress = arr[4];
                double average = Double.parseDouble(arr[5]);
                Student student = new Student(id, fullname, age, gender, adress,average);
                students.add(student);
                str = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
