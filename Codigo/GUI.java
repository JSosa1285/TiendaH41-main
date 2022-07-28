import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

public class GUI extends JFrame
{
    public GUI()
    {
        setTitle("TIENDA H41");
        setBounds(100, 100, 1200, 700);
        setLayout(null);
        
        JPanel panelFormulario = new JPanel();
        panelFormulario.setBounds(5, 5, 600, 400);
        panelFormulario.setBackground(new Color(106, 106, 0));
        panelFormulario.setLayout(null);
        getContentPane().add(panelFormulario);
        
        JPanel panelTabla = new JPanel();
        panelTabla.setBounds(400, 5, 600, 400);
        panelTabla.setBackground(new Color(170, 170, 255));
        getContentPane().add(panelTabla);
        
        JLabel labelId = new JLabel("Id");
        labelId.setBounds(10, 20, 100, 30);
        panelFormulario.add(labelId);
        
        setVisible(true);
    }

}
