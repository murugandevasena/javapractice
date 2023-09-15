package TestPractice;

import java.util.function.Consumer;

public class ConsumerInterfacePractice {
	public static void main(String[] args) {
		Consumer<String> c1= String::toUpperCase;
		c1.accept("murugan");
		
	}
}
