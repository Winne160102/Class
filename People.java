package QA1;

import java.util.Scanner;

public class People {
	//attributes
	private String name;
	private String id;
	private String sex;
	private String phoneNum;
	private String address;
	private String birthday;
	
	//constructor
	public People() {
		
	}
	//constructor all attributes
	public People (String name, String id, String sex, String phoneNum, String address, String birthday) {
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday; 
		this.phoneNum = phoneNum;
	}
	
	//set attribute
	public void setname(String name) {
		this.name = name;
	}
	public void setid(String id) {
		this.id = id;
	}
	public void setphonNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setsex(String sex) {
		this.sex = sex;
	}
	public void setbirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
	//set all attributes
	public void setall(String name, String id, String sex, String phoneNum, String address, String birthday) {
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.address = address;
		this.birthday = birthday; 
		this.phoneNum = phoneNum;
	}
	
	//get attribute
	public String getname() {
		return this.name;
	}
	public String getid() {
		return this.id;
	}
	public String getsex() {
		return this.sex;
	}
	public String getphoneNum() {
		return this.phoneNum;
	}
	public String getaddress() {
		return this.address;
	}
	public String getbirthday() {
		return this.birthday;
	}
	
	// input
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Import Name: ");
		name = sc.nextLine();
		
		System.out.println("Import ID: ");
		id = sc.nextLine();
		
		System.out.println("Import Birthday: ");
		birthday = sc.nextLine();
		
		System.out.println("Import Phone Number: ");
		phoneNum = sc.nextLine();
		
		System.out.println("Import Address: ");
		address = sc.nextLine();
		
		System.out.println("Import Sex: ");
		sex = sc.nextLine();
	
		sc.close();
	}
	
	//output
	public void output() {
		System.out.println("Name: " + getname());
		System.out.println("ID: " + getid());
		System.out.println("Birthday: " + getbirthday());
		System.out.println("Phone Number: " + getphoneNum());
		System.out.println("Address: " + getaddress());
		System.out.println("Sex: " + getsex());
	} 
	
}