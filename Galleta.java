
/**
 * Write a description of class Galleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galleta
{
    // instance variables - replace the example below with your own
    private int posX;
    private int posY;
    public static final int NUM_GALLETAS = 10;
    public static final int RADIO_GALLETA = 2;

    /**
     * Constructor for objects of class Galleta
     */
    public Galleta(int posX, int posY)
    {
        this.posX = posX;
        this.posY = posY;
    }

    /**
     * Devolvemos la posicion de la galleta en el eje horizontal
     */
    public int getPosX()
    {
        return posX;
    }

    /**
     * Devolvemos la posicion de la galleta en el eje vertical
     */
    public int getPosY()
    {
        return posY;
    }
    
    /**
     * Metodo que dibujara la galleta en pantalla
     * 
     */
    public void drawGalleta(Canvas lienzo)
    {
        lienzo.fillCircle(posX - RADIO_GALLETA, posY - RADIO_GALLETA, RADIO_GALLETA*2);
    }
    
    /**
     * Metodo que borrara la galleta en pantalla
     */
    public void borrar(Canvas lienzo){
        lienzo.eraseCircle(posX - RADIO_GALLETA, posY - RADIO_GALLETA, RADIO_GALLETA * 2);
    }
}
