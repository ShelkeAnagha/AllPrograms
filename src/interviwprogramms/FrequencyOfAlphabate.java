package interviwprogramms;

public class FrequencyOfAlphabate {

	public static void main(String[] args) {
		
		String a = "I LOVEEE INDIA";
		char   b = 'E';
		int count=  0;
		
		for(int i=0;i<a.length()-1;i++)
		{
			if(b==a.charAt(i))
			{
				count++;
			}
		}
		System.out.println("Frequency of char E="+count);
		
	}

}
