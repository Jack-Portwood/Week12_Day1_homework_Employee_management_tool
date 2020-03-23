package Staff;

public abstract class Employee {

        private String name;
        private String NInum;
        private double salary;

        public Employee (String name, String NInum, double salary) {

            this.name = name;
            this.NInum = NInum;
            this.salary = salary;

        }

        //getters

    public String getName() {
        return name;
    }

    public String getNInum() {
        return NInum;
    }

    public double getSalary() {
        return salary;
    }

    //methods

    public double raiseSalary( double raise){
            return this.salary += raise;
        }

        public double payBonus (){
            return this.salary / 100;
        }
}


