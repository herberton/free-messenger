import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
  
  
public class Janela extends JFrame{  
	public static JFrame mainFrame = null;
    String msg;  
    JTextArea conversa= new JTextArea(10, 20);
    JTextArea enviar= new JTextArea(3, 20);
    JButton btn_enviar  = new JButton();
    public Janela(){  
        super("Chat beta 1.0!");  
    }  
      
    public void criaJanela(){   
    	msg=JOptionPane.showInputDialog(null, "Digite seu nome", "Chat",1);
    	JPanel chatPane = new JPanel(new BorderLayout());
    	conversa = new JTextArea(10, 20);
    	conversa.setLineWrap(true);
    	conversa.setEditable(false);
    	conversa.setForeground(Color.blue);
        JScrollPane chatTextPane = new JScrollPane(conversa,
           JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
           JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        enviar.setEnabled(true);
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
        mainPane.add(btn_enviar, BorderLayout.AFTER_LAST_LINE);

        // Set up the main frame
        mainFrame = new JFrame(msg);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setContentPane(mainPane);
        mainFrame.setSize(mainFrame.getPreferredSize());
        mainFrame.setLocation(200, 200);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }  
      
    public static void main(String args[])  
    {  
    	Janela s = new Janela();  
        s.criaJanela();  
    }  
} 