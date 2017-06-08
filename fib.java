package evenodd;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1,c=0;
System.out.println("ENTER THE VALUES");
for(int i=0;i<=5;i++){
	c=a+b;
	System.out.print(c);
	a=b;
	b=c;
	System.out.println();
}

	}

}
