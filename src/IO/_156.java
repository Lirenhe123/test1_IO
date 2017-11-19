package IO;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class _156 {
	public static void main(String args[]) throws IOException{
		read(write());
	}
	public static byte[] write() throws IOException{
		/*//dest==client
		byte[] dest;
		//Stream==socket/tube
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		//write==server
		String msg="datasource";
		byte[] info=msg.getBytes();
		bos.write(info,0,info.length);
		//client get the data of Stream(socket)
		dest=bos.toByteArray();
		//
		bos.close();*/
		//dest==client
		//**********************************************
		
		//dest
		byte[] dest;
		//Stream
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		//write
		String msg="datasource";
		byte[] info=msg.getBytes();
		bos.write(info,0,info.length);
		//client get the data of Stream(socket)
		dest=bos.toByteArray();
		//
		bos.close();
		return dest;
	}
	public static void read(byte[] src) throws IOException{
		//datasource==get the data of the Stream(socket)
		/*String msg="datasource";
		byte[] src=msg.getBytes();*/
		//Stream
		InputStream bis=new BufferedInputStream(
					new ByteArrayInputStream(
								src
							)
				);
		//read
		byte[] flush=new byte[1024];
		int len=0;
		while((len=bis.read(flush))!=-1){
			System.out.println(new String(flush,0,len));
			
		}
		bis.close();
	}

}
