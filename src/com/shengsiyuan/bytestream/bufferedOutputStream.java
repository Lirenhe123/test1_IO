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
			String str="��writeBoolean(),writeUTF()��writeChar��writeByte()��writeDouble()�ȺͶ�Ӧ��read������\n";
			byte buffer[]=str.getBytes();
			os.write(buffer, 0, buffer.length);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ�û�ҵ�");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("д��ʧ��");
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
