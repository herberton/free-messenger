package cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import tela.Janela;


public class Cliente {

	public static Janela cli;

	public static boolean enviar = false;
	private String host;
	private int porta;
	public String nome;

	public Cliente(String host, int porta, Janela cli) {
		this.host = host;
		this.porta = porta;
		this.nome = cli.msg;
		this.cli = cli;
	}

	public void executa() throws UnknownHostException, IOException {
		Socket cliente = null;
		try {
			cliente = new Socket(this.host, this.porta);
			System.out.println("O cliente se conectou ao servidor!");
		} catch (ConnectException e) {
			JOptionPane.showMessageDialog(null,
					"Erro ao conectar com o Servidor", "Erro",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		cliente = new Socket(this.host, this.porta);
		System.out.println("O cliente se conectou ao servidor!");

		// thread para receber mensagens do servidor
		Recebedor r = new Recebedor(cliente.getInputStream(), this);
		new Thread(r).start();
		PrintStream saida = null;

		do {
			while (!enviar) {
			}
			cliente = new Socket(this.host, this.porta);
			saida = new PrintStream(cliente.getOutputStream());
			saida.println(nome + ": " + cli.enviar.getText() + "\r\n");
			saida.close();
			cliente.close();
			cli.enviar.setText("");
			enviar = false;
		} while (true);

		// le msgs do teclado e manda pro servidor
		// Scanner teclado = new Scanner(System.in);
		// PrintStream saida = new PrintStream(cliente.getOutputStream());
		// while (teclado.hasNextLine()) {
		// saida.println(nome+": "+teclado.nextLine()+"\r\n");
		// }
		// teclado.close();

	}

	public static void click(ActionEvent e) {
		enviar = !cli.enviar.getText().isEmpty();
		cli.enviar.grabFocus(); 
	}
	
	public static void main(String[] args) throws UnknownHostException,
	IOException {

Janela cli = new Janela();
cli.criaJanela();
cli.btn_enviar.setMnemonic(KeyEvent.VK_ENTER);
cli.btn_enviar.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		click(e);
		
	}
		
});

new Cliente("10.72.2.138", 8080, cli).executa();

}


}