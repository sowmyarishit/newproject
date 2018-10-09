package Interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class notepad_words_sentences {

	public static void main(String[] args) throws Exception {
		File f=new File("C:\\Users\\Admin\\Desktop\\word.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int now=0;
		int nos=0;
		String l="";
		while ((l = br.readLine()) != null) {
			nos=nos+1;
			String[] p=l.split(" ");
			now=now+p.length;
			
		}
		System.out.println(nos);
		System.out.println(now);

		/*String line = "", str = "";
		int a = 0;
		int b = 0;
		while ((line = br.readLine()) != null) {
		str += line + " ";
		b++;
		}
		System.out.println("Totally " + b + " lines");
		 
		System.out.println(str);
		 
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
		String s = st.nextToken();
		a++;
		}
		System.out.println("File has " + a + " words  in the file");*/
		}
		 
		

	}


