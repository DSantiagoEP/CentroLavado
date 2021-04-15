
package centrolavado;

import Vista.Vista;
import Modelo.Modelo;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CentroLavado {

    public static void main(String[] arf[]) {
        try{ 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        
        catch(UnsupportedLookAndFeelException e){
        }
        catch(ClassNotFoundException e){
        }
        catch(InstantiationException e){
        }
        catch(IllegalAccessException e){
        }
        
        Modelo modelo =new Modelo();       
        Vista vista =new Vista();
       
    }
}
        
    
    

