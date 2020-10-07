
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_acerca))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_crearusu)
                            .addComponent(btn_editusu)
                            .addComponent(btn_cerrarsesi))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_listProd)
                            .addComponent(btn_buscarpr)
                            .addComponent(btn_nuevopr))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editusu)
                    .addComponent(btn_nuevopr))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_crearusu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscarpr)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_listProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_acerca)
                            .addComponent(btn_salir)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cerrarsesi)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        pack();
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
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
