package jupiterpi;

public class Application {
	
	public int add(int a, int b) {
		return a + b;
	}
	

	public static void main(String args[]){
		System.out.println("Started");
		Application a = new Application();
		System.out.println("2 + 3 = " + a.add(2, 3));
	}
}
