import java.util.Scanner;
public class SumS{
public static long sumofseries(int n){
return ((long)n*((long)n+1))/2;
}
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
System.out.println("Enter the number");
int val=a.nextInt();
System.out.println("the sum of the series "+val+" is:");
System.out.println(sumofseries(val));

}
}
