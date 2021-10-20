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
