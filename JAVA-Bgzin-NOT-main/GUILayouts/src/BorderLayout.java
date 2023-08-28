import javax.swing.JFrame;
import java.awt.*;

public class BorderLayout {
    public BorderLayout() {
        super();
        //criando uma janela
        JFrame janela3 = new JFrame("Janela Principal");
        BorderLayout border = new BorderLayout();
        janela3.setLayout((LayoutManager) border);
    
    }
}
