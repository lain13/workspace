package example;

public class GoodMorningGreetingService implements GreetingService {

	@Override
	public String greet(String name) {
		return "Good Morning " + name;
	}
}
