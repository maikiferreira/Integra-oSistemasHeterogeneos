package tsi.web.services.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class NodeJsEcho {
  // objeto socket
  private Socket socket = null;
  
  public void enviar(String mensagem) throws UnknownHostException, IOException {
		NodeJsEcho client = new NodeJsEcho();
		// conexão socket tcp
	    String ip = "192.168.1.103";
	    int port = 6969;
	    client.socketConnect(ip, port);
	
	    // escreve e recebe mensagem
	    System.out.println("Enviando: " + mensagem);
	    String retorno = client.echo(mensagem);
	    System.out.println("Recebendo: " + retorno);
	  

  }

  // realiza a conexão com o socket
  private void socketConnect(String ip, int port) throws UnknownHostException, IOException {
    System.out.println("[Conectando socket...]");
    this.socket = new Socket(ip, port);
  }

  // escreve e recebe mensagem full no socket (String)
  public String echo(String message) {
    try {
      PrintWriter out = new PrintWriter(getSocket().getOutputStream(), true);
      BufferedReader in = new BufferedReader
      (new InputStreamReader(getSocket().getInputStream()));

      out.println(message);
      String retorno = in.readLine();
      return retorno;

      } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }

  // obtem instância do socket
  private Socket getSocket() {
              return socket;
  }
}
