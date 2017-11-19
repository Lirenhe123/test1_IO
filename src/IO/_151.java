package IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _151 {
	public static void main(String args[]){
		boolean flag=false;
		File src=new File("C:/Users/lenovo/Desktop/自己能有一份吗？/1.txt");
		File file=new File("C:/Users/lenovo/Desktop/自己能有一份吗？/12.txt");
		Reader reader=null;
		Writer writer=null;
		try {
			reader=new FileReader(src);
			writer=new FileWriter(file);
			
			char[] flush=new char[1024];
			int len=0;
			System.out.println(len);
			while((len=reader.read(flush))!=-1){
				writer.write(flush,0,len);
			}
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
