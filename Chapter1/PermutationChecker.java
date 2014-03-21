
public class PermutationChecker 
{
	/*
	 * Given two Strings, write a method to decide if one is a permutation of the other
	 */
	//Key: case sensitive importance of whitespace 
	
	/*
	 * Solution #1  sort the string
	 */
	public String sort(String s)
	{
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	public boolean permutation(String s, String t)
	{
		if(s.length() != t.length())
		{
			return false;
		}
		return sort(s).equals(sort(t));
	}
	/*
	 * Solution #2 check if the strings have identical character counts
	 */
	public boolean permutaion1(String s, String t)
	{
		if(s.length() != t.length())
		{//use the key, importance of whitespace
			return false;
		}
		int [] letters = new int [256];//assumption
		char [] s_array = s.toCharArray();
		for(char c : s_array)
		{//cout number of each char in s
			letters[c]++;
		}
		for(int i = 0; i < t.length(); i++)
		{
			int c = (int) t.charAt(i);
			if(--letters[c] < 0)
			{
				return false;
			}
		}
		return true;
	}

}
