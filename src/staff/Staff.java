import java.util.Scanner;

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

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
