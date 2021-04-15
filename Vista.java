
package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame{
    public JButton lavado, lavadoEspecial;
    private JPanel panelB, panelR;
    public JLabel lResultado;
    public JTextField campoTexto;
    public Vista(){
        
        getContentPane().setLayout(new BorderLayout());
        panelB =new JPanel();panelB.setLayout(new FlowLayout());
        
        panelR =new JPanel();
        panelR.setLayout(new FlowLayout());
        lavado =new JButton("Convertir a Pesos");
        lavadoEspecial  =new JButton("Convertir a Dolares");
        lResultado =new JLabel("Resultado:");
        campoTexto =new JTextField(20);
        panelB.add(lavado);
        panelB.add(lavadoEspecial);
        panelR.add(lResultado);
        add(campoTexto,BorderLayout.NORTH);
        add(panelB,BorderLayout.SOUTH);
        add(panelR,BorderLayout.CENTER);
    
    }

}
