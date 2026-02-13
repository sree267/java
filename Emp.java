import java.util.Scanner;
public class Emp
{
    int Empno;
    String name;
    void getdata()
    {
        Scanner Scan=new Scanner(System.in);
        System.out.println("\n\n Enter Employe Name:");
        name=Scan.nextLine();
        System.out.println("\n\n Enter EmpNo:");
        Empno=Scan.nextInt();
    }
    void display()
    {
        System.out.println("Employee Name:"+name);
        System.out.println("Employee No:"+Empno);
    }
public static void main(String args[])
{
    Emp e =new Emp();
    e.getdata();
    System.out.println("\n\n Employee Details \n");
    System.out.println("\n\n --------------\n");
    e.display();  
}
}