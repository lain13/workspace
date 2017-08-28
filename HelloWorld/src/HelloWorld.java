import example.GreetingService;


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
