package com.shengsiyuan.bytestream;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *   我的个人理解是ByteArrayOutputStream是用来缓存数据的（数据写入的目标（output stream原义）），
 *   向它的内部缓冲区写入数据，缓冲区自动增长，当写入完成时可以从中提取数据。由于这个原因，ByteArrayOutputStream常用于存储数据以用于一次写入。
 * @author lenovo
 *
 */
public class byteArrayOutputStream {
//	功能1:		从文件中读取二进制数据，全部存储到ByteArrayOutputStream中。
//	功能2:		将ByteArrayOutputStream中的数据重定向到其他流中,参考void writeTo(OutputStream out) 文档
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
			c = bis.read();//读取bis流中的下一个字节
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

