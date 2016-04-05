import java.util.ArrayList;
import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake
{
    // instance variables - replace the example below with your own
    private ArrayList<Segment> segmentos;
    private static final int NUMERO_SEGMENTOS_INICIALES = 3;
    private static final Color COLOR_SERPIENTE = Color.BLACK;
    private static final int DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES = 90;
    private static final int MARGEN_LIENZO = 10;
    private int anchoLienzo;
    private int altoLienzo;
    
    /**
     * Constructor for objects of class Snake
     */
    public Snake(int altoLienzo, int anchoLienzo)
    {
        this.altoLienzo = altoLienzo;
        this.anchoLienzo = anchoLienzo;
        Canvas lienzo = new Canvas("lienzo", anchoLienzo, altoLienzo);
        Random rnd = new Random();
        segmentos = new ArrayList<>();
        for(int i = 1; i <= 3; i++){
            if(i == 1){
                segmentos.add(new Segment(anchoLienzo/2, altoLienzo/2, 
                rnd.nextInt(4)* DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES, COLOR_SERPIENTE));
            }
            segmentos.add(new Segment(segmentos.get(i-1).getPosicionFinalX(), 
                segmentos.get(i-1).getPosicionFinalY(),
                 rnd.nextInt(4)* DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES,COLOR_SERPIENTE));
        }
    }

    /**
     * Metodo para dibujar la serpiente en pantalla
     */
    public void dibujar(Canvas lienzo){
        
    }
}
