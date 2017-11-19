package com.shengsiyuan.bytestream;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *   �ҵĸ��������ByteArrayOutputStream�������������ݵģ�����д���Ŀ�꣨output streamԭ�壩����
 *   �������ڲ�������д�����ݣ��������Զ���������д�����ʱ���Դ�����ȡ���ݡ��������ԭ��ByteArrayOutputStream�����ڴ洢����������һ��д�롣
 * @author lenovo
 *
 */
public class byteArrayOutputStream {
//	����1:		���ļ��ж�ȡ���������ݣ�ȫ���洢��ByteArrayOutputStream�С�
//	����2:		��ByteArrayOutputStream�е������ض�����������,�ο�void writeTo(OutputStream out) �ĵ�
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis=null;
		ByteArrayOutputStream baos=null;
		try {
			File file=new File("test.txt");
			fis = new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			baos=new ByteArrayOutputStream();
			
			int c = 0;
			c = bis.read();//��ȡbis���е���һ���ֽ�
			while(c!=-1){
			     baos.write(c);
			     c=bis.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(bis!=null){
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		byte retArr[]=baos.toByteArray();
		System.out.println(baos.toString());
	}
}

