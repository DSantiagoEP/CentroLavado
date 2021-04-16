
package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame{
    public JButton lavadoBasico, lavadoEspecial,desinfeccionBasica,desinfeccionAvanzada;
    private JPanel panelB, panelR;
    public JLabel serviciosOfertados;
    public JButton combo1,combo2,combo3;
    public JTextField campoTexto;
    public JLabel combos;
    public Vista(){
        
        setBounds(200, 100, 200, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        getContentPane().setLayout(new BorderLayout());
        panelB =new JPanel();panelB.setLayout(new FlowLayout());
        
        panelR =new JPanel();
        panelR.setLayout(new FlowLayout());
        serviciosOfertados =new JLabel("Los servicios ofertados son:");
        lavadoBasico =new JButton("Lavado basico");
        lavadoEspecial  =new JButton("Lavado especial");
        desinfeccionBasica= new JButton("Desinfeccion basica");
        desinfeccionAvanzada= new JButton("Desinfeccion avanzada");
        combos= new JLabel("Los combos son:");
        combo1=new JButton("Lavado, polichado y desengrasante por debajo");
        combo2=new  JButton("combo 1 + grafilado de chasis");
        combo3=new  JButton("Combo 2 + tapiceria (Desmontado de sillas para un aseo mas profundo)");
        campoTexto =new JTextField(20);
        panelR.add(serviciosOfertados);
        panelR.add(lavadoBasico);
        panelR.add(lavadoEspecial);
        panelR.add(desinfeccionBasica);
        panelR.add(desinfeccionAvanzada);
        panelR.add(combos);
        panelR.add(combo1);
        panelR.add(combo2);
        panelR.add(combo3);
        add(campoTexto,BorderLayout.NORTH);
        add(panelB,BorderLayout.SOUTH);
        add(panelR,BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
       Vista miInterfaz = new Vista();
    }

    public void actionPerformed(ActionEvent ae) {
        
    String evento, datoCaja1;
    evento= lavadoBasico.getActionCommand();
        if (evento.equals("Botoncito")) {
            datoCaja1=campoTexto.getText();
            JOptionPane.showMessageDialog(this, "el dato de la caja 1 es "+datoCaja1);
            //t1.setText("si sirve");
        }
    
    }
    
}
