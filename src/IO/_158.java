package IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class _158 {
	public static void main(String args[]) throws IOException{
		//write("C:/Users/lenovo/Desktop/FirstHardWorkandThen/data.txt");
		read("C:/Users/lenovo/Desktop/FirstHardWorkandThen/data.txt");
	}
	public static void read(String srcPath) throws IOException{
		File src=new File(srcPath);
		DataInputStream dis=new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(src)
							)
				);
		
		double point=dis.readDouble();
		long num=dis.readLong();
		String str=dis.readUTF();
		System.out.println(point+"-->"+num+"-->"+str);
		
				
	}
	public static void write(String destPath) throws IOException{
		double point=2.5;
		long num=100L;
		String str="shusflsl";
		
		File dest=new File(destPath);
		DataOutputStream dos=new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(dest)
						)
				);
		
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		dos.close();
	}

}
