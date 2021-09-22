import java.util.*;
class BinarySearch{
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
System.out.println("Enter the key element");
int k = sc.nextInt();
int low=0;
int high = n-1;
int c=1;
while(low<=high){
int mid =(high+low)/2;
if(arr[mid]==k){
System.out.println("Present"+c);
break;
}
else if(k<arr[mid]){
high = mid-1;
c++;
}
else{
low=mid+1;
c++;
}
}
if(low>high){
System.out.println("Not Present");
}
}
}
}
