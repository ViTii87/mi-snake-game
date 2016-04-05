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
        lienzo = new Canvas("lienzo", ANCHO, ALTO);
        serpiente = new Snake(ANCHO, ALTO);
    }
    
    
    
    /*
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake()
    {
        serpiente.dibujar(lienzo);
    }
    
}