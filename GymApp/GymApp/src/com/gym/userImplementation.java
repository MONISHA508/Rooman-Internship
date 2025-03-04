package com.gym;

public class userImplementation implements IUser {
private User users[];
userImplementation(){
	users=new User[5];
}
	@Override
	public String register(User user, int index) {
		System.out.println("the user name is : "+user);
		users[index]=user;
		return "Thank u for registration !";
	}

	@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		for(User user:users) {
			if(user!=null && user.getUsername().equals(userName) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
