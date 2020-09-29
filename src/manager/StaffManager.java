package manager;

import staff.Staff;

import java.util.stream.IntStream;

public class StaffManager {
    public int numberOfStaff;
    Staff[] staffList;

    ///CONSTRUCTOR
    public StaffManager() {
        numberOfStaff = 1;
        staffList = new Staff[numberOfStaff];
    }


    //METHODS:
    public void updateStaffList(){
        Staff[] l = new Staff[numberOfStaff];

        IntStream.range(0, staffList.length).forEach(i -> l[i] = staffList[i]);
        staffList = l;
    }
    public void addStaff(Staff staff){
        this.staffList[numberOfStaff-1] = staff;
        numberOfStaff++;
    }

    public void showStaffList(){
        for (Staff s : staffList){
            System.out.print(s.toString());
        }
    }



    public void underAvarageList(){}
}
