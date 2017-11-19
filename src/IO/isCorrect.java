package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class isCorrect {
	public static void main(String args[]) throws FileNotFoundException, IOException{
		String srcpath="C:/Users/lenovo/Desktop/FirstHardWorkandThen";
		String destpath="C:/Users/lenovo/Desktop/copy";
		File srcfile=new File(srcpath);
		File destfile=new File(destpath);
		boolean flag=false;
		if(srcfile.isDirectory()){
			flag=FileUtilTest.copyDir(srcfile,destfile);
		}else{
			flag=FileUtilTest.copyFile(srcfile, destfile);
		}
		
		/*boolean flag=false;
		if(srcfile.isFile()){
			destfile.mkdirs();
			flag=FileUtil.copyFile(srcfile, new File(destfile,srcfile.getName()));
		}
		
		flag=true;
		
		*/
		System.out.println(flag);
	}

}
