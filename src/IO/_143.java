package IO;

import java.io.File;
import java.io.IOException;

public class _143 {
	
	
	public static void main(String args[]) throws IOException{
		/**
		 * 圣思园
		 */
		
		/*File file=new File("C:/Users/lenovo/Desktop/test.txt");
		//File file=new File("C:"+File.separator+"users"+File.separator+"lenovo"+File.separator+"Desktop"+File.separator+"test.txt");
		//File file=new File(File.pathSeparator+"test.txt");
		boolean flag=file.createNewFile();
		System.out.println(flag);
		System.out.println(file.getAbsolutePath());*/
		
		/*File file=new File("C:/Users/lenovo/Desktop/day14");
		File[] files=file.listFiles();
		System.out.println(files);
		for(File f:files){
			//System.out.println(f.getName());
			System.out.println(f.getParent());
		}*/
		
		/*File file = new File(File.separator);
		File file2=new File(file,"test.txt");
		System.out.println(file2.createNewFile());*/
		
		
		
		

		
		
		
		/**
		 * 尚学堂300
		 */
		/*File file=new File(".");
		System.out.println(file.getAbsolutePath());*/
		
		
		/*File fileParent=new File("C:"+File.separator+"users"+File.separator+"lenovo"+File.separator+"Desktop");
		File fileChild=new File("FirstHardWorkandThen"+File.separator+"001.jpg");
		File file=new File(fileParent,fileChild.getPath());
		System.out.println(fileParent.getPath());
		System.out.println(fileChild.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.exists());*/
		
		/*String parentPath="C:"+File.separator+"Users"+File.separator+"lenovo"+File.separator+"Desktop"+File.separator+"自己能有一份吗？";
		String path="001.jpg";
		
		File file=new File(parentPath,path);
		File src=new File(new File(parentPath),path);
		System.out.println(file);
		System.out.println(src.getName());
		System.out.println(src.getPath());*/
		
		/*String url="C:/Users/lenovo/Desktop/自己能有一份吗？/001.jpg";
		File drc=new File(url);
		System.out.println(drc);
		System.out.println(drc.getName());
		System.out.println(drc.getPath());*/
		
		/*File test=new File("test.jpg");
		System.out.println(test.getName());
		System.out.println(test.getPath());
		System.out.println(test.getAbsolutePath());*/
		
		/*File file=new File(".");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());*/
	}

}
