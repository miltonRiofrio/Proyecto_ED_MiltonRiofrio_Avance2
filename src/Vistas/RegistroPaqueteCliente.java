/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author Sebastian
 */
public class RegistroPaqueteCliente extends javax.swing.JFrame {

    /**
     * Creates new form RegistroPaquete
     */
    public RegistroPaqueteCliente() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setText("R E G I S T R O   P A Q U E T E   D E   C L I E N T E");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 30, 290, 16);

        jButton1.setText("AGREGAR PAQUETE");
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 580, 150, 22);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DEL DESTINATARIO"));
        jPanel2.setLayout(null);

        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 40, 70, 16);

        jLabel3.setText("CI/RUC:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 80, 70, 16);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(140, 40, 250, 22);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(140, 80, 250, 22);

        jLabel4.setText("Telefono:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 120, 60, 16);

        jLabel5.setText("Ciudad:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 160, 41, 16);

        jLabel6.setText("Direccion:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 200, 70, 16);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(140, 120, 250, 22);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(140, 160, 250, 22);
        jPanel2.add(jTextField5);
        jTextField5.setBounds(140, 200, 250, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 70, 480, 240);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO PAQUETE CLIENTE"));
        jPanel3.setLayout(null);

        jLabel7.setText("Id Paquete:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 50, 83, 16);

        jLabel8.setText("Peso:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 90, 83, 16);

        jLabel9.setText("Fragilidad:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(480, 70, 83, 16);

        jLabel10.setText("Fecha de llegada:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 140, 100, 16);
        jPanel3.add(jTextField7);
        jTextField7.setBounds(140, 90, 260, 22);
        jPanel3.add(jTextField8);
        jTextField8.setBounds(140, 140, 260, 22);

        jLabel11.setText("Prioridad:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(480, 140, 60, 16);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALTA", "MEDIA", "BAJA" }));
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(580, 140, 120, 22);
        jPanel3.add(jLabel12);
        jLabel12.setBounds(140, 50, 180, 20);

        jCheckBox1.setText("Es Fragil");
        jPanel3.add(jCheckBox1);
        jCheckBox1.setBounds(570, 70, 85, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 340, 1010, 200);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DE REMITENTE"));
        jPanel4.setLayout(null);
        jPanel4.add(jTextField6);
        jTextField6.setBounds(160, 200, 250, 22);
        jPanel4.add(jTextField11);
        jTextField11.setBounds(160, 80, 250, 22);

        jLabel17.setText("Direccion:");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(40, 200, 70, 16);
        jPanel4.add(jTextField10);
        jTextField10.setBounds(160, 120, 250, 22);
        jPanel4.add(jTextField12);
        jTextField12.setBounds(160, 40, 250, 22);
        jPanel4.add(jTextField9);
        jTextField9.setBounds(160, 160, 250, 22);

        jLabel16.setText("Ciudad:");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(40, 160, 41, 16);

        jLabel13.setText("Nombre:");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(40, 40, 70, 16);

        jLabel14.setText("CI/RUC:");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(40, 80, 80, 16);

        jLabel15.setText("Telefono:");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(40, 120, 60, 16);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(530, 70, 490, 240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1034, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1048, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RegistroPaqueteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPaqueteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPaqueteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPaqueteCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPaqueteCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
