package kr.ac.kopo.day01;
import java.lang.System ;
/*
    출력메소드
    
    System.out.print()      : 괄호안의 내용을 단순히 출력
    System.out.println()   : 내용 출력 후, 한 줄 띄워짐
    System.out.printf()      : jdk 1.5, format 형식으로 나타내야함 
    
       ---format-----
       %[간격]알파벳          // % 뒤에 옵션을 넣을 수 있음
       %[전체자리수][.소수점이하자리수]
        정수      %d
       실수      %f
       문자      %c
       문자열      %s
       논리값      %b
    
    \r : CarriageReturn
    \n : LineFeed
    
    " " : 
    ' ' : 문자열
    
    
 */

// public : 접근제어자
// java의 배열은 객체로 인식한다.


public class HelloMain {

   public static void main(String[] args) {
      
      java.lang.System.out.println(10.0/3.0);
      System.out.printf("%.2f\n", 10.0/3.0); // 소수점 2자리까지 나타낸다.
      
      System.out.printf("%-15s%6d\n", "빼빼로" , 1500);
      System.out.printf("%-15s%6d\n", "빠다코코넛" , 1500);
      System.out.printf("%-15s%6d\n", "dddddddd" , 1500);
      
      System.out.println("빼빼로" +"\t"+ 1500 );
      System.out.println("빠다코코넛" +"\t"+ 2000 );
      System.out.println("dddddddddddddddddd" +"\t"+ 2000 ); 
   
      System.out.println(10);
      System.out.print(20); // 개행 x
      System.out.println(20);
      System.out.printf("%d%c%d", 10, '\n', 20);
      
   }
}