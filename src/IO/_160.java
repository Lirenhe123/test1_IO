package IO;
import java.io.Closeable;
import java.io.IOException;

public class _160 {
	/**
	 * 工具类 关闭流
	 * 可变参数：... 任意个数 处理方式和数组一致 只能形参最后一个位置
	 * 调用：FileUtil.close(os,is等流);
	 */
	public static void close(Closeable ... io){
		for(Closeable temp:io){
			if(temp!=null){
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static <T extends Closeable> void closeAll(T... io){
		for(Closeable temp:io){
			if(temp!=null){
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	}
}
