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
