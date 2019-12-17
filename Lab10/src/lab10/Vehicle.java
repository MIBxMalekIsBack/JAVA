package lab10;

public class Vehicle {
     private String color;
    private String type;
    private String transmission;

    public Vehicle(){  //like default constructor
        color = "unknown";
        type = "unknown";
        transmission = "unknown";
    }
    
    public Vehicle(String c, String t, String n){ 
        color = c;
        type = t;
        transmission = n;
    }
    
    public void printColor(int times){
        for(int i=1; i<=times; i++)
        System.out.println("Color is: " + color);
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public void printColor(){
        System.out.println("Color is: " + color);
    }
}
