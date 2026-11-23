package discoverone;

public class MySingletonClass {
	
	private static volatile MySingletonClass obj=null;
	
	private MySingletonClass()
	{
		if(obj!=null) {
			System.out.println("Singleton instance already exists");
			throw new RuntimeException("Singleton instance already exists");
		}
	}
	
	public static MySingletonClass getSingletonInstance()throws RuntimeException
	{
		if(obj==null)
		{
			synchronized (MySingletonClass.class) {
				obj=new MySingletonClass();
			}
		}
		return obj;
	}

}
