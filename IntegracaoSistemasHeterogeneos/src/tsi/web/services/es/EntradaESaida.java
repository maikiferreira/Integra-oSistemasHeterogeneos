package tsi.web.services.es;

import static javax.swing.JOptionPane.*;

public class EntradaESaida {
	/**
	 * Exibe uma mensagem na tela.
	 * @param mensagem � uma String contendo a mensagem que ser� utilizada.
	 * @param titulo � uma String contendo o titulo da mensagem.
	 */
	public static void exibirMensagem(String mensagem, String titulo) {
		showMessageDialog(null, mensagem, titulo, INFORMATION_MESSAGE);
	}
	
	/**
	 * Exibe uma mensagem de erro na tela.
	 * @param mensagem � uma String contendo a mensagem que ser� utilizada.
	 * @param titulo � uma String contendo o titulo da mensagem.
	 */
	public static void exibirMensagemErro(String mensagem, String titulo) {
		showMessageDialog(null, mensagem, titulo, ERROR_MESSAGE);
	}
	
	/**
	 * Obt�m um valor int que ser� inserido pelo usu�rio.
	 * @param mensagem � uma String contendo a mensagem que ser� utilizada.
	 * @param titulo � uma String contendo o titulo da mensagem.
	 * @return um int contendo o valor inserido pelo usuario.
	 */
	public static int lerInt(String mensagem, String titulo) {
		return Integer.parseInt(showInputDialog(null, mensagem, titulo, INFORMATION_MESSAGE));
	}
	
	/**
	 * Obt�m um valor double que ser� inserido pelo usu�rio.
	 * @param mensagem � uma String contendo a mensagem que ser� utilizada.
	 * @param titulo � uma String contendo o titulo da mensagem.
	 * @return um double contendo o valor inserido pelo usuario.
	 */
	public static double lerDouble(String mensagem, String titulo) {
		return Double.parseDouble(showInputDialog(null, mensagem, titulo, INFORMATION_MESSAGE));
	}
	
	/**
	 * Obt�m uma String que ser� inserida pelo usu�rio.
	 * @param mensagem � uma String contendo a mensagem que ser� utilizada.
	 * @param titulo � uma String contendo o titulo da mensagem.
	 * @return uma String contendo o texto inserido pelo usuario.
	 */
	public static String lerString(String mensagem, String titulo) {
		return showInputDialog(null, mensagem, titulo, INFORMATION_MESSAGE);
	}
	
	public static boolean lerBolean(String mensagem, String titulo) {
		if(Integer.parseInt(showInputDialog(null, mensagem, titulo, INFORMATION_MESSAGE)) == 1)
			return true;
		return false;
	}
}
