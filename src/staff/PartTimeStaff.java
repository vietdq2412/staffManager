package staff;

public class PartTimeStaff extends Staff {
    private int workTime;

    ///CONSTRUCTOR
    public PartTimeStaff() {
        name = "part time";
    }

    public PartTimeStaff(int staffId, String name, int age, int phoneNumber, String email, int workTime) {
        super(staffId, name, age, phoneNumber, email);
        this.workTime = workTime;
    }

    /////METHODS:
    @Override
    public int getRealSalary() {
        return workTime * 100000;
    }


}
