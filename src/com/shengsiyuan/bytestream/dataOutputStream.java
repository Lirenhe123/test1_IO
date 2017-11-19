package com.shengsiyuan.bytestream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataOutputStream{
	public static void main(String[] args) {
		File file=new File("dataoutputstream.txt");
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream(file));
			
			String[] names={"衬衣","手套","围巾"};
			float prices[] = {98.3f,30.3f,50.5f} ;  
	        int nums[] = {3,2,1} ; 
	        
	        for(int i=0;i<names.length;i++){
	        	dos.writeUTF(names[i]);
	        	dos.writeUTF("\t");
	        	dos.writeFloat(prices[i]);
	        	dos.writeUTF("\t");
	        	dos.writeInt(nums[i]);
	        	dos.writeUTF("\n");
	        }
	        
		} catch (FileNotFoundException e) {
			System.out.println("文件没找到");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("写出失败");
			e.printStackTrace();
		}finally{
			if(dos!=null){
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
/*public class dataOutputStream{
    public static void main(String args[]) throws Exception{    // 所有异常抛出
        DataOutputStream dos = null ;            // 声明数据输出流对象
        File f = new File("d:" + File.separator + "order.txt") ; // 文件的保存路径
        dos = new DataOutputStream(new FileOutputStream(f)) ;    // 实例化数据输出流对象
        String names[] = {"衬衣","手套","围巾"} ;    // 商品名称
        float prices[] = {98.3f,30.3f,50.5f} ;        // 商品价格
        int nums[] = {3,2,1} ;    // 商品数量
        for(int i=0;i<names.length;i++){    // 循环输出
            dos.writeChars(names[i]) ;    // 写入字符串
            dos.writeChar('\t') ;    // 写入分隔符
            dos.writeFloat(prices[i]) ; // 写入价格
            dos.writeChar('\t') ;    // 写入分隔符
            dos.writeInt(nums[i]) ; // 写入数量
            dos.writeChar('\n') ;    // 换行
        }
        dos.close() ;    // 关闭输出流
    }
};*/
