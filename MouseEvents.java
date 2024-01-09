package BALU;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener{
    String msg="";
    int mouseX=0,mouseY=0;
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);}
    public void mouseClicked(MouseEvent me){
        mouseX=0;
        mouseY=10;
        msg="Mouse clicked";
        repaint();}
    public void mouseEntered(MouseEvent me){
        mouseX=0;
        mouseY=10;
        msg="Mouse Entered";
        repaint();}
    public void mouseExited(MouseEvent me){
        mouseX=0;
        mouseY=10;
        msg="Mouse Exited";
        repaint();}
    public void mousePressed(MouseEvent me){
        mouseX=0;
        mouseY=10;
        msg="Mouse Pressed";
        repaint();}
    public void mouseReleased(MouseEvent me){
        mouseX= me.getX();
        mouseY= me.getY();
        msg="Mouse released";
        repaint();}
    public void mouseDragged(MouseEvent me){
        mouseX= me.getX();
        mouseY= me.getY();
        msg="Mouse Dragged";
        showStatus("Dragged mouse at"+ mouseX +" "+mouseY);
        repaint();}
    public void mouseMoved(MouseEvent me){
        mouseX= me.getX();
        mouseY= me.getY();
       
        showStatus("Moving mouse at"+ mouseX +" "+mouseY);
        }
    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }

    
    
}