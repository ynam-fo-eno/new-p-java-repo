import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        String password = "pizza123";
        String entry;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password to log in.");
        entry = scanner.nextLine();

        if(password.compareTo(entry)==0)
        {
            double radius,height;
            System.out.println("Congrats- you can calculate a tank's volume now!\n First, enter tank's radius in meters.");
            radius=scanner.nextDouble();
            System.out.println("Now enter the height, also in metres.");
            height=scanner.nextDouble();
            System.out.println("Now enter the height, also in metres.");
            System.out.println("Given radius of "+radius+" and height of "+height+" metres...");
            System.out.println("...volume of beloved tank is "+String.format("%.4f",(Math.PI*radius*radius*height))+" cubic metres...");
            System.out.println("...and its capacity is "+String.format("%.4f",(Math.PI*radius*radius*height*1000))+" litres.");
        }
        else
        {
            System.out.println("Incorrect password-apologies, can't use this system!.\nNo tank for you looool!");
        }
        scanner.close();
    }
}
