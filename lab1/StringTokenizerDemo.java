import java.util.StringTokenizer;
//QUESTION 1 PART D 
public class StringTokenizerDemo
{
   public static void main(String[] args)
   {
      String sentence = "It's,fleece,was,white,as,snow.";
      StringTokenizer mystery = new StringTokenizer(sentence, ",");
      System.out.println(mystery.countTokens());
      System.out.println(mystery.nextToken());
      System.out.println(mystery.nextToken());
      
   }
} 
//-------------------------------------------------------------------------------------------

