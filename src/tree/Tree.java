package tree;

/** This is our lightweight object with mutable fields */

public class Tree {

    private final TreeView treeView;
    private int coordX;
    private int coordY;

    public Tree(TreeView treeView, int coordX, int coordY) {
        this.treeView = treeView;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public String getName() {
        return this.treeView.getName();
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

}
