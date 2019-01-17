
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
    private Triangle bottomlayer;
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
        upperlayer = new Triangle();
        middlelayer = new Triangle();
        bottomlayer = new Triangle();
        trunk = new Square();
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
        upperlayer.makeVisible();
        upperlayer.changeSize(70,100);
        //translate horizontally and veitically by x and y
        upperlayer.moveHorizontal(x);
        upperlayer.moveVertical(y);
        
        middlelayer.makeVisible();
        middlelayer.changeSize(70,100);
        middlelayer.moveVertical(40);
        middlelayer.moveHorizontal(x);
        middlelayer.moveVertical(y);
        
        bottomlayer.makeVisible();
        bottomlayer.changeSize(70,100);
        bottomlayer.moveVertical(80);
        bottomlayer.moveHorizontal(x);
        bottomlayer.moveVertical(y);
        
        trunk.makeVisible();
        trunk.changeColor("brown");
        trunk.moveVertical(115);
        trunk.moveHorizontal(-25);
        trunk.moveHorizontal(x);
        trunk.moveVertical(y);
        // translate the tree to the specified location
        
        
    }
    
}