
package atm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignInPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginlogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cardnumber = new javax.swing.JTextField();
        cardpassword = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        SignInPanel1.setBackground(new java.awt.Color(0, 0, 0));
        SignInPanel1.setForeground(new java.awt.Color(255, 255, 255));
        SignInPanel1.setPreferredSize(new java.awt.Dimension(380, 361));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Autobahn Stencil", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Virtual ATM");

        loginlogo.setBackground(new java.awt.Color(0, 0, 0));
        loginlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signin.png"))); // NOI18N
        loginlogo.setText("jLabel3");
        loginlogo.setToolTipText("");
        loginlogo.setMaximumSize(new java.awt.Dimension(120, 120));
        loginlogo.setMinimumSize(new java.awt.Dimension(120, 120));
        loginlogo.setPreferredSize(new java.awt.Dimension(120, 120));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign In");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Card Number :");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password       :");

        cardnumber.setBackground(new java.awt.Color(51, 51, 51));
        cardnumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cardnumber.setForeground(new java.awt.Color(255, 255, 255));
        cardnumber.setToolTipText("");
        cardnumber.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cardnumber.setCaretColor(new java.awt.Color(255, 255, 255));
        cardnumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cardnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnumberActionPerformed(evt);
            }
        });

        cardpassword.setBackground(new java.awt.Color(51, 51, 51));
        cardpassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cardpassword.setForeground(new java.awt.Color(255, 255, 255));
        cardpassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cardpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        cardpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardpasswordActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("a Astro Space", 0, 14)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/login.gif"))); // NOI18N
        login.setText("Login");
        login.setName(""); // NOI18N
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("  Don't have a account?");

        signup.setBackground(new java.awt.Color(51, 153, 255));
        signup.setFont(new java.awt.Font("a Astro Space", 0, 13)); // NOI18N
        signup.setText("Sign Up");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Forgot Password?");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SignInPanel1Layout = new javax.swing.GroupLayout(SignInPanel1);
        SignInPanel1.setLayout(SignInPanel1Layout);
        SignInPanel1Layout.setHorizontalGroup(
            SignInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInPanel1Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(SignInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(SignInPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(cardpassword))
                        .addGroup(SignInPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(cardnumber)))
                    .addGroup(SignInPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(signup))
                    .addGroup(SignInPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(SignInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(SignInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(login))))
                    .addGroup(SignInPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(loginlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SignInPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel2)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        SignInPanel1Layout.setVerticalGroup(
            SignInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(SignInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cardnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(SignInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cardpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(SignInPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cardpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardpasswordActionPerformed

    private void cardnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnumberActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        String CardNumber= cardnumber.getText();
        String Pass = new String(cardpassword.getPassword());
        
        try {
            FileReader fr=new FileReader("src\\Database.csv");
            BufferedReader br=new BufferedReader(fr);
            String line;
            matched=false;
            while((line=br.readLine())!=null)
            {   
                String [] arr=line.split(",");
                if(CardNumber.equals(arr[0])&&Pass.equals(arr[1]))
                {   
                    Line = line;
                    matched=true;
                    AccNo=CardNumber;
                    Name=arr[3];
                    Password=Pass;
                    PinNum=arr[2];
                    Email=arr[4];
                    Balance=arr[8];
                    break;
                } 
            }
            
            if(matched)
            {   
                MainMenu main=new MainMenu();
                main.setVisible(true);
                main.AccNo=AccNo;
                main.Name=Name;
                main.Password=Password;
                main.PinNum=PinNum;
                main.Email=Email;
                main.Balance=Balance;
                main.name.setText("Mr. "+main.Name);
                main.accNo.setText(main.AccNo);
                main.Line = Line;
                dispose();
            }
            else if("".equals(CardNumber))
            {
                JFrame f=new JFrame();
                JOptionPane.showMessageDialog(f,"Card number is empty");
            }
            
            else if("".equals(Pass))
               {
                JFrame f=new JFrame();
                JOptionPane.showMessageDialog(f,"Password is empty");
            }  
            else if(!matched)
            {
                JFrame f=new JFrame();
                JOptionPane.showMessageDialog(f,"Card Number Or Password isn't correct");
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
    }//GEN-LAST:event_loginMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
         ForgotPass forgotpass=new ForgotPass();
         forgotpass.setVisible(true); 
         dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        // TODO add your handling code here:
        SignUp signup= new SignUp();
        signup.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_signupMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
      
    }
     public String Line;
    public  String AccNo;
    public  String Name;
    public  Boolean matched;
    public  String  Password;
     public  String  PinNum;
     public  String  Email;
     public  String  Balance;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SignInPanel1;
    private javax.swing.JTextField cardnumber;
    private javax.swing.JPasswordField cardpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton login;
    private javax.swing.JLabel loginlogo;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
