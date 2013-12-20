/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp;

import javax.swing.JFrame;
import medrecapp.Gui.FrmUtama;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//        try {
//            UIManager.setLookAndFeel(new NimbusLookAndFeel());
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmUtama fu = new FrmUtama();
                fu.setExtendedState(fu.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                fu.setVisible(true);
            }
        });
    }

}
