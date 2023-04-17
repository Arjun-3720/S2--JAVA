import java.util.Scanner;
interface Area{
        void get();
        void display();
}
class Rectangle implements Area{
        int l,b,a;
  Scanner sc = new Scanner(System.in);

public void get(){
  System.out.println("Enter length:");
  l = sc.nextInt();
  System.out.println("Enter breadth:");
  b = sc.nextInt();
        a = l*b;
        }
public void display(){
  System.out.println("Area is:"+a);
}}

class Square extends Rectangle implements Area{
        int s,a;

public void get(){

  System.out.println("Enter side:");
  s = sc.nextInt();
        a = s*s;
        }
public void display(){
  System.out.println("Area is:"+a);
}}

class Circle extends Square implements Area{
        double pi=3.14,a;
        int r ;

public void get(){

 System.out.println("Enter radius:");
  r = sc.nextInt();
        a = pi*r*r;
        }
public void display(){
  System.out.println("Area is:"+a);
}
}

class Main{
public static void main(String args[]){

Rectangle r = new Rectangle();
Square s = new Square();
Circle c = new Circle();
r.get();
r.display();

s.get();
s.display();
c.get();
c.display();
}}