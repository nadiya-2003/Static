import java.util.Scanner;
public class CircleArea {
static double pi;
double radius;
double area;

static
{
	pi=3.14;
}
void collectData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius of circle:");
radius=sc.nextFloat();

}
void calculate()
{
	area=(pi*radius*radius);
}
void display()
{
	System.out.println("The area of the circle is :"+area);
}
}
