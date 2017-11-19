package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1,文件复制
 * 2,文件夹复制
 * 3,测试各种流及其方法
 * @author lenovo
 *
 */
public class FileUtilTest {
	/**
	 * 文件复制
	 * @throws FileNotFoundException,IOException 
	 * 
	 */
	
	public static boolean copyFile(String srcpath,String destpath) throws FileNotFoundException,IOException{
		boolean flag=false;
		File srcfile=new File(srcpath);
		File destfile=new File(destpath);
		copyFile(srcfile,destfile);
		flag=true;
		return flag;
	}
	public static boolean copyFile(File srcfile,File destfile) throws FileNotFoundException,IOException{
		boolean flag=false;
		
		InputStream bs=new BufferedInputStream(new FileInputStream(srcfile));
		OutputStream bo=new BufferedOutputStream(new FileOutputStream(destfile));
		
		byte[] flush=new byte[2000000];
		int len=0;
		while((len=bs.read(flush))!=-1){
			bo.write(flush);
		}
		bo.flush();
		bs.close();
		bo.close();
		flag=true;
		return flag;
	}
	
	public static boolean copyDir(File srcfile,File destfile) throws IOException{
		boolean flag=false;
		
		if(srcfile.isDirectory()){
			destfile=new File(destfile,srcfile.getName());
		}
		flag=copyDirDetail(srcfile,destfile);
		
		return flag;
		
	}
	public static boolean copyDirDetail(File srcfile,File destfile) throws FileNotFoundException, IOException{
		boolean flag=false;
		if(srcfile.isFile()){
			FileUtilTest.copyFile(srcfile,destfile);
		}else if(srcfile.isDirectory()){
			destfile.mkdirs();
			File[] subfiles=srcfile.listFiles();
			for(File subfile:subfiles){
				copyDirDetail(subfile,new File(destfile,subfile.getName()));
			}
		}
		flag=true;
		
		return flag;
	}

}
