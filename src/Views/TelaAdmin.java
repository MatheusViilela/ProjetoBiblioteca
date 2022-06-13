package Views;
import javax.swing.JOptionPane;
import Controller.AcessoBD;
import Controller.CadastroADM_BD;
import Controller.Conexao;
import Model.Adm;
import Model.Usuarios;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


       
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
                cont.getIdAdmin(),
                cont.getNome(),
                cont.getEmail(),
                cont.getSenha()
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
        Emprestimos = new javax.swing.JPanel();
        Users = new javax.swing.JPanel();
        btConsultar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsers = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CadastroAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoSenhaAdm = new javax.swing.JPasswordField();
        campoEmailAdm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoNomeAdm = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAdmin = new javax.swing.JTable();
        btListAdmin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

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

        javax.swing.GroupLayout AcervoLayout = new javax.swing.GroupLayout(Acervo);
        Acervo.setLayout(AcervoLayout);
        AcervoLayout.setHorizontalGroup(
            AcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        AcervoLayout.setVerticalGroup(
            AcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Acervo", Acervo);

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
        Users.add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 126, 32));

        jButton4.setText("EXCLUIR");
        Users.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 438, 126, 32));

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
        tabelaUsers.setSelectionForeground(new java.awt.Color(102, 255, 51));
        jScrollPane1.setViewportView(tabelaUsers);

        Users.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 740, 370));

        jButton5.setText("EDITAR");
        Users.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 438, 126, 32));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela Usuários - Adm.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        Users.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 507));

        jTabbedPane2.addTab("Usuários", Users);

        CadastroAdmin.setBackground(new java.awt.Color(251, 251, 251));

        jLabel1.setText("EMAIL");

        jLabel2.setText("SENHA");

        campoEmailAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailAdmActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("NOME");

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

        btListAdmin.setText("CONSULTAR");
        btListAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CadastroAdminLayout = new javax.swing.GroupLayout(CadastroAdmin);
        CadastroAdmin.setLayout(CadastroAdminLayout);
        CadastroAdminLayout.setHorizontalGroup(
            CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroAdminLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(133, 133, 133))
            .addGroup(CadastroAdminLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CadastroAdminLayout.createSequentialGroup()
                        .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNomeAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(campoEmailAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(CadastroAdminLayout.createSequentialGroup()
                        .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(campoSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CadastroAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btListAdmin)
                .addGap(355, 355, 355))
        );
        CadastroAdminLayout.setVerticalGroup(
            CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroAdminLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CadastroAdminLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomeAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(CadastroAdminLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEmailAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btListAdmin)
                .addGap(29, 29, 29))
        );

        jTabbedPane2.addTab("Administradores", CadastroAdmin);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable tabelaUsers;
    private javax.swing.JTable tbAdmin;
    // End of variables declaration//GEN-END:variables
  }


