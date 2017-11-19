package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class _159 {
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException{
		serializable("C:/Users/lenovo/Desktop/FirstHardWorkandThen/dataSeri.txt");
		antiSeri("C:/Users/lenovo/Desktop/FirstHardWorkandThen/dataSeri.txt");
	}
	
	public static void antiSeri(String src) throws IOException, ClassNotFoundException{
		File srcfile=new File(src);
		InputStream is=new FileInputStream(srcfile);
		ObjectInputStream ois=new ObjectInputStream(
					new BufferedInputStream(
								is
							)
				);
		Object obj=ois.readObject();
		if(obj instanceof _159_Emp){
			_159_Emp emp=(_159_Emp)obj;
			System.out.println(emp.getName());//已被transient的，透明化了
			System.out.println(emp.getSalary());
		}
		obj=ois.readObject();
		int[] arr=(int[])obj;
		System.out.println(Arrays.toString(arr));
	}
	public static  void serializable(String dest) throws FileNotFoundException, IOException{
		_159_Emp emp=new _159_Emp();
		int arr[]={1,2,3,4};
		
		File destfile=new File(dest);
		ObjectOutputStream oos=new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(destfile)
						)
				);
		oos.writeObject(emp);
		oos.writeObject(arr);
		oos.flush();
	}
	

}
