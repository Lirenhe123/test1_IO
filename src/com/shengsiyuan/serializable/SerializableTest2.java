package com.shengsiyuan.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest2
{
	public static void main(String[] args) throws Exception
	{
		Person2 p1 = new Person2(20, "zhangsan", 4.55);
		Person2 p2 = new Person2(50, "lisi", 4.67);
		Person2 p3 = new Person2(10, "wangwu", 17.78);

		FileOutputStream fos = new FileOutputStream("Person2.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);

		oos.close();

		System.out.println("--------------------");

		FileInputStream fis = new FileInputStream("Person2.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Person2 p = null;

		for (int i = 0; i < 3; i++)
		{
			p = (Person2) ois.readObject();

			System.out.println(p.age + "," + p.name + "," + p.height);
		}

		ois.close();
	}
}

class Person2 implements Serializable{
	int age;

	transient String name;

	double height;

	public Person2(int age, String name, double height)
	{
		this.age = age;
		this.name = name;
		this.height = height;
	}

	//关键代码段
	//精确地控制什么需要序列化,什么不需要...尽管有transient修饰,仍然可以序列化,因为我已指定
	//否则用ObjectInputStream,ObjectOutputStream来处理
	private void writeObject(java.io.ObjectOutputStream out) throws IOException
	{
		out.writeInt(age);
		out.writeUTF(name);
		
		System.out.println("write object");
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException,
			ClassNotFoundException
	{
		age = in.readInt();
		name = in.readUTF();
		
		System.out.println("read object");
	}
}
