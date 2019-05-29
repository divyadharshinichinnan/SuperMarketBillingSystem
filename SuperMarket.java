package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class supermarket extends javax.swing.JFrame {
    double a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u;
    public supermarket() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
        g=0;
        h=0;
        i=0;
        j=0;
        k=0;
        l=0;
        m=0;
        n=0;
        o=0;
        p=0;
        q=0;
        r=0;
        s=0;
        t=0;
        u=0;
 a=Double.parseDouble(jTextField1.getText());   
 b=Double.parseDouble(jTextField2.getText());
 c=Double.parseDouble(jTextField3.getText());
 d=Double.parseDouble(jTextField8.getText());
 e=Double.parseDouble(jTextField9.getText());
 f=Double.parseDouble(jTextField10.getText());
 g=Double.parseDouble(jTextField11.getText());
 h=Double.parseDouble(jTextField12.getText());
 i=Double.parseDouble(jTextField13.getText());
 j=Double.parseDouble(jTextField14.getText());
 k=Double.parseDouble(jTextField15.getText());
 l=Double.parseDouble(jTextField16.getText());
 m=Double.parseDouble(jTextField17.getText());
 n=Double.parseDouble(jTextField18.getText());
 o=Double.parseDouble(jTextField19.getText());
 p=Double.parseDouble(jTextField20.getText());
 q=Double.parseDouble(jTextField21.getText());
 r=Double.parseDouble(jTextField22.getText());
 s=Double.parseDouble(jTextField23.getText());
 t =Double.parseDouble(jTextField24.getText());
 u =Double.parseDouble(jTextField25.getText());
  try 
        { 
        double total;
        double tot = 0;
        total=0;
        
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/test","priya","cse");// TODO add your handling code here:
            java.sql.Statement stmt;
            stmt = conn.createStatement();
            ResultSet rst=stmt.executeQuery("select * from PRODUCT");
            while(rst.next())
            {
                String v=rst.getString("PRICE");
                double w=Double.parseDouble(v);
                if("1".equals(rst.getString("ITEMCODE")))
                    tot=a*w;
                if("2".equals(rst.getString("ITEMCODE")))
                    tot=b*w;
                if("3".equals(rst.getString("ITEMCODE")))
                    tot=c*w;
                if("4".equals(rst.getString("ITEMCODE")))
                    tot=d*w;
                if("5".equals(rst.getString("ITEMCODE")))
                    tot=e*w;
                if("6".equals(rst.getString("ITEMCODE")))
                    tot=f*w;
                if("7".equals(rst.getString("ITEMCODE")))
                    tot=g*w;
                if("8".equals(rst.getString("ITEMCODE")))
                    tot=h*w;
                if("9".equals(rst.getString("ITEMCODE")))
                    tot=i*w;
                if("10".equals(rst.getString("ITEMCODE")))
                    tot=j*w;
                if("11".equals(rst.getString("ITEMCODE")))
                    tot=k*w;
                if("12".equals(rst.getString("ITEMCODE")))
                    tot=l*w;
                if("13".equals(rst.getString("ITEMCODE")))
                    tot=m*w;
                if("14".equals(rst.getString("ITEMCODE")))
                    tot=n*w;
                if("15".equals(rst.getString("ITEMCODE")))
                    tot=o*w;
                 if("16".equals(rst.getString("ITEMCODE")))
                    tot=p*w;
                 if("17".equals(rst.getString("ITEMCODE")))
                    tot=q*w;
                 if("18".equals(rst.getString("ITEMCODE")))
                    tot=r*w;
                  if("19".equals(rst.getString("ITEMCODE")))
                    tot=s*w;
                   if("20".equals(rst.getString("ITEMCODE")))
                    tot=t*w;
                 if("21".equals(rst.getString("ITEMCODE")))
                    tot=u*w;
                total=total+tot; 
        }  
           String total1=Double.toString(total);
            jTextField4.setText(total1);
            double tax;
            tax=total*0.105;
            String tax1=Double.toString(tax);
            jTextField5.setText(tax1);
            double dis;
            dis=(.15)*total;
            String dis1=Double.toString(dis);
            jTextField6.setText(dis1);
            double gtot;
            gtot=(total+tax)-dis;
            String gtot1=Double.toString(gtot);
            jTextField7.setText(gtot1);
        } catch (SQLException ex) {
            Logger.getLogger(supermarket.class.getName()).log(Level.SEVERE, null, ex);
        } // TODO add your handling code here:
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            
    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            
    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 jTextField1.setText("");  
 jTextField2.setText("");  
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");
jTextField8.setText("");  
jTextField9.setText("");  
jTextField10.setText("");  
jTextField11.setText("");  
jTextField12.setText("");  
jTextField13.setText("");  
jTextField14.setText("");  
jTextField15.setText("");  
jTextField16.setText("");  
jTextField17.setText("");  
jTextField18.setText("");  
jTextField19.setText("");  
jTextField20.setText("");  
jTextField21.setText("");  
jTextField22.setText("");  
jTextField23.setText("");  
jTextField24.setText("");
jTextField25.setText("");  
    }                                        

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {                                             
            }                                            

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {                                             
    }                                            
    public static void main(String args[]) {
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(supermarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(supermarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(supermarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(supermarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new supermarket().setVisible(true);
            }
        });    }
