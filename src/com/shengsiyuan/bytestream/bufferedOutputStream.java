package com.shengsiyuan.bytestream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class bufferedOutputStream {
	public static void main(String[] args) {
		File file=new File("fileoutputstream");
		System.out.println(file.getAbsolutePath());
		OutputStream os=null;
		try {
			os=new BufferedOutputStream(new FileOutputStream(file,true));
			String str="如writeBoolean(),writeUTF()，writeChar，writeByte()，writeDouble()等和对应的read方法，\n";
			byte buffer[]=str.getBytes();
			os.write(buffer, 0, buffer.length);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件没找到");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("写出失败");
		}finally{
			if(os!=null){
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
