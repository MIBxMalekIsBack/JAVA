package labsix;

public class Employee {
    private String empNo, empName, empGender, title;
    private final double basicSal = 1000.00;
    private double empComm, empSal;
    
    public Employee(){
        empNo = "Unassigned";
        empGender = "Unassigned";
        empComm = 0.0;
        empSal = 0.0;
        empName = "Unassigned";
        title = "Unassigned";
    }
    public void getEmpInfo(String ID, String name, String gender, double comm, double sal){
        empNo = ID;
        empName = name;
        empGender = gender;
        empComm = comm;
        empSal = sal;
        salaryCal();
        titleCheck();
    }
    
    private void salaryCal(){
        empSal = basicSal + empSal + empComm;
    }
    
    private void titleCheck() {
        if (empGender.equals("Male"))
            title = "Mr.";
        else
            title = "Ms.";
    }
    
    public String displayAnswer(){
        return (title + " " + empName + ". This month you have earned " +
                "RM " + empSal + ".");
    }
}
