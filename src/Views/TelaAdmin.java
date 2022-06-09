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
 
    public TelaAdmin() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        Acervo = new javax.swing.JPanel();
        Emprestimos = new javax.swing.JPanel();
        Users = new javax.swing.JPanel();
        btConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsers = new javax.swing.JTable();
        CadastroAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoSenhaAdm = new javax.swing.JPasswordField();
        campoEmailAdm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoNomeAdm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(189, 208, 255));
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        Acervo.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout AcervoLayout = new javax.swing.GroupLayout(Acervo);
        Acervo.setLayout(AcervoLayout);
        AcervoLayout.setHorizontalGroup(
            AcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        AcervoLayout.setVerticalGroup(
            AcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Acervo", Acervo);

        Emprestimos.setBackground(new java.awt.Color(204, 255, 153));

        javax.swing.GroupLayout EmprestimosLayout = new javax.swing.GroupLayout(Emprestimos);
        Emprestimos.setLayout(EmprestimosLayout);
        EmprestimosLayout.setHorizontalGroup(
            EmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        EmprestimosLayout.setVerticalGroup(
            EmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Empréstimos", Emprestimos);

        Users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btConsultar.setText("CONSULTAR");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        Users.add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

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
        jScrollPane1.setViewportView(tabelaUsers);

        Users.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 190));

        jTabbedPane2.addTab("Usuários", Users);

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

        javax.swing.GroupLayout CadastroAdminLayout = new javax.swing.GroupLayout(CadastroAdmin);
        CadastroAdmin.setLayout(CadastroAdminLayout);
        CadastroAdminLayout.setHorizontalGroup(
            CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroAdminLayout.createSequentialGroup()
                .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CadastroAdminLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(campoSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addGroup(CadastroAdminLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))))
                    .addGroup(CadastroAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoEmailAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNomeAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(76, 76, 76)
                .addComponent(jButton2)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        CadastroAdminLayout.setVerticalGroup(
            CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(campoNomeAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(campoEmailAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(CadastroAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cadastrar Admin", CadastroAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
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

        Listar();
//        Connection connection = null;
////        ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
//      
//        connection = Conexao.getInstance().getConnection();
//        System.out.println("Conectado e preparando a listagem");
//        Statement stmt = null;
//        
//        try
//        {
//            stmt = connection.createStatement();
//            ResultSet res = stmt.executeQuery("SELECT * FROM usuarios");
//            ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
//
//            while (res.next())
//            {
////              Usuarios usuarios = new Usuarios(res.getString("Nome"),res.getString("CPF"), res.getString("Email"), res.getString("Senha"));
////                listaUsuarios.add(usuarios);
////                System.out.println(""+res.getString("Nome")+res.getString("CPF")+ res.getString("Email")+ res.getString("Senha"));
//                Usuarios obj = new Usuarios();
//                obj.setNome(res.getString("Nome"));
//                obj.setNome(res.getString("CPF"));
//                obj.setNome(res.getString("Email"));
//                obj.setNome(res.getString("Senha"));
////                obj.setNome(res.getString("Nome"));
////                obj.setNome(res.getString("Nome"));
////                obj.setNome(res.getString("Nome"));
////                obj.setNome(res.getString("Nome"));
////                obj.setNome(res.getString("Nome"));
//               listaUsuarios.add(obj);
//            }            
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
//        return;
          // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarActionPerformed
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
    private javax.swing.JTextField campoEmailAdm;
    private javax.swing.JTextField campoNomeAdm;
    private javax.swing.JPasswordField campoSenhaAdm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    public javax.swing.JTable tabelaUsers;
    // End of variables declaration//GEN-END:variables
  }


