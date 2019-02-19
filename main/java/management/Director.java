package management;

public class Director extends Manager {

    private double budget;

    public double getBudget() {
        return budget;
    }

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }
    @Override
    public double payBonus(){
        return this.salary/50.00;
    }
}
