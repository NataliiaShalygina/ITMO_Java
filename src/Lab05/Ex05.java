package Lab05;

public class Ex05 {
    public static void main(String[] args) {
        String test = "Кот";
        System.out.println("The given string is: '" + test + "'");
        System.out.println("The string reversed word by word is:");
        System.out.println("'" + inversion(test) + "'");
    }

    public static String inversion(String line) {
        StringBuilder builder = new StringBuilder(line);
        return builder.reverse().toString();
    }
}
