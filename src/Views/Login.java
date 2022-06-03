package Views;
import javax.swing.JOptionPane;
import Controller.AcessoBD;
import Controller.CadastroBD;
import java.util.HashSet;
public class Login extends javax.swing.JFrame {
    
    private Cadastrar cad;
    private TelaAdmin Tadm;
    private TelaUsuario Tuser;
    public Login() {
        
        initComponents();
        cad = new Cadastrar();
        Tadm = new TelaAdmin();
        Tuser = new TelaUsuario();
             
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        btesqueciSenha = new javax.swing.JButton();
        btLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela inicial");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 204, 204));
        setLocation(new java.awt.Point(350, 125));
        setMaximumSize(new java.awt.Dimension(800, 543));
        setMinimumSize(new java.awt.Dimension(800, 543));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btCadastrar.setBackground(new java.awt.Color(75, 169, 255));
        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botão Cadastre-se.png"))); // NOI18N
        btCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadastrarMouseClicked(evt);
            }
        });
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 180, 39));

        campoLogin.setBackground(new java.awt.Color(233, 233, 235));
        campoLogin.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        campoLogin.setBorder(null);
        campoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoLogin.setSelectionColor(new java.awt.Color(255, 255, 255));
        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(campoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 340, 30));

        campoSenha.setBackground(new java.awt.Color(229, 229, 229));
        campoSenha.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        campoSenha.setBorder(null);
        campoSenha.setSelectionColor(new java.awt.Color(255, 255, 255));
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 370, 40));

        btesqueciSenha.setBackground(new java.awt.Color(255, 255, 255));
        btesqueciSenha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btesqueciSenha.setForeground(new java.awt.Color(11, 42, 119));
        btesqueciSenha.setText("Esqueci minha senha");
        btesqueciSenha.setBorder(null);
        btesqueciSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btesqueciSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btesqueciSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        btLogin.setBackground(new java.awt.Color(255, 255, 255));
        btLogin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btLogin.setForeground(new java.awt.Color(102, 255, 102));
        btLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botão Entrar.png"))); // NOI18N
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaLogin.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 543));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 543));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 800, 543));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btesqueciSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btesqueciSenhaActionPerformed
        JOptionPane.showMessageDialog(null, "CONTATE UM ADMINISTRADOR", "Erro", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_btesqueciSenhaActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLoginActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cad = new Cadastrar();
        cad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarMouseClicked

    }//GEN-LAST:event_btCadastrarMouseClicked

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        String email;
        String senha;
        CadastroBD cadastro = new CadastroBD();
        AcessoBD acesso = new AcessoBD();
        Model.Login login = new Model.Login();
             
        email = campoLogin.getText();
        senha = campoSenha.getText();      
               
        login.setEmail(email);
        login.setSenha(senha);

        if(acesso.verificaAcesso(login) == true)
        {
            Tadm.setVisible(true);
            this.dispose();
        }
        else if(acesso.verificaAcessoUser(login) == true) {
            Tuser.setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Email ou senha incorreta", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btLoginActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btesqueciSenha;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
