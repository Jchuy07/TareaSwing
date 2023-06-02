
package calculadorass.java;

import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
 CalculadoraEspecial operaciones = new CalculadoraEspecial("Especial", "verde", 10, "abs123", "JP"); 
   
   public NewJFrame() {
    initComponents();
    jLabel1.requestFocus();
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoN1 = new javax.swing.JTextField();
        campoN2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnRaizCuadrada = new javax.swing.JButton();
        btnEsPrimo = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnLogaritmo = new javax.swing.JButton();
        btnSeno = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnCoseno = new javax.swing.JButton();
        btnFibonacci = new javax.swing.JButton();
        fieldResultado = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setForeground(new java.awt.Color(255, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Calculadora simple y avanzada");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel2.setText("Primer Numero");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 3, 12)); // NOI18N
        jLabel3.setText("Segundo Numero");

        campoN1.setColumns(20);
        campoN1.setForeground(new java.awt.Color(255, 0, 51));
        campoN1.setToolTipText("");
        campoN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoN1ActionPerformed(evt);
            }
        });

        campoN2.setForeground(new java.awt.Color(255, 102, 102));

        jLabel4.setText("Resultado");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        btnSumar.setBackground(new java.awt.Color(255, 153, 153));
        btnSumar.setForeground(new java.awt.Color(255, 0, 51));
        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.setBackground(new java.awt.Color(255, 153, 153));
        btnRestar.setForeground(new java.awt.Color(255, 0, 51));
        btnRestar.setText("Restar");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(255, 153, 153));
        btnMultiplicar.setForeground(new java.awt.Color(255, 0, 51));
        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnDividir.setBackground(new java.awt.Color(255, 153, 153));
        btnDividir.setForeground(new java.awt.Color(255, 0, 51));
        btnDividir.setText("Dividir");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnRaizCuadrada.setBackground(new java.awt.Color(255, 153, 153));
        btnRaizCuadrada.setForeground(new java.awt.Color(255, 0, 51));
        btnRaizCuadrada.setText("Raiz Cuadrada");
        btnRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizCuadradaActionPerformed(evt);
            }
        });

        btnEsPrimo.setBackground(new java.awt.Color(255, 153, 153));
        btnEsPrimo.setForeground(new java.awt.Color(255, 0, 51));
        btnEsPrimo.setText("Es primo");
        btnEsPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsPrimoActionPerformed(evt);
            }
        });

        btnPotencia.setBackground(new java.awt.Color(255, 153, 153));
        btnPotencia.setForeground(new java.awt.Color(255, 0, 51));
        btnPotencia.setText("Potencia");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnLogaritmo.setBackground(new java.awt.Color(255, 153, 153));
        btnLogaritmo.setForeground(new java.awt.Color(255, 0, 51));
        btnLogaritmo.setText("Logaritmo");
        btnLogaritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogaritmoActionPerformed(evt);
            }
        });

        btnSeno.setBackground(new java.awt.Color(255, 153, 153));
        btnSeno.setForeground(new java.awt.Color(255, 0, 51));
        btnSeno.setText("Seno");
        btnSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenoActionPerformed(evt);
            }
        });

        btnFactorial.setBackground(new java.awt.Color(255, 153, 153));
        btnFactorial.setForeground(new java.awt.Color(255, 0, 51));
        btnFactorial.setText("factorial");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        btnCoseno.setBackground(new java.awt.Color(255, 153, 153));
        btnCoseno.setForeground(new java.awt.Color(255, 0, 51));
        btnCoseno.setText("Coseno");
        btnCoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosenoActionPerformed(evt);
            }
        });

        btnFibonacci.setBackground(new java.awt.Color(255, 153, 153));
        btnFibonacci.setForeground(new java.awt.Color(255, 0, 51));
        btnFibonacci.setText("fibonacci");
        btnFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFibonacciActionPerformed(evt);
            }
        });

        fieldResultado.setForeground(new java.awt.Color(255, 102, 102));
        fieldResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldResultadoActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoN2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(campoN1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnEsPrimo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                                .addComponent(btnlimpiar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnFibonacci))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnRaizCuadrada)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnFactorial))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnDividir)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCoseno))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnRestar)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnMultiplicar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSeno))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSumar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldResultado, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnPotencia, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnLogaritmo, javax.swing.GroupLayout.Alignment.TRAILING))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(fieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRestar)
                            .addComponent(btnPotencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSumar)
                            .addComponent(btnLogaritmo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMultiplicar)
                            .addComponent(btnSeno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDividir)
                            .addComponent(btnCoseno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRaizCuadrada)
                            .addComponent(btnFactorial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEsPrimo)
                            .addComponent(btnFibonacci))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlimpiar)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoN1ActionPerformed
    
    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double num2 = Double.parseDouble(campoN2.getText());
           double resultado= operaciones.sumar(num1,num2);       
       fieldResultado.setText(String.valueOf(resultado)); 
       campoN1.requestFocus();
       campoN1.selectAll();    
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double num2 = Double.parseDouble(campoN2.getText());
           double resultado= operaciones.restar(num1,num2);       
       fieldResultado.setText(String.valueOf(resultado)); 
       campoN1.requestFocus();
       campoN1.selectAll(); 
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
       double num1 = Double.parseDouble(campoN1.getText());
        double num2 = Double.parseDouble(campoN2.getText());
           double resultado= operaciones.multiplicar(num1, num2);
       fieldResultado.setText(String.valueOf(resultado)); 
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        double num1 = Double.parseDouble(campoN1.getText());
        double num2 = Double.parseDouble(campoN2.getText());
           double resultado= operaciones.dividir(num1, num2);
       fieldResultado.setText(String.valueOf(resultado));
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizCuadradaActionPerformed
       double num1 = Double.parseDouble(campoN1.getText());
           double resultado= operaciones.raizCuadrada(num1);
       fieldResultado.setText(String.valueOf(resultado)); 
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_btnRaizCuadradaActionPerformed

    private void btnEsPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsPrimoActionPerformed
           int num1 = Integer.parseInt(campoN1.getText());
    boolean resultado = operaciones.esPrimo(num1);
    fieldResultado.setText(String.valueOf(resultado)); 
    campoN1.requestFocus();
    campoN1.selectAll();
    }//GEN-LAST:event_btnEsPrimoActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        int numero = Integer.parseInt(campoN1.getText());
            double resultado= operaciones.factorial(numero);
       fieldResultado.setText(String.valueOf(resultado)); 
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibonacciActionPerformed
        int n = Integer.parseInt(campoN1.getText());
            double resultado= operaciones.fibonacci(n);
       fieldResultado.setText(String.valueOf(resultado)); 
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_btnFibonacciActionPerformed

    private void btnCosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosenoActionPerformed
         double angulo = Double.parseDouble(campoN1.getText());
           double resultado= operaciones.coseno(angulo);
       fieldResultado.setText(String.valueOf(resultado)); 
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_btnCosenoActionPerformed

    private void btnLogaritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogaritmoActionPerformed
        double numero = Double.parseDouble(campoN1.getText());
           double resultado= operaciones.logaritmo(numero);
       fieldResultado.setText(String.valueOf(resultado)); 
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_btnLogaritmoActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        double base = Double.parseDouble(campoN1.getText());
        double exponente = Double.parseDouble(campoN1.getText());
           double resultado= operaciones.potencia(base, exponente);
       fieldResultado.setText(String.valueOf(resultado)); 
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenoActionPerformed
      double angulo = Double.parseDouble(campoN1.getText());
           double resultado= operaciones.seno(angulo);
       fieldResultado.setText(String.valueOf(resultado)); 
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_btnSenoActionPerformed

    private void fieldResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldResultadoActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
      campoN1.setText(""); 
      campoN2.setText("");
     fieldResultado.setText(""); 
      
    }//GEN-LAST:event_btnlimpiarActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoseno;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnEsPrimo;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnFibonacci;
    private javax.swing.JButton btnLogaritmo;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnRaizCuadrada;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSeno;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JTextField campoN1;
    private javax.swing.JTextField campoN2;
    private javax.swing.JTextField fieldResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
