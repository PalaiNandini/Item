public class Library
{
public static void main(String args[])
{
char x;
String[] List=new String[5];
Item i;
Scanner sc=new Scanner(System.in);
for(int j=0;j<=4;j++)
{
System.out.println("b/d : ");
x=sc.next().charAt(0);
if(x=='b')
{
i=new Book();
i.read();
i.show();
}
else if (x=='d')
{
i=new Dvd();
i.read();
i.show();
}
}
}
}




