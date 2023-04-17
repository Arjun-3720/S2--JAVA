import java.util.Scanner;
class Mca{
        String dept,hod;
        int strength;
void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department:");
        dept = sc.next();
        System.out.println("Enter hod name:");
        hod = sc.next();
        System.out.println("Enter strength:");
        strength = sc.nextInt();
}
  void display(){
        System.out.println("Department is:"+dept);
        System.out.println("Hod is:"+hod);
        System.out.println("Strength is:"+strength);
}}

    class s1 extends Mca{
        String sname,address;
        int rno;
  void get(){
        super.get();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        sname = sc.next();
        System.out.println("Enter address:");
        address = sc.next();
        System.out.println("Enter roll:");
        rno = sc.nextInt();
}
  void display(){
        super.display();
        System.out.println("Student is:"+sname);
        System.out.println("Address is:"+address);
        System.out.println("Roll no is:"+rno);
}
}

class Mooc extends s1{
        String sub,duration;
  void get(){
        super.get();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject:");
        sub = sc.next();
        System.out.println("Enter duration:");
        duration = sc.next();
}
 void display(){
        super.display();
        System.out.println("Subject is:"+sname);
        System.out.println("duration is:"+address);
}}

class Main{
public static void main(String args[]){
Mooc m = new Mooc();
m.get();
m.display();
}}