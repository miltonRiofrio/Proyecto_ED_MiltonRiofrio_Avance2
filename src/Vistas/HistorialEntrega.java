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
public class HistorialEntrega extends javax.swing.JFrame {

    /**
     * Creates new form DetalleEnvio
     */
    public HistorialEntrega() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setText("H I S T O R I A L  E N T R E G A");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 20, 190, 16);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Conductor"));
        jPanel2.setLayout(null);

        jLabel2.setText("Nombre Conductor:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 30, 120, 16);

        jLabel3.setText("Sueldo:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 70, 80, 16);

        jLabel4.setText("Cedula:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(400, 30, 50, 16);

        jLabel8.setText("Telefono:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(400, 70, 60, 16);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(160, 30, 130, 22);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(160, 70, 130, 22);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(480, 30, 160, 22);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(480, 70, 160, 22);

        jLabel10.setText("Anios Trabajo:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(30, 110, 90, 16);
        jPanel2.add(jTextField8);
        jTextField8.setBounds(160, 110, 130, 22);

        jLabel11.setText("Licencia:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(400, 150, 50, 16);

        jLabel12.setText("Direccion:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(30, 150, 70, 16);

        jLabel13.setText("Ciudad:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(400, 110, 41, 16);
        jPanel2.add(jTextField7);
        jTextField7.setBounds(160, 150, 130, 22);
        jPanel2.add(jTextField9);
        jTextField9.setBounds(480, 110, 160, 22);
        jPanel2.add(jTextField10);
        jTextField10.setBounds(480, 150, 160, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 50, 760, 200);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Camion"));
        jPanel3.setLayout(null);

        jLabel5.setText("Placa:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 30, 76, 16);

        jLabel6.setText("Marca:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 70, 37, 16);

        jLabel7.setText("Capacidad:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(400, 40, 70, 16);
        jPanel3.add(jTextField5);
        jTextField5.setBounds(100, 30, 150, 22);
        jPanel3.add(jTextField6);
        jTextField6.setBounds(100, 70, 150, 22);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carga liviana", "Carga media", "Carga pesada" }));
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(510, 40, 120, 22);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 270, 760, 120);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ruta"));
        jPanel4.setLayout(null);

        jLabel9.setText("IdHEntrega:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(32, 37, 62, 16);
        jPanel4.add(jTextField11);
        jTextField11.setBounds(130, 40, 140, 22);

        jLabel14.setText("Ciudad Origen:");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(30, 90, 90, 16);

        jLabel15.setText("Ciudad destino:");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(380, 90, 90, 16);
        jPanel4.add(jTextField12);
        jTextField12.setBounds(130, 90, 140, 22);
        jPanel4.add(jTextField13);
        jTextField13.setBounds(510, 90, 140, 22);

        jLabel16.setText("Fecha de entrega:");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(370, 40, 100, 16);
        jPanel4.add(jTextField14);
        jTextField14.setBounds(510, 40, 140, 22);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 410, 760, 130);

        jButton1.setText("Agregar");
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 560, 75, 22);

        jButton2.setText("Ver Envios");
        jPanel1.add(jButton2);
        jButton2.setBounds(450, 560, 130, 22);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Camionero"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre Conductor", "Placa", "IdHEntrega", "Cedula", "Licencia", "Sueldo", "Anios de trabajo", "Ciudad", "Direccion", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 600, 760, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
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
            java.util.logging.Logger.getLogger(HistorialEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialEntrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
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
