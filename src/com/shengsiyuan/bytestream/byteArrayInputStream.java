package com.shengsiyuan.bytestream;
/**
 * �鿴byteArrayInputStream�ĵ��ķ���֪��:����������:����ûByteArrayOutputStream��,������
 * ByteArrayOutputStream:�ڲ��и�����,���Ի��������������,���������������߱��Ĺ���.
 * ����������ȡ�ļ�ϵͳ������д�����������,��toString����toByteArray�õ��������
 * ͬʱ�ֿ��Խ����е�����writteTo����������,��������д�����ļ�ϵͳ��
 * @author lenovo
 * 
 * 
 *	byteArrayInputStream����;:
 *������Ϊһ���ȽϺõ���;���������ж�ȡ���ݰ����������ݰ�һ���Ƕ����ģ����ǿ����ȷ���һ�������byte���飬����byte buf[]=new byte[1024];

Ȼ�����ĳ�������õ������е����ݰ������磺

Socket s=...;

DataInputStream dis=new DataInputStream(s.getInputStream());

dis.read(buf);//���������ݴ浽buf��

ByteArrayInputStream bais=new ByteArrayInputStream(buf); //�ѸղŵĲ�����Ϊ������

DataInputStream dis_2=new DataInputStream(bais);

//���ڿ���ʹ��dis_2�ĸ���read��������ȡָ�����ֽ�

�����һ���ֽ��ǰ汾�ţ�dis_2.readByte();

�ȵȡ���

�����ʾ�������ΰ�װ����ȥ�е���һ�٣���ʹ��ByteArrayInputStream�ĺô��ǹص���֮������������Ȼ���ڡ�
 */
public class byteArrayInputStream {
	
}

