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
			
			String[] names={"����","����","Χ��"};
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
			System.out.println("�ļ�û�ҵ�");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("д��ʧ��");
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
    public static void main(String args[]) throws Exception{    // �����쳣�׳�
        DataOutputStream dos = null ;            // �����������������
        File f = new File("d:" + File.separator + "order.txt") ; // �ļ��ı���·��
        dos = new DataOutputStream(new FileOutputStream(f)) ;    // ʵ�����������������
        String names[] = {"����","����","Χ��"} ;    // ��Ʒ����
        float prices[] = {98.3f,30.3f,50.5f} ;        // ��Ʒ�۸�
        int nums[] = {3,2,1} ;    // ��Ʒ����
        for(int i=0;i<names.length;i++){    // ѭ�����
            dos.writeChars(names[i]) ;    // д���ַ���
            dos.writeChar('\t') ;    // д��ָ���
            dos.writeFloat(prices[i]) ; // д��۸�
            dos.writeChar('\t') ;    // д��ָ���
            dos.writeInt(nums[i]) ; // д������
            dos.writeChar('\n') ;    // ����
        }
        dos.close() ;    // �ر������
    }
};*/
