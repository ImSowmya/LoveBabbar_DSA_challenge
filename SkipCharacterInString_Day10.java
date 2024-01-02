class SkipCharacterInString_Day10 
{
    public static void main(String[] args) 
    {
        System.out.println(Skip("Parachata", ""));        
    }
    
    static String Skip(String word, String ans)
    {
        if (word.length() == 0) return ans;
        if (word.charAt(0) == 'a')
        {
            return Skip(word.substring(1), ans);
        }
        else
        {
            return Skip(word.substring(1), ans+word.charAt(0));
        }
    }
}
