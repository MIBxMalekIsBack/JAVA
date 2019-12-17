package exercise3;

public class UserInformation {
    
    private String name,gender;
    private String title;
    private int age;
    private double height,weight;

    public void setUserInfo(String Uname, int Uage, String Ugender, double Uheight){
        name = Uname;
        age = Uage;
        gender = Ugender;
        height = Uheight;
    }
   
    public int getAge() {
        return age;
    }
   
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
   
    public String getName() {
        return (name);
    }

    public String getGender() {
        return gender;
    }
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   
}
