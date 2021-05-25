package kr.ac.kopo.day17;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		
		File dirObj = new File("iodata");
		System.out.println(dirObj.exists() ? 
							"��ȿ�� ���丮�Դϴ�." : "��ȿ���� ���� ���丮�Դϴ�.");
		System.out.println(dirObj.isDirectory() ? 
							"���丮�Դϴ�." : "���丮�� �ƴմϴ�."); 
		
		String[] list = dirObj.list();
		System.out.println("----------------------------------------------");
		System.out.println("\t" + dirObj.getName() + "����");
		System.out.println("----------------------------------------------");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("----------------------------------------------");
		
		
		File newDirObj = new File("iodata/������");
		if(!newDirObj.exists()) {
			boolean bool = newDirObj.mkdir();
			System.out.println(bool? "���丮 ���� ����" : "���丮 ���� ����");
		}
		
		
		newDirObj = new File("iodata/��������/����");
		if(!newDirObj.exists()) {
			//��� '����'������ ����� ������ '��������'�������� �ʾƼ� ���� ����
			//boolean bool = newDirObj.mkdir();
			
			//mkdirs()�� �������� �ʴ� ���� ���丮���� ����
			boolean bool = newDirObj.mkdirs();
			System.out.println(bool? "���丮 ���� ����" : "���丮 ���� ����");
		}
		
		boolean bool = newDirObj.delete();
		System.out.println(bool ? "���� ����" : "���� ����");
		
		
		/*
		//"iodata/a.txt" file ���� �˾ƿ���
		File fileObj = new File("iodata/a.txt");
//		File fileObj = new File("C:\\Users\\HP\\Desktop\\java\\kopo_java\\src\\iodata\\a.txt");
		
		
		String name = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
		String abPath = fileObj.getAbsolutePath();
		
		System.out.println("���ϸ� : " + name);
		System.out.println("�θ��̸� : " + parent);
		System.out.println("��� : "+ path);
		System.out.println("������ : " + abPath);
		
		boolean bool = fileObj.isFile();
		System.out.println(bool? "�����Դϴ�" : "������ �ƴմϴ�.");
		
		bool = fileObj.isDirectory();
		System.out.println(bool? "���丮�Դϴ�." : "���丮�� �ƴմϴ�.");
		
		bool = fileObj.exists();
		System.out.println(bool? "�����մϴ�." : "�������� �ʽ��ϴ�.");
		
		long size = fileObj.length();
		System.out.println("����ũ�� : " + size + "byte(s)");
		
		long time = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		System.out.println("������ ���� ��¥ : " + sdf.format(new Date(time)));
		
		bool = fileObj.canRead();
		System.out.println(bool? "�бⰡ��" : "�б�Ұ���");
		
		bool = fileObj.canWrite();
		System.out.println(bool? "���Ⱑ��" : "����Ұ���");
		
		*/
	}

}
