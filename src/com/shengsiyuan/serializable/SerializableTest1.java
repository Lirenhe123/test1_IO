package com.shengsiyuan.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest1
{
	public static void main(String[] args) throws Exception
	{
		Person p1 = new Person(20, "zhangsan", 4.55);
		Person p2 = new Person(50, "lisi", 4.67);
		Person p3 = new Person(10, "wangwu", 17.78);

		FileOutputStream fos = new FileOutputStream("person.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);

		oos.close();

		System.out.println("--------------------");

		FileInputStream fis = new FileInputStream("person.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Person p = null;
		//关键的代码段
		for (int i = 0; i < 3; i++)
		{
			p = (Person) ois.readObject();//读取单个数据（对象）都是采用这种方式

			System.out.println(p.age + "," + p.name + "," + p.height);
		}

		ois.close();
	}
}

class Person implements Serializable{
	int age;

	transient String name;//transient修饰的成员变量是不会被序列化,也就不会被存入目的文件(查看person.txt),输出的值为null.
	//静态的成员变量和成员方法同理

	double height;

	public Person(int age, String name, double height)
	{
		this.age = age;
		this.name = name;
		this.height = height;
	}
}
