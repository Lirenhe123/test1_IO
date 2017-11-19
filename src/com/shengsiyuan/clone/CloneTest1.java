package com.shengsiyuan.clone;

public class CloneTest1
{
	public static void main(String[] args) throws Throwable
	{
		Student student = new Student();
		
		student.setAge(20);
		student.setName("zhangsan");
		
		Student student2 = (Student)student.clone();
		
		System.out.println(student2.getAge());
		System.out.println(student2.getName());
		
		System.out.println("----------------------");
		
		student2.setName("lisi");
		
		System.out.println(student.getName());
		System.out.println(student2.getName());
	}
}

class Student implements Cloneable
{
	private int age;
	
	private String name;

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	//为什么调用super.clone()：因为Object类是任何类的父类，当然就是该类的父类了，
	//下面的代码“重写”了Object父类中的clone（）方法，super指向Object对象，super.clone()指向的就是Object的clone方法，这样拥有了父类clone的功能
	public Object clone() throws CloneNotSupportedException
	{
		Object object = super.clone();
		
		return object;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
