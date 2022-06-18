
import database.Dba;
import static java.lang.Math.random;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Frame extends javax.swing.JFrame {

    static Random random = new Random();
    /**
     * Creates new form Frame
     */
    public Frame() {
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

        CrearCarpetaFrame = new javax.swing.JDialog();
        NombreCarpetaLabel = new javax.swing.JLabel();
        NombreCarpetaTextField = new javax.swing.JTextField();
        CrearCarpetaButton = new javax.swing.JButton();
        CrearArchivoFrame = new javax.swing.JDialog();
        NombreArchivoLabel = new javax.swing.JLabel();
        NombreArchivoTextField = new javax.swing.JTextField();
        ExtensionLabel = new javax.swing.JLabel();
        ExtensionComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        TamanoField = new javax.swing.JTextField();
        MB = new javax.swing.JLabel();
        CrearArchivoButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Checkbox_pertenece_a_carpeta = new javax.swing.JCheckBox();
        LinkProgressBar = new javax.swing.JProgressBar();
        ListScrollPane = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        MenuBar = new javax.swing.JMenuBar();
        Archivos = new javax.swing.JMenu();
        MiUnidad = new javax.swing.JMenuItem();
        Destacados = new javax.swing.JMenuItem();
        Papelera = new javax.swing.JMenuItem();
        Agregar = new javax.swing.JMenu();
        AgregarCarpeta = new javax.swing.JMenuItem();
        AgregarArchivo = new javax.swing.JMenuItem();

        NombreCarpetaLabel.setText("Nombre de la Carpeta");

        CrearCarpetaButton.setText("Crear Carpeta");
        CrearCarpetaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearCarpetaButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CrearCarpetaFrameLayout = new javax.swing.GroupLayout(CrearCarpetaFrame.getContentPane());
        CrearCarpetaFrame.getContentPane().setLayout(CrearCarpetaFrameLayout);
        CrearCarpetaFrameLayout.setHorizontalGroup(
            CrearCarpetaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCarpetaFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearCarpetaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CrearCarpetaButton)
                    .addGroup(CrearCarpetaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NombreCarpetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombreCarpetaLabel)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        CrearCarpetaFrameLayout.setVerticalGroup(
            CrearCarpetaFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearCarpetaFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreCarpetaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreCarpetaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(CrearCarpetaButton)
                .addContainerGap())
        );

        NombreArchivoLabel.setText("Nombre del Archivo");

        ExtensionLabel.setText("Extensión");

        ExtensionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".pdf", ".txt", ".docx", ".jpg", ".mp4" }));

        jLabel1.setText("Tamaño");

        MB.setText("MB");

        CrearArchivoButton.setText("Crear Archivo");
        CrearArchivoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearArchivoButtonMouseClicked(evt);
            }
        });

        jLabel4.setText("Pertenece a alguna carpeta:");

        Checkbox_pertenece_a_carpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checkbox_pertenece_a_carpetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CrearArchivoFrameLayout = new javax.swing.GroupLayout(CrearArchivoFrame.getContentPane());
        CrearArchivoFrame.getContentPane().setLayout(CrearArchivoFrameLayout);
        CrearArchivoFrameLayout.setHorizontalGroup(
            CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrearArchivoFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreArchivoLabel)
                    .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CrearArchivoFrameLayout.createSequentialGroup()
                            .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CrearArchivoFrameLayout.createSequentialGroup()
                                    .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ExtensionLabel)
                                        .addComponent(ExtensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(CrearArchivoFrameLayout.createSequentialGroup()
                                            .addComponent(TamanoField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(MB))
                                        .addComponent(jLabel1)))
                                .addGroup(CrearArchivoFrameLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Checkbox_pertenece_a_carpeta)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrearArchivoButton))
                        .addComponent(NombreArchivoTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CrearArchivoFrameLayout.setVerticalGroup(
            CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearArchivoFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CrearArchivoFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CrearArchivoButton))
                    .addGroup(CrearArchivoFrameLayout.createSequentialGroup()
                        .addComponent(NombreArchivoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreArchivoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExtensionLabel)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExtensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TamanoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(CrearArchivoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Checkbox_pertenece_a_carpeta)
                            .addComponent(jLabel4))))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        List.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "testing" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListScrollPane.setViewportView(List);

        jLabel2.setText("Descarga Individual");

        jLabel3.setText("Descarga Total");

        Archivos.setText("Archivos");
        Archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivosActionPerformed(evt);
            }
        });

        MiUnidad.setText("Mi Unidad");
        MiUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiUnidadActionPerformed(evt);
            }
        });
        Archivos.add(MiUnidad);

        Destacados.setText("Destacados");
        Destacados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestacadosActionPerformed(evt);
            }
        });
        Archivos.add(Destacados);

        Papelera.setText("Papelera");
        Papelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PapeleraActionPerformed(evt);
            }
        });
        Archivos.add(Papelera);

        Agregar.setText("Agregar");

        AgregarCarpeta.setText("Carpeta");
        AgregarCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCarpetaActionPerformed(evt);
            }
        });
        Agregar.add(AgregarCarpeta);

        AgregarArchivo.setText("Archivo");
        AgregarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarArchivoActionPerformed(evt);
            }
        });
        Agregar.add(AgregarArchivo);

        Archivos.add(Agregar);

        MenuBar.add(Archivos);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LinkProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LinkProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiUnidadActionPerformed
        Opcion = "Mi Unidad";
    }//GEN-LAST:event_MiUnidadActionPerformed

    private void DestacadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestacadosActionPerformed
        Opcion = "Destacados";
    }//GEN-LAST:event_DestacadosActionPerformed

    private void PapeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PapeleraActionPerformed
        Opcion = "Papelera";
    }//GEN-LAST:event_PapeleraActionPerformed

    private void AgregarCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCarpetaActionPerformed
        CrearCarpetaFrame.setModal(true);
        CrearCarpetaFrame.pack();
        CrearCarpetaFrame.setLocationRelativeTo(this);
        CrearCarpetaFrame.setVisible(true);
    }//GEN-LAST:event_AgregarCarpetaActionPerformed

    private void AgregarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarArchivoActionPerformed
        CrearArchivoFrame.setModal(true);
        CrearArchivoFrame.pack();
        CrearArchivoFrame.setLocationRelativeTo(this);
        CrearArchivoFrame.setVisible(true);
    }//GEN-LAST:event_AgregarArchivoActionPerformed

    private void ArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivosActionPerformed

    }//GEN-LAST:event_ArchivosActionPerformed

    private void CrearCarpetaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearCarpetaButtonMouseClicked
        String Link = "dive.google.com/" + NombreCarpetaTextField.getText() + "/";
        int cont = 0;
        while (cont <= 5) {
            int numero = 65 + random.nextInt(57);
            Link = Link + (char)numero;
            cont++;
        }
        System.out.println(Link);
        //        Carpeta file = new Carpeta(NombreCarpetaTextField.getText(), Link, Carpetas, Archivos);
    }//GEN-LAST:event_CrearCarpetaButtonMouseClicked

    private void CrearArchivoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearArchivoButtonMouseClicked
        try {
            String nombre;
            String extension;
            int tamano;
            boolean pertenece;
            String link;
            Date fecha = new Date();
            String fechacreacion = fecha.toString();
            
            nombre= NombreArchivoTextField.getText();
            extension = ExtensionComboBox.getSelectedItem().toString();
            tamano = Integer.parseInt(TamanoField.getText());
            
            if (Checkbox_pertenece_a_carpeta.isSelected()) {
                pertenece = true;
            }else{
                pertenece = false;
            }
            
            link = CrearLink();
            
            Archivo archivo = new Archivo(nombre, link, extension, tamano, fechacreacion, pertenece);
            
            AgregarBaseArchivo(archivo);
        } catch (SQLException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearArchivoButtonMouseClicked

    private void Checkbox_pertenece_a_carpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checkbox_pertenece_a_carpetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Checkbox_pertenece_a_carpetaActionPerformed

    
    public void AgregarBaseArchivo(Archivo a) throws SQLException{
        
        //En la tabla de archivos, se almacenará: Nombre de
//        archivo, peso, fecha de creación y si pertenece o no a una carpeta.
        String base = "./Base.accdb";
        Dba db = new Dba(base);
        db.conectar();
        int peso;
        String nombre;
        String fecha_creacion = "";
        String fechacreate= fecha_creacion.toString();
        System.out.println(fechacreate);
        boolean pertenece;
        nombre = a.getNombre();
        peso = a.getTamano();
        fecha_creacion = a.getFechaCreacion();
        pertenece = a.isPertenece();
        db.query.execute("INSERT INTO Archivos"
                + " (Nombre,Fecha_de_creacion,Pertenece_a_una_carpeta,Peso)"
                + " VALUES ('" + nombre + "', '" + fecha_creacion + "', '" + pertenece + "', '" + peso + "')");
        //+ " VALUES ('" + c + "', '" + n + "')");
        db.commit();
        System.out.println("fin");
        db.desconectar();
    }
    
    public String CrearLink(){
        String Link = "dive.google.com/" + NombreCarpetaTextField.getText() + "/";
        int cont = 0;
        while (cont <= 5) {
            int numero = 65 + random.nextInt(57);
            Link = Link + (char)numero;
            cont++;
        }
        
        return Link;
    }
    
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Agregar;
    private javax.swing.JMenuItem AgregarArchivo;
    private javax.swing.JMenuItem AgregarCarpeta;
    private javax.swing.JMenu Archivos;
    private javax.swing.JCheckBox Checkbox_pertenece_a_carpeta;
    private javax.swing.JButton CrearArchivoButton;
    private javax.swing.JDialog CrearArchivoFrame;
    private javax.swing.JButton CrearCarpetaButton;
    private javax.swing.JDialog CrearCarpetaFrame;
    private javax.swing.JMenuItem Destacados;
    private javax.swing.JComboBox<String> ExtensionComboBox;
    private javax.swing.JLabel ExtensionLabel;
    private javax.swing.JProgressBar LinkProgressBar;
    private javax.swing.JList<String> List;
    private javax.swing.JScrollPane ListScrollPane;
    private javax.swing.JLabel MB;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MiUnidad;
    private javax.swing.JLabel NombreArchivoLabel;
    private javax.swing.JTextField NombreArchivoTextField;
    private javax.swing.JLabel NombreCarpetaLabel;
    private javax.swing.JTextField NombreCarpetaTextField;
    private javax.swing.JMenuItem Papelera;
    private javax.swing.JTextField TamanoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
    String Opcion;
}
