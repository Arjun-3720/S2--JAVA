//triangle multiplication table

public class TrianglePattern {
   public static void main(String[] args) {
      int rows = 6;
      for (int i = 0; i < rows; i++) {
         int num = 0;
         for (int j = 0; j <= i; j++) {
            System.out.print(num + " ");
            num += i + 1;
         }
         System.out.println();
      }
   }
}