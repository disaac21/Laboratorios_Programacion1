package examen2p1_danieljuarez;

import javax.swing.JOptionPane;

public class Examen2P1 extends javax.swing.JFrame {

    public Examen2P1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Operadores = new javax.swing.JButton();
        Distancia = new javax.swing.JButton();
        Stack = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(153, 153, 255));

        Operadores.setBackground(new java.awt.Color(255, 255, 153));
        Operadores.setText("Operadores Lógicos");
        Operadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperadoresActionPerformed(evt);
            }
        });

        Distancia.setBackground(new java.awt.Color(255, 204, 204));
        Distancia.setText("Distancia");
        Distancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistanciaActionPerformed(evt);
            }
        });

        Stack.setBackground(new java.awt.Color(204, 255, 204));
        Stack.setText("Stack");
        Stack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StackActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(153, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Examen 2 - Laboratorio Programación 1");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Operadores)
                        .addGap(35, 35, 35)
                        .addComponent(Distancia)
                        .addGap(42, 42, 42)
                        .addComponent(Stack)
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Operadores, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(Distancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(Salir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        //Salir
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void StackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StackActionPerformed
        //Stack
        String cadenainput = JOptionPane.showInputDialog(null, "Ingrese una Cadena.", "Stack", JOptionPane.PLAIN_MESSAGE);
        Word word = new Word();
        Stack stack = new Stack();
        word.setCadenainword(cadenainput);
        word.Reverse();

        JOptionPane.showMessageDialog(null, "Cadena Invertida: " + word.SentFromWord(), "Stack", JOptionPane.PLAIN_MESSAGE);
        //        word.AddingPrint(cadenainput);
        //        JOptionPane.showMessageDialog(null, "Cadena Reverse: " + word.AddingPrint(cadenainput), "Stack", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_StackActionPerformed

    private void DistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistanciaActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Número Mayor a 999", "Distancia", JOptionPane.PLAIN_MESSAGE));
        while (numero < 999) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Debe Ingresar un Número Mayor a 999.\nIngrese un Número Mayor a 999", "Distancia", JOptionPane.PLAIN_MESSAGE));
        }
        Numerito numerito = new Numerito();
        numerito.Distancia(numero);
    }//GEN-LAST:event_DistanciaActionPerformed

    private void OperadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperadoresActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Número entre 0 y 255", "Operadores Lógicos", JOptionPane.PLAIN_MESSAGE));
        while (numero < 0 || numero > 255) {
            if (numero < 0) {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Debe Ingresar un Número Mayor a 0.\nIngrese un Número entre 0 y 255", "Operadores Lógicos", JOptionPane.PLAIN_MESSAGE));
            } else {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Debe Ingresar un Número Menor a 255.\nIngrese un Número entre 0 y 255", "Operadores Lógicos", JOptionPane.PLAIN_MESSAGE));
            }
        }
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Número entre 0 y 255", "Operadores Lógicos", JOptionPane.PLAIN_MESSAGE));
        while (numero2 < 0 || numero2 > 255) {
            if (numero2 < 0) {
                numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Debe Ingresar un Número Mayor a 0.\nIngrese un Número entre 0 y 255", "Operadores Lógicos", JOptionPane.PLAIN_MESSAGE));
            } else {
                numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Debe Ingresar un Número Menor a 255.\nIngrese un Número entre 0 y 255", "Operadores Lógicos", JOptionPane.PLAIN_MESSAGE));
            }
        }
        Binario bin = new Binario();
        //        JOptionPane.showMessageDialog(null, "El Número " + numero + " en Binario es: " + bin.Dec2Bin(numero), "Operadores Lógicos", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "El Número " + numero + " en Binario es: " + bin.Dec2Bin(numero)+"\nEl Número " + numero2 + " en Binario es: " + bin.Dec2Bin(numero2), "Operadores Lógicos", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_OperadoresActionPerformed

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
            java.util.logging.Logger.getLogger(Examen2P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Examen2P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Examen2P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Examen2P1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examen2P1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton Distancia;
    private javax.swing.JButton Operadores;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Stack;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
