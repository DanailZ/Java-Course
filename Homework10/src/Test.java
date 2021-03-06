import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		try {
			readingWriting("..\\files\\text.txt", "..\\files\\text2.txt");
		} catch (IOException e) {
			System.out.println("Error.");
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

	private static void readingWriting(String path, String path2) throws IOException {
		
		FileReader fileReader = new FileReader(path);
		BufferedReader reader = new BufferedReader(fileReader);
		
		FileWriter fileWriter = new FileWriter(path2, true);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		
		while(reader.ready()){
			String line = reader.readLine();
			
			writer.write(line.split(",").toString());
			writer.newLine();
			
		}
		System.out.println("Reading / Writing is success.");
		
		reader.close();
		writer.close();
	}


}
