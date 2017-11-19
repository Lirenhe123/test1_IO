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
		//�ؼ��Ĵ����
		for (int i = 0; i < 3; i++)
		{
			p = (Person) ois.readObject();//��ȡ�������ݣ����󣩶��ǲ������ַ�ʽ

			System.out.println(p.age + "," + p.name + "," + p.height);
		}

		ois.close();
	}
}

class Person implements Serializable{
	int age;

	transient String name;//transient���εĳ�Ա�����ǲ��ᱻ���л�,Ҳ�Ͳ��ᱻ����Ŀ���ļ�(�鿴person.txt),�����ֵΪnull.
	//��̬�ĳ�Ա�����ͳ�Ա����ͬ��

	double height;

	public Person(int age, String name, double height)
	{
		this.age = age;
		this.name = name;
		this.height = height;
	}
}
