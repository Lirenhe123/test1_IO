package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class _161 {
	public static void main(String args[]) throws IOException{
		/*//��ӡ���������
		System.out.println("true");
		PrintStream ps=System.out;
		ps.println("false");
		
		//������ļ�
		File destfile=new File("C:/Users/lenovo/Desktop/FirstHardWorkandThen/test.txt");
		ps=new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream(destfile)
						),true
				);
		ps.println("lsdljfsadflasfls");*/
		
		/*System.out.println("true");
		System.err.println("false");*/
		
		
		//InputStream is=System.in;
		/*File filesrc=new File("C:/Users/lenovo/Desktop/FirstHardWorkandThen/test.txt");
		Scanner sc=new Scanner(filesrc);
		System.out.println(sc.nextLine());*/
		
	/*	//�ض������������־
		System.setOut(
				new PrintStream(
						new BufferedOutputStream(
								new FileOutputStream("C:/Users/lenovo/Desktop/FirstHardWorkandThen/test.txt")
								),true
						)
				);
		
		System.out.println("��ɽ�˺���Ȼ�������෽��");
		//�ض������������̨
		System.setOut(
				new PrintStream(
						new BufferedOutputStream(
								new FileOutputStream(
										FileDescriptor.out
										)
								),true
						)
				);
		System.out.println("adflsdflalsfll");*/
		
		InputStream is=System.in;
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String msg=br.readLine();
		System.out.println(msg);
	}
	

}
