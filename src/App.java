import tree.Tree;

public class App {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.populateNames(5);
        forest.populateForest(1000);

        System.out.println("forest.forestSize() = " + forest.forestSize() + "\n");

        for (String name : forest.getNames()) {
            System.out.println(name);
        }

        System.out.println("\n");

        for (Tree tree : forest.getTrees()) {
            System.out.println(tree.getName() + ", " + tree.getCoordX() + ", " + tree.getCoordY());
        }
    }
}
