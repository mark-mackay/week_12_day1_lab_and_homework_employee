package staff;

public abstract class Employee {
    private String name;
    private String niNumber;
    protected double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getNiNumber() {
        return niNumber;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void raiseSalary(double raise){
        if (raise >= 0.00) {
            this.salary += raise;
        }
    }
    public double payBonus(){
        return this.salary/100.00;
    }
}
