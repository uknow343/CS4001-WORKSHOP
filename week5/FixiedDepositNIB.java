import java.util.Scanner;
public class FixiedDepositNIB{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        char choice = 'y';
        
         while (choice == 'y' || choice == 'Y') {
             
            System.out.println("Enter Deposit Ammount (rs.): ");
            double P = sc.nextDouble();
        
            
            if (P < 1000) {
                System.out.println("Minimum deposit is rs. 1000.");
                continue;
            }
            System.out.println("Enter anual intrest rate (8-12%): ");
            double annualRate = sc.nextDouble();
            
            if(annualRate < 8 || annualRate > 12){
                System.out.println("Rate must be between 8% and 12%. ");
                continue;
            }
            System.out.println("enter duration in years (max 5 years): ");
            int years = sc.nextInt();
            
            if (years>5) {
                System.out.println("Maximum duration is 5 years. ");
                continue;
            }
            double r = annualRate / 100;
            double monthlyRate = r / 12;
            int months = years = 12;
            double A = P * Math.pow((1 + monthlyRate), months);
            double feeRate = 0.005;
            double fee = A * feeRate;
            double finalAmmount = A - fee;
            
            System.out.println("\n FD DETAILS ");
            System.out.println("Principle: RS. "+P);
            System.out.println("Rate: " + annualRate + "%");
            System.out.println("Duration: " + years + "years");
            System.out.println("Maturity Amount (before fee): Rs. " + A);
            System.out.println("Processing Fee (0.5%): Rs. " + finalAmmount);
            System.out.println("\n Do  you want to calculate another FD? (y/n): ");
            choice = sc.next().charAt(0);
            
            }
            sc.close();
            System.out.println("Thank you!");
        }
        }