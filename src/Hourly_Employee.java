
public class Hourly_Employee extends Employee {

    private int workedhours;
    private double accumulatedsalary;

    public Hourly_Employee(Syndicate syndicate,String name, String address, String type, String paymentMethod,double salary,
                           int workedhours,double accumulatedsalary,int employeeid)
    {
        super(syndicate,name,address,type,paymentMethod,salary,employeeid);
        this.workedhours = workedhours;
        this.accumulatedsalary = accumulatedsalary;
    }

    public double getAccumulatedsalary() {
        return accumulatedsalary;
    }

    public void setAccumulatedsalary(double accumulatedsalary) {
        this.accumulatedsalary += accumulatedsalary;
    }

    public int getWorkedhours() {
        return workedhours;
    }

    public void setWorkedhours(int workedhours) {
        this.workedhours = workedhours;
    }

    public String toString()
    {
        return (this.getName() + System.lineSeparator() + this.getAccumulatedsalary());
    }
}
