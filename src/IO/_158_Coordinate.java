package IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class _158_Coordinate {
	public static void main(String args[]) throws IOException{
		byte[] data=write();
		System.out.println(data.length);
		read(data);
		
	}
	public static void read(byte[] srcArray) throws IOException{
		ByteArrayInputStream bais=new ByteArrayInputStream(srcArray);
		
		DataInputStream dis=new DataInputStream(
					new BufferedInputStream(
							bais
							)
				);
		
		double point=dis.readDouble();
		long num=dis.readLong();
		String str=dis.readUTF();
		System.out.println(point+"-->"+num+"-->"+str);	
	}
	
	public static byte[] write() throws IOException{
		byte[] dest=null;
		
		double point=2.5;
		long num=100L;
		String str="shusflsl";
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(
				new BufferedOutputStream(
							baos
						)
				);
		
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		
		dest=baos.toByteArray();
		dos.close();
		return dest;
	}

}

