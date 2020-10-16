
package Vistas;

public class Menu_principal extends javax.swing.JFrame {

    public Menu_principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_editusu = new javax.swing.JButton();
        btn_crearusu = new javax.swing.JButton();
        btn_nuevopr = new javax.swing.JButton();
        btn_buscarpr = new javax.swing.JButton();
        btn_listProd = new javax.swing.JButton();
        btn_cerrarsesi = new javax.swing.JButton();
        btn_acerca = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QUESERA LA 81");

        jLabel2.setText("BIENVENIDO/A");

        btn_editusu.setText("EDITAR USUARIO");
        btn_editusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editusuActionPerformed(evt);
            }
        });

        btn_crearusu.setText("CREAR USUARIO");
        btn_crearusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearusuActionPerformed(evt);
            }
        });

        btn_nuevopr.setText("NUEVO PRODUCTO");
        btn_nuevopr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoprActionPerformed(evt);
            }
        });

        btn_buscarpr.setText("BUSCAR PRODUCTO");
        btn_buscarpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarprActionPerformed(evt);
            }
        });

        btn_listProd.setText("LISTA DE PRODUCTOS");
        btn_listProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listProdActionPerformed(evt);
            }
        });

        btn_cerrarsesi.setText("CERRAR SESION");
        btn_cerrarsesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarsesiActionPerformed(evt);
            }
        });

        btn_acerca.setText("ACERCA DE");
        btn_acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acercaActionPerformed(evt);
            }
        });

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opt/editar_opt.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opt/usuario_opt.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opt/cerrar-sesion_opt.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opt/codigo-de-barras_opt.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opt/lupa_opt.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opt/shopping-list_opt.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opt/refrescar_opt.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opt/informacion_opt.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opt/casa_opt (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 82, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_editusu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_crearusu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_cerrarsesi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_nuevopr, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(btn_buscarpr, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_listProd)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8))))
                                .addGap(0, 72, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_acerca))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_editusu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nuevopr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_crearusu, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                    .addComponent(btn_buscarpr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_cerrarsesi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_listProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_acerca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarsesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarsesiActionPerformed
    // Por medio de este boton, se cierra sesion y se devuelve hacia el inicio de sesion, ya sea para cambiar de usuario o cerrar el programa
        Cerrar_sesion cs = new Cerrar_sesion(); // Creacion del objeto para ejeecutar la accion
        cs.setVisible(true); //Este comando lo que hace es abrir la ventana que tiene guardada la variable en la linea de comando anterior
        dispose(); // Este comando permite cerrar la ventana en la cual se ejecuta la accion
    }//GEN-LAST:event_btn_cerrarsesiActionPerformed

    private void btn_acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acercaActionPerformed
    // Por medio de este boton, el usuario se dirigira hacia la informacion de la creacion del programa, como los creadores, etc.    
        Acerca_De ac = new Acerca_De(); // Creacion del objeto para ejeecutar la accion
        ac.setVisible(true); //Este comando lo que hace es abrir la ventana que tiene guardada la variable en la linea de comando anterior
        dispose(); // Este comando permite cerrar la ventana en la cual se ejecuta la accion
    }//GEN-LAST:event_btn_acercaActionPerformed

    private void btn_listProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listProdActionPerformed
    // Por medio de este boton, el usuario podra ver la lista de productos disponibles
        ListarP lp = new ListarP(); // Creacion del objeto para ejeecutar la accion 
        lp.setVisible(true); //Este comando lo que hace es abrir la ventana que tiene guardada la variable en la linea de comando anterior
        dispose(); // Este comando permite cerrar la ventana en la cual se ejecuta la accion
    }//GEN-LAST:event_btn_listProdActionPerformed

    private void btn_buscarprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarprActionPerformed
    // Por medio de este boton, el usuario podra buscar el numero de productos que hay disponibles de cierta mercancia
        Buscar_producto bp = new Buscar_producto(); // Creacion del objeto para ejeecutar la accion
        bp.setVisible(true); //Este comando lo que hace es abrir la ventana que tiene guardada la variable en la linea de comando anterior
        dispose(); // Este comando permite cerrar la ventana en la cual se ejecuta la accion
    }//GEN-LAST:event_btn_buscarprActionPerformed

    private void btn_nuevoprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoprActionPerformed
    // Por medio de este boton, se ingresara un producto nuevo  
        Productos p = new Productos(); // Creacion del objeto para ejeecutar la accion
        p.setVisible(true); //Este comando lo que hace es abrir la ventana que tiene guardada la variable en la linea de comando anterior
        dispose(); // Este comando permite cerrar la ventana en la cual se ejecuta la accion
    }//GEN-LAST:event_btn_nuevoprActionPerformed

    private void btn_crearusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearusuActionPerformed
    // Por medio de este boton, Se podra crear otro usuario, el cual podra entrar al sistema
        Crear_usuario crearus = new Crear_usuario(); // Creacion del objeto para ejeecutar la accion
        crearus.setVisible(true); //Este comando lo que hace es abrir la ventana que tiene guardada la variable en la linea de comando anterior
        dispose(); // Este comando permite cerrar la ventana en la cual se ejecuta la accion
    }//GEN-LAST:event_btn_crearusuActionPerformed

    private void btn_editusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editusuActionPerformed
    // Por medio de este boton, se podra eliminar o corregir algun usuario dentro del sistema 
        Editar_usuario editus = new Editar_usuario(); // Creacion del objeto para ejeecutar la accion
        editus.setVisible(true); //Este comando lo que hace es abrir la ventana que tiene guardada la variable en la linea de comando anterior
        dispose(); // Este comando permite cerrar la ventana en la cual se ejecuta la accion
    }//GEN-LAST:event_btn_editusuActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
    // Por medio de este boton, se cerrara el programa
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed
  
   
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acerca;
    private javax.swing.JButton btn_buscarpr;
    private javax.swing.JButton btn_cerrarsesi;
    private javax.swing.JButton btn_crearusu;
    private javax.swing.JButton btn_editusu;
    private javax.swing.JButton btn_listProd;
    private javax.swing.JButton btn_nuevopr;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
