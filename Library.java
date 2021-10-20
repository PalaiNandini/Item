import java.util.*;
interface Item
{
public void read();
public void show();
}
class Book implements Item
{
protected String name;
protected String author;
protected String publication;

public void read()
{
System.out.println("book name: ");
name=System.console().readLine();
System.out.println("author name: ");
author=System.console().readLine();
System.out.println("publication name: ");
publication=System.console().readLine();
}
public void show()
{
System.out.println("book:"+name+"\nAuthor:"+author+"\nPublication:"+publication);
}
}
class Dvd implements Item
{
protected String title;
protected String director;
protected String category;

public void read()
{
System.out.println("Title is:");
title=System.console().readLine();
System.out.println("Director name:");
director=System.console().readLine();
System.out.println("category :");
category=System.console().readLine();
}
public void show()
{
System.out.println("DVD title :"+title+"\nDirector name:"+director+"\nCategory:"+category);
}
}
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




