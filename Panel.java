package draw1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.MouseListener;

public class Panel extends JPanel implements MouseListener{

    private Color drawColor = new Color(0, 255, 0);
    
    public Panel(){
        super.setSize(300, 300);
        this.setFocusable(true);
        this.addMouseListener(this);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(drawColor);
        g.fillOval(100, 100, 50, 50);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        drawColor = new Color(255, 0, 0);
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        drawColor = new Color(0, 255, 0);
        repaint();
    }   
    
}
