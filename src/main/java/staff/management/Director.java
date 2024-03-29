package staff.management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String nationalInsuranceNumber, int salary, String deptName,double budget) {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
    public double payBonus(){
        return this.salary * 1.02;
    }

}
