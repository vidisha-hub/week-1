import java.util.*;
class LinearSearch{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of test case");
int t= sc.nextInt();
for(int i=0;i<t;i++)
{
System.out.println("Enter number of element");
int n= sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter array elements");
for(i=0;i<n;i++)
arr[i] = sc.nextInt();
System.out.println(" Enter the key element");
int k = sc.nextInt();
for(i=0;i<n;i++)
{
if(arr[i]==k)
{
System.out.println("Present"+ i+1);
break;
}
else if(i==n-1)
System.out.println("Not Present"+ i+1);
}
if(i==n)
System.out.println(" Not Present"+ i);
}
}
}
