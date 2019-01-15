
/**
 * This class draws a house on screen using individual shapes
 * 
 * @author Fabian Pohlemann 
 * @version (Jan 11 2019)
 */
public class MyHouse
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    // ACESS_MODIFIER TYPE NAME
    private Square mainblock;
    private Triangle roof;
    private Square window1L;
    private Square window2L;
    private Square window1R;
    private Square window2R;
    private Square windowFrame;
    private Square door1;
    private Square door2;
    private Circle doorknob;
    

    /**
     * The job of a constructor is to initialize all the instance variables.
     */
    public MyHouse()
    {
        // Instanzvariable initialisieren
        mainblock = new Square();
        roof = new Triangle();
        window1L = new Square();
        window2L = new Square();
        window1R = new Square();
        window2R = new Square();
        windowFrame = new Square();
        door1 = new Square();
        door2 = new Square();
        doorknob = new Circle();
    }

    /**
     * Draw the house for us
     */
    public void drawHouse()
    {
        //Put the mainblock in poition
        mainblock.makeVisible();
        mainblock.changeSize(150);
        mainblock.moveVertical(70);
        mainblock.moveHorizontal(15);
        //Draw the roof
        roof.makeVisible();
        roof.changeSize(100,150);
        roof.moveHorizontal(100);
        roof.moveVertical(5);
        //
        windowFrame.makeVisible();
        windowFrame.changeColor("white");
        windowFrame.moveVertical(87);
        windowFrame.moveHorizontal(27);
        windowFrame.changeSize(54);
        //Add a window
        window1L.makeVisible();
        window1L.changeColor("yellow");
        window1L.changeSize(20);
        window1L.moveVertical(90);
        window1L.moveHorizontal(30);
        //
        window2L.makeVisible();
        window2L.changeColor("yellow");
        window2L.moveVertical(115);
        window2L.moveHorizontal(30);
        window2L.changeSize(20);
        //
        window1R.makeVisible();
        window1R.changeColor("yellow");
        window1R.moveVertical(90);
        window1R.moveHorizontal(55);
        window1R.changeSize(20);
        //
        window2R.makeVisible();
        window2R.changeColor("yellow");
        window2R.moveVertical(115);
        window2R.moveHorizontal(55);
        window2R.changeSize(20);
        
        //Create the door
        door1.makeVisible();
        door1.changeColor("blue");
        door1.moveVertical(180);
        door1.moveHorizontal(115);
        door2.makeVisible();
        door2.changeColor("blue");
        door2.moveVertical(150);
        door2.moveHorizontal(115);
        //Giving the door a doorknob
        doorknob.makeVisible();
        doorknob.changeColor("black");
        doorknob.moveHorizontal(150);
        doorknob.moveVertical(150);
        doorknob.changeSize(15);
        doorknob.moveVertical(10);
        doorknob.moveHorizontal(5);
      
       
    }
}
