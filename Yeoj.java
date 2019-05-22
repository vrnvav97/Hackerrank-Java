import java.util.*;
class Yeoj
{
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		int randomNumber = (int)(Math.random()*(al.size()-0)+0);
		System.out.println (al.get(randomNumber));

	}
}