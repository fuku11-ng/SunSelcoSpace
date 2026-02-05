package jp.co.sunselcospace.entity;

/**
 * アカウントテーブル用のEntity
 * @author 山下 諒
 */
public class AccountEntity {
	private String id;
	private String password;
	private String name;

	/**
	 * @author 山下 諒
	 *
	 * @param id
	 * @param password
	 * @param name
	 */
	public AccountEntity(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}

	/**
	 * @author 山下 諒
	 */
	public AccountEntity(String id, String password) {
		this(id, password, "no Name");
	}

	/**
	 * @author 山下 諒
	 */
	public AccountEntity(String id) {
		this(id, "no password", "no Name");
	}

	/**
	 * @author 山下 諒
	 */
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	/**
	 * @author 山下 諒
	 */
	public String getName() {
		return name;
	}
}
