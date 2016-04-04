import java.awt.Color;
/**
 * Write a description of class Segmento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segmento
{
    // instance variables - replace the example below with your own
    private int posX;
    private int posY;
    private int posFinX;
    private int posFinY;
    private int direccion;
    private Color color;
    private static final int LONGITUD_SEGMENTO = 4;

    /**
     * Constructor for objects of class Segmento
     */
    public Segmento(int posX, int posY, int direccion) //, Color color
    {
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
        //this.color = color;
        if(direccion == 0){ // Direccion 0, hacia la derecha
            posFinX = posX + LONGITUD_SEGMENTO;
            posFinY = posY;
        }
        else if(direccion == 1){ // Direccion 1, hacia abajo
            posFinX = posX;
            posFinY = posY + LONGITUD_SEGMENTO;
        }
        else if(direccion == 2){ // Direccion 2, hacia la izquierda
            posFinX = posX - LONGITUD_SEGMENTO;
            posFinY = posY;
        }
        else if(direccion == 3){ // Direccion 3, hacia arriba
            posFinX = posX;
            posFinY = posY - LONGITUD_SEGMENTO;
        }
    }

    /**
     * Metodo para dibujar el segmento en el lienzo
     */
    public void dibujarSegmento(Canvas lienzo){
        lienzo.drawLine(posX, posY, posFinX, posFinY);
    }
    
    /**
     * Metodo para borrar el lienzo
     */
    public void borrarLienzo(Canvas lienzo){
        lienzo.erase();
    }
}
