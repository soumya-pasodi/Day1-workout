import java.util.Scanner;
class Areaofcircle{
    public static void main( String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius:");
    double radius  = sc.nextDouble();
    double area= Math.PI * radius * radius;
    System.out.println("Area of the Circle:" + area);
    sc.close();
    }
}