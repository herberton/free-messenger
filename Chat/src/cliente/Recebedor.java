package cliente;
import java.io.InputStream;
import java.util.Scanner;

public class Recebedor implements Runnable {

 private InputStream servidor;
 private Cliente cliente ;

 public Recebedor(InputStream servidor,Cliente cliente) {
 this.servidor = servidor;
 this.cliente=cliente;
 
 }

 public void run() {
 // recebe msgs do servidor e imprime na tela
 Scanner s = new Scanner(this.servidor);
 while (s.hasNextLine()) {
 String mensagem=s.nextLine();
 if(mensagem.length()>1){
 System.out.println(mensagem);
 cliente.cli.conversa.append(mensagem+"\r\n");	 
 }
 }
 }
}