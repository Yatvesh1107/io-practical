package fileUpdate;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter("test.txt");
			fileWriter.write("we just created new file");
			fileWriter.close();
			System.out.println("data is inserted");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("data is not inserted");
		}
		

	}
}
