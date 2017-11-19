package IO;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class _148 {
	public static void main(String[] args) {
		String srcpath="C:/Users/lenovo/Desktop/FirstHardWorkandThen/001.jpg";
		String destpath="C:/Users/lenovo/Desktop/FirstHardWorkandThen/111.jpg";
		boolean flag=false;
		_148 copy=null;
		try {
			copy=new _148();
			flag = FileUtil.copyFile(srcpath,destpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("the file is not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("the file was not transmited");
		}
		System.out.println(flag);
	}
	
}
