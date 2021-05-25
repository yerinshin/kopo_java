package kr.ac.kopo.day16;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.FileClose;

public class FileIOMain12 {
	
	public static void write() {
		
		UserVO user = new UserVO("홍길동", 26, "010-1111-2222", "서울시 서초구");
		UserVO user2 = new UserVO("구길동", 30, "010-3333-4444", "경기도 광명시 철산동");
		UserVO user3 = new UserVO("윤길동", 28, "010-5555-6666", "서울시 송파구");
		
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iodata/userList2.txt");
			oos = new ObjectOutputStream(fos);
			
//			for(UserVO vo : list) {
//				oos.writeObject(vo);
//			}
			
			//arraylist 가 serializable 상속 받고 있기 때문에 list객체로 write
			oos.writeObject(list);
			
			oos.flush();
			System.out.println("userList2.txt 저장완료..");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	
	}
	
	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		List<UserVO> list = new ArrayList<>();
		
		
		try {
			fis = new FileInputStream("iodata/userList2.txt");
			ois = new ObjectInputStream(fis);
			
			list = (ArrayList<UserVO>) ois.readObject();

/*
			while(true) {
				try {				
					UserVO user = (UserVO)ois.readObject();			//readObject는 null일 때 특별한 반환값 x, 그러나 값없을 때 EOFException발생시킴 --> 또다른 try/catch 문으로 처리
//					System.out.println(user);
					list.add(user);
				} catch (EOFException e) {				
					break;											// EOFException 발생하면 break
				}
			}

*/
			System.out.println("파일 로드 완료...");
			
			for(UserVO vo : list) {
				System.out.println(vo);
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(ois);
			FileClose.close(fis);
		}
				
	}
	
	
	public static void main(String[] args) {
		write();
		read();

	}

}
