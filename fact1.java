public class fact1;
{
public static void main(String arg[])
{
int i,n,fact=1;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
n=s.nextInt();
for(int i=0;i<=n;i++)
{
fact=fact*i;
}
System.out.println("the factorial is"+fact);
}
}
