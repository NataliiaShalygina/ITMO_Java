package Lab05;

public class Ex04 {
    public static void main(String[] args) {
        String one = "кот и кошка, кот серый, кошка белая, коты голодные";
        String two = "кот";
        System.out.println("Число вхождений равно " + cont(one, two));
    }

    public static int cont(String line, String subline) {
        String[] occur = line.split(subline);
        return occur.length - 1;
    }
}
