package Views;
import javax.swing.JOptionPane;
import Controller.AcessoBD;
import Controller.CadastroADM_BD;
import Model.Adm;
import Model.Usuarios;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Controller.Conexao;
import Controller.CadastroBD;


       
public class TelaAdmin extends javax.swing.JFrame {
    private String nome, email, senha;
    private Login hm; 
    
    public void Listar(){
        Conexao obj = new Conexao();
        List<Usuarios> Users = obj.listarUsers();
        DefaultTableModel dado = (DefaultTableModel) tabelaUsers.getModel();
        dado.setNumRows(0);
        
        for(Usuarios cont : Users) {
            dado.addRow(new Object[]{
                cont.getId(),
                cont.getNome(),
                cont.getCpf(),
                cont.getEmail(),
                cont.getSenha()
            });
        }
    }
    public void ListarAdmin(){
        Conexao obj = new Conexao();
        List<Adm> Adm = obj.listarAdmin();
        DefaultTableModel dado = (DefaultTableModel) tbAdmin.getModel();
        dado.setNumRows(0);
        
        for(Adm cont : Adm) {
            dado.addRow(new Object[]{
                cont.getIdAdm(),
                cont.getNome(),
                cont.getEmail(),
                cont.getSenha()
            });
        }
    }
     public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) tbAdmin.getModel();
        modelo.setNumRows(0);
        Usuarios obj = new Usuarios();
        Conexao obje = new Conexao();

        for (Usuarios u : obje.listarUsers()){

            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getCpf(),
                u.getEmail(),
                u.getSenha()
            });

        }
     }    
        
 
    public TelaAdmin() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Acervo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Emprestimos = new javax.swing.JPanel();
        Users = new javax.swing.JPanel();
        btConsultar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsers = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CadastroAdmin = new javax.swing.JPanel();
        campoSenhaAdm = new javax.swing.JPasswordField();
        campoEmailAdm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        campoNomeAdm = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAdmin = new javax.swing.JTable();
        btListAdmin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(189, 208, 255));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        Acervo.setBackground(new java.awt.Color(251, 251, 251));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela Acervo - adm.png"))); // NOI18N

        javax.swing.GroupLayout AcervoLayout = new javax.swing.GroupLayout(Acervo);
        Acervo.setLayout(AcervoLayout);
        AcervoLayout.setHorizontalGroup(
            AcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcervoLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AcervoLayout.setVerticalGroup(
            AcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcervoLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Acervo", Acervo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Reservas", jPanel1);

        Emprestimos.setBackground(new java.awt.Color(251, 251, 251));

        javax.swing.GroupLayout EmprestimosLayout = new javax.swing.GroupLayout(Emprestimos);
        Emprestimos.setLayout(EmprestimosLayout);
        EmprestimosLayout.setHorizontalGroup(
            EmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        EmprestimosLayout.setVerticalGroup(
            EmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Empréstimos", Emprestimos);

        Users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        Users.add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 126, 32));

        jButton4.setText("EXCLUIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Users.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 126, 32));

        tabelaUsers.setBackground(new java.awt.Color(225, 231, 246));
        tabelaUsers.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tabelaUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idUsuario", "Nome", "CPF", "Email", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsers.setGridColor(new java.awt.Color(0, 51, 153));
        tabelaUsers.setPreferredSize(new java.awt.Dimension(370, 80));
        tabelaUsers.setSelectionForeground(new java.awt.Color(102, 255, 51));
        tabelaUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsers);

        Users.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 720, 180));

        jButton5.setText("EDITAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Users.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 126, 32));

        txtNome.setBackground(new java.awt.Color(229, 229, 229));
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        Users.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 53, 453, 22));

        txtCpf.setBackground(new java.awt.Color(229, 229, 229));
        txtCpf.setBorder(null);
        Users.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 53, 203, 20));

        txtEmail.setBackground(new java.awt.Color(229, 229, 229));
        txtEmail.setBorder(null);
        Users.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 116, 453, 20));

        txtSenha.setBackground(new java.awt.Color(229, 229, 229));
        txtSenha.setBorder(null);
        Users.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 116, 203, 20));

        jButton3.setBackground(new java.awt.Color(178, 200, 255));
        jButton3.setText("PESQUISAR");
        jButton3.setToolTipText("");
        jButton3.setBorder(null);
        jButton3.setMaximumSize(new java.awt.Dimension(80, 20));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Users.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 90, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela user - adm.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        Users.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 507));

        jTabbedPane2.addTab("Usuários", Users);

        CadastroAdmin.setBackground(new java.awt.Color(251, 251, 251));
        CadastroAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoSenhaAdm.setBackground(new java.awt.Color(229, 229, 229));
        campoSenhaAdm.setBorder(null);
        campoSenhaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaAdmActionPerformed(evt);
            }
        });
        CadastroAdmin.add(campoSenhaAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 480, 20));

        campoEmailAdm.setBackground(new java.awt.Color(229, 229, 229));
        campoEmailAdm.setBorder(null);
        campoEmailAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailAdmActionPerformed(evt);
            }
        });
        CadastroAdmin.add(campoEmailAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 130, -1));

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        CadastroAdmin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CadastroAdmin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, -1, -1));

        campoNomeAdm.setBackground(new java.awt.Color(229, 229, 229));
        campoNomeAdm.setBorder(null);
        CadastroAdmin.add(campoNomeAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 306, 20));

        tbAdmin.setBackground(new java.awt.Color(225, 231, 246));
        tbAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idAdmin", "nome", "email", "senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbAdmin);

        CadastroAdmin.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 727, 740, 175));

        btListAdmin.setText("CONSULTAR");
        btListAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListAdminActionPerformed(evt);
            }
        });
        CadastroAdmin.add(btListAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 920, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela adm - adm.png"))); // NOI18N
        CadastroAdmin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        jTabbedPane2.addTab("Administradores", CadastroAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked

    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Adm adm = new Adm();
        CadastroADM_BD CadastroADM_BD = new CadastroADM_BD();

        nome = campoNomeAdm.getText();
        email = campoEmailAdm.getText();
        senha = campoSenhaAdm.getText();

        adm.setNome(nome);
        adm.setEmail(email);
        adm.setSenha(senha);

        if(CadastroADM_BD.inserirAdm(adm) == true)
        {
            JOptionPane.showMessageDialog(null, "Você foi cadastrado com sucesso!!!", "Cadastro",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro no cadastro", "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoEmailAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailAdmActionPerformed

    }//GEN-LAST:event_campoEmailAdmActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hm = new Login();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        Listar();    // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btListAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListAdminActionPerformed
    ListarAdmin();      // TODO add your handling code here:
    }//GEN-LAST:event_btListAdminActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void tabelaUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsersMouseClicked
      if(tabelaUsers.getSelectedRow()!=-1){
         
          txtNome.setText(tabelaUsers.getValueAt(tabelaUsers.getSelectedRow(), 1).toString());
          txtCpf.setText(tabelaUsers.getValueAt(tabelaUsers.getSelectedRow(), 2).toString());
          txtEmail.setText(tabelaUsers.getValueAt(tabelaUsers.getSelectedRow(), 3).toString());
          txtSenha.setText(tabelaUsers.getValueAt(tabelaUsers.getSelectedRow(), 4).toString());
          
      }
          
    }//GEN-LAST:event_tabelaUsersMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         if (tabelaUsers.getSelectedRow() != -1) {

            Usuarios p = new Usuarios();
            CadastroBD cad = new CadastroBD();

            p.setNome(txtNome.getText());
            p.setCpf(txtCpf.getText());
            p.setEmail(txtEmail.getText());
            p.setSenha(txtSenha.getText());
           
            p.setId((int) tabelaUsers.getValueAt(tabelaUsers.getSelectedRow(), 0));
            cad.AlterarUser(p);

            txtNome.setText("");
            txtCpf.setText("");
            txtEmail.setText("");
            txtSenha.setText("");

            readJTable();

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void campoSenhaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaAdmActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed
//    private void usersTable(){
//        
//        Connection connection = null;
//        ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
//      
//        connection = Conexao.getInstance().getConnection();
//        System.out.println("Conectado e preparando a listagem");
//        Statement stmt = null;
//        
//        try
//        {
//            stmt = connection.createStatement();
//            ResultSet res = stmt.executeQuery("SELECT Nome,CPF,Email,Senha FROM usuarios");
//            
//            while (res.next())
//            {
//              Usuarios usuarios = new Usuarios(res.getString("Nome"),res.getString("CPF"), res.getString("Email"), res.getString("Senha"));
//                listaUsuarios.add(usuarios);
//                System.out.println(""+res.getString("Nome")+res.getString("CPF")+ res.getString("Email")+ res.getString("Senha"));
//            }
//            
//        } 
//        catch (SQLException e)
//        {
//            System.out.println(e.getMessage());
//            return ;
//        }
//        finally
//        {
//          
//            try
//            {
//                stmt.close();
//                connection.close();
//            }
//            catch (SQLException e)
//            {
//                System.out.println("Erro ao desconectar" + e.getMessage());
//            }
//        }
//    }
    /**
     * @param args the command line arguments
     */
    
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Acervo;
    private javax.swing.JPanel CadastroAdmin;
    private javax.swing.JPanel Emprestimos;
    private javax.swing.JPanel Users;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btListAdmin;
    private javax.swing.JTextField campoEmailAdm;
    private javax.swing.JTextField campoNomeAdm;
    private javax.swing.JPasswordField campoSenhaAdm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable tabelaUsers;
    private javax.swing.JTable tbAdmin;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
  }


