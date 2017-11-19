package com.shengsiyuan.charstream;
import java.io.*;
/**一次性考察以下4个流：
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
			ps=new PrintStream(bos);//重定向输出流必须是PrintStream，而不能是其他流
			
			System.setIn(bis);//重定向输入流可以是任何流
			console=System.out;//保存console，最后要恢复
			System.setOut(ps);
			System.setErr(ps);
			
			br=new BufferedReader(
					new InputStreamReader(System.in));//PrintStream是FilterOutputStream
//的子类，属于处理流（过滤流）
			String s=null;
			while((s=br.readLine())!=null){
				System.out.println(s);//已经重定向了到test.out
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			//很多流的情况下，先关闭处理流再关闭节点流
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
