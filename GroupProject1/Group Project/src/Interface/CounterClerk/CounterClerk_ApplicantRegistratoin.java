/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CounterClerk;

/**
 *
 * @author Umesh Saranga
 */
public class CounterClerk_ApplicantRegistratoin extends javax.swing.JFrame {

    /**
     * Creates new form CounterClerk_ApplicantRegistratoin
     */
    public CounterClerk_ApplicantRegistratoin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JLABLE = new javax.swing.JLabel();
        RegisterApplicant_Name = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        RegisterApplicant_Address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ApplicantRegistration_NID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ApplicantRegistration_TPNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ApplicantRegistration_Email = new javax.swing.JTextField();
        RegisterApplicantDetails_Submit = new javax.swing.JButton();
        RegisterApplicantDetails_Close = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        RegisterApplicantDetails_Initials = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RegisterApplicantDetails_LastName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Register Applicant Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 190, 20));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLABLE.setText("Name");
        jPanel2.add(JLABLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        jPanel2.add(RegisterApplicant_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 260, 30));

        Address.setText("Address");
        jPanel2.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        RegisterApplicant_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterApplicant_AddressActionPerformed(evt);
            }
        });
        jPanel2.add(RegisterApplicant_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 260, 30));

        jLabel2.setText("NID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel2.add(ApplicantRegistration_NID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 260, 30));

        jLabel3.setText("Telephone Number");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel2.add(ApplicantRegistration_TPNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 260, 30));

        jLabel4.setText("Email");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        jPanel2.add(ApplicantRegistration_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 260, 30));

        RegisterApplicantDetails_Submit.setText("Submit");
        jPanel2.add(RegisterApplicantDetails_Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        RegisterApplicantDetails_Close.setText("Close");
        jPanel2.add(RegisterApplicantDetails_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel5.setText("Initials");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel2.add(RegisterApplicantDetails_Initials, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 260, 30));

        jLabel6.setText("Last Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel2.add(RegisterApplicantDetails_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 260, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 450, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterApplicant_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterApplicant_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterApplicant_AddressActionPerformed

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
            java.util.logging.Logger.getLogger(CounterClerk_ApplicantRegistratoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CounterClerk_ApplicantRegistratoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CounterClerk_ApplicantRegistratoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CounterClerk_ApplicantRegistratoin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CounterClerk_ApplicantRegistratoin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextField ApplicantRegistration_Email;
    private javax.swing.JTextField ApplicantRegistration_NID;
    private javax.swing.JTextField ApplicantRegistration_TPNum;
    private javax.swing.JLabel JLABLE;
    private javax.swing.JButton RegisterApplicantDetails_Close;
    private javax.swing.JTextField RegisterApplicantDetails_Initials;
    private javax.swing.JTextField RegisterApplicantDetails_LastName;
    private javax.swing.JButton RegisterApplicantDetails_Submit;
    private javax.swing.JTextField RegisterApplicant_Address;
    private javax.swing.JTextField RegisterApplicant_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
