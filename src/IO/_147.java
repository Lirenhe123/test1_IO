package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _147 {
	public static void main(String args[]){
		File src=new File("C:/Users/lenovo/Desktop/�Լ�����һ����/1.txt");
		InputStream is=null;
		try {
			is=new FileInputStream(src);
			byte car[]=new byte[1024];
			int len=0;
			while((len=is.read(car))!=-1){
				String info=new String(car,0,len);
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ�������");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("��ȡ�ļ�ʧ��");
		}finally{
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("�ر�������ʧ��");
				}
			}
		}
		
		File dest=new File("C:/Users/lenovo/Desktop/�Լ�����һ����/1.txt");
		OutputStream os=null;
		try {
			os=new FileOutputStream(dest,false);
			String str="**����ȫ��,�ṩ2017������ȫ��׼ȷ����Ƹ��վ��Ϣ,Ϊ��ҵ����ְ���ṩ�˲���Ƹ��"
					+ "��ְ���ҹ�������ѵ�����ڵ�ȫ��λ��������Դ����,������ְ�ҹ�����Ϣ...";
			byte[] data=str.getBytes();
			os.write(data,0,data.length);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ�δ�ҵ�");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("д���ļ�ʧ��");
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
