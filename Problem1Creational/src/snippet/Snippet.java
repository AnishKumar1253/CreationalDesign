package snippet;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Snippet {

	public static void main(String args[]) throws Exception {
		DatabaseConnector db1=DatabaseConnector.getInstance("localhost:3306","AnishKumar","sql1253");
		System.out.println(db1);
		
		DatabaseConnector db2=DatabaseConnector.getInstance("localhost:3311","Jayat","jayat1253");
		
		/**same object gets returned **/
		System.out.println(db2);
		
		DatabaseConnector db3=null;
		Constructor[] constructors=DatabaseConnector.class.getDeclaredConstructors();
		
		for(Constructor constructor:constructors) {
			constructor.setAccessible(true);
			/**Exception will occur while creating this object **/
			db3=(DatabaseConnector) constructor.newInstance("localhost:3311","Jayat","jayat1253");
			break;
		}
		System.out.println(db3);
		
	}
}

