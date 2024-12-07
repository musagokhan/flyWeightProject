package special;

public class Tree {
	private final int posX; 
    private final int posY;
    private final TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.posX = x;
        this.posY = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(posX, posY);
    }

}
