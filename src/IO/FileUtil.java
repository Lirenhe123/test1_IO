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
 * �ļ��Ŀ���
 * �ļ��е� ����
 * ������������װ����
 * @author lenovo
 *
 */
public class FileUtil {
	
	/**
	 * �ļ��Ŀ���
	 * @param Դ�ļ�·��srcpath
	 * @param Ŀ¼�ļ�·��destpath
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
	 * �ļ��Ŀ���
	 * @param Դ�ļ�����
	 * @param Ŀ¼�ļ�����
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
	 * @param Դ·��srcpath
	 * @param Ŀ��·��destpath
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
	 * @param Դ�ļ�src
	 * @param Ŀ���ļ�dest
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
			System.out.println("Դ�ļ�����Ŀ���ļ��в���ͬ��");
			throw new IOException();
		}
		/**
		 * ���ﲻӦ����src.isDirectory()������dest.isDirectory()��
		 * ����src�Ƿ����ļ������ļ��У�����ʱ��Ӧ����destΪ�ļ��У�
		 * ��Ȼ���src���ļ����ܹ�����dest���ļ���
		 * 
		 * ��������ǰ����destΪ�ļ��С�ֻҪ��Ϊ�ļ��У�����룺
		 * dest=new File(dest,src.getName());
		 */
		if(src.isDirectory()){
			dest=new File(dest,src.getName());
		}
		
		flag=copyDirDetail(src,dest);
		return flag;
	}
	/**
	 * ˼ά�����������src���ļ��У��͵���copyDirDetail�������������������
	 * ��Ȼ���������ķ���������봫����Ӧ�Ĳ�������Щ��������һ���Ĺ�ϵ���ڵݹ�ʱ��
	 * �������������Ĺ�ϵ��
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
				 * ����㶮copyDirDetail()����֮��Ĺ�ϵ����ô
				 * �ڵݹ����ʱ�����ù��̵�˼ά����������ѧ��˼ά��
				 * ֻҪ��������һ�ֹ�ϵ����ֱ�ӵ��ü��ɡ�
				 */
				copyDirDetail(srcSub,new File(dest,srcSub.getName()));
			}
		}
		flag=true;
		return flag;
	}
}
