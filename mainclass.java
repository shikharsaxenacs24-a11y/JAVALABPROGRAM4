import java.util.Scanner;
class InputScanner {
    Scanner sc = new Scanner(System.in); 
}
abstract class Shape extends InputScanner {
    int dim1, dim2;
    abstract void input();
    abstract void printArea();
}
class Rectangle extends Shape {
    void input() {
        System.out.print("Enter length of Rectangle: ");
        dim1 = sc.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        dim2 = sc.nextInt();
    }

    void printArea() {
        double area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    void input() {
        System.out.print("Enter base of Triangle: ");
        dim1 = sc.nextInt();
        System.out.print("Enter height of Triangle: ");
        dim2 = sc.nextInt();
    }
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends Shape {
    void input() {
        System.out.print("Enter radius of Circle: ");
        dim1 = sc.nextInt();
    }
    void printArea() {
        double area = 3.14 * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}
public class mainclass {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Circle cir = new Circle();

        System.out.println("\n--- Rectangle ---");
        rect.input();
        rect.printArea();

        System.out.println("\n--- Triangle ---");
        tri.input();
        tri.printArea();

        System.out.println("\n--- Circle ---");
        cir.input();
        cir.printArea();
    }
}
