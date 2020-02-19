package tree;

import java.util.ArrayList;
import java.util.List;

public class TreeViewFactory {

    private static List<TreeView> treeViews = new ArrayList<>();

    public TreeView getTreeView(String name) {
        int pos = containsTreeView(name);
        if (pos >= 0) {
            return treeViews.get(pos);
        }
        TreeView treeView = new TreeView(name, randomLeafColor(), randomBarkColor(), randomWoodColor(), randomCrownForm(), randomHeight(), randomCrownWidth(), randomCrownHeight(), randomLeavesQuantity());
        treeViews.add(treeView);
        return treeView;
    }


    public TreeView getTreeView(int pos) {
        if (pos >= 0 && pos < treeViews.size()) {
            return treeViews.get(pos);
        }
        return null;
    }

    public TreeView getRandomTreeView() {
        if (!treeViews.isEmpty()) {
            return treeViews.get(randomPos(treeViews.size()));
        }
        return null;
    }


    public int treeViewsSize() {
        return treeViews.size();
    }

    private int containsTreeView(String name) {
        int result = -1;
        for (TreeView treeView : treeViews) {
            if (treeView.getName().equalsIgnoreCase(name)) {
                result = treeViews.indexOf(treeView);
            }
        }
        return result;
    }

    private LeafColor randomLeafColor() {
        return LeafColor.values()[randomPos(LeafColor.values().length)];
    }

    private BarkColor randomBarkColor() {
        return BarkColor.values()[randomPos(BarkColor.values().length)];
    }

    private WoodColor randomWoodColor() {
        return WoodColor.values()[randomPos(WoodColor.values().length)];
    }

    private CrownForm randomCrownForm() {
        return CrownForm.values()[randomPos(CrownForm.values().length)];
    }

    private int randomHeight() {
        return randomLimited(20, 30);
    }

    private int randomCrownWidth() {
        return randomLimited(10, 30);
    }

    private int randomCrownHeight() {
        return randomLimited(10, 18);
    }

    private int randomLeavesQuantity() {
        return randomLimited(100000, 500000);
    }

    private int randomPos(int length) {
        return (int) (Math.random() * length);
    }

    private int randomLimited(int min, int max) {
        int rnd = -1;
        if (min > 0 && min < max) {
            while (rnd < min) {
                rnd = (int) (Math.random() * max);
            }
            return rnd;
        }
        return rnd;
    }

}
