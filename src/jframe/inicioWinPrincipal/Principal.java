package jframe.inicioWinPrincipal;

import jframe.menuPrincipal.Backup;
import jframe.menuPrincipal.date;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo_Senorans
 */
public final class Principal extends javax.swing.JFrame {

    Backup Backup = new Backup();
    date date = new date();
    String user = System.getProperty("user.name");
    File fileUser = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\user.csv");
    File fileEntradaUser = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\userEntrada.csv");
    File crearFichero = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros");

    public Principal() {
        initComponents();
        ficheroApp();
        this.setTitle("Login Control Usuarios");
        this.setLocationRelativeTo(Principal.this);
        setIconImage(new ImageIcon(getClass().getResource("/img/IconoJFrame.png")).getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        CrearFichero();
        Backup.ficheroApp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        btnVerPass = new javax.swing.JCheckBox();
        btnEntrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNomUser = new javax.swing.JTextField();
        labelUser = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelFondo.setBackground(new java.awt.Color(243, 233, 147));

        labelTitulo.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Control Usuarios");

        btnVerPass.setBackground(new java.awt.Color(243, 233, 147));
        btnVerPass.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnVerPass.setForeground(new java.awt.Color(0, 0, 255));
        btnVerPass.setText("Ver contraseñas");
        btnVerPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVerPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVerPass.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVerPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPassActionPerformed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(0, 0, 255));
        btnEntrar.setMnemonic('e');
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnEntrarKeyReleased(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 255));
        btnSalir.setMnemonic('s');
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnSalirKeyReleased(evt);
            }
        });

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        labelLogo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));

        txtNomUser.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txtNomUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelUser.setBackground(new java.awt.Color(243, 233, 147));
        labelUser.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        labelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUser.setText("Usuario:");
        labelUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelPass.setBackground(new java.awt.Color(243, 233, 147));
        labelPass.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        labelPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPass.setText("Contraseña:");
        labelPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPass.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setToolTipText("");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(labelLogo))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVerPass, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ficheroApp() {
        if (!fileUser.exists()) {
           JOptionPane.showMessageDialog(null, "\nHay un error en los fichero\nhable con el administrador.");
        }
    }

    public void CrearFichero() {
        File directorio = new File("C:\\Users\\" + user + "\\Documents\\NetBeansProjects\\JFrame\\src\\file\\Ficheros");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
            }
        }
    }

    public void GuardarEntrada() {
        String line2;
        int i = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileEntradaUser));
            while ((line2 = br.readLine()) != null) {
                i++;
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "\nError: " + e);
        }
        String line;
        int d = 0;
        try {
            BufferedWriter bw = null;
            br = new BufferedReader(new FileReader(fileUser));
            bw = new BufferedWriter(new FileWriter(fileEntradaUser, true));
            while ((line = br.readLine()) != null) {
                String[] cod_tar = line.split(";");
                if (cod_tar[1].equalsIgnoreCase(txtNomUser.getText())) {
                    d++;
                    String fecha = date.fecha();
                    bw.write(fecha + ';' + cod_tar[1] + ';' + i + "\n");
                }
            }
            bw.flush();
            br.close();
            bw.close();
            if (d == 0) {
                JOptionPane.showMessageDialog(null, "\nNo se encuentran datos para\nrealizar la entrada.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "\nError: " + e);
        }
    }

    public void entrarUser() {
        String pass = new String(txtPass.getPassword());
        if (txtNomUser.getText().equals("") && pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Tiene que rellenar los\ncampos antes de pulsar Entrar");
        } else if (txtNomUser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El usuario está vacio,\nescriba el nombre de usuario");
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "La contraseña está vacia,"
                    + "\nescriba la contraseña del usuario"
                    + "\n" + txtNomUser.getText()
                    + "\npara poder entrar");
        } else {
            BufferedReader br = null;
            String line;
            int i = 0;
            try {
                br = new BufferedReader(new FileReader(fileUser));
                while ((line = br.readLine()) != null) {
                    String[] nombreUserFile = line.split(";");
                    String[] passFile = line.split(";");
                    if ((nombreUserFile[1].equals(txtNomUser.getText()) && passFile[2].equals(pass))
                            && nombreUserFile[0].equals("user")) {
                        i++;
                        new InicioWin().setVisible(true);
                        dispose();
                    } else if ((nombreUserFile[1].equals(txtNomUser.getText()) && passFile[2].equals(pass))
                            && !nombreUserFile[0].equals("user")) {
                        i++;
                        new InicioWinUserN().setVisible(true);
                        dispose();

                    }
                }
                br.close();
                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "El usuario "
                            + txtNomUser.getText()
                            + "\nno existe o la contraseña"
                            + " es incorrecta."
                            + "\n\nSi no tiene usuario"
                            + "\nhable con el administrador"
                            + "\npara que le proporcione uno.");
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al leer el fichero");
            }
        }
    }

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        GuardarEntrada();
        entrarUser();
        ficheroApp();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
        ficheroApp();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPassActionPerformed
        if (btnVerPass.isSelected()) {
            txtPass.setEchoChar((char) 0);
        } else {
            txtPass.setEchoChar('*');
        }
    }//GEN-LAST:event_btnVerPassActionPerformed

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            GuardarEntrada();
            entrarUser();
            ficheroApp();
        }

    }//GEN-LAST:event_txtPassKeyReleased

    private void btnEntrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarUser();
            ficheroApp();
        }
    }//GEN-LAST:event_btnEntrarKeyReleased

    private void btnSalirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirKeyReleased
        System.exit(0);
        CrearFichero();
        ficheroApp();
    }//GEN-LAST:event_btnSalirKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox btnVerPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtNomUser;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
