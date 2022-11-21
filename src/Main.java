import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static ArrayList<ArrayList> user = new ArrayList<ArrayList>();
    public static void main(String[] args)
    {
        System.out.println("press 1 to add data");
        System.out.println("press 2 to view data");
        System.out.println("press 3 to search data");
        System.out.println("press 4 to delete data");
        System.out.println("press 5 to exit");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
    }
    static void addemployee()
    {
        ArrayList<Object> a1 = new ArrayList<Object>();
        System.out.println("enter employee code");
        Scanner sc = new Scanner(System.in);
        int code =sc.nextInt();
        System.out.println("enter employee name");
        String name=sc.next();
        System.out.println("enter employee designation");
        String designation=sc.next();
        System.out.println("enter salary");
        int salary = sc.nextInt();
        System.out.println("enter company name");
        String company=sc.next();
        System.out.println("enter phone number");
        double phonenumber = sc.nextDouble();
        System.out.println("email");
        String email=sc.next();
        a1.add(code);
        a1.add(name);
        a1.add(designation);
        a1.add(salary);
        a1.add(company);
        a1.add(phonenumber);
        a1.add(email);
        user.add(a1);
        System.out.println("employee added");
    }

}

