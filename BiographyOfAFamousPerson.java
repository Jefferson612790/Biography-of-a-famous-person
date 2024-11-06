
import java.util.Scanner;

public class BiographyOfAFamousPerson {

   
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner (System.in);
        
       //Information about Rodrigo Duterte
       System.out.println("lets learn about Rodrigo Duterte!");
       
       //Various Aspect of Rogrigo Duterte
       System.out.print("What is Rodrigo Duterte's full name?");
       String fullname = scanner.nextLine();
       
       System.out.print("Enter the start year of Duterte's presidential term:");
       String endYear = scanner.nextLine();
       
       System.out.print("What is his date of birth?");
       String birthDate = scanner.nextLine();
       
       System.out.print("What is his profession?");
       String profession = scanner.nextLine();
       
       System.out.print("What position did he hold in the Philippines?");
       String position = scanner.nextLine();
       
       System.out.print("What is one major policy or initiative he is known for? ");
       String policy = scanner.nextLine(); 
       
       System.out.print("Enter Duterte hometown:");
       String hometown = scanner.nextLine();
       
       System.out.print("Enter one major politicial issue during Duterte presidency:");
       String politicialIssue = scanner.nextLine();
       
       System.out.print("What is Duterte's stance on illegal drugs? ");
       String drugsStance = scanner.nextLine();
       
       
       //Output
       System.out.println("Information about Rodrigo Duterte: ");
       System.out.println("Full Name: + fullname");
       System.out.println("You entered: " + endYear);
       System.out.println("Date of Birth: " + birthDate);
       System.out.println("Profession: " + profession);
       System.out.println("Position Held: " +position);
       System.out.println("Major Policy/Initiative: "+ policy);
       System.out.println("You entered: " + hometown);
       System.out.println("You entered: " + politicialIssue);
       System.out.println("You entered: " + drugsStance);
       
       
       
       
       
       
       
       
       
       
      
     
       
  
    }
    
}
