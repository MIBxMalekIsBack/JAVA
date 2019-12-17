package lab16;

public class Student {
    private String name;
    private int age;
    private double cgpa;
    
    public Student(){}
    
    public Student(String n, int a, double c){
        name = n;
        age = a;
        cgpa = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCgpa() {
        return cgpa;
    }
    
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    
    @Override
    public String toString(){
        return "Name : " + name +
                "\nAge : " + age +
                "\nCGPA : " + cgpa;
    }
    
}
