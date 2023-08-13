import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("please write a greeting");
//        String greeting = scanner.nextLine();
//
//
//        System.out.println("please enter your age");
//        int age = scanner.nextInt();
//
//        System.out.println("Hi Man, your age is : " + age + " " + greeting);

        //exercise
        //ask user to give you name
        //ask user to give surname
        //ask user to provide the age
        //print username , surname and age.

        //scanner declaration
        Scanner scanner = new Scanner(System.in);
        //getting the name
        System.out.println("please enter your name");
        String userName = scanner.nextLine();
        //getting the surname
        System.out.println("please enter your surname");
        String surname = scanner.nextLine();
        //getting the age
        System.out.println("please enter your age");
        int age = scanner.nextInt();
        //print everything
        System.out.println("Hi, your name is: " + userName +" and your surname is: " + surname + " and your age is: " + age);








    }
}
