package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;


    //Constructor
    public Manager(String name, String NInum, double salary, String deptName) {
        super(name, NInum, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

