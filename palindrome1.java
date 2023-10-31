import java.util.Scanner;
class palindrome1
{
public static void main(String args[])
{
String str,rev="";
Scanner s=new Scanner(System.in);
System.out.println("enter a string");
str =s.nextLine();
int length=str.length();
for(int i=length-1;i>=0;i--)
rev=rev+str.charAt(i);
if(str.equals(rev))
System.out.println(str + "is palindrome");
else
System.out.println(str + "not a palindrome");
}
}

