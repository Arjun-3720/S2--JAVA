import java.util.Scanner;

class Multiplication extends Thread{
public void run(){

          System.out.println("Multiplication table of 5 :");
   for(int i=1;i<=10;i++){
        System.out.println(i+" * 5 = "+(i*5));
}
}
}
class Prime extends Thread{
   int limit;
   Prime(int limit){
       this.limit = limit;
}

public void run(){
     System.out.println("Prime numbers upto "+limit);
     for(int i=2;i<=limit;i++){
      int count =0;
      for(int j=1;j<=i;j++){
         if(i%j == 0)
           count = count+1;
      }
        if(count == 2)
         System.out.println(i);
      }
}
}

class ThreadSample{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Multiplication m = new Multiplication();
        System.out.println("Enter limit for prime numbers:");
        int limit = sc.nextInt();
        Prime p = new Prime(limit);
//Thread t1 = new Thread(m);
//      Thread t2 = new Thread(p);
        p.start();
        m.start();
}
}
