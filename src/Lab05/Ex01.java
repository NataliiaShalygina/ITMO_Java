package Lab05;

public class Ex01 {
    public static void main(String[] args) {
        String text = "Каждый из нас понимает очевидную вещь: экономическая повестка сегодняшнего дня, а также свежий взгляд на привычные вещи — безусловно открывает новые горизонты для своевременного выполнения сверхзадачи. Имеется спорная точка зрения, гласящая примерно следующее: некоторые особенности внутренней политики освещают чрезвычайно интересные особенности картины в целом, однако конкретные выводы, разумеется, преданы социально-демократической анафеме.";
        System.out.println(text);
        System.out.println("Самое динное слово - '" + max(text) + "'");
    }

    public static String max(String text) {
        int maxLength = 0;
        String maxWord = null;
        for (String w : text.split(" ")) {
            int length = w.length();
            if (length > maxLength) {
                maxLength = length;
                maxWord = w;
            }
        }
        return maxWord;
    }
}
