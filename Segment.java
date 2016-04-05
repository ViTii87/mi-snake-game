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
    public static final int LONGITUD_SEGMENTO = 4;

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
        //lienzo.drawLine(posX, posY, posFinX, posFinY);
        Pen lapiz = new Pen(posicionX, posicionY, lienzo);
        lapiz.turnTo(direccion * 90);
        lapiz.move(LONGITUD_SEGMENTO);
    }

    /**
     * Metodo para borrar el lienzo
     */
    public void borrar(Canvas lienzo){
        Color colorSnake = lienzo.getForegroundColor();
        lienzo.setForegroundColor(lienzo.getBackgroundColor());
        dibujar(lienzo);
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
        else if(direccion == 2){
            posFinX = posicionX - LONGITUD_SEGMENTO;
        }
        return posFinX;
    }

    /**
     * Metodo que devuelve la posicion final, en el eje vertical, del segmento
     */
    public int getPosicionFinalY(){
        int posFinY = posicionY;
        if(direccion == 1){
            posFinY = posicionY + LONGITUD_SEGMENTO;
        }
        else if(direccion == 3){
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
     * Metodo para comprobar si el segmento colisiona con otro ya existente
     */
    public boolean colisionaCon(Segment seg){
        return ((seg.getPosicionFinalX() == posicionX || seg.getPosicionFinalX() == getPosicionFinalX()) &&
            (seg.getPosicionFinalY() == posicionX || seg.getPosicionFinalY() == getPosicionFinalY()));
    }
}
