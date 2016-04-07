import java.awt.Color;
/**
 * Write a description of class Segmento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    // instance variables - replace the example below with your own
    private int posicionX;
    private int posicionY;
    private int direccion;
    private Color color;
    public static final int LONGITUD_SEGMENTO = 10;

    /**
     * Constructor for objects of class Segmento
     */
    public Segment(int posX, int posY, int direccion, Color color)
    {
        posicionX = posX;
        posicionY = posY;
        this.direccion = direccion;
        this.color = color;
    }

    /**
     * Metodo para dibujar el segmento en el lienzo
     */
    public void dibujar(Canvas lienzo){
        lienzo.setForegroundColor(color);
        lienzo.drawLine(posicionX, posicionY, getPosicionFinalX(), getPosicionFinalY());
    }

    /**
     * Metodo para borrar el lienzo
     */
    public void borrar(Canvas lienzo){
        Color colorSnake = lienzo.getForegroundColor();
        lienzo.setForegroundColor(lienzo.getBackgroundColor());
        lienzo.drawLine(posicionX, posicionY, getPosicionFinalX(), getPosicionFinalY());
        lienzo.setForegroundColor(colorSnake);
    }

    /**
     * Metodo que devuelve la posicion, en el eje horizontal, del segmento
     */
    public int getPosicionInicialX(){
        return posicionX;
    }

    /**
     * Metodo que devuelve la posicion, en el eje vertical, del segmento
     */
    public int getPosicionInicialY(){
        return posicionY;
    }

    /**
     * Metodo que devuelve la posicion final, en el eje horizontal, del segmento
     */
    public int getPosicionFinalX(){
        int posFinX = posicionX;
        if(direccion == 0){
            posFinX = posicionX + LONGITUD_SEGMENTO;
        }
        else if(direccion == 180){
            posFinX = posicionX - LONGITUD_SEGMENTO;
        }
        return posFinX;
    }

    /**
     * Metodo que devuelve la posicion final, en el eje vertical, del segmento
     */
    public int getPosicionFinalY(){
        int posFinY = posicionY;
        if(direccion == 90){
            posFinY = posicionY + LONGITUD_SEGMENTO;
        }
        else if(direccion == 270){
            posFinY = posicionY - LONGITUD_SEGMENTO;
        }
        return posFinY;
    }

    /**
     * Metodo que devuelve la direccion del segmento
     */
    public int getDireccion(){
        return direccion;
    }

    /**
     * Devuelve true si el segmento pasado como parametro colisiona con el segmento sobre el
     * que se invoca el metodo, teniendo en cuenta que el pasado como parametro se supone que
     * es un nuevo segmento de la serpiente; false en otro caso
     */
    public boolean colisionaCon(Segment seg){
        return (posicionX == seg.getPosicionFinalX() && posicionY == seg.getPosicionFinalY());
    }
}
