class Person {
    int id;
    String name;
    double basicsalary;
    static String collegeName = "Islington College"; 
 
    Person(int id, String name, double basicsalary){
        this.id = id;
        this.name = name;
        this.basicsalary = basicsalary;
    }
 
    double calculateAnnualSalary(){
        return basicsalary * 12;
    }
}