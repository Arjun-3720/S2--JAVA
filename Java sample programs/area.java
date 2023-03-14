//Program to find the perimeter and area of rectangle where its area is same as the area of square. given the side of the square and breadth of the rectangle


public class Area {
    public static void main(String[] args) {
      
        double side = 15.2;
        
        double breadth = 44.3;
        
        double area_square = side * side;
        double area_rect = area_square;
        double length = area_rect / breadth;
        
        double perimeter_rect = 2 * (length + breadth);
        double area_rect_final = length * breadth;
        
        System.out.println("Perimeter of the rectangle is " + perimeter_rect);
        System.out.println("Area of the rectangle is " + area_rect_final);
    }
}