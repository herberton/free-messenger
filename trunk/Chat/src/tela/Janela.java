package tela;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Janela extends JFrame implements KeyListener,ActionListener {
	public static JFrame mainFrame = null;
	public String msg;
	public JTextArea conversa = new JTextArea(10, 20);
	public JTextArea enviar = new JTextArea(3, 20);
	public JButton btn_enviar = new JButton();
	JButton btn_limpar = new JButton();
	private boolean key1 = false;
	private JMenuBar barraMenu = new JMenuBar();  
	private JMenu menuSistema = new JMenu("Sistema");
	private JMenuItem menuItemHelp = new JMenuItem("Help");;
	private JMenuItem menuItemSair = new JMenuItem("Sair");
	
	public Janela() {
		super("Chat beta 1.0.2!");
		barraMenu.add(menuSistema);
		  menuSistema.add(menuItemHelp);
		    menuItemHelp.addActionListener(this);
		  menuSistema.add(menuItemSair);
		    menuItemSair.addActionListener(this);
	}
	
	public void criaJanela() {

		msg = JOptionPane.showInputDialog(null, "Digite seu nome", "Chat", 1);
		JPanel chatPane = new JPanel(new BorderLayout());
		conversa = new JTextArea(10, 20);
		conversa.setLineWrap(true);
		conversa.setEditable(false);
		conversa.addKeyListener(this);
		conversa.setForeground(Color.blue);
		JScrollPane chatTextPane = new JScrollPane(conversa,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		conversa.setAutoscrolls(true);
		
		enviar.setEnabled(true);
		enviar.addKeyListener(this);
		chatPane.add(chatTextPane, BorderLayout.CENTER);
		chatPane.add(enviar, BorderLayout.AFTER_LAST_LINE);
		chatPane.setPreferredSize(new Dimension(600, 300));

		// Set up the main pane
		JPanel mainPane = new JPanel(new BorderLayout());

		mainPane.add(chatPane, BorderLayout.CENTER);
		btn_enviar.setPreferredSize(new Dimension(20, 20));
		btn_enviar.setName("Enviar");
		btn_enviar.setEnabled(true);
		btn_enviar.setLabel("Enviar");
		btn_enviar.setMnemonic(KeyEvent.VK_ENTER);
		btn_limpar.setMnemonic(KeyEvent.VK_L);
		btn_limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conversa.setText("");
			}

		});
		mainPane.add(btn_limpar, BorderLayout.AFTER_LAST_LINE);
		mainPane.add(btn_enviar, BorderLayout.AFTER_LAST_LINE);

		// Set up the main frame
		mainFrame = new JFrame(msg);
		mainFrame.setJMenuBar(barraMenu);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setContentPane(mainPane);
		mainFrame.setSize(mainFrame.getPreferredSize());
		mainFrame.setLocation(200, 200);
		mainFrame.addKeyListener(this);
		mainFrame.pack();
		mainFrame.setVisible(true);
		

	}

	public void keyPressed(KeyEvent p) {
		if (p.getKeyCode() == 17 && !key1) {
			key1 = true;
			return;
		} else {
			if (p.getKeyCode() == 17 && key1) {
				minimiza();
				key1 = false;
			} else {
				key1 = false;
			}
		}
	}
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == menuItemHelp) {
	   	 String	saida= "Atalhos úteis!!!\n" +
					   "Alt+Enter => Envia mensagem(ação do botão enviar) \n" +
					   "Alt+L => Limpa a tela \n" +
					   "Ctrl 2x => minimiza a tela do chat\n" +
					   "Obrigado!!!";
						   

	   	JOptionPane.showMessageDialog(null, saida,"Informações sobre o Sistema", JOptionPane.PLAIN_MESSAGE);		
				   
	      }
	      if (evt.getSource() == menuItemSair) {
	   	   System.exit( 0 );   
	      }
		}
	public void minimiza() {
		mainFrame.setExtendedState(ICONIFIED);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	public static void main(String args[]) {
		Janela s = new Janela();
		s.criaJanela();
	}

}