/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradormodelosysimulacion;

import java.util.ArrayList;



/**
 *
 * @author Arrieta - Acosta
 */
public class InterfaceMenu extends javax.swing.JFrame {

    private int nroExperimento;
    public DatosFinales datFinales;

    /**
     * Creates new form InterfaceMenu
     */
    //Cnstructor
    public InterfaceMenu() {
        initComponents();
        botonResumenFinal.setEnabled(false);
        nroExperimento = 0;
        datFinales = new DatosFinales();
    }
    
    //sirve para calcular el promedio de espera en la cola y de tiempo de ocio
    private double CalcularPromedio(double acumulado, int total){
        return acumulado / total;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextnroclientes = new javax.swing.JTextField();
        jTextSemilla = new javax.swing.JTextField();
        jTextMediaServicio = new javax.swing.JTextField();
        jTextMediaLlegada = new javax.swing.JTextField();
        jTextCantidadServidores = new javax.swing.JTextField();
        botonEjecutar = new javax.swing.JButton();
        botonResumenFinal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Número de personas a simular:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Introduzca una semillla: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Media de Tiempo de Servicio:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Media de Tiempo de llegada de Personas: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad de Casillas de control  habilitadas:");

        jTextnroclientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextnroclientes.setText("1600");

        jTextSemilla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextSemilla.setText("153");

        jTextMediaServicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextMediaServicio.setText("30");

        jTextMediaLlegada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextMediaLlegada.setText("5");

        jTextCantidadServidores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextCantidadServidores.setText("4");

        botonEjecutar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonEjecutar.setText("Ejecutar");
        botonEjecutar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEjecutarActionPerformed(evt);
            }
        });

        botonResumenFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonResumenFinal.setText("Mostrar Resumen Final");
        botonResumenFinal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonResumenFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResumenFinalActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modelo De Colas");

        jLabel7.setFont(new java.awt.Font("Edwardian Script ITC", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Control de Migracion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(608, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextnroclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextMediaLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jTextCantidadServidores, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jTextMediaServicio)
                                    .addComponent(jTextSemilla))))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonResumenFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(botonEjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextnroclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextMediaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextMediaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonResumenFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextCantidadServidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Accion del boton ejecutar, crea un experimento
    private void botonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEjecutarActionPerformed
        // TODO add your handling code here:
        
        //Guarda los valores de los textBox
        nroExperimento =  nroExperimento + 1;
        botonResumenFinal.setEnabled(true);
        int nroClientes = Integer.parseInt(jTextnroclientes.getText());
        int semilla = Integer.parseInt(jTextSemilla.getText());
        int mediaServicios = Integer.parseInt(jTextMediaServicio.getText());
        int mediaLlegada  = Integer.parseInt(jTextMediaLlegada.getText());
        int cantServidores  = Integer.parseInt(jTextCantidadServidores.getText());
       
        //divido la cola en la cantidad de servidores disponibles que existe
        ArrayList<Integer> Contadores = new ArrayList<Integer>();
        int auxNroClientes = nroClientes;
        int cos = (int) (auxNroClientes / cantServidores);
       
        //divide equitativamente en cada caja el numero de clientes
        if((auxNroClientes % cantServidores)>0){
            cos = cos + 1;
        }
        
        for(int i=0; i< cantServidores; i++){

           if(auxNroClientes > cos){
               Contadores.add(cos);
           }else{
               Contadores.add(auxNroClientes);
           }
           auxNroClientes = auxNroClientes - cos;
        }
        
        //Control de cantidad etapa testing
        System.out.print("Valores de cada muestra a instanciar: ");
        for (int item : Contadores){
            System.out.print(item + " ; ");
        }


        //Variables de resguardo
        ArrayList res;
        int acumOcio = 0;
        double ultLlegadaTime = 0.0;
        int acumEsperaCola = 0;
        double ultSalidaTime = 0.0;
        int acumNroClientesCola = 0;
        
        
        //una instancia por caja habilitada
        for (int item : Contadores){
            Datos unDato = new Datos();
            ArrayList<Integer> tiempo_llegada = unDato.cargarModeloPoisson(item, mediaLlegada);
            ArrayList<Double> tiempo_servicio = unDato.cargarModeloExponencial(item,semilla, mediaServicios);
            
            ModeloDeColas unmodelo = new ModeloDeColas(item, nroExperimento);
            
            //res: tiene los valores de los calculos de tabla resumen del experimento
            res = unmodelo.ejecutar(tiempo_servicio, tiempo_llegada, nroExperimento);

            acumOcio = acumOcio + (Integer) res.get(0);
            if(ultLlegadaTime < (Double) res.get(1)){
                ultLlegadaTime = (Double) res.get(1);
            }
            
            acumEsperaCola = acumEsperaCola + (Integer) res.get(2);
            if(ultSalidaTime < (Double) res.get(3)){
                ultSalidaTime = (Double) res.get(3); 
            }
            acumNroClientesCola = acumNroClientesCola + (Integer) res.get(4);   
            
        }    
        
        //Guarda los datos del experimento para un Resumen Final de la Simulacion
        this.datFinales.FinalNroExperimento.add(nroExperimento);
        this.datFinales.FinalNroClientes.add(nroClientes);
        this.datFinales.FinalMediaServicios.add(mediaServicios);
        this.datFinales.FinalMediaLlegada.add(mediaLlegada);
        this.datFinales.FinalCantServidores.add(cantServidores);

        this.datFinales.FinalocioTime.add(acumOcio);
        this.datFinales.FinalLlegadaTime.add(ultLlegadaTime);
        this.datFinales.FinalEsperaColaTime.add(acumEsperaCola);
        this.datFinales.FinalSalidaTime.add(ultSalidaTime);
        this.datFinales.FinalNumeroClienteCola.add(acumNroClientesCola);
        this.datFinales.ocioPromedio.add(this.CalcularPromedio(acumOcio, nroClientes));
        this.datFinales.esperaColaPromedio.add(this.CalcularPromedio(acumEsperaCola, nroClientes));
        
             
    }//GEN-LAST:event_botonEjecutarActionPerformed

    private void botonResumenFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResumenFinalActionPerformed
        // TODO add your handling code here:
        //muestro tabla con grafico de resultados
        ResumenFinal unaSimulacion = new ResumenFinal();
        unaSimulacion.cargarTabla(datFinales);
        
    }//GEN-LAST:event_botonResumenFinalActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        //Salir
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InterfaceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InterfaceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InterfaceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InterfaceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InterfaceMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEjecutar;
    private javax.swing.JButton botonResumenFinal;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCantidadServidores;
    private javax.swing.JTextField jTextMediaLlegada;
    private javax.swing.JTextField jTextMediaServicio;
    private javax.swing.JTextField jTextSemilla;
    private javax.swing.JTextField jTextnroclientes;
    // End of variables declaration//GEN-END:variables
}
