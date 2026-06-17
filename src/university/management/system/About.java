
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    
    
    About(){
        setSize(800,600);
        setLocation(600,300);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("JNTU Wanaparthy");
        heading.setBounds(238, 0, 400, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel head = new JLabel("<html>University<br/>Management System</html>");
        head.setBounds(70, 70, 300, 130);
        head.setFont(new Font("Tahoma", Font.BOLD, 35));
        add(head);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
        Image i2=i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2); 
        JLabel image = new JLabel(i3);
        image.setBounds(400,15,250,300);
        add(image);
        
        JLabel dev = new JLabel("Developed By:");
        dev.setBounds(70, 250, 400, 30);
        dev.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(dev);
        
        JLabel riyaz = new JLabel("1.Sushmitha");
        riyaz.setBounds(150, 300, 500, 30);
        riyaz.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(riyaz);
        
//        JLabel AK = new JLabel("2.Allibad Akansha");
//        AK.setBounds(150, 330, 400, 30);
//        AK.setFont(new Font("Tahoma", Font.PLAIN, 25));
//        add(AK);
        
//        JLabel HA= new JLabel("3.Kuppala Harika");
//        HA.setBounds(150, 360, 400, 30);
//        HA.setFont(new Font("Tahoma", Font.PLAIN, 25));
//        add(HA);
//        
//        JLabel ravi = new JLabel("4.Lodugu Ravi Kumar");
//        ravi.setBounds(150, 390, 500, 30);
//        ravi.setFont(new Font("Tahoma", Font.PLAIN, 25));
//        add(ravi);
//        
//        JLabel balu = new JLabel("5.G Bala Krishna");
//        balu.setBounds(150, 420, 500, 30);
//        balu.setFont(new Font("Tahoma", Font.PLAIN, 25));
//        add(balu);
        
        setLayout(null);
        
        setVisible(true);
    
    }
    
    public static void main(String[] args){
        new About();
    }
}
