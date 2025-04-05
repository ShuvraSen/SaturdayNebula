package singleton;

public class SingletonNav {
	//private static instance of the class
	private static SingletonNav singletonNav;
	//private constructor
	private SingletonNav(){
		
	};
	//public static getInstance method to provide access 
	public static SingletonNav getinstance(){
		if(singletonNav==null){
			singletonNav= new SingletonNav();
		}
		return singletonNav;
	}
	//individual public method
	public void display(){
		System.out.println("https://www.google.com/search?sca_esv=0144c96a229ff1a7&rlz=1C1JZAP_enUS979US979&q=singleton+java&udm=7&fbs=ABzOT_CWdhQLP1FcmU5B0fn3xuWpA-dk4wpBWOGsoR7DG5zJBtmuEdhfywyzhendkLDnhcrUz6wxBwARHD96EKWkSbZoqXb6uOuzhtkIDhbKMFBTOSopnMSiYQfajMRcOqHpFXiuixuphoEvyJTuX5yYBnQEZCINeCLcKyGdjmVXh6I0C2TnOrV4C_adia4N1YykHtn5cCl1VuW8naGtlXJhmYx6uELZeA&sa=X&sqi=2&ved=2ahUKEwiV-uvci_uLAxX278kDHdYcAvkQtKgLegQIFBAB&biw=1920&bih=911&dpr=1#fpstate=ive&vld=cid:33133d6d,vid:khnair65cVc,st:0");
	}
}
