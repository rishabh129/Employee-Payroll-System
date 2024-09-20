public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name, id);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    public double CalculateSalary(){
        return this.hoursWorked*this.hourlyRate;
    }

}
