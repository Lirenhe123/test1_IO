package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
/**
 * 文件的拷贝
 * 文件夹的 拷贝
 * 利用重载来封装对象
 * @author lenovo
 *
 */
public class FileUtil {
	
	/**
	 * 文件的拷贝
	 * @param 源文件路径srcpath
	 * @param 目录文件路径destpath
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static boolean copyFile(String srcpath,String destpath)throws FileNotFoundException, IOException{
		boolean flag=false;
		File src=new File(srcpath);
		File dest=new File(destpath);
		flag=copyFile(src,dest);
		return flag;
		
	}
	/**
	 * 文件的拷贝
	 * @param 源文件对象
	 * @param 目录文件对象
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static boolean copyFile(File src,File dest)throws FileNotFoundException, IOException{
		boolean flag=false;
		if(! src.isFile()){
			System.out.println("it is not a file");
			throw new IOException("it is not a file");
		}
		InputStream is=new BufferedInputStream(new FileInputStream(src));
		OutputStream os=new BufferedOutputStream(new FileOutputStream(dest));
		
		byte[] flush=new byte[1000000];
		int len=0;
		
		len=is.read(flush);
		
		if(len!=-1){
			os.write(flush, 0, len);
		}
		os.flush();
		is.close();
		os.close();
		flag=true;
		return flag;
	}
	/**
	 * 
	 * @param 源路径srcpath
	 * @param 目标路径destpath
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static boolean copyDir(String srcpath,String destpath) 
			throws FileNotFoundException,IOException{
		boolean flag=false;
		File src=new File(srcpath);
		File dest=new File(destpath);
		flag=copyDir(src,dest);
		flag=true;
		
		return flag;
	}
	/**
	 * 
	 * @param 源文件src
	 * @param 目标文件dest
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static boolean copyDir(File src,File dest) 
			throws FileNotFoundException,IOException{
		boolean flag=false;
		if(src.getAbsolutePath().equals(dest.getAbsolutePath())){
			System.out.println(src.getAbsolutePath());
			System.out.println(dest.getAbsolutePath());
			System.out.println("源文件夹与目标文件夹不能同名");
			throw new IOException();
		}
		/**
		 * 这里不应该是src.isDirectory()，而是dest.isDirectory()。
		 * 无论src是否是文件或者文件夹，拷贝时都应该让dest为文件夹，
		 * 虽然如果src是文件，能够覆盖dest的文件。
		 * 
		 * 这里拷贝的前提是dest为文件夹。只要它为文件夹，则必须：
		 * dest=new File(dest,src.getName());
		 */
		if(src.isDirectory()){
			dest=new File(dest,src.getName());
		}
		
		flag=copyDirDetail(src,dest);
		return flag;
	}
	/**
	 * 思维：如果拷贝的src是文件夹，就调用copyDirDetail，否则调用其它方法。
	 * 既然调用这样的方法，则必须传入相应的参数，这些参数具有一定的关系，在递归时，
	 * 必须满足这样的关系。
	 * @param src
	 * @param dest
	 * @return
	 */
	public static boolean copyDirDetail(File src,File dest){
		boolean flag=false;
		if(src.isFile()){
			try {
				FileUtil.copyFile(src, dest);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(src.isDirectory()){
			dest.mkdirs();
			for(File srcSub:src.listFiles()){
				/**
				 * 必须搞懂copyDirDetail()参数之间的关系，那么
				 * 在递归调用时不需用过程的思维，而是用数学的思维：
				 * 只要满足那样一种关系，则直接调用即可。
				 */
				copyDirDetail(srcSub,new File(dest,srcSub.getName()));
			}
		}
		flag=true;
		return flag;
	}
}
