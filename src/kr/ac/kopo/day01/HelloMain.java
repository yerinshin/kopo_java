package kr.ac.kopo.day01;
import java.lang.System ;
/*
    ��¸޼ҵ�
    
    System.out.print()      : ��ȣ���� ������ �ܼ��� ���
    System.out.println()   : ���� ��� ��, �� �� �����
    System.out.printf()      : jdk 1.5, format �������� ��Ÿ������ 
    
       ---format-----
       %[����]���ĺ�          // % �ڿ� �ɼ��� ���� �� ����
       %[��ü�ڸ���][.�Ҽ��������ڸ���]
        ����      %d
       �Ǽ�      %f
       ����      %c
       ���ڿ�      %s
       ����      %b
    
    \r : CarriageReturn
    \n : LineFeed
    
    " " : 
    ' ' : ���ڿ�
    
    
 */

// public : ����������
// java�� �迭�� ��ü�� �ν��Ѵ�.


public class HelloMain {

   public static void main(String[] args) {
      
      java.lang.System.out.println(10.0/3.0);
      System.out.printf("%.2f\n", 10.0/3.0); // �Ҽ��� 2�ڸ����� ��Ÿ����.
      
      System.out.printf("%-15s%6d\n", "������" , 1500);
      System.out.printf("%-15s%6d\n", "�������ڳ�" , 1500);
      System.out.printf("%-15s%6d\n", "dddddddd" , 1500);
      
      System.out.println("������" +"\t"+ 1500 );
      System.out.println("�������ڳ�" +"\t"+ 2000 );
      System.out.println("dddddddddddddddddd" +"\t"+ 2000 ); 
   
      System.out.println(10);
      System.out.print(20); // ���� x
      System.out.println(20);
      System.out.printf("%d%c%d", 10, '\n', 20);
      
   }
}