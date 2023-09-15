package com.practice;

public class ExpandStringBasedOnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "b2a2c4";
		StringBuilder s = new StringBuilder();
		char name = ' ';

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isLetter(c)) {
				name = c;
			} else if (Character.isDigit(c)) {
				int a = Character.getNumericValue(c);

				for (int j = 0; j < a; j++) {
					s.append(name);
				}
			}
		}
		System.out.println("StringRepeatation:" + s);

		
		
		// using for loop
		for (int h = 0; h < input.length(); h = h + 2) {
			for (int h1 = 0; h1 < Integer.parseInt(input.charAt(h + 1) + ""); h1++) {
				System.out.print(input.charAt(h));
			}
		}
		
		
		//using enhanced for loop and if-else -mistake
		
		StringBuilder sb = new StringBuilder();
		int count=0;
		
		for(char c1:input.toCharArray()) {
			if(Character.isDigit(c1)) {
				count = Character.getNumericValue(c1);
			}
			else {
				for(int d=0;d<count;d++) {
					sb.append(c1);
				}
			}
		}
		System.out.print("String builder output:"+sb.toString());
	
		
		
		// using HashMap
//		String[] letters = input.split("[0-9]");
//		String[] num = input.split("[a-z]");
//		System.out.println(letters[2]);
//		Map<Integer, Character> map = new HashMap<Integer,Character>();
//		for(int g=0;g<letters.length;g++) {
//			map.put(null, null);
//		}

	}

}
