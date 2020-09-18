public class Program {
    public static void main(String[] args) {
        StaffManager company = new StaffManager();

        Staff staff1 = new FullTimeStaff();
        company.addStaff(staff1);
        company.updateStaffList();

        Staff staff2 = new PassTimeStaff();
        company.addStaff(staff2);

        System.out.println(company.staffList[0].toString());

        System.out.println(company.staffList[1].toString());
    }
}
