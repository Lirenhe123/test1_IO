package IO;
import java.io.Closeable;
import java.io.IOException;

public class _160 {
	/**
	 * ������ �ر���
	 * �ɱ������... ������� ����ʽ������һ�� ֻ���β����һ��λ��
	 * ���ã�FileUtil.close(os,is����);
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
