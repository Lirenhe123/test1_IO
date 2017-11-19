package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class _154{
	public static void main(String args[]) throws IOException{
		File src=new File("C:/Users/lenovo/Desktop/自己能有一份吗？/1.txt");
		File dest=new File("C:/Users/lenovo/Desktop/自己能有一份吗？/20.txt");
		
		BufferedReader br=new BufferedReader (
				new InputStreamReader(
						new FileInputStream(src),"gbk"
						)
				); 
		BufferedWriter bw=new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream(dest),"gbk"
						)
				);
		String info=br.readLine();
		/*while((info=br.readLine())!=null){//最后想info返回一个null，所以 bw.write(info);出现空指针异常
			System.out.println(info);
		}*/
	    bw.write(info);
		bw.flush();
		
		br.close();
		bw.close();
	}
}
