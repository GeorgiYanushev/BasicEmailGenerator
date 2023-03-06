import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstname;
        String lastname;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter First Name:");
        firstname=in.nextLine();
        System.out.print("Enter Last Name:");
        lastname=in.nextLine();
        User person=new User(firstname,lastname);
        person.PrintAllInfo();
    }
}