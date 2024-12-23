
class Test{
static int a,b,c;
int m,n,o;
//static block - can access only static variables
static
{
a=200;
b=300;
c=400;
}
//instance block - can access both static and instance variables
{
	a=2000;
	b=3000;
	c=4000;
	m=9001;
	n=8001;
	o=7001;
}
static void display()//can access only static variables
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

}
void display1()//can display both static and instance variables
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(m);
	System.out.println(n);
	System.out.println(o);

}
}

