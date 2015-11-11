import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test
{
	public static void main (String[] args) throws FileNotFoundException
	{
		File inputFile = new File("/home/adam/Downloads/purple/AL.txt"); /*change file path for relevant operating system etc.*/
		Scanner input = new Scanner(inputFile);
		while(input.hasNextLine()){
			String wat = input.nextLine();
			System.out.println(wat);
		}
		input.close();
	}
}
