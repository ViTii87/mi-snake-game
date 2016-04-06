import java.util.Random;
/**
 * Clase SnakeGame
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class SnakeGame
{
    private Snake serpiente;
    private Canvas lienzo;
    private static final int ALTO = 600;
    private static final int ANCHO = 600;
    
    /*
     * Constructor de la clase Snake
     */
    public SnakeGame()
    {
        lienzo = new Canvas("SnakeGame", ANCHO, ALTO);
    }

    /*
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake()
    {
        serpiente = new Snake(ANCHO, ALTO);
        lienzo.erase();
        serpiente.dibujar(lienzo);
    }
    
    /**
     * Anima la serpiente, terminara cuando no tenga mas movimientos y pondra un mensaje an pantalla
     */
    public void animateSnake(){
        while(serpiente.mover(lienzo)){
            lienzo.wait(50);
        }
        lienzo.drawString("Game Over!", ANCHO/2, ALTO/2);
    }
}