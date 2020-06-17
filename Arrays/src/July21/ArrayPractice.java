package July21;

import java.util.Arrays;

public class ArrayPractice {
	
	//adding to GitHub

	public static void main(String[] args) {
		String[] str  = {"Poli", "Polli", "Polly"};
		System.out.println("Old string" + Arrays.toString(str));
		str[1] = "Pollie";
		for (String s : str) System.out.println(s);

	}

}
