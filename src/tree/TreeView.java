package tree;

/** This is hard object with immutable fields */

public class TreeView {

    private String name;
    private LeafColor leafColor;
    private BarkColor barkColor;
    private WoodColor woodColor;
    private CrownForm crownForm;
    private int height;
    private int crownWidth;
    private int crownHeight;
    private int leavesQuantity;

    public TreeView(String name, LeafColor leafColor, BarkColor barkColor, WoodColor woodColor, CrownForm crownForm, int height, int crownWidth, int crownHeight, int leavesQuantity) {
        this.name = name.toLowerCase();
        this.leafColor = leafColor;
        this.barkColor = barkColor;
        this.woodColor = woodColor;
        this.crownForm = crownForm;
        this.height = height;
        this.crownWidth = crownWidth;
        this.crownHeight = crownHeight;
        this.leavesQuantity = leavesQuantity;
    }

    public String getName() {
        return name;
    }

}
