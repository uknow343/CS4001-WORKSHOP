class Staff extends Person {
 
    double workhour;
    double ratePerHour;
 
    Staff(int id, String name, double basicSalary, double workingHours, double ratePerHour){
        super(id, name, basicSalary);  
        this.workhour = workingHours;
        this.ratePerHour = ratePerHour;
    }
 
    double calculateSalary(){
        return workhour * ratePerHour;
    }
}