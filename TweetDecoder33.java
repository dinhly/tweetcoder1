import java.util.Scanner;

public class TweetDecoder33 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";

      System.out.println("Enter abbreviation from tweet: ");
      origTweet = scnr.nextLine();
if(origTweet.length() <= 140 ){


      if (origTweet.indexOf("LOL") != -1) {
         System.out.println("LOL = laughing out loud");
      }
       if (origTweet.indexOf("BFN") != -1) {
         System.out.println("BFN = bye for now");
      }
       if (origTweet.indexOf("FTW") != -1 ) {
         System.out.println("FTW = for the win");
      }
     
}
else {
System.out.println("This is longer than 140 characters. ");	
}

      

      return;
   }
}