class Circle {
    double radius;

    
    double calculateArea() {
        return 3.14 * radius * radius;
    }

  
    void display() {
        double area = calculateArea();
        System.out.println("Area: " + area);
    }
}

public class Area {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 4.5; 
        c1.display();    
    }
}
