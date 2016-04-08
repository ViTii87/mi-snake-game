import java.util.Random;
import java.util.ArrayList;
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
    private ArrayList<Galleta> galletas;

    /*
     * Constructor de la clase Snake
     */
    public SnakeGame()
    {
        lienzo = new Canvas("SnakeGame", ANCHO, ALTO);
        galletas = new ArrayList<>();
    }

    /*
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake()
    {
        serpiente = new Snake(ANCHO, ALTO);
        lienzo.erase();
        serpiente.dibujar(lienzo);
        generaGalletas(500);
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

    /**
     * Metodo que genera galletas en pantalla de forma aleatoria y en posiciones validas.
     */
    public void generaGalletas(int numGalletas){
        Random rnd = new Random();
        int j = 0;
        for(int i = 0; i < numGalletas - 1; i++){
            int posGX = (rnd.nextInt((ANCHO - (serpiente.MARGEN_LIENZO * 2)) / Segment.LONGITUD_SEGMENTO) * Segment.LONGITUD_SEGMENTO) + serpiente.MARGEN_LIENZO;
            int posGY = (rnd.nextInt((ALTO - (serpiente.MARGEN_LIENZO * 2)) / Segment.LONGITUD_SEGMENTO) * Segment.LONGITUD_SEGMENTO) + serpiente.MARGEN_LIENZO;
            while(serpiente.colisionConPuntos(posGX, posGY)){
                posGX = (rnd.nextInt((ANCHO - (serpiente.MARGEN_LIENZO * 2)) / Segment.LONGITUD_SEGMENTO) * Segment.LONGITUD_SEGMENTO) + serpiente.MARGEN_LIENZO;
                posGY = (rnd.nextInt((ALTO - (serpiente.MARGEN_LIENZO * 2)) / Segment.LONGITUD_SEGMENTO) * Segment.LONGITUD_SEGMENTO) + serpiente.MARGEN_LIENZO;
            }
            while(j < galletas.size() && galletas.size()!=0){
                if(posGX == galletas.get(j).getPosX() && posGY == galletas.get(j).getPosY()){
                    i--;
                }
                j++;
            }
            galletas.add(new  Galleta(posGX, posGY));
            galletas.get(i).drawGalleta(lienzo);
        }
    }
}
