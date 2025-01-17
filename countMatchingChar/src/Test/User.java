package Test;

public class User {
	
	
	 private String userName;
	private String email;
	 private String password;
	private int userId;
	
	User(UserBuilder ub)
	{
		this.userName=ub.userName;
		this.password=ub.password;
		this.userId=ub.userId;
		this.email=ub.email;
	}
	
	static class UserBuilder
	{
		private String userName;
		private String email;
		private String password;
		private int userId;
		
		
		public UserBuilder(String userName,String password)
		{
			this.userName=userName;
			this.password=password;
		}
		
		public UserBuilder age(int userId)
		{
			this.userId=userId;
			return this;
		}
		
		public UserBuilder email(String email)
		{
			this.email=email;
			return this;
		}
		
		public User build()
		{
			User user=new User(this);
			return user;
		}
	}
	
	public static void main(String args[])
	{
	  User build = new User.UserBuilder("welcome", "Password123456").build();
	  System.out.println(build.password);
	}
	

}
