package Lab02;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int exampleSum1 = calc.sum(35, 40);
        long exampleSum2 = calc.sum(100500L, 305404L);
        double exampleSum3 = calc.sum(6.0, 9.5);
        System.out.println(exampleSum1 + " " + exampleSum2 + " " + exampleSum3);

        double exampleDiv = calc.div(100500L,100500L);
        long exampleMult = calc.mul(100500L,2L);
        int exampleSub = calc.sub(306,6);
        System.out.println(exampleDiv + " " + exampleMult + " " + exampleSub);

        figureSkaters sashaTrusova = new figureSkaters("Sasha","Trusova", Discipline.womenSingles, Status.Active);
        figureSkaters yuzuruHanyu = new figureSkaters();
        yuzuruHanyu.setName("Yuzuru");
        yuzuruHanyu.setSurname("Hanyu");
        yuzuruHanyu.setStat(Status.Completed);
        figureSkaters shomaUno = new figureSkaters("Shoma","Uno", Discipline.menSingles, 25,"Japan", Status.Active);
        System.out.println(sashaTrusova);
        System.out.println(yuzuruHanyu);
        System.out.println(shomaUno);
    }
}
