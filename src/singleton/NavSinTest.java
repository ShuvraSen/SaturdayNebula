package singleton;

public class NavSinTest {

	public static void main(String[] args) {
		//SingletonNav singletonNavobj= new SingletonNav();
		//cann't instanciated new object because of it's private constructor
		SingletonNav.getinstance().display();

	}

}
