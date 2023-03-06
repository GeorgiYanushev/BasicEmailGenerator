import java.util.Scanner;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    public String department;

    private String email;

    public User(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        setDepartment();
        setRandomPassword();
        email=department.isEmpty()? this.firstName+"."+this.lastName+".CompanyEOD.com":this.firstName+"."+this.lastName+"@"+this.department+".CompanyEOD.com" ;
    }
    private void setDepartment(){
        System.out.print("DEPARTMENT CODES\n0 for None\n1 for Sales\n2 for Development\n3 for Accounting\nEnter Department:");
        Scanner in= new Scanner(System.in);
        int depChoice= in.nextInt();
        switch (depChoice){
            case 1:
                this.department= "Sales";
                break;
            case 2:
                this.department= "Development";
                break;
            case 3:
                this.department= "Accounting";
                break;
            case 0:
            default:
                this.department= "";

        }
    }
    private void setRandomPassword(){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
        char[] password= new char[12];
        int rand;
        for(int i=0;i<12;i++){
            rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        this.password=new String(password);
    }
    public void changePassword(String password){this.password=password;}
    public String getEmail(){return email;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public void PrintAllInfo(){
        System.out.println("Name: "+firstName+" "+lastName);
        if(department.isEmpty())
            System.out.println("Department: None");
        else
            System.out.println("Department: "+department);
        System.out.println("Email: "+email);
        System.out.println("Password: "+password);
    }
}
