
/**
 * Creates an instance of a Tree.
 *
 * @author Fabian Pohlemann
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle upperlayer;
    private Triangle middlelayer;
    private Triangle downerlayer;
    private Square trunk;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        upperlayer = newTriangle();
        middlelayer = newTriangle();
        downerlayer = newTriangle();
        trunk = newSquare();
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        
        // translate the tree to the specified location
        
        
    }
    
}