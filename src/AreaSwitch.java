import java.util.Scanner;

public class AreaSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose a figure to calculate its area:");
        System.out.println("Circle");
        System.out.println("Rectangle");
        System.out.println("Triangle");
        System.out.println("Square");
        System.out.println("Enter your Choice:");
        
        String choice = sc.nextLine();
        
        switch (choice) {
            case "Circle": 
                System.out.println("Enter the radius of the circle:");
                double radius = sc.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + circleArea);
                break;
                
            case "Rectangle":
                System.out.println("Enter the length of the rectangle:");
                double length = sc.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                double width = sc.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;
                
            case "Triangle":
                System.out.println("Enter the base of the triangle:");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of the triangle: " + triangleArea);
                break;
                
            case "Square": 
                System.out.println("Enter the side length of the square:");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of the square: " + squareArea);
                break;
                
            default:
                System.out.println("Invalid choice. Please choose a valid figure.");
                    }
	
		        
		        }
		    
		}

	


