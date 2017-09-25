import java.util.Scanner;
class Num_freq
{
public static void main(String args[])
{
int k;String p;
Scanner s=new Scanner(System.in);
//System.out.println("Enter the no. of digits in the number:");
//k=s.nextInt();

System.out.println("Enter the number:");
p=s.nextLine();
k=p.length();
char arr[]=new char[k];
arr=p.toCharArray();
for(int n=0;n<k;n++)
{
int freq=0;
for(int i=0;i<k;i++)
{
if(arr[n]==(arr[i]))
{
freq=freq+1;
}
}
System.out.println("frequency of"+arr[n]+":"+freq);
}
}
}