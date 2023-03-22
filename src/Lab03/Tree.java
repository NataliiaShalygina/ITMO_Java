package Lab03;

public class Tree {
    String nameTree;
    Integer ageTree;
    Boolean isAlive;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(String nameTree, Integer ageTree, Boolean isAlive) {
        this.nameTree = nameTree;
        this.ageTree = ageTree;
        this.isAlive = isAlive;
    }

    public Tree(String nameTree, Integer ageTree) {
        this.nameTree = nameTree;
        this.ageTree = ageTree;
    }


}
