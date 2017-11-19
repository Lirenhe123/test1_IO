package com.shengsiyuan.bytestream;
/**
 * 查看byteArrayInputStream文档的方法知道:该流很少用:方法没ByteArrayOutputStream多,功能少
 * ByteArrayOutputStream:内部有个数组,可以获得这个数组的数据,这是其他流都不具备的功能.
 * 用其他流获取文件系统的数据写出到这个流中,再toString或者toByteArray得到这个数据
 * 同时又可以将流中的数据writteTo到其他流中,由其他流写出到文件系统中
 * @author lenovo
 * 
 * 
 *	byteArrayInputStream的用途:
 *个人认为一个比较好的用途是在网络中读取数据包，由于数据包一般是定长的，我们可以先分配一个够大的byte数组，比如byte buf[]=new byte[1024];

然后调用某个方法得到网络中的数据包，例如：

Socket s=...;

DataInputStream dis=new DataInputStream(s.getInputStream());

dis.read(buf);//把所有数据存到buf中

ByteArrayInputStream bais=new ByteArrayInputStream(buf); //把刚才的部分视为输入流

DataInputStream dis_2=new DataInputStream(bais);

//现在可以使用dis_2的各种read方法，读取指定的字节

比如第一个字节是版本号，dis_2.readByte();

等等……

上面的示例的两次包装看上去有点多此一举，但使用ByteArrayInputStream的好处是关掉流之后它的数据仍然存在。
 */
public class byteArrayInputStream {
	
}

