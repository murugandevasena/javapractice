package com.practice.exception;

public class Login {
	static String p= "muruga";
	public static void main(String[] args) throws PasswordException  {
		//Login l= new Login();
		System.out.println(checkPassword(p));
	}
	private static String checkPassword(String p2) throws PasswordException {
		// TODO Auto-generated method stub
		try {
			if(p2.length()>8) {
				return "Login successfully.";
			}
			else {
				throw new PasswordException("Pass word not follow the standard one.");	
			}
		} 
		catch (PasswordException p) {
			System.out.println(p);
			return p.getMessage();
		}
		finally {
			System.out.println("password");
		}

	}

	
	

}
