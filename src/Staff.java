public abstract class Staff {
    protected int staffId;
    protected String name;
    protected int age;
    protected int phoneNumber;
    protected String email;

    ///CONSTRUCTOR
    public Staff() {
    }

    public Staff(int staffId, String name, int age, int phoneNumber, String email) {
        this.staffId = staffId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /////METHODS:
    @Override
    public String toString() {
        return "| ID          : " + staffId
                + "\n| Name        : " + name
                + "\n| Age         : " + age
                + "\n| Phone number: " + phoneNumber
                + "\n| Email       : "+ email
                + "\n--------------------------------";
    }

    public abstract int getRealSalary();
}
