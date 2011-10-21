package cliente;
/*
  Este exemplo mostra como detectar eventos do
  teclado em uma JFrame.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estudos extends JFrame implements KeyListener{
  private JTextArea textArea;  
  private boolean key1=false;
  
  public Estudos(){
    super("Eventos do Mouse e Teclado");
    Container c = getContentPane();
    FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
    c.setLayout(layout);
    textArea = new JTextArea(100, 150);
    textArea.setEnabled(false);    
    textArea.setDisabledTextColor(Color.BLACK); 
    c.add(textArea);

    addKeyListener(this);
    
    
    setSize(350, 250);
    setVisible(true);
  }
    
  public void keyReleased(KeyEvent p){
    if(p.getKeyCode() == 17 && !key1){
      key1=true;
      return;
    }else{
    	if(p.getKeyCode() == 17 && key1){
    		minimiza();
    	}else{
    	key1=false;	
    	}
    }
  }
    

  public void keyTyped(KeyEvent e){
    // sem implementação
  }   
  
  public static void main(String args[]){
    Estudos app = new Estudos();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
public void minimiza(){
	setExtendedState(ICONIFIED);
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}