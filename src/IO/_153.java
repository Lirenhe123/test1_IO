package IO;

import java.io.UnsupportedEncodingException;

public class _153 {
	public static void main(String args[]) throws UnsupportedEncodingException{
		String str="�й�";
		//������
		byte[] data1=str.getBytes();
		System.out.println(new String(data1));
		System.out.println(new String(data1,0,3));
		
		//����
		byte[] data2=str.getBytes("utf-8");
		System.out.println(new String(data2));
		
		//ָ���ַ���������
		byte[] data3=str.getBytes("utf-8");
		System.out.println(new String(data3,"utf-8"));
	}
	
		

}
