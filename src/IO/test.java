package IO;

import java.io.File;
import java.io.IOException;

public class test {
public static void main(String args[]){
	String srcPath="C:/Users/lenovo/Desktop/�Լ�����һ����";
	String destPath="C:/Users/lenovo/Desktop/�Լ�����һ����";
	File src=new File(srcPath);
	File dest=new File(destPath);
	if(src.getAbsolutePath().equals(dest.getAbsolutePath())){
		System.out.println(src.getAbsolutePath());
		System.out.println(dest.getAbsolutePath());
		System.out.println("Դ�ļ�����Ŀ���ļ��в���ͬ��");
	}
	if(src.isDirectory()){
		dest=new File(dest,src.getName());
	}
	System.out.println("sfjls");
	System.out.println(src.getAbsolutePath());
	System.out.println(dest.getAbsolutePath());
}
	
	

}
