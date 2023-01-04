package snippet;
import java.io.Serializable;

public class DatabaseConnector implements Serializable {

	private static DatabaseConnector instance;
	private String url;
	private String username;
	private String password;
	
	
	private DatabaseConnector(String url,String username,String password) throws Exception {
		this.url=url;
		this.username=username;
		this.password=password;
		
		if(instance!=null) {
			throw new Exception("Another instance creation not allowed");
		}
	}

public static synchronized DatabaseConnector getInstance(String url,String username,String password) throws Exception{
		if(instance==null)
			return instance=new DatabaseConnector(url,username,password);
		return instance;
	}
	@Override
public String toString() {
		return "DatabaseConnector [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
	
}

