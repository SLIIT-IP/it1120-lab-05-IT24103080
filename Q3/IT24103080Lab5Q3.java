import java.util.Scanner;
public class IT24103080Lab5Q3
{
     static final double charges_per_day = 48000.00;
     static final double discount1 = 0.1;    //discount(10%) = 10/100
     static final double discount2 = 0.2;    //discount(20%) = 20/100
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Satart Date (1-31): ");
         int num1 = input.nextInt();
         System.out.print("Enter End Date(1-31): ");
         int num2 = input.nextInt();
         int days = num2 - num1;   //Number of days reserved
         double cost = charges_per_day*days;    // Total amount without discount
         if(num1 < 1 || num1 > 31)
         {
             System.out.print("Error: Days must be between 1 and 31");
         }
         else if(num2 < 1 || num2 > 31)
         {
             System.out.print("Error: Days must be between 1 and 31");
         }
         else if(num1 > num2)
         {
             System.out.print("Error: Start Date must be less than End Date");
         }
         else
         {
             System.out.println("Room charge per Day: Rs."+charges_per_day);
             System.out.println("Number of Days Reserved: "+days);
             double cost1 = cost - (cost*discount1);  
             double cost2 = cost - (cost*discount2);
            if (days < 3) 
            {
                System.out.println("Total Amount to be paid: "+cost);
            } 
            else if (days >= 3 || days <= 4) 
            {
                System.out.println("Total Amount to be paid: "+cost1);
            } 
            else 
            {
                System.out.println("Total Amount to be paid: "+cost2);
            }
            
         }

         
     }
}
 
