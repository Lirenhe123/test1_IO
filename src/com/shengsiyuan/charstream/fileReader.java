package com.shengsiyuan.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
	public static void main(String[] args) {
		// 1. ��������
	    BufferedReader in = null;
		try {
			in = new BufferedReader(
			    new FileReader("test.txt"));//InputStreamReader�����࣬
		    //�ַ�����ֱ�Ӵ����ֽ�������Դ�����֪���ǵ���File-->FIS-->����ISR��
		    String s, s2 = new String();
		    while((s = in.readLine())!= null)
		      s2 += s + "\n";//�ַ���ƴ��
		    System.out.println(s2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(in!=null){
				 try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
