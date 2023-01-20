import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class MainHangmanJudge {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line, word, guess;
		int n, i, erros;
		HashSet<Character> pal;
		char c;
		boolean alreadyGuessed,  chickens;
		while ((line = in.readLine()) != null)
		{
			n = Integer.parseInt(line);
			if (n == -1){
				System.exit(0);
			}
			
			System.out.println("Round " + n);
			
			word = in.readLine();
			guess = in.readLine();
			chickens = true;
			pal = new HashSet<Character>();
			erros = 0;
			for (i=0; i<guess.length(); i++)
			{
				c = guess.charAt(i);
				alreadyGuessed = pal.add(c);
				if (!alreadyGuessed)
					continue;
				if (word.indexOf(c) > -1){
					word = word.replace(""+c, "");
					if (word.length() == 0){
						System.out.println("You win.");
						chickens = false;
						break;
					}
				} else{
					erros++;
					if (erros == 7){
						System.out.println("You lose.");
						chickens = false;
						break;
					}
				}
			}
			if (chickens){
				System.out.println("You chickened out.");
			}
		}
	}
}
