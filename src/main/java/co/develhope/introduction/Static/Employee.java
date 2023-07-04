package co.develhope.introduction.Static;

public class Employee {
    String name;
    String surname;
    String address;

    Employee (String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }


    public String getEmployeeDetails() {
        return
                "name='" + this.name + '\'' +
                ", surname='" + this.surname + '\'' +
                ", address='" + this.address ;
    }
}
