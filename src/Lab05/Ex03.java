package Lab05;

public class Ex03 {
    public static void main(String[] args) {
        String text = "Значение слова бяка. Что такое бяка? Бяка - это что-то дурное или плохое, нежелательное";
        System.out.println(text);
        System.out.println(censorship(text));
    }

    public static String censorship(String string) {
        string = string.replaceAll("бяка", "[вырезано цензурой]");
        string = string.replaceAll("Бяка", "[вырезано цензурой]");
        return string;
    }
}
