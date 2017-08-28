import example.GreetingService;

/**
 * HelloWorld Service
 * @author y2292712
 *
 */
public class HelloWorld {
	private GreetingService service;

	public void setService(GreetingService service) {
		this.service = service;
	}

	public void sayHello()
	{
		String name = "Kang Hye Won";
		String message = service.greet(name);
		System.out.println(message);
	}
}
