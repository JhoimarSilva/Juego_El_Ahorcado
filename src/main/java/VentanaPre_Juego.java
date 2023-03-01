
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author JHOIMAR
 */
public class VentanaPre_Juego extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPre_Juego
     */
    public VentanaPre_Juego() {
        initComponents();
        setSize(500, 500); //Defne el ancho y la altura
        setLocationRelativeTo(null); //Coloca el jframe en el centro
        setResizable(false); // No permine modificar el tamaño de la ventana
        setMinimumSize(new Dimension(500,500)); //Estable el tamaño minimo
        getContentPane().setBackground(Color.orange); //Establece un color en el panel
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Deja de ejecutar la aplicación
        setTitle("JUEGO EL AHORCADO");
    }
    
    int i = 0;
    String nombres [] = new String[100];
    
    public void EscogerCategoria(){
        if(btnDeportes.isSelected()){
            System.out.println("Se escogio esta categoria");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnJugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TFNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnDeportes = new javax.swing.JButton();
        btnPaises = new javax.swing.JButton();
        btnAnimales = new javax.swing.JButton();
        btnColores = new javax.swing.JButton();
        btnFrutas = new javax.swing.JButton();
        btnVerduras = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(192, 89, 13));
        jPanel1.setLayout(null);

        btnJugar.setBackground(new java.awt.Color(0, 0, 0));
        btnJugar.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("JUGAR");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        jPanel1.add(btnJugar);
        btnJugar.setBounds(180, 360, 140, 50);

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESE SU NOMBRE:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 220, 40);

        TFNombres.setBackground(new java.awt.Color(255, 255, 255));
        TFNombres.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        jPanel1.add(TFNombres);
        TFNombres.setBounds(230, 10, 250, 40);

        jLabel2.setFont(new java.awt.Font("Jokerman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ESCOJA UNA TEMATICA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 90, 340, 50);

        btnDeportes.setBackground(new java.awt.Color(0, 0, 0));
        btnDeportes.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btnDeportes.setForeground(new java.awt.Color(255, 255, 255));
        btnDeportes.setText("DEPORTES");
        btnDeportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeportes);
        btnDeportes.setBounds(20, 170, 130, 60);

        btnPaises.setBackground(new java.awt.Color(0, 0, 0));
        btnPaises.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btnPaises.setForeground(new java.awt.Color(255, 255, 255));
        btnPaises.setText("PAISES");
        jPanel1.add(btnPaises);
        btnPaises.setBounds(180, 170, 130, 60);

        btnAnimales.setBackground(new java.awt.Color(0, 0, 0));
        btnAnimales.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btnAnimales.setForeground(new java.awt.Color(255, 255, 255));
        btnAnimales.setText("ANIMALES");
        jPanel1.add(btnAnimales);
        btnAnimales.setBounds(340, 170, 120, 60);

        btnColores.setBackground(new java.awt.Color(0, 0, 0));
        btnColores.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btnColores.setForeground(new java.awt.Color(255, 255, 255));
        btnColores.setText("COLORES");
        jPanel1.add(btnColores);
        btnColores.setBounds(20, 260, 130, 60);

        btnFrutas.setBackground(new java.awt.Color(0, 0, 0));
        btnFrutas.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btnFrutas.setForeground(new java.awt.Color(255, 255, 255));
        btnFrutas.setText("FRUTAS");
        jPanel1.add(btnFrutas);
        btnFrutas.setBounds(180, 260, 130, 60);

        btnVerduras.setBackground(new java.awt.Color(0, 0, 0));
        btnVerduras.setFont(new java.awt.Font("Jokerman", 1, 14)); // NOI18N
        btnVerduras.setForeground(new java.awt.Color(255, 255, 255));
        btnVerduras.setText("VERDURAS");
        jPanel1.add(btnVerduras);
        btnVerduras.setBounds(340, 260, 120, 60);

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Jokerman", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(30, 420, 110, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        //Atras
        
        V1 a = new V1();
        a.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // Jugar
        String nombreGuardado = TFNombres.getText();
        nombres [i] = nombreGuardado;
        i++;
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombreGuardado + " la modalidad que escogio fue: ");
        EscogerCategoria();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnDeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeportesActionPerformed
        //Seleccionar boton
        if(btnDeportes.isSelected()){
            System.out.println("Se escogio esta categoria");
        }
    }//GEN-LAST:event_btnDeportesActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPre_Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFNombres;
    private javax.swing.JButton btnAnimales;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnColores;
    private javax.swing.JButton btnDeportes;
    private javax.swing.JButton btnFrutas;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnPaises;
    private javax.swing.JButton btnVerduras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
