package example;

public class GoodAfternoonService implements GreetingService {

	@Override
	public String greet(String name) {
		return "Good Afternoon " + name;
	}

}
