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
    private int posX;
    private int posY;
    private int direccion;
    private Color color;
    public static final int LONGITUD_SEGMENTO = 4;

    /**
     * Constructor for objects of class Segmento
     */
    public Segment(int posX, int posY, int direccion, Color color)
    {
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
        this.color = color;
        
    }

    /**
     * Metodo para dibujar el segmento en el lienzo
     */
    public void dibujar(Canvas lienzo){
        //lienzo.drawLine(posX, posY, posFinX, posFinY);
        Pen lapiz = new Pen(posX, posY, lienzo);
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
    public int getPosX(){
        return posX;
    }

    /**
     * Metodo que devuelve la posicion, en el eje vertical, del segmento
     */
    public int getPosY(){
        return posY;
    }

    /**
     * Metodo que devuelve la posicion final, en el eje horizontal, del segmento
     */
    public int getPosFinX(){
        int posFinX = posX;
        if(direccion == 0){
            posFinX = posX + LONGITUD_SEGMENTO;
        }
        else if(direccion == 2){
            posFinX = posX - LONGITUD_SEGMENTO;
        }
        return posFinX;
    }

    /**
     * Metodo que devuelve la posicion final, en el eje vertical, del segmento
     */
    public int getPosFinY(){
        int posFinY = posY;
        if(direccion == 1){
            posFinY = posY + LONGITUD_SEGMENTO;
        }
        else if(direccion == 3){
            posFinY = posY - LONGITUD_SEGMENTO;
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
        return ((seg.getPosFinX() == posX || seg.getPosFinX() == getPosFinX()) &&
            (seg.getPosFinY() == posX || seg.getPosFinY() == getPosFinY()));
    }
}
