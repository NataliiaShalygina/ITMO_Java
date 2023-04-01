package Lab05;

public class Ex02 {
    public static void main(String[] args) {
        String wordOne = "Топот";
        String wordTwo = "кот";
        System.out.println(palindrome(wordOne));
        System.out.println(palindrome(wordTwo));
    }

    public static String palindrome(String word) {
        String itog = "Слово '" + word + "' не палиндром";
        word = word.toLowerCase();
        StringBuilder builder = new StringBuilder(word);
        if (word.equals(builder.reverse().toString()) == true) {
            itog = "Слово '" + word + "' палиндром";
        }
        return itog;
    }

}

