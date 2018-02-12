package priv.bidi.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtils {
	
	public List<String> matchSrcPath(String srcPath,String regex)throws IOException,FileNotFoundException{
		List<String> filePathList=new ArrayList<String>();
		File srcFile=new File(srcPath);
		
		if(srcFile.isFile()){
			filePathList=matchWhensrcFileisFile(srcFile,regex,filePathList);
		}else if(srcFile.isDirectory()){
			filePathList=matchWhensrcFileisDirectory(srcFile,regex,filePathList);
		}
		
		return filePathList;
	}
	
	public List<String> matchWhensrcFileisFile(File srcFile,String regex,List<String> filePathList)
			throws IOException,FileNotFoundException{
		String fileName=srcFile.getName();
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(fileName);
		if(matcher.find()){
			String path=srcFile.getAbsolutePath();
			filePathList.add(path);
		}else{
			System.out.println("该路径是文件"+fileName+"，但不符合"+regex+"匹配");
		}
		return filePathList;
	}
	
	public List<String> matchWhensrcFileisDirectory(File srcFile,String regex,List<String>filePathList) throws FileNotFoundException, IOException{
		File[] files=srcFile.listFiles();
		for(File file:files){
			if(file.isFile()){
				filePathList=matchWhensrcFileisFile(file,regex,filePathList);
			}else{
				filePathList=matchWhensrcFileisDirectory(file,regex,filePathList);
			}
		}
		return filePathList;
	}
	public boolean copyFile(String srcPath,String destPath)throws IOException,FileNotFoundException{
		boolean flag=false;
		File srcFile=new File(srcPath);
		File destFile=new File(destPath);
		
		if(destFile.isDirectory()){
			destFile=new File(destPath+"/"+srcFile.getName());
		}
		
		System.err.println(destFile.getAbsolutePath());
		
		
		
		flag=copyFile(srcFile,destFile);
		return flag;
	}
	public boolean copyFile(File srcFile,File destFile)throws IOException,FileNotFoundException{
		boolean flag=false;
		if(!srcFile.isFile()){
			System.out.println("srcFile is not file");
			throw new IOException("srcFile is not file");
		}
		
		InputStream fis=new FileInputStream(srcFile);
		OutputStream fos=new FileOutputStream(destFile);
		
		byte[] buffer=new byte[(int) (Math.pow(2,10)*1000)];
		int len=0;
		while((len=fis.read(buffer))!=-1){
			fos.write(buffer, 0, len);
		}
		if(fos!=null&&fis!=null){
			fos.close();
			fis.close();
			flag=true;
		}
		return flag;
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String srcPath="E:\\WorkSpace03\\bxkc_data_storage_service_generator\\outputFiles\\service.impl";
		String destPath="E:\\WorkSpace04\\171228\\src\\com\\bidizhaobiao\\data\\crawl\\service\\impl";
		String regex="(Y|XX).*\\.java";
		FileUtils tool=new FileUtils();
		List<String> filePathList=tool.matchSrcPath(srcPath,regex);
		for(String filePath:filePathList){
			File srcFile=new File(srcPath);
			boolean flag=tool.copyFile(filePath,destPath);
			System.out.println(flag);
		}
		
		
		
		
		
		
	}
	
}
