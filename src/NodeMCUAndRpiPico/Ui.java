/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodeMCUAndRpiPico;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author saliya
 */
public class Ui extends javax.swing.JFrame {

    private Thread WIFI_CONNECT_THREAD;
    private Socket WIFI_SOCKET;
    private String WIFI_IP = "";
    private String WIFI_PORT = "";
    private BufferedWriter WIFI_BUFFERED_WRITER;

    /**
     * Creates new form Ui
     */
    public Ui() {
        initComponents();
        sw1.setEnabled(false);
        sw2.setEnabled(false);
        sw3.setEnabled(false);
        sw4.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WIFI_IP_TXF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        WIFI_CONNECT_BTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        sw1 = new javax.swing.JToggleButton();
        sw2 = new javax.swing.JToggleButton();
        sw3 = new javax.swing.JToggleButton();
        sw4 = new javax.swing.JToggleButton();
        WIFI_PORT_TXF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NodeMCU & Raspberry Pi Pico");
        setResizable(false);

        WIFI_IP_TXF.setText("192.168.4.1");

        jLabel1.setText("IP Address :");

        WIFI_CONNECT_BTN.setText("Connect");
        WIFI_CONNECT_BTN.setPreferredSize(new java.awt.Dimension(73, 20));
        WIFI_CONNECT_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WIFI_CONNECT_BTNActionPerformed(evt);
            }
        });

        sw1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/toff.png"))); // NOI18N
        sw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sw1ActionPerformed(evt);
            }
        });

        sw2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/toff.png"))); // NOI18N
        sw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sw2ActionPerformed(evt);
            }
        });

        sw3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/toff.png"))); // NOI18N
        sw3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sw3ActionPerformed(evt);
            }
        });

        sw4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/toff.png"))); // NOI18N
        sw4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sw4ActionPerformed(evt);
            }
        });

        WIFI_PORT_TXF.setText("80");

        jLabel2.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WIFI_IP_TXF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WIFI_PORT_TXF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(WIFI_CONNECT_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sw1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sw2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sw3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sw4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(WIFI_IP_TXF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(WIFI_CONNECT_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(WIFI_PORT_TXF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sw1)
                    .addComponent(sw2)
                    .addComponent(sw3)
                    .addComponent(sw4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sw1ActionPerformed
        if (sw1.isSelected()) {
            sw1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ton.png")));
            try {
                SendData("A");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            sw1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/toff.png")));
            try {
                SendData("a");
            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_sw1ActionPerformed

    private void sw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sw2ActionPerformed
        if (sw2.isSelected()) {
            sw2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ton.png")));
            try {
                SendData("B");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            sw2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/toff.png")));
            try {
                SendData("b");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_sw2ActionPerformed

    private void sw3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sw3ActionPerformed
        if (sw3.isSelected()) {
            sw3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ton.png")));
            try {
                SendData("C");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            sw3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/toff.png")));
            try {
                SendData("c");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_sw3ActionPerformed

    private void sw4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sw4ActionPerformed
        if (sw4.isSelected()) {
            sw4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/ton.png")));
            try {
                SendData("D");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            sw4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/toff.png")));
            try {
                SendData("d");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_sw4ActionPerformed

    private void WIFI_CONNECT_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WIFI_CONNECT_BTNActionPerformed
        if (WIFI_IP_TXF.getText().isEmpty() || WIFI_PORT_TXF.getText().isEmpty()) {
            return;
        }
        WIFI_CONNECT_BTN.setEnabled(false);

        WIFI_CONNECT_THREAD = new Thread(() -> {
            if (WIFI_isConnected()) {
                jLabel2.setText("closing connection ...");
                WIFI_closeConnecition();
                jLabel2.setText("connection closed");
                WIFI_SOCKET = null;
                WIFI_CONNECT_BTN.setText("Connect");
                WIFI_CONNECT_BTN.setEnabled(true);
                WIFI_IP_TXF.setEnabled(true);
                WIFI_PORT_TXF.setEnabled(true);
                return;
            }

            WIFI_IP = WIFI_IP_TXF.getText();
            WIFI_PORT = WIFI_PORT_TXF.getText();
            try {
                jLabel2.setText("connecting...");
                WIFI_SOCKET = new Socket(WIFI_IP, Integer.valueOf(WIFI_PORT));
                jLabel2.setText("connected to :" + WIFI_IP + "  " + WIFI_PORT);
                WIFI_CONNECT_BTN.setText("Disconnect");
                WIFI_CONNECT_BTN.setEnabled(true);
                WIFI_IP_TXF.setEnabled(false);
                WIFI_PORT_TXF.setEnabled(false);
                sw1.setEnabled(true);
                sw2.setEnabled(true);
                sw3.setEnabled(true);
                sw4.setEnabled(true);
            } catch (UnknownHostException e1) {
                jLabel2.setText("Error !");
                WIFI_CONNECT_BTN.setEnabled(true);
                WIFI_IP_TXF.setEnabled(true);
                WIFI_PORT_TXF.setEnabled(true);
                sw1.setEnabled(false);
                sw2.setEnabled(false);
                sw3.setEnabled(false);
                sw4.setEnabled(false);
            } catch (IOException e1) {
                jLabel2.setText("Network is unreachable !");
                WIFI_CONNECT_BTN.setEnabled(true);
                WIFI_IP_TXF.setEnabled(true);
                WIFI_PORT_TXF.setEnabled(true);
                sw1.setEnabled(false);
                sw2.setEnabled(false);
                sw3.setEnabled(false);
                sw4.setEnabled(false);
            }
        });
        WIFI_CONNECT_THREAD.start();
    }//GEN-LAST:event_WIFI_CONNECT_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ui().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton WIFI_CONNECT_BTN;
    private javax.swing.JTextField WIFI_IP_TXF;
    private javax.swing.JTextField WIFI_PORT_TXF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton sw1;
    private javax.swing.JToggleButton sw2;
    private javax.swing.JToggleButton sw3;
    private javax.swing.JToggleButton sw4;
    // End of variables declaration//GEN-END:variables
  private void WIFI_closeConnecition() {
        if (WIFI_SOCKET != null) {
            if (WIFI_SOCKET.isConnected()) {
                try {
                    WIFI_SOCKET.close();
                    WIFI_SOCKET = null;
                    sw1.setEnabled(false);
                    sw2.setEnabled(false);
                    sw3.setEnabled(false);
                    sw4.setEnabled(false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }

    }

    private boolean WIFI_isConnected() {
        if (WIFI_SOCKET != null) {
            if (WIFI_SOCKET.isConnected()) {
                return true;
            }
        }
        return false;
    }

    private void SendData(String x) throws Exception {
        if (x == null || x.isEmpty()) {
            return;
        }
        if (WIFI_SOCKET == null) {
            jLabel2.setText("not connected !");
            return;
        }
        try {
            WIFI_BUFFERED_WRITER = new BufferedWriter(new OutputStreamWriter(WIFI_SOCKET.getOutputStream()));
            WIFI_BUFFERED_WRITER.write(x + "\n");
            WIFI_BUFFERED_WRITER.flush();
            jLabel2.setText("sent :" + x);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
