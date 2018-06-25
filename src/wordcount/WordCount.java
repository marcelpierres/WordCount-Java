/**
 * 
 */
package wordcount;

/**
 * @author marce
 *
 */
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.util.*;

public class WordCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException,FileNotFoundException, InterruptedException {
		// create variables
		String[] filenames = new String[] {"C:\\Users\\marce\\eclipse-workspace\\WordCount\\src\\wordcount\\wordcount1.txt", "wordcount2.txt"};
		JFrame frame = new JFrame();
		int totallines=0, totalchar=0, totalwords=0;
		
		for (String filename:filenames) {
			
			try {
				// obtain contents of file in scanner
				Scanner scanner = new Scanner(new File(filename));
				
				//Tell user the file has be found		
				JOptionPane.showMessageDialog(frame, filename+" Is Found");
				
				//wait 4 seconds
				Thread.sleep(4000);
				
				// create variables 
				int lines=0, chars=0, words=0;
				
				// print out each word
				while(scanner.hasNextLine()) {
				String line = scanner.nextLine();	
				lines++;
				chars += line.length()+1;
				StringTokenizer st = new StringTokenizer(line);
				words += st.countTokens();
				
						
				}
				
				System.out.println("Words: "+words+"  Characters: "+chars+"  Lines: "+lines);
				totalwords += words;
				totalchar += chars;
				totallines += lines;
				
			}
			
			//If a file does not exist, Catch the Exception
			catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(frame, filename+" Doesn't Exist");
				
				break;
			}
			
			
		}
		
		
		

	}

}
