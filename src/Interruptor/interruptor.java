package Interruptor;
import java.util.Random;

public class interruptor {
	public static void main(String[] args) {

	    System.out.println("Descobri o interruptor da minha sala, agora vou caminhar para outra sala...");

	    // Criar um objeto Random para simular a sala em que você está
	    Random random = new Random();
	    int interruptor = random.nextInt(2) + 1;
	    System.out.println("O interruptor " + interruptor + " foi ligado na minha sala...");

	    // Escolher aleatoriamente um dos interruptores para ligar
	    int minhaSala = random.nextInt(2) + 1;
	    int outraSala = (minhaSala == 1) ? 2 : 1; // Selecionar a outra sala que não seja a sua

	    System.out.println("Fui para a sala " + outraSala + ".");

	    // Verificar se o interruptor ligado é o da sua sala
	    boolean meuInterruptor = (interruptor == minhaSala);

	    // Verificar se a luz na outra sala está acesa ou apagada
	    if (meuInterruptor) {
	      System.out.println(
	          "A luz na minha sala está acesa, portanto o interruptor " + interruptor + " está associado à minha sala.");
	    } else {
	      System.out.println(
	          "A luz na outra sala está acesa(porque a qual eu fui está sem luz), portanto o interruptor " + interruptor
	              + " está associado à outra sala.");
	    }
	  }
	}

	// A minha sala não conta pois eu já descobri o interruptor no caso agora são
	// apenas 2 salas... a sala 01 e 02
	/*
	 * Fiz este código relacionado a questão 4 e nisso consegui resumir os
	 * algoritmos na qual formulei e criei, como eu estou na minha sala e só pode
	 * ter duas idas , descobri que dá para adivinhar o interruptor apenas indo para
	 * uma sala, pois a sala a qual eu estou eu já sei qual é o meu interruptor...
	 */
	 /*
	 * Lembrando que este código ele não tem uma variavel definida , mas o seu
	 * modelo evita ambiguidades, porque através de uma ida para descobrir qual o
	 * interruptor
	 * que está ligado na minha sala...
	 */
     /*
     * E sim dá para melhorar ele colocando mais elementos de lógica, porém pensei
     * em fazer algo prático para que não tenha ambiguidades e no caso se ele
     * retorna falso ou verdadeiro eu consigo definir apenas com uma ida
     */

