
public class Launch {
public static void main(String args[])
{
	System.out.println(Test.a);
	System.out.println(Test.b);
	System.out.println(Test.c);
	System.out.println("--------");
	Test.display();
	System.out.println("--------");
 	Test t=new Test();
	t.display1();
	System.out.println("--------");
	System.out.println(t.m);
	System.out.println(t.n);
	System.out.println(t.o);

}
}
