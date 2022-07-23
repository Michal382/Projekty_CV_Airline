/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airline;


import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author micha
 */
public class Bilety extends javax.swing.JFrame {

    /**
     * Creates new form Bilety
     */
    public Bilety() {
        initComponents();
        PobierzPasazera();
        PobierzDane();
        PobierzLot();
        WyswietlRezerwacje();
        Czyszczenie();
        BiletyImieJava.setEditable(false);
        BiletyPlecJava.setEditable(false);
        BiletyNarodowoscJava.setEditable(false);
        BiletyPaszportJava.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BiletyImieJava = new javax.swing.JTextField();
        BiletyPaszportJava = new javax.swing.JTextField();
        BiletyIDJava = new javax.swing.JComboBox<>();
        BiletyNumerJava = new javax.swing.JComboBox<>();
        BiletyIloscJava = new javax.swing.JTextField();
        BiletyNarodowoscJava = new javax.swing.JTextField();
        BiletyRezerwuj = new javax.swing.JButton();
        BiletyReset = new javax.swing.JButton();
        BiletyPowrot = new javax.swing.JButton();
        BiletyPlecJava = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BiletyTabelaJava = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Rezerwacja biletów");

        jLabel2.setText("ID Pasażera");

        jLabel3.setText("Imię Pasażera");

        jLabel4.setText("Numer Lotu");

        jLabel5.setText("Płeć");

        jLabel6.setText("Numer Paszportu");

        jLabel7.setText("Ilość");

        jLabel8.setText("Narodowość");

        BiletyIDJava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BiletyIDJavaMouseClicked(evt);
            }
        });
        BiletyIDJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiletyIDJavaActionPerformed(evt);
            }
        });

        BiletyRezerwuj.setText("Rezerwuj");
        BiletyRezerwuj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BiletyRezerwujMouseClicked(evt);
            }
        });
        BiletyRezerwuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiletyRezerwujActionPerformed(evt);
            }
        });

        BiletyReset.setText("Reset");
        BiletyReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BiletyResetMouseClicked(evt);
            }
        });

        BiletyPowrot.setText("Powrót");
        BiletyPowrot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BiletyPowrotMouseClicked(evt);
            }
        });

        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        BiletyTabelaJava.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(BiletyTabelaJava);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2))
                    .addComponent(BiletyIDJava, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BiletyImieJava, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5)
                        .addGap(102, 102, 102))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BiletyNumerJava, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(BiletyPlecJava, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BiletyPaszportJava, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BiletyIloscJava, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BiletyNarodowoscJava, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BiletyRezerwuj)
                        .addGap(117, 117, 117)
                        .addComponent(BiletyReset))
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(BiletyPowrot)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BiletyPaszportJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BiletyImieJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BiletyIDJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BiletyNumerJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BiletyIloscJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BiletyNarodowoscJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BiletyPlecJava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BiletyRezerwuj)
                    .addComponent(BiletyReset)
                    .addComponent(BiletyPowrot))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BiletyPowrotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BiletyPowrotMouseClicked
        // TODO add your handling code here:
        new Główne_Okno().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BiletyPowrotMouseClicked

    private void BiletyResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BiletyResetMouseClicked
        // TODO add your handling code here:
        Czyszczenie();
    }//GEN-LAST:event_BiletyResetMouseClicked

    private void BiletyRezerwujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiletyRezerwujActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BiletyRezerwujActionPerformed

    private void BiletyRezerwujMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BiletyRezerwujMouseClicked
        // TODO add your handling code here:
        if(BiletyIDJava.getSelectedIndex() == -1 || BiletyNumerJava.getSelectedIndex() == -1 || BiletyIloscJava.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Brakuje danych!");
        }else{
            try{
                Licznik();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
                PreparedStatement Add = Con.prepareStatement("insert into rezerwacjatabela values(?, ?, ?, ?, ?, ?, ?)");
                Add.setInt(1, BiletID);
                Add.setString(2, BiletyImieJava.getText());
                Add.setString(3, BiletyNumerJava.getSelectedItem().toString());
                Add.setString(4, BiletyPlecJava.getText());
                Add.setString(5, BiletyPaszportJava.getText());
                Add.setInt(6, Integer.valueOf(BiletyIloscJava.getText()));
                Add.setString(7, BiletyNarodowoscJava.getText());
                int wiersz = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Bilet(y) zarejestrowano pomyślnie!");
                Con.close();
                WyswietlRezerwacje();
                Czyszczenie();
            } catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }

        }
    }//GEN-LAST:event_BiletyRezerwujMouseClicked

    private void BiletyIDJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiletyIDJavaActionPerformed
        // TODO add your handling code here:
        PobierzDane();
    }//GEN-LAST:event_BiletyIDJavaActionPerformed

    private void BiletyIDJavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BiletyIDJavaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BiletyIDJavaMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked
    
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null, RS1 = null;
    Statement St = null, St1 = null;
    
    private void PobierzPasazera()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
            St = Con.createStatement();
            String Zapytanie = "select * from pasazertabela";
            Rs = St.executeQuery(Zapytanie);
            while(Rs.next())
            {
                String PID = String.valueOf(Rs.getInt("PID"));
                BiletyIDJava.addItem(PID);
            }
        } catch (Exception e){
            
        }
    }
    
    private void PobierzDane()
    {
        String Zapytanie = "select * from pasazertabela where PID ="+BiletyIDJava.getSelectedItem().toString();
        Statement St;
        ResultSet Rs;
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
            St = Con.createStatement();
            Rs = St.executeQuery(Zapytanie);
            if(Rs.next())
            {
                BiletyImieJava.setText(Rs.getString("PImie"));
                BiletyPlecJava.setText(Rs.getString("PPlec"));
                BiletyPaszportJava.setText(Rs.getString("PPaszport"));
                BiletyNarodowoscJava.setText(Rs.getString("PNarodowosc"));
            }
        } catch(Exception e){
        }
    }
    
    private void PobierzLot()
    {
         try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
            St = Con.createStatement();
            String Zapytanie = "select * from lot";
            Rs = St.executeQuery(Zapytanie);
            while(Rs.next())
            {
                String LotNUMER = String.valueOf(Rs.getString("LotNUMER"));
                BiletyNumerJava.addItem(LotNUMER);
            }
        } catch (Exception e){
            
        }
    }
    
    int BiletID = 0;
    private void WyswietlRezerwacje()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from rezerwacjatabela");
            BiletyTabelaJava.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e){
            
        }
    }
    private void Licznik()
    {
        try{
            St1 = Con.createStatement();
            RS1 = St1.executeQuery("select Max(BiletID) from rezerwacjatabela");
            RS1.next();
            BiletID = RS1.getInt(1)+1;
        }catch (Exception e){
            
        }
    }
    
    private void Czyszczenie()
    {
        BiletyImieJava.setText("");
        BiletyNumerJava.setSelectedIndex(-1);
        BiletyPlecJava.setText("");
        BiletyNarodowoscJava.setText("");
        BiletyIloscJava.setText("");
        BiletyPaszportJava.setText("");
    }
    
    
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
            java.util.logging.Logger.getLogger(Bilety.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bilety.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bilety.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bilety.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bilety().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BiletyIDJava;
    private javax.swing.JTextField BiletyIloscJava;
    private javax.swing.JTextField BiletyImieJava;
    private javax.swing.JTextField BiletyNarodowoscJava;
    private javax.swing.JComboBox<String> BiletyNumerJava;
    private javax.swing.JTextField BiletyPaszportJava;
    private javax.swing.JTextField BiletyPlecJava;
    private javax.swing.JButton BiletyPowrot;
    private javax.swing.JButton BiletyReset;
    private javax.swing.JButton BiletyRezerwuj;
    private javax.swing.JTable BiletyTabelaJava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}