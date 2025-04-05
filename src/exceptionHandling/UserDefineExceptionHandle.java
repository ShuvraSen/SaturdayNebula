package exceptionHandling;

public class UserDefineExceptionHandle  {

	public static void main(String[] args) {
		try{
			throw new UserDefineException("test");
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
