/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio2;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCalculadora = new javax.swing.JPanel();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        lblElemento1 = new javax.swing.JLabel();
        TxtNum01 = new javax.swing.JTextField();
        lblElemento2 = new javax.swing.JLabel();
        TxtNum02 = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        lblTextoR = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PanelCalculadora.setBackground(new java.awt.Color(153, 104, 119));
        PanelCalculadora.setForeground(new java.awt.Color(51, 51, 51));

        btnRestar.setBackground(new java.awt.Color(255, 255, 204));
        btnRestar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRestar.setText("-");
        btnRestar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(255, 255, 204));
        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMultiplicar.setText("x");
        btnMultiplicar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(255, 255, 204));
        btnDividir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDividir.setText("/");
        btnDividir.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        lblElemento1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblElemento1.setForeground(new java.awt.Color(51, 0, 0));
        lblElemento1.setText("Elemento 1");

        TxtNum01.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TxtNum01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNum01ActionPerformed(evt);
            }
        });

        lblElemento2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblElemento2.setForeground(new java.awt.Color(51, 0, 0));
        lblElemento2.setText("Elemento 2");

        TxtNum02.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TxtNum02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNum02ActionPerformed(evt);
            }
        });

        btnSumar.setBackground(new java.awt.Color(255, 255, 204));
        btnSumar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSumar.setText("+");
        btnSumar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        btnSumar.setBorderPainted(false);
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblResultado.setText("0.0");

        lblTextoR.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTextoR.setText("Resultado");

        javax.swing.GroupLayout PanelCalculadoraLayout = new javax.swing.GroupLayout(PanelCalculadora);
        PanelCalculadora.setLayout(PanelCalculadoraLayout);
        PanelCalculadoraLayout.setHorizontalGroup(
            PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                        .addComponent(TxtNum01, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(btnRestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSumar)
                                    .addComponent(btnDividir))
                                .addGap(47, 47, 47))
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(lblElemento1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNum02, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElemento2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCalculadoraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTextoR)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addGap(38, 38, 38))
        );
        PanelCalculadoraLayout.setVerticalGroup(
            PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblElemento1)
                            .addComponent(lblElemento2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNum01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNum02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResultado))
                    .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(PanelCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMultiplicar)
                                    .addComponent(btnRestar)))
                            .addGroup(PanelCalculadoraLayout.createSequentialGroup()
                                .addComponent(btnSumar)
                                .addGap(47, 47, 47)
                                .addComponent(btnDividir)))
                        .addGap(18, 18, 18)
                        .addComponent(lblTextoR)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        lblTítulo.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(153, 51, 0));
        lblTítulo.setText("Calculadora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblTítulo)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTítulo)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNum01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNum01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNum01ActionPerformed

    private void TxtNum02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNum02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNum02ActionPerformed

    private Operaciones getOperador(){
        
        float Elemento01 = Float.parseFloat(TxtNum01.getText());
        float Elemento02 = Float.parseFloat(TxtNum02.getText());
        
        Operaciones ope = new Operaciones(Elemento01,Elemento02);
        return ope;
    }
    
    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        
        Operaciones ope = getOperador();
        lblResultado.setText(String.valueOf(ope.Dividir()));
        
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        Operaciones ope = getOperador();
        lblResultado.setText(String.valueOf(ope.Restar()));
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        Operaciones ope = getOperador();
        lblResultado.setText(String.valueOf(ope.Sumar()));
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        Operaciones ope = getOperador();
        lblResultado.setText(String.valueOf(ope.Multiplicar()));
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCalculadora;
    private javax.swing.JTextField TxtNum01;
    private javax.swing.JTextField TxtNum02;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblElemento1;
    private javax.swing.JLabel lblElemento2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTextoR;
    private javax.swing.JLabel lblTítulo;
    // End of variables declaration//GEN-END:variables
}
