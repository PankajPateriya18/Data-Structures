package array_1;

import java.util.Scanner;

public class HelloWorld {
	
	static int i = 10;
	int j = 5;

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Hello World");
		
		HelloWorld hw = new HelloWorld();
		String ret = hw.returnHello();
		System.out.println(ret);
	}
	
	public String returnHello() {
		return "Hello World";
	}
}

class ByeWorld{
	
}
