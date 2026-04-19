import java.util.Scanner;
public class Scholarship{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double GPA;
        
        System.out.println("Enter GPA (0.0 - 4.0): ");
        GPA = sc.nextDouble();
        
        if(GPA < 0 || GPA > 4) {
            System.out.println("Invalid GPA!");
        }
        
        else if (GPA >= 3.5){
            System.out.println("Eligible for scholarship");
        }else{
            System.out.println("Not Eligible for scholarship");
        }
        sc.close();
        }
    }