
package JFrameStack;

import java.util.Stack;

/*
 * @Jonathan Cabrera
 */
public class JFrameStack extends javax.swing.JFrame {
  
    public JFrameStack() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Insertar = new javax.swing.JButton();
        EstadoPila = new javax.swing.JButton();
        MostrarPila = new javax.swing.JButton();
        ConsultarSinBorrar = new javax.swing.JButton();
        BuscarPosicion = new javax.swing.JButton();
        ConsultarBorrando = new javax.swing.JButton();
        MostrarDato = new javax.swing.JLabel();
        Pila = new javax.swing.JLabel();
        Texto = new javax.swing.JTextField();
        Buscar = new javax.swing.JTextField();
        Borrar = new javax.swing.JLabel();
        BorrarE = new javax.swing.JLabel();
        Verificar = new javax.swing.JLabel();
        BuscarP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("Seleccione su Opción:");

        Insertar.setBackground(new java.awt.Color(255, 255, 255));
        Insertar.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Insertar.setForeground(new java.awt.Color(0, 0, 51));
        Insertar.setText("Insertar Elemento");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        EstadoPila.setBackground(new java.awt.Color(255, 255, 255));
        EstadoPila.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        EstadoPila.setForeground(new java.awt.Color(0, 0, 51));
        EstadoPila.setText("Verificar si la Pila Está Vacia");
        EstadoPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoPilaActionPerformed(evt);
            }
        });

        MostrarPila.setBackground(new java.awt.Color(255, 255, 255));
        MostrarPila.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        MostrarPila.setForeground(new java.awt.Color(0, 0, 51));
        MostrarPila.setText("Mostrar Elementos de la Pila");
        MostrarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPilaActionPerformed(evt);
            }
        });

        ConsultarSinBorrar.setBackground(new java.awt.Color(255, 255, 255));
        ConsultarSinBorrar.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        ConsultarSinBorrar.setForeground(new java.awt.Color(0, 0, 51));
        ConsultarSinBorrar.setText("Consultar Tope Sin Borrar");
        ConsultarSinBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarSinBorrarActionPerformed(evt);
            }
        });

        BuscarPosicion.setBackground(new java.awt.Color(255, 255, 255));
        BuscarPosicion.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        BuscarPosicion.setForeground(new java.awt.Color(0, 0, 51));
        BuscarPosicion.setText("Buscar Posicion de Elemento");
        BuscarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPosicionActionPerformed(evt);
            }
        });

        ConsultarBorrando.setBackground(new java.awt.Color(255, 255, 255));
        ConsultarBorrando.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        ConsultarBorrando.setForeground(new java.awt.Color(0, 0, 51));
        ConsultarBorrando.setText("Borrar Elemento en Tope y Mostarlo");
        ConsultarBorrando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarBorrandoActionPerformed(evt);
            }
        });

        MostrarDato.setText("Mostrar Datos");

        Pila.setText("Pila(Stock)");

        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        BorrarE.setText("Mostar Datos");

        Verificar.setText("Mostrar Datos");

        BuscarP.setText("Mostrar Datos");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Gestor de Pilas(Stock)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MostrarPila)
                                .addComponent(BuscarPosicion))
                            .addGap(66, 66, 66)
                            .addComponent(Pila, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Insertar)
                                .addComponent(ConsultarSinBorrar))
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MostrarDato, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ConsultarBorrando)
                                    .addGap(4, 4, 4))
                                .addComponent(EstadoPila))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BorrarE, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BuscarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(546, 546, 546)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Borrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(Borrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insertar)
                    .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultarSinBorrar)
                    .addComponent(MostrarDato))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultarBorrando)
                    .addComponent(BorrarE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarPosicion)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstadoPila)
                    .addComponent(Verificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostrarPila)
                    .addComponent(Pila))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        
        pilaStack.push(Texto.getText());
        Texto.setText("");
    }//GEN-LAST:event_InsertarActionPerformed

    private void ConsultarSinBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarSinBorrarActionPerformed
        
        MostrarDato.setText("El elemento del tope de la Pila es: " + pilaStack.peek());
    }//GEN-LAST:event_ConsultarSinBorrarActionPerformed

    private void ConsultarBorrandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarBorrandoActionPerformed
        BorrarE.setText("El elemento removido del tope de la Pila es: " + pilaStack.pop());
    }//GEN-LAST:event_ConsultarBorrandoActionPerformed

    private void BuscarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPosicionActionPerformed
        
        int bus = pilaStack.search(Buscar.getText());
        BuscarP.setText("El elemento buscado se encuentra en la posición: " + bus);
    }//GEN-LAST:event_BuscarPosicionActionPerformed

    private void EstadoPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoPilaActionPerformed
        
        if (pilaStack.empty()== true){
            Verificar.setText("La Pila se encuentra vacia");
        }else{
        Verificar.setText("La Pila se encuentra LLena ");
        }
    }//GEN-LAST:event_EstadoPilaActionPerformed

    private void MostrarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPilaActionPerformed
        Pila.setText(pilaStack.toString());
        Texto.setText("");
    }//GEN-LAST:event_MostrarPilaActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed
    
    
    Stack<String> pilaStack = new Stack<>();
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
            java.util.logging.Logger.getLogger(JFrameStack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameStack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameStack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameStack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameStack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Borrar;
    private javax.swing.JLabel BorrarE;
    private javax.swing.JTextField Buscar;
    private javax.swing.JLabel BuscarP;
    private javax.swing.JButton BuscarPosicion;
    private javax.swing.JButton ConsultarBorrando;
    private javax.swing.JButton ConsultarSinBorrar;
    private javax.swing.JButton EstadoPila;
    private javax.swing.JButton Insertar;
    private javax.swing.JLabel MostrarDato;
    private javax.swing.JButton MostrarPila;
    private javax.swing.JLabel Pila;
    private javax.swing.JTextField Texto;
    private javax.swing.JLabel Verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
