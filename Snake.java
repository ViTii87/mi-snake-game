import java.util.ArrayList;
import java.awt.Color;
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
    private int anchoLienzo;
    private int altoLienzo;
    
    /**
     * Constructor for objects of class Snake
     */
    public Snake(int altoLienzo, int anchoLienzo)
    {
        this.altoLienzo = altoLienzo;
        this.anchoLienzo = anchoLienzo;
        segmentos = new ArrayList<>();
    }

}
