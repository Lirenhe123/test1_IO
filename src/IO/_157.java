package IO;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class _157 {
	public static void main(String args[]) throws IOException{
		byte[] data=getBytesFromFile("C:/Users/lenovo/Desktop/FirstHardWorkandThen/001.jpg");
		toFileFromByteArray(data,"C:/Users/lenovo/Desktop/FirstHardWorkandThen/test.jpg");
	}
	
	public static void toFileFromByteArray(byte[] src,String destPath) throws IOException{
		//create dest
		File dest=new File(destPath);
		//InputStream
		InputStream is=new BufferedInputStream(new ByteArrayInputStream(src));
		//OutputStream
		OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));
		byte[] data=new byte[1024];
		int len=0;
		while((len=is.read(data))!=-1){
			os.write(data, 0, len);
		}
		os.flush();
		is.close();
		os.close();
	}
	public static byte[] getBytesFromFile(String srcPath) throws IOException{
		//create filesource
		File src = new File(srcPath);
		//create dest
		byte[] dest=null;
		//InputStream
		InputStream is=new BufferedInputStream(new FileInputStream(src));
		//OutputStream
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		//read data from is to dataArray
		byte[] flush=new byte[1024];
		int len=0;
		while((len=is.read(flush))!=-1){
			bos.write(flush,0,len);
		}
		bos.flush();
		
		//get the data from bos
		dest=bos.toByteArray();
		bos.close();
		is.close();
		return dest;
	}

}
