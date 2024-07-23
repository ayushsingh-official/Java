package streamAPI;

interface Logic {
	int add(int val1, int val2);

}

public class LambdaExpressions {

	public static void main(String[] args) {

		Logic logic = ( val1,  val2) -> {
			return (val1 + val2);
		};

		System.out.println(logic.add(1, 2));

		// logic.add(1,2);
	}

}
