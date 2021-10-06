import java.util.Scanner;
public class person
{
person()
{
name=" ";
gender=" ";
address=" ";
age="0";
}
void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name" +name);
String name=sc.nextLine();
System.out.println("Enter Gender" +gender);
String gender=sc.nextLine();
System.out.println("Enter address" +address);
String address=sc.NextLine();
Scanner sc1=new Scanner(System.in);
System.out.println("Enter age" +age);
int age=sc1.nextInt();
}
}

