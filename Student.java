package QA1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends People {
	private String block;
	private String Class;
	
	public Student() {
		super();
	}

	public Student(String id, String name, String birthday, String phoneNum, String address, String sex, String block, String Class) {
		super(id, name, birthday, phoneNum, address, sex);
		this.block = block;
		this.Class = Class;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}
	
	public String getCclass() {
		return Class;
	}

	public void setClass(String class1) {
		Class = class1;
	}

	public void setall(String name,String id , String birthday, String phoneNum, String address, String sex, String block, String Class) {
		super.setall(id, name, birthday, phoneNum, address, sex);
		this.block = block;
		this.Class = Class;
	}
	
	public void inputStudent() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Input Block: ");
		block = sc.nextLine();
		System.out.println("Input Class: ");
		Class = sc.nextLine();
		
	}
	
	public void outputStudent() {
		super.output();
		System.out.println("Block: " + getBlock());
	}

	public static ArrayList<Student> inputFileStudent() {
		ArrayList<Student> list = new ArrayList<Student>();
		try {
			String ClassStudent = "C:\\Users\\Admin\\Desktop\\lib java\\Class.txt";
			FileReader fReader = new FileReader(ClassStudent);
			BufferedReader bReader = new BufferedReader(fReader);
			while(true) {
				String line = bReader.readLine();
				if(line == null || line == "") break;
				String[] temp = line.split("[;]");
				Student data = new Student(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);
				list.add(data);
			}
			bReader.close();
			fReader.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void outputFileStudent(ArrayList<Student> list) {
			Scanner sc = new Scanner(System.in);
			String ClassStudent;
			System.out.println("Input Name File: ");
			ClassStudent = sc.nextLine();
		try {
			FileWriter fWriter = new FileWriter("C:\\Users\\Admin\\Desktop\\lib java\\ClassStudent.txt");
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			for (Student data : list) {
				if(data.getCclass().equals(ClassStudent)) {
					bWriter.write(data.getname() + ";" + data.getid() + ";" + data.getbirthday() + ";" + data.getphoneNum() + ";" + data.getaddress() + ";" + data.getsex() + ";" + data.getBlock() + ";" + data.getCclass());
					bWriter.newLine();
				}
			}
			bWriter.close();
			fWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list = inputFileStudent();
		outputFileStudent(list);
	}
}
