
public class DeteminantLetterUniquness
{
	/*
	 * 1.1 implement an algorithm to determine if a string has all unique characters. 
	 * what if you cannot use additional data structures??
	 *
	 */
		public static boolean isUniqueCharactors2(String str)
		{
			/*
			 * time complexity is o(n)
			 * the space complexity is o(1)
			 */
			if(str.length() > 256)
			{
				return false;
				/*to automatically return false 
				 * if the length of the string is grater than the number of unique characters in the alphabet
				 */
			}
			boolean[] char_set = new boolean[256];
			for(int i = 0; i < str.length(); i++)
			{
				int val = str.charAt(i);
				if(char_set[val])
				{
					//already found this char in string 
					return false;
				}
				char_set[val] = true;
			}
			return true;
		}
		public boolean isUniqueChars(String str)
		{
			int checker = 0;
			for(int i = 0; i < str.length(); i++)
			{
				int val = str.charAt(i) - 'a';
				if((checker & (1 << val)) > 0)
				{
					return false;
				}
				checker |= (1 << val);
			}
			return true;
		}
		static public void main(String [] arg)
		{
			String word1 = "Hello";
			String word2 = "Dreamy";
			if(isUniqueCharactors2(word1))
			{
				System.out.printf("yes all of chars in %s are used unique chars\n",word1);
			}
			else
			{
				System.out.printf("No there exists char x such that x is deprecated in %s \n", word1);
				
			}
			if(isUniqueCharactors2(word2))
			{
				System.out.printf("yes all of chars in %s are used unique chars\n",word2);
			}
			else
			{
				System.out.printf("No there exists char x such that x is deprecated in %s \n", word2);
				
			}
			
		}
}
/*
 * out put:
 * No there exists char x such that x is deprecated in Hello 
 *yes all of chars in Dreamy are used unique chars

*/