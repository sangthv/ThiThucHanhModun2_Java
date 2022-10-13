package models;

public class Student {
    private int id ;
    private String fullname;
    private int age;
    private String gender;
    private String adress;
    private double average;

    public Student() {
    }
    public Student(int id, String fullname, int age, String gender, String adress, double average) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
        this.average = average;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", adress='" + adress + '\'' +
                ", average=" + average +
                '}';
    }
}
