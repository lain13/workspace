import example.GoodAfternoonService;
import example.ProxyGreetingService;


public class Main {
	public static void main(String[] args) {
		HelloWorld world = new HelloWorld();
		GoodAfternoonService service = new GoodAfternoonService();
		ProxyGreetingService proxy = new ProxyGreetingService(service);
		world.setService(proxy);
		world.sayHello();
	}
}
