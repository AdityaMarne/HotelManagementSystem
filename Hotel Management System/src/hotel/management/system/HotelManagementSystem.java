package hotel.management.system;
import java.awt.Color;
import javax.swing.*;    //All Frame componet usefull packages are included in this package.
import java.awt.*;       //Label color files are included in this package.
import java.awt.event.*;  //This packages for event handling

public class HotelManagementSystem extends JFrame implements ActionListener
{
    
    HotelManagementSystem()
    {
        setBounds(300,300,1366,565);  //It contains Size and Location argument
        
       //setSize(400,400);      //Size of frame
       //setLocation(300,300);  //Location of Frame
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
       JLabel l1=new JLabel(i1);
       l1.setBounds(0, 0, 1366, 565);
       add(l1);
       
       JLabel l2=new JLabel("Hotel Management System");
       l2.setBounds(20,430,1000,90);
       l2.setForeground(Color.WHITE);      //For color of label
       l2.setFont(new Font("serif",Font.PLAIN, 70));      //This fun set font of label.
       l1.add(l2);
       
       JButton b1=new JButton("Next");
       b1.setBackground(Color.WHITE);
       b1.setForeground(Color.BLACK);
       b1.setBounds(1150, 450, 150, 50);
       b1.addActionListener(this);
       l1.add(b1);
       
       setLayout(null);
       setVisible(true);
       
       //This while loop is for Blinking the HotelManagement System Label
       while(true){
            l2.setVisible(false);
            try{
                Thread.sleep(500);
            }catch (Exception e){
              
            }
            l2.setVisible(true);
            try{
            Thread.sleep(500);
            }catch(Exception e){}
        }
       }
    
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);   //This function for when we click on Next buttton HotelManagementSystem.java frame automaticaly closed
    }
    
    public static void main(String[] args) {
         new HotelManagementSystem();
    }
 }
    
    