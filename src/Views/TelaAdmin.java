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

    public void Listar() {
        Conexao obj = new Conexao();
        List<Usuarios> Users = obj.listarUsers();
        DefaultTableModel dado = (DefaultTableModel) tabelaUsers.getModel();
        dado.setNumRows(0);

        for (Usuarios cont : Users) {
            dado.addRow(new Object[]{
                cont.getId(),
                cont.getNome(),
                cont.getCpf(),
                cont.getEmail(),
                cont.getSenha()
            });
        }
    }

    public void ListarAdmin() {
        Conexao obj = new Conexao();
        List<Adm> Adm = obj.listarAdmin();
        DefaultTableModel dado = (DefaultTableModel) tbAdmin.getModel();
        dado.setNumRows(0);

        for (Adm cont : Adm) {
            dado.addRow(new Object[]{
                cont.getIdAdm(),
                cont.getNome(),
                cont.getEmail(),
                cont.getSenha()
            });
        }
    }

    public void readJTableAdm() {

        DefaultTableModel modelo = (DefaultTableModel) tbAdmin.getModel();
        modelo.setNumRows(0);
        Usuarios obj = new Usuarios();
        Conexao obje = new Conexao();

        for (Usuarios u : obje.listarUsers()) {

            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getCpf(),
                u.getEmail(),
                u.getSenha()
            });

        }
    }
    public void readJTableAdmPesquisa(String nome) {

        DefaultTableModel modelo = (DefaultTableModel) tbAdmin.getModel();
        modelo.setNumRows(0);
        CadastroADM_BD obj = new CadastroADM_BD();
        Conexao obje = new Conexao();

        for (Adm u : obj.PesquisaNomeAdm(nome)) {

            modelo.addRow(new Object[]{
                u.getIdAdm(),
                u.getNome(),
                u.getEmail(),
                u.getSenha()
            });

        }
    }
    public void readJTableUserPesquisa(String nome) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaUsers.getModel();
        modelo.setNumRows(0);
        CadastroBD obj = new CadastroBD();
        Conexao obje = new Conexao();

        for (Usuarios u : obj.PesquisaNomeUser(nome)) {

            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
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
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CadastroAdmin = new javax.swing.JPanel();
        campoEmailAdm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        campoNomeAdm = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAdmin = new javax.swing.JTable();
        btListAdmin = new javax.swing.JButton();
        btEditAdm = new javax.swing.JButton();
        campoSenhaAdm = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        txtBuscaNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Emprestimos = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
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
        jButton15 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        txtPesquisaNomeU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(189, 208, 255));
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTabbedPane2.setMaximumSize(new java.awt.Dimension(800, 540));
        jTabbedPane2.setMinimumSize(new java.awt.Dimension(800, 540));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(800, 540));
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        Acervo.setBackground(new java.awt.Color(251, 251, 251));
        Acervo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Cadastrar (novo).png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Acervo.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 126, 32));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Consultar.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Acervo.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 126, 32));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Editar.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Acervo.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 126, 32));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Excluir.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Acervo.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 126, 32));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Sair certo.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        Acervo.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 6, 68, 28));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela Acervo - adm nova.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setMaximumSize(new java.awt.Dimension(800, 507));
        jLabel7.setMinimumSize(new java.awt.Dimension(800, 507));
        jLabel7.setPreferredSize(new java.awt.Dimension(800, 507));
        Acervo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Acervo", Acervo);

        CadastroAdmin.setBackground(new java.awt.Color(251, 251, 251));
        CadastroAdmin.setMaximumSize(new java.awt.Dimension(800, 507));
        CadastroAdmin.setMinimumSize(new java.awt.Dimension(800, 507));
        CadastroAdmin.setPreferredSize(new java.awt.Dimension(800, 507));
        CadastroAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoEmailAdm.setBackground(new java.awt.Color(229, 229, 229));
        campoEmailAdm.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoEmailAdm.setBorder(null);
        campoEmailAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailAdmActionPerformed(evt);
            }
        });
        CadastroAdmin.add(campoEmailAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 108, 480, 22));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Cadastrar (novo).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        CadastroAdmin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 435, 126, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Sair certo.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        CadastroAdmin.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 6, 68, 28));

        campoNomeAdm.setBackground(new java.awt.Color(229, 229, 229));
        campoNomeAdm.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoNomeAdm.setBorder(null);
        CadastroAdmin.add(campoNomeAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 45, 660, 22));

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
        tbAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAdminMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbAdmin);

        CadastroAdmin.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 200, 723, 193));

        btListAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Consultar.png"))); // NOI18N
        btListAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListAdminActionPerformed(evt);
            }
        });
        CadastroAdmin.add(btListAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 435, 126, 30));

        btEditAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Editar.png"))); // NOI18N
        btEditAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditAdmActionPerformed(evt);
            }
        });
        CadastroAdmin.add(btEditAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 435, 126, 30));

        campoSenhaAdm.setBackground(new java.awt.Color(229, 229, 229));
        campoSenhaAdm.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoSenhaAdm.setBorder(null);
        CadastroAdmin.add(campoSenhaAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 108, 170, 22));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Excluir.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        CadastroAdmin.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 434, 126, 32));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Pesquisar.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        CadastroAdmin.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 164, 126, 28));

        txtBuscaNome.setBackground(new java.awt.Color(229, 229, 229));
        txtBuscaNome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtBuscaNome.setBorder(null);
        CadastroAdmin.add(txtBuscaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 166, 240, 23));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela Adm - adm nova 2.png"))); // NOI18N
        CadastroAdmin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        jTabbedPane2.addTab("Administradores", CadastroAdmin);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Autorizar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 126, 32));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Negar.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 126, 32));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Sair certo.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 6, 68, 28));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela Reservas - adm.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setPreferredSize(new java.awt.Dimension(800, 507));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        jTabbedPane2.addTab("Reservas", jPanel1);

        Emprestimos.setBackground(new java.awt.Color(251, 251, 251));
        Emprestimos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Devolver novo.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Emprestimos.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 140, 36));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Sair certo.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Emprestimos.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 6, 68, 28));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela Empréstimo - adm.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(800, 507));
        jLabel5.setMinimumSize(new java.awt.Dimension(800, 507));
        jLabel5.setPreferredSize(new java.awt.Dimension(800, 507));
        Emprestimos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane2.addTab("Empréstimos", Emprestimos);

        Users.setMaximumSize(new java.awt.Dimension(800, 507));
        Users.setMinimumSize(new java.awt.Dimension(800, 507));
        Users.setPreferredSize(new java.awt.Dimension(800, 507));
        Users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Consultar.png"))); // NOI18N
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        Users.add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 445, 126, 32));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Excluir.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Users.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 445, 126, 32));

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
        tabelaUsers.setRowHeight(22);
        tabelaUsers.setSelectionForeground(new java.awt.Color(0, 51, 102));
        tabelaUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsers);

        Users.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 700, 200));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Editar.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Users.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 445, 126, 32));

        txtNome.setBackground(new java.awt.Color(229, 229, 229));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        Users.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 53, 450, 22));

        txtCpf.setBackground(new java.awt.Color(229, 229, 229));
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCpf.setBorder(null);
        Users.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 53, 185, 22));

        txtEmail.setBackground(new java.awt.Color(229, 229, 229));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtEmail.setBorder(null);
        Users.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 116, 450, 22));

        txtSenha.setBackground(new java.awt.Color(229, 229, 229));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtSenha.setBorder(null);
        Users.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 116, 185, 22));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Sair certo.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        Users.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 6, 68, 28));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Pesquisar.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        Users.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 169, 126, 28));

        txtPesquisaNomeU.setBackground(new java.awt.Color(229, 229, 229));
        txtPesquisaNomeU.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPesquisaNomeU.setBorder(null);
        Users.add(txtPesquisaNomeU, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 171, 237, 24));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela Usuário - adm nova.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(new java.awt.Dimension(800, 507));
        jLabel4.setMinimumSize(new java.awt.Dimension(800, 507));
        jLabel4.setPreferredSize(new java.awt.Dimension(800, 507));
        Users.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 507));

        jTabbedPane2.addTab("Usuários", Users);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

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

        if (CadastroADM_BD.inserirAdm(adm) == true) {
            JOptionPane.showMessageDialog(null, "Você foi cadastrado com sucesso!!!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro no cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
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
        if (tabelaUsers.getSelectedRow() != -1) {

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

//            readJTable();
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void btEditAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditAdmActionPerformed

        int dialogButton = JOptionPane.YES_NO_OPTION;
        dialogButton = JOptionPane.showConfirmDialog (null, "Tem certeza que deseja editar?","WARNING", dialogButton);
        while (tbAdmin.getSelectedRow() != -1) {
            if (dialogButton == JOptionPane.NO_OPTION) {
                break;
            } else if (dialogButton == JOptionPane.YES_OPTION) {
                Adm p = new Adm();
                CadastroADM_BD cad = new CadastroADM_BD();

                p.setNome(campoNomeAdm.getText());
                p.setEmail(campoEmailAdm.getText());
                p.setSenha(campoSenhaAdm.getText());

                p.setIdAdm((int) tbAdmin.getValueAt(tbAdmin.getSelectedRow(), 0));
                cad.AlterarAdm(p);

                txtNome.setText("");
                txtCpf.setText("");
                txtEmail.setText("");
                txtSenha.setText("");
                break;
            }
        }
//            

    }//GEN-LAST:event_btEditAdmActionPerformed

    private void tbAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAdminMouseClicked
        if (tbAdmin.getSelectedRow() != -1) {

            campoNomeAdm.setText(tbAdmin.getValueAt(tbAdmin.getSelectedRow(), 1).toString());
            campoEmailAdm.setText(tbAdmin.getValueAt(tbAdmin.getSelectedRow(), 2).toString());
            campoSenhaAdm.setText(tbAdmin.getValueAt(tbAdmin.getSelectedRow(), 3).toString());

    }//GEN-LAST:event_tbAdminMouseClicked
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        dialogButton = JOptionPane.showConfirmDialog (null, "Tem certeza que deseja excluir","WARNING", dialogButton);
        while (tabelaUsers.getSelectedRow() != -1) {
            if (dialogButton == JOptionPane.NO_OPTION) {
                break;
            } else if (dialogButton == JOptionPane.YES_OPTION) {
                Usuarios p = new Usuarios();
               CadastroBD cad = new CadastroBD();

              

                p.setId((int) tabelaUsers.getValueAt(tabelaUsers.getSelectedRow(), 0));
                cad.DeleteUser(p);

                txtNome.setText("");
                txtCpf.setText("");
                txtEmail.setText("");
                txtSenha.setText("");
                break;
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        hm = new Login();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        hm = new Login();
        hm.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        hm = new Login();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        hm = new Login();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       int dialogButton = JOptionPane.YES_NO_OPTION;
        dialogButton = JOptionPane.showConfirmDialog (null, "Tem certeza que deseja excluir","WARNING", dialogButton);
        while (tbAdmin.getSelectedRow() != -1) {
            if (dialogButton == JOptionPane.NO_OPTION) {
                break;
            } else if (dialogButton == JOptionPane.YES_OPTION) {
                Adm p = new Adm();
                CadastroADM_BD cad = new CadastroADM_BD();

              

                p.setIdAdm((int) tbAdmin.getValueAt(tbAdmin.getSelectedRow(), 0));
                cad.DeleteAdm(p);

                txtNome.setText("");
                txtCpf.setText("");
                txtEmail.setText("");
                txtSenha.setText("");
                break;
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        readJTableAdmPesquisa(txtBuscaNome.getText());
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        readJTableUserPesquisa(txtPesquisaNomeU.getText());
    }//GEN-LAST:event_jButton18ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Acervo;
    private javax.swing.JPanel CadastroAdmin;
    private javax.swing.JPanel Emprestimos;
    private javax.swing.JPanel Users;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditAdm;
    private javax.swing.JButton btListAdmin;
    private javax.swing.JTextField campoEmailAdm;
    private javax.swing.JTextField campoNomeAdm;
    private javax.swing.JTextField campoSenhaAdm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable tabelaUsers;
    private javax.swing.JTable tbAdmin;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisaNomeU;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
