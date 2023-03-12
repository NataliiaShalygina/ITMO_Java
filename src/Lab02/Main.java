package Lab02;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int exampleSum1 = calc.sum(35, 40);
        long exampleSum2 = calc.sum(100500L, 305404L);
        double exampleSum3 = calc.sum(6.0, 9.5);
        System.out.println(exampleSum1 + " " + exampleSum2 + " " + exampleSum3);

        double exampleDiv = calc.div(2L,3L);
        long exampleMult = calc.mul(100500L,2L);
        int exampleSub = calc.sub(306,6);
        System.out.println(exampleDiv + " " + exampleMult + " " + exampleSub);

        FigureSkaters sashaTrusova = new FigureSkaters("Sasha","Trusova", Discipline.WOMENSINGLES, Status.ACTIVE);
        FigureSkaters yuzuruHanyu = new FigureSkaters();
        yuzuruHanyu.setName("Yuzuru");
        yuzuruHanyu.setSurname("Hanyu");
        yuzuruHanyu.setStat(Status.COMPLETED);
        FigureSkaters shomaUno = new FigureSkaters("Shoma","Uno", Discipline.MENSINGLES, 25,"Japan", Status.ACTIVE);
        System.out.println(sashaTrusova);
        System.out.println(yuzuruHanyu);
        System.out.println(shomaUno);
    }
}
