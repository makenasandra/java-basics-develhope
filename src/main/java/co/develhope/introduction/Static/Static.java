package co.develhope.introduction.Static;
public class Static {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Suzzie", "Muigai", "123 Parklands");

        Employee emp2 = new Employee("Bryan", "Kipyegon", "123 Athi River");

        Badge badge1 = new Badge(emp1);

        Badge badge2 = new Badge(emp2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }
}
