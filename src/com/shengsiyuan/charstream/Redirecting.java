package com.shengsiyuan.charstream;
import java.io.*;
/**һ���Կ�������4������
 * 1,PrintStream
 * 2,System.out
 * 3,BufferedReader
 * 4,InputStreamReader
 * @author lenovo
 *
 */
public class Redirecting {
	public static void main(String[] args) {
		File fileIn=new File("Redirecting.java");
		File fileOut=new File("test.out");
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		PrintStream ps=null;
		BufferedReader br=null;
		PrintStream console=null;
		try {
			bis=new BufferedInputStream(new FileInputStream(fileIn));
			bos=new BufferedOutputStream(new FileOutputStream(fileOut));
			ps=new PrintStream(bos);//�ض��������������PrintStream����������������
			
			System.setIn(bis);//�ض����������������κ���
			console=System.out;//����console�����Ҫ�ָ�
			System.setOut(ps);
			System.setErr(ps);
			
			br=new BufferedReader(
					new InputStreamReader(System.in));//PrintStream��FilterOutputStream
//�����࣬���ڴ���������������
			String s=null;
			while((s=br.readLine())!=null){
				System.out.println(s);//�Ѿ��ض����˵�test.out
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			//�ܶ���������£��ȹرմ������ٹرսڵ���
			if(ps!=null){
				ps.close();
				System.setOut(console);
			}else if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
