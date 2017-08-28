package example;

public class ProxyGreetingService implements GreetingService {

	private GreetingService service;

	public ProxyGreetingService(GreetingService service) {
		this.service = service;
	}

	@Override
	public String greet(String name) {
		System.out.println("GREETING SERVICE BEFORE!!!");
		return service.greet(name);
	}
}
