package impclasses;

public class I003_StringPractical {
	public static void main(String[] args) {
		
		String st = "sun rises in east";
		
		//east in rises sun
		//tsae ni sesir nus
		//nus sesir ni tsae
		//east rises in sun
		
		String words[] = st.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
		
		
		
	}
}
