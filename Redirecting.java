//: Redirecting.java
package ʵ��35;
import java.io.*;

public class Redirecting {
  public static void main(String[] args)
  throws IOException {
    PrintStream console = System.out;
    BufferedInputStream in = new BufferedInputStream(
      new FileInputStream("Redirecting.java"));
    PrintStream out = new PrintStream(
      new BufferedOutputStream(
        new FileOutputStream("test.out")));
    System.setIn(in);    //�ض����׼����
    System.setOut(out);  //�ض����׼���
    System.setErr(out);  //�ض����׼����
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
    String s;
    while((s = br.readLine()) != null)
      System.out.println(s);
    out.close(); //  �ر�������ͷ���Դ
    System.setOut(console);
  }
} ///:~
