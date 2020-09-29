package staff;

public class FullTimeStaff extends Staff {
    private int penalty;
    private int salary;
    private int bonus;

    ///CONSTRUCTOR
    public FullTimeStaff() {
        name = "full time";
    }

    public FullTimeStaff(int staffId, String name, int age, int phoneNumber, String email, int penalty, int salary, int bonus) {
        super(staffId, name, age, phoneNumber, email);
        this.penalty = penalty;
        this.salary = salary;
        this.bonus = bonus;
    }

    /////METHODS:
    @Override
    public int getRealSalary() {
        return salary + bonus - penalty;
    }
}
