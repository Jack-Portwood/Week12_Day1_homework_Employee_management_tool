package Staff.Management;

import Staff.Employee;

public class Director extends Employee {

    private int budget;

    public Director(String name, String NInum, double salary, int budget) {
        super(name, NInum, salary);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}
