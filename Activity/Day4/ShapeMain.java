import java.util.*;
public class ShapeMain {
    static String shape ;
    static int radius, side;
    public static void main(String[] ar){

    Scanner sc = new Scanner(System.in);
    System.out.println("Circle");
    System.out.println("Square");
    System.out.println("Enter the Shape");
    shape=sc.nextLine();
    if(shape.equals("Circle")){
        System.out.println("Enter the radius");
        radius=sc.nextInt();
        Circle c1=new Circle(radius);
        System.out.println("Area of circle is: "+ c1.calculateArea());

    }
    else{
        System.out.println("Enter the side");
        side=sc.nextInt();
        Square s1=new Square(side);
        System.out.println("Area of Square is: "+ s1.calculateArea());
    }
    }
}
