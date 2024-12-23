import java.util.Scanner;
public class Farmer {

double principle;
static double rate;
double time;
double Simpleinterest;

static {
	rate=2.5;
}
void collectData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter principle amount:");
	principle=sc.nextDouble();
	System.out.println("Enter the time in years:");
	time=sc.nextDouble();
}
void calculate()
{
Simpleinterest=(principle*time*rate)/100;
}
void display()
{
	System.out.println("The Simple interest is:"+Simpleinterest);
	
}
}
