/**
 *
 * @author Nasir Basha K
 */
public class Calculator {

    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }
    
}
