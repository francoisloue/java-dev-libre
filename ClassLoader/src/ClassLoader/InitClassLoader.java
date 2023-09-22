package ClassLoader;

public class InitClassLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassLoader classLoader = InitClassLoader.class.getClassLoader();
		try {
			Class<?> myClass = classLoader.loadClass("ClassLoader.MyClassToLoad");
			Object myObject = myClass.newInstance();
			if (myObject instanceof MyClassToLoad) {
				MyClassToLoad instance = (MyClassToLoad) myObject;
				instance.sayHello();
			}
		} catch(Exception e) {
			System.err.println("Error occured on InitClassLoader : "+e);
		}
	}

}
