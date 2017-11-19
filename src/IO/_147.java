package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class _147 {
	public static void main(String args[]){
		File src=new File("C:/Users/lenovo/Desktop/自己能有一份吗？/1.txt");
		InputStream is=null;
		try {
			is=new FileInputStream(src);
			byte car[]=new byte[1024];
			int len=0;
			while((len=is.read(car))!=-1){
				String info=new String(car,0,len);
				System.out.println(info);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("读取文件失败");
		}finally{
			if(is!=null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("关闭输入流失败");
				}
			}
		}
		
		File dest=new File("C:/Users/lenovo/Desktop/自己能有一份吗？/1.txt");
		OutputStream os=null;
		try {
			os=new FileOutputStream(dest,false);
			String str="**面向全国,提供2017最新最全最准确的招聘网站信息,为企业和求职者提供人才招聘、"
					+ "求职、找工作、培训等在内的全方位的人力资源服务,更多求职找工作信息...";
			byte[] data=str.getBytes();
			os.write(data,0,data.length);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件未找到");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("写入文件失败");
		}finally{
			if(os!=null){
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	

}
