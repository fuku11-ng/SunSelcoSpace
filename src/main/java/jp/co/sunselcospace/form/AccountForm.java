package jp.co.sunselcospace.form;

public class AccountForm {
	private String name;
	//追記
	private String id;
	private String password;
	
	public String getName() {
		return name;
		}
	//追記
	
	public void setName(String name) {
		this.name = name;
		}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
