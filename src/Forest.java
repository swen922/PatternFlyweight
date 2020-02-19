import tree.*;

import java.util.ArrayList;
import java.util.List;

public class Forest {

    private String symbols = "abcdefghijklmnopqrstuvwxyz";

    private List<String> names = new ArrayList<>();
    private List<Tree> trees = new ArrayList<>();

    public void populateNames(int quantity) {

        if (quantity < 1) {
            return;
        }

        char[] ch = symbols.toCharArray();

        for (int k = 1; k <= quantity; k++) {
            int length = 0;
            while (length < 2) {
                length = (int) (Math.random() * 10);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(ch[randomPos(ch.length)]);
            }
            names.add(sb.toString());
        }
    }


    public void populateForest(int quantity) {

        if (names.isEmpty()) {
            return;
        }

        TreeViewFactory factory = new TreeViewFactory();

        for (int i = 0; i < quantity; i++) {
            Tree tree = new Tree(factory.getTreeView(names.get(randomPos(names.size()))), randomPos(100), randomPos(100));
            trees.add(tree);
        }
    }

    public int forestSize() {
        return trees.size();
    }

    public List<String> getNames() {
        List<String> result = new ArrayList<>();
        for (Tree tree : trees) {
            result.add(tree.getName());
        }
        return result;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    private int randomPos(int length) {
        return (int) (Math.random() * length);
    }

}
