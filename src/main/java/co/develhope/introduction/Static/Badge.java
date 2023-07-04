package co.develhope.introduction.Static;

import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }

    private String randGeneratedStr(int l){

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // creating a StringBuffer size of AlphaNumericStr

        StringBuilder s = new StringBuilder(l);

        int i;

        for ( i=0; i<l; i++) {

            //generating a random number using math.random()

            int ch = (int)(AlphaNumericString.length() * Math.random());

            //adding Random character one by one at the end of s

            s.append(AlphaNumericString.charAt(ch));

        }

        return s.toString();
    }

    private String generateBadgeIdCode(){
        return randGeneratedStr(3) + employee.name + employee.surname + randGeneratedStr(3);
    }


    public void showBadgeDetails() {
        System.out.println(
                "Badge{" +
                        "badgeIdCode='" + badgeIdCode + '\'' +
                        ", employee=" + employee.getEmployeeDetails() + '\'' +
                        ", totalNumberOfEmployees="+ totalNumberOfEmployees +
                        '}'
        );
    }

    Badge(Employee employeeThatNeedsBadge ){
        keepTrackOfEmployeesNumber();

        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }
}
