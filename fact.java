public class fact
{
public static void main(String args[])
{
int n,i,fact;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
n=s.nextInt();
for(int i=0;i<=n;i++)
{
fact=fact*i;
