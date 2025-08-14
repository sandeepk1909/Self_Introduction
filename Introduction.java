

import java.util.Scanner;

public class Introduction {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  name");
        String name =sc.nextLine();
        System.out.println("Enter your father name");
        String s=sc.nextLine();
        System.out.println("Enter your mother name");
        String a =sc.nextLine();
        System.out.println("Enter your address");
        String b =sc.nextLine();
        System.out.println("Enter your qualification");
        String c =sc.nextLine();
        System.out.println("How much percentage you get..!");
        int D =sc.nextInt();

        System.out.println(" MY INTRO");
        System.out.println("Good morning to all , My Name is " + name + "." + "  I'm From " + b + "," +"  My Father Name is " + s + "." +" My Mother name is  " + a + "." +"  I Completed My "+c+" Graduation in Vijaywada."+"  My percentage is:"+D+ ".."+"  Thanks to All....!");


    sc.close();

        
     }
     
}
    