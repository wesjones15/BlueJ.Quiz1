 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer acc = number;
          for (int i = 1; i < number; i++) {
              acc *= i;
          }
          return acc;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          StringBuilder acc = new StringBuilder();
          acc.append(phrase.charAt(0));
          for (int i = 1; i < phrase.length(); i++) {
              String currentChar = Character.toString(phrase.charAt(i));
              if (currentChar.equals(" ")) {
                  acc.append(phrase.charAt(i + 1));
              }
          }
          return acc.toString().toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
          StringBuilder encryptedWord = new StringBuilder();
          for (int k = 0; k < word.length(); k++) {
              for (int i = 0; i < alphabet.length; i++) {
                  int idx = i;
                  if (idx + 3 >= alphabet.length) {
                      idx = i - alphabet.length;
                  }
                  if (word.charAt(k) == alphabet[i]) {
                      encryptedWord.append(alphabet[idx+3]);
                  }

              }
          }
          return encryptedWord.toString();
      }
}
