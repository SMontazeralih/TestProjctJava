package createGUI;

import java.awt.*;
import java.awt.event.*;

public class GrafischeOberflaeche01 extends Frame{

	public static void main(String[] args) {   
		Frame frame =  new GrafischeOberflaeche01();
		Button button = new Button("Hi click me to close the Frame");
		//button.setBounds(200,200,80,70);
		button.setBounds(50, 80, 180, 50);
		TextField tf= new TextField("Welcome to Javatpoint.");
		tf.setBounds(50,50,180,20);
		frame.setSize(700,500);
		frame.setTitle("Ich bin eine grafische Oberfläche");
		frame.setLayout(null); 
		frame.setVisible(true);
		frame.add(button);
		frame.add(tf);
		button.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				tf.setText("Welcome to Javatpoint.");  
				frame.dispose();
			}
		});  
	}

}
