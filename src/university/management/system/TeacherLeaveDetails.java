package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class TeacherLeaveDetails extends JFrame implements ActionListener {
    
    Choice cEmpId,cdate;
    JTable table;
    JButton search,print,cancel;
    
    TeacherLeaveDetails(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading =new JLabel("Employee Id");
        heading.setBounds(20,20,150,20);
        add(heading);
        
        cEmpId=new Choice();
        cEmpId.setBounds(180,20,150,20);
        add(cEmpId);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from teacher ");
           while (rs.next()){
                cEmpId.add(rs.getString("empId"));
            }
        
        }catch(Exception e){
              e.printStackTrace();
        }
        
        JLabel date =new JLabel("Search by Date");
        date.setBounds(400,20,100,20);
        add(date);
        
        cdate=new Choice();
        cdate.setBounds(520,20,150,20);
        add(cdate);
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from teacherleave");
           while (rs.next()){
                cdate.add(rs.getString("date"));
            }
        
        }catch(Exception e){
              e.printStackTrace();
        }
        
        table=new JTable();
        
         try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from teacherleave");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e){
              e.printStackTrace();
        }
        
        JScrollPane jsp =new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        add(jsp);
        
        search =new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);
        
        print =new JButton("Print");
        print .setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print );
        
       
        
        cancel =new JButton("cancel");
        cancel.setBounds(220,70,80,20);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
    
         
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
           String query ="select * from teacherleave where empId= '"+cEmpId.getSelectedItem()+"'and date='"+cdate.getSelectedItem()+"'";
           try{
               Conn c=new Conn();
               ResultSet rs=c.s.executeQuery(query);
               table.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){
                e.printStackTrace();
           }
           
        }else if(ae.getSource()==print){
           try{
              table.print();
           }catch(Exception e){
                e.printStackTrace();
           }
        }
        else {
            setVisible(false);
        }
    
    }
    
    
    public static void main(String[] agrs){
       new TeacherLeaveDetails();
        
    
    }
    
}


