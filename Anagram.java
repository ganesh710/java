import java.util.Arrays;
public class Anagram
{
 static void isAnagram(String s1, String s2)
 	{
		boolean status = true;
		if (s1.length() != s2.length()) 
		{
			status = false;
                }
		else 
			{
			char[] Array1 = s1.toLowerCase().toCharArray();
			char[] Array2 = s2.toLowerCase().toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			status = Arrays.equals(Array1, Array2);
		        }
		if (status) 
		{
			System.out.println(s1 + " and " + s2 + " are anagrams");
		}
 		else 
		{
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}
 
	public static void main(String[] args) {
		isAnagram("Dormitory", "Dirtyroom");
		isAnagram("Mother In Law", "Hitler Woman");
	}
}
