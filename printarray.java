import java.util.Scanner;
public class Printarray{
public static void prtarry(int arr[],int N){
 for(int i=0;i<N;i++)
{
   System.out.print(arr[i]+" ");
}
}
public static void main(String args[]){
int N;

Scanner a=new Scanner(System.in);
System.out.println("enter the size of an array:");
int n=a.nextInt();
N=n;
int[] arr=new int[N];
System.out.println("enter the elements to insert in array");
for(int i=0;i<N;i++){
int val=a.nextInt();
arr[i]=val;
}
System.out.println("number of element in the array are:");
prtarry(arr,N);
}


}