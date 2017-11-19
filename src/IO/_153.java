package IO;

import java.io.UnsupportedEncodingException;

public class _153 {
	public static void main(String args[]) throws UnsupportedEncodingException{
		String str="中国";
		//不乱码
		byte[] data1=str.getBytes();
		System.out.println(new String(data1));
		System.out.println(new String(data1,0,3));
		
		//乱码
		byte[] data2=str.getBytes("utf-8");
		System.out.println(new String(data2));
		
		//指定字符集不乱码
		byte[] data3=str.getBytes("utf-8");
		System.out.println(new String(data3,"utf-8"));
	}
	
		

}
