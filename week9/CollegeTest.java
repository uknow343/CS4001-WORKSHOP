public class CollegeTest {
 
    public static void main(String[] args) {
 
        Teacher teacher1 = new Teacher(101, "rohan", 40000, "Math", 5000);
 
        Staff staff1 = new Staff(201, "Bina Karki", 20000, 160, 150);
 
        System.out.println("\nTeacher");
        System.out.println("ID : " + teacher1.id);
        System.out.println("Name : " + teacher1.name);
        System.out.println("Subject : " + teacher1.subject);
        System.out.println("Basic Salary  : Rs. " + teacher1.basicsalary);
        System.out.println("Bonus : Rs. " + teacher1.bonus);
        System.out.println("Annual Salary : Rs. " + teacher1.calculateAnnualSalary());
 
        System.out.println("\nStaff");
        System.out.println("ID : " + staff1.id);
        System.out.println("Name : " + staff1.name);
        System.out.println("Working Hours : " + staff1.workhour);
        System.out.println("Rate Per Hour : Rs. " + staff1.ratePerHour);
        System.out.println("Salary : Rs. " + staff1.calculateSalary());
 
        System.out.println("\nCollege Name : " + Person.collegeName);
    }
}
 