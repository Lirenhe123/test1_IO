package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class _152 {
	public static void main(String args[]){
		boolean flag=false;
		File src=new File("C:/Users/lenovo/Desktop/自己能有一份吗？/1.txt");
		File file=new File("C:/Users/lenovo/Desktop/自己能有一份吗？/13.txt");
		BufferedReader reader=null;
		BufferedWriter writer=null;
		try {
			reader=new BufferedReader(new FileReader(src));
			writer=new BufferedWriter(new FileWriter(file));
			String line=null;
			while((line=reader.readLine())!=null){
				writer.write(line);
				writer.newLine();
				//writer.append("\r\n");
			}
			/*char[] flush=new char[1024];
			int len=0;
			while((len=reader.read(flush))!=-1){
				writer.write(flush,0,len);
			}*/
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				reader.close();
				writer.close();
				flag=true;
				System.out.println(flag);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
