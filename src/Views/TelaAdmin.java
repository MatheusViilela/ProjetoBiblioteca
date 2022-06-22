package Views;

import javax.swing.JOptionPane;
import Controller.AcessoBD;
import Controller.CadastroAC_BD;
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
import Model.Acervo;

public class TelaAdmin extends javax.swing.JFrame {

    private String nome, email, senha;
    private Login hm;
    private String Tipo, Assunto, Titulo, Autor, Publicacao, Editora;

    //                Listar usuários
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
    //               Listar Administradores
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
    
    //              Listar Acervo ListarAcervo();
    public void ListarAcervo() {
        Conexao obj = new Conexao();
        List<Acervo> Acervo = obj.listarAcervo();
        DefaultTableModel dado = (DefaultTableModel) tabelaAcervo.getModel();
        dado.setNumRows(0);

        for (Acervo cont : Acervo) {
            dado.addRow(new Object[]{
                cont.getIdItem(),
                cont.getTipo(),
                cont.getAssunto(),
                cont.getTitulo(),
                cont.getAutor(),
                cont.getPublicacao(),
                cont.getEditora()
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
    public void readJTableAdmEmail(String email) {

        DefaultTableModel modelo = (DefaultTableModel) tbAdmin.getModel();
        modelo.setNumRows(0);
        CadastroADM_BD obj = new CadastroADM_BD();
        Conexao obje = new Conexao();

        for (Adm u : obj.PesquisaEmailAdm(email)) {

            modelo.addRow(new Object[]{
                u.getIdAdm(),
                u.getNome(),
                u.getEmail(),
                u.getSenha()
            });

        }
    }
    
    public void readJTableAdmSenha(String senha) {

        DefaultTableModel modelo = (DefaultTableModel) tbAdmin.getModel();
        modelo.setNumRows(0);
        CadastroADM_BD obj = new CadastroADM_BD();
        Conexao obje = new Conexao();

        for (Adm u : obj.PesquisaSenhaAdm(senha)) {

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
                u.getCpf(),
                u.getEmail(),
                u.getSenha()
            });
        }
    }
     public void readJTableUserCPF(String Cpf) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaUsers.getModel();
        modelo.setNumRows(0);
        CadastroBD obj = new CadastroBD();
        Conexao obje = new Conexao();

        for (Usuarios u : obj.PesquisaCPFUser(Cpf)) {

            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getCpf(),
                u.getEmail(),
                u.getSenha()
        
            });

        }
    }

     public void readJTableUserEmail(String Email) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaUsers.getModel();
        modelo.setNumRows(0);
        CadastroBD obj = new CadastroBD();
        Conexao obje = new Conexao();

        for (Usuarios u : obj.PesquisaEmailUser(Email)) {

            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getCpf(),
                u.getEmail(),
                u.getSenha()
        
            });
        }
    }
     
    public void readJTableUserSenha(String Senha) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaUsers.getModel();
        modelo.setNumRows(0);
        CadastroBD obj = new CadastroBD();
        Conexao obje = new Conexao();

        for (Usuarios u : obj.PesquisaSenhaUser(Senha)) {

            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getCpf(),
                u.getEmail(),
                u.getSenha()
        
            });

        }
    }
    
    public void readJTableAcervoTipo(String Tipo) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaAcervo.getModel();
        modelo.setNumRows(0);
        CadastroAC_BD obj = new CadastroAC_BD();
        Conexao obje = new Conexao();

        for (Acervo a : obj.PesquisaTipo(Tipo)) {

            modelo.addRow(new Object[]{
                a.getIdItem(),
                a.getTipo(),
                a.getAssunto(),
                a.getTitulo(),
                a.getAutor(),
                a.getPublicacao(),
                a.getEditora()
            });
        }
    }
    
    public void readJTableAcervoAssunto(String Assunto) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaAcervo.getModel();
        modelo.setNumRows(0);
        CadastroAC_BD obj = new CadastroAC_BD();
        Conexao obje = new Conexao();

        for (Acervo a : obj.PesquisaAssunto(Assunto)) {

            modelo.addRow(new Object[]{
                a.getIdItem(),
                a.getTipo(),
                a.getAssunto(),
                a.getTitulo(),
                a.getAutor(),
                a.getPublicacao(),
                a.getEditora()
            });
        }
    }
    
    public void readJTableAcervoTitulo(String Titulo) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaAcervo.getModel();
        modelo.setNumRows(0);
        CadastroAC_BD obj = new CadastroAC_BD();
        Conexao obje = new Conexao();

        for (Acervo a : obj.PesquisaTitulo(Titulo)) {

            modelo.addRow(new Object[]{
                a.getIdItem(),
                a.getTipo(),
                a.getAssunto(),
                a.getTitulo(),
                a.getAutor(),
                a.getPublicacao(),
                a.getEditora()
            });
        }
    }
    
    public void readJTableAcervoAutor(String Autor) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaAcervo.getModel();
        modelo.setNumRows(0);
        CadastroAC_BD obj = new CadastroAC_BD();
        Conexao obje = new Conexao();

        for (Acervo a : obj.PesquisaAutor(Autor)) {

            modelo.addRow(new Object[]{
                a.getIdItem(),
                a.getTipo(),
                a.getAssunto(),
                a.getTitulo(),
                a.getAutor(),
                a.getPublicacao(),
                a.getEditora()
            });
        }
    }
    
    public void readJTableAcervoPublicacao(String data) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaAcervo.getModel();
        modelo.setNumRows(0);
        CadastroAC_BD obj = new CadastroAC_BD();
        Conexao obje = new Conexao();

        for (Acervo a : obj.PesquisaDataPubli(data)) {

            modelo.addRow(new Object[]{
                a.getIdItem(),
                a.getTipo(),
                a.getAssunto(),
                a.getTitulo(),
                a.getAutor(),
                a.getPublicacao(),
                a.getEditora()
            });
        }
    }
    
    public void readJTableAcervoEditora(String Editora) {

        DefaultTableModel modelo = (DefaultTableModel) tabelaAcervo.getModel();
        modelo.setNumRows(0);
        CadastroAC_BD obj = new CadastroAC_BD();
        Conexao obje = new Conexao();

        for (Acervo a : obj.PesquisaEditora(Editora)) {

            modelo.addRow(new Object[]{
                a.getIdItem(),
                a.getTipo(),
                a.getAssunto(),
                a.getTitulo(),
                a.getAutor(),
                a.getPublicacao(),
                a.getEditora()
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
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Acervo = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaAcervo = new javax.swing.JTable();
        campoTipo = new javax.swing.JTextField();
        campoAutor = new javax.swing.JTextField();
        campoAssunto = new javax.swing.JTextField();
        campoPublicacao = new javax.swing.JTextField();
        campoTitulo = new javax.swing.JTextField();
        campoEditora = new javax.swing.JTextField();
        cbPesquisaAcervo = new javax.swing.JComboBox<>();
        campoPesquisaAcervo = new javax.swing.JTextField();
        btPesquisarAcervo = new javax.swing.JButton();
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
        btPesquisarAdm = new javax.swing.JButton();
        txtBuscaNome = new javax.swing.JTextField();
        cbPesquisaAdm = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Emprestimos = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaEmpAdm = new javax.swing.JTable();
        campoPesquisaEmp = new javax.swing.JTextField();
        btPesquisarEmp = new javax.swing.JButton();
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
        btPesquisar = new javax.swing.JButton();
        txtPesquisaNomeU = new javax.swing.JTextField();
        cbPesquisaUsuario = new javax.swing.JComboBox<>();
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

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

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
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Acervo.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 126, 32));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Consultar.png"))); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Acervo.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 126, 32));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Editar.png"))); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        tabelaAcervo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tabelaAcervo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "idItem", "Tipo", "Assunto", "Título", "Autor", "Data de Publicação", "Editora"
            }
        ));
        tabelaAcervo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAcervoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaAcervo);

        Acervo.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 231, 700, 170));

        campoTipo.setBackground(new java.awt.Color(229, 229, 229));
        campoTipo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoTipo.setBorder(null);
        Acervo.add(campoTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 53, 140, 22));

        campoAutor.setBackground(new java.awt.Color(229, 229, 229));
        campoAutor.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoAutor.setBorder(null);
        Acervo.add(campoAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 116, 220, 22));

        campoAssunto.setBackground(new java.awt.Color(229, 229, 229));
        campoAssunto.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoAssunto.setBorder(null);
        Acervo.add(campoAssunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 53, 210, 22));

        campoPublicacao.setBackground(new java.awt.Color(229, 229, 229));
        campoPublicacao.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoPublicacao.setBorder(null);
        Acervo.add(campoPublicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 116, 195, 22));

        campoTitulo.setBackground(new java.awt.Color(229, 229, 229));
        campoTitulo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoTitulo.setBorder(null);
        Acervo.add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 53, 250, 22));

        campoEditora.setBackground(new java.awt.Color(229, 229, 229));
        campoEditora.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoEditora.setBorder(null);
        Acervo.add(campoEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 116, 195, 22));

        cbPesquisaAcervo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbPesquisaAcervo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Selecione um filtro", "  Tipo", "  Assunto", "  Título", "  Autor", "  Data de publicação", "  Editora" }));
        Acervo.add(cbPesquisaAcervo, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 195, 203, 23));

        campoPesquisaAcervo.setBackground(new java.awt.Color(229, 229, 229));
        campoPesquisaAcervo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoPesquisaAcervo.setBorder(null);
        Acervo.add(campoPesquisaAcervo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 196, 236, 22));

        btPesquisarAcervo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Pesquisar.png"))); // NOI18N
        btPesquisarAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarAcervoActionPerformed(evt);
            }
        });
        Acervo.add(btPesquisarAcervo, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 193, 125, 28));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela Acervo - adm.png"))); // NOI18N
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
        CadastroAdmin.add(campoEmailAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 116, 480, 22));

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
        CadastroAdmin.add(campoNomeAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 53, 660, 22));

        tbAdmin.setBackground(new java.awt.Color(225, 231, 246));
        tbAdmin.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
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

        CadastroAdmin.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 231, 698, 170));

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
        CadastroAdmin.add(campoSenhaAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 116, 170, 22));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Excluir.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        CadastroAdmin.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 434, 126, 32));

        btPesquisarAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Pesquisar.png"))); // NOI18N
        btPesquisarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarAdmActionPerformed(evt);
            }
        });
        CadastroAdmin.add(btPesquisarAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 193, 126, 28));

        txtBuscaNome.setBackground(new java.awt.Color(229, 229, 229));
        txtBuscaNome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtBuscaNome.setBorder(null);
        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });
        CadastroAdmin.add(txtBuscaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 195, 240, 23));

        cbPesquisaAdm.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbPesquisaAdm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Selecione um filtro", "  Nome", "  Email", "  Senha" }));
        cbPesquisaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPesquisaAdmActionPerformed(evt);
            }
        });
        CadastroAdmin.add(cbPesquisaAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 195, 205, 23));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Tela adm - adm.png"))); // NOI18N
        CadastroAdmin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 507));

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
        Emprestimos.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 435, 140, 35));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Sair certo.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Emprestimos.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 6, 68, 28));

        tabelaEmpAdm.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tabelaEmpAdm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Usuário", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane5.setViewportView(tabelaEmpAdm);

        Emprestimos.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 160, 711, 240));

        campoPesquisaEmp.setBackground(new java.awt.Color(229, 229, 229));
        campoPesquisaEmp.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        campoPesquisaEmp.setBorder(null);
        Emprestimos.add(campoPesquisaEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 72, 235, 25));

        btPesquisarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Pesquisar.png"))); // NOI18N
        btPesquisarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarEmpActionPerformed(evt);
            }
        });
        Emprestimos.add(btPesquisarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 71, 125, 28));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela Empréstimo - adm NOVA.png"))); // NOI18N
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
        tabelaUsers.setShowGrid(true);
        tabelaUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsers);

        Users.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 700, 170));

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
        Users.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 53, 445, 22));

        txtCpf.setBackground(new java.awt.Color(229, 229, 229));
        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtCpf.setBorder(null);
        Users.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 53, 185, 22));

        txtEmail.setBackground(new java.awt.Color(229, 229, 229));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtEmail.setBorder(null);
        Users.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 116, 445, 22));

        txtSenha.setBackground(new java.awt.Color(229, 229, 229));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtSenha.setBorder(null);
        Users.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 116, 185, 22));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Sair certo.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        Users.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 6, 68, 28));

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botão Pesquisar.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        Users.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 192, 126, 29));

        txtPesquisaNomeU.setBackground(new java.awt.Color(229, 229, 229));
        txtPesquisaNomeU.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPesquisaNomeU.setBorder(null);
        txtPesquisaNomeU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaNomeUActionPerformed(evt);
            }
        });
        Users.add(txtPesquisaNomeU, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 195, 237, 24));

        cbPesquisaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbPesquisaUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Selecione um filtro", "  Nome", "  CPF", "  Email", "  Senha" }));
        cbPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPesquisaUsuarioActionPerformed(evt);
            }
        });
        Users.add(cbPesquisaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 194, 206, 25));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela user - adm.png"))); // NOI18N
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
            JOptionPane.showMessageDialog(null, "Administrador cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
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
        //JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
        Acervo acervo = new Acervo();
        CadastroAC_BD CadastroAC_BD = new CadastroAC_BD();

        Tipo = campoTipo.getText();
        Assunto = campoAssunto.getText();
        Titulo = campoTitulo.getText();
        Autor = campoAutor.getText();
        Publicacao = campoPublicacao.getText();
        Editora = campoEditora.getText();
        
        acervo.setTipo(Tipo);
        acervo.setAssunto(Assunto);
        acervo.setTitulo(Titulo);
        acervo.setAutor(Autor);
        acervo.setPublicacao(Publicacao);
        acervo.setEditora(Editora);
        
        if (CadastroAC_BD.inserirItem(acervo) == true) {
            JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Erro no cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
        ListarAcervo();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
        int dialogButton = JOptionPane.YES_NO_OPTION;
        dialogButton = JOptionPane.showConfirmDialog (null, "Tem certeza que deseja editar?","WARNING", dialogButton);
        while (tabelaAcervo.getSelectedRow() != -1) {
            if (dialogButton == JOptionPane.NO_OPTION) {
                break;
            } else if (dialogButton == JOptionPane.YES_OPTION) {
                Acervo p = new Acervo();
                CadastroAC_BD cad = new CadastroAC_BD();

                p.setTipo(campoTipo.getText());
                p.setAssunto(campoAssunto.getText());
                p.setTitulo(campoTitulo.getText());
                p.setAutor(campoAutor.getText());
                p.setPublicacao(campoPublicacao.getText());
                p.setEditora(campoEditora.getText());

                p.setIdItem((int) tabelaAcervo.getValueAt(tabelaAcervo.getSelectedRow(), 0));
                cad.AlterarAcervo(p);

                campoTipo.setText("");
                campoAssunto.setText("");
                campoTitulo.setText("");
                campoAutor.setText("");
                campoPublicacao.setText("");
                campoEditora.setText("");
                break;
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //JOptionPane.showMessageDialog(null, "Projeto em desenvolvimento", "Erro", JOptionPane.ERROR_MESSAGE);
        int dialogButton = JOptionPane.YES_NO_OPTION;
        dialogButton = JOptionPane.showConfirmDialog (null, "Tem certeza que deseja excluir?","WARNING", dialogButton);
        while (tabelaAcervo.getSelectedRow() != -1) {
            if (dialogButton == JOptionPane.NO_OPTION) {
                break;
            } else if (dialogButton == JOptionPane.YES_OPTION) {
                Acervo p = new Acervo();
                CadastroAC_BD cad = new CadastroAC_BD();

                p.setIdItem((int) tabelaAcervo.getValueAt(tabelaAcervo.getSelectedRow(), 0));
                cad.DeleteItem(p);

                campoTipo.setText("");
                campoAssunto.setText("");
                campoTitulo.setText("");
                campoAutor.setText("");
                campoPublicacao.setText("");
                campoEditora.setText("");
                break;
            }
        }
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
        dialogButton = JOptionPane.showConfirmDialog (null, "Tem certeza que deseja excluir?","WARNING", dialogButton);
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
        dialogButton = JOptionPane.showConfirmDialog (null, "Tem certeza que deseja excluir?","WARNING", dialogButton);
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

    private void btPesquisarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarAdmActionPerformed
        if(cbPesquisaAdm.getSelectedItem() == "  Selecione um filtro")
        {
            JOptionPane.showMessageDialog(null, "Selecione um filtro de pesquisa", "Aviso - Filtro de pesquisa", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(cbPesquisaAdm.getSelectedItem() == "  Nome"){
            readJTableAdmPesquisa(txtBuscaNome.getText());
        }
        else if(cbPesquisaAdm.getSelectedItem() == "  Email")
        {
            readJTableAdmEmail(txtBuscaNome.getText());
        }
        else if(cbPesquisaAdm.getSelectedItem() == "  Senha")
        {
            readJTableAdmSenha(txtBuscaNome.getText());
        }
        
    }//GEN-LAST:event_btPesquisarAdmActionPerformed

        // Pesquisa com filtro Usuarios com combobox
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        if(cbPesquisaUsuario.getSelectedItem() == "  Nome")
        {
            readJTableUserPesquisa(txtPesquisaNomeU.getText());
        } 
        else if(cbPesquisaUsuario.getSelectedItem() == "  CPF")
        {
            readJTableUserCPF(txtPesquisaNomeU.getText());
        }
        else if(cbPesquisaUsuario.getSelectedItem() == "  Email")
        {
             readJTableUserEmail(txtPesquisaNomeU.getText());
        }
        else if(cbPesquisaUsuario.getSelectedItem() == "  Senha")
        {
            readJTableUserSenha(txtPesquisaNomeU.getText());
        }
        else if(cbPesquisaUsuario.getSelectedItem()== "  Selecione um filtro")
        {
            JOptionPane.showMessageDialog(null, "Selecione um filtro de pesquisa", "Aviso - Filtro de pesquisa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void txtPesquisaNomeUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaNomeUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaNomeUActionPerformed

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void cbPesquisaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPesquisaAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPesquisaAdmActionPerformed

    private void cbPesquisaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPesquisaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPesquisaUsuarioActionPerformed

    private void btPesquisarAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarAcervoActionPerformed
        if(cbPesquisaAcervo.getSelectedItem()== "  Selecione um filtro")
        {
            JOptionPane.showMessageDialog(null, "Selecione um filtro de pesquisa", "Aviso - Filtro de pesquisa", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(cbPesquisaAcervo.getSelectedItem() == "  Tipo")
        {
            readJTableAcervoTipo(campoPesquisaAcervo.getText());
        }
        else if(cbPesquisaAcervo.getSelectedItem() == "  Assunto")
        {
            readJTableAcervoAssunto(campoPesquisaAcervo.getText());
        }
        else if(cbPesquisaAcervo.getSelectedItem() == "  Título")
        {
            readJTableAcervoTitulo(campoPesquisaAcervo.getText());
        }
        else if(cbPesquisaAcervo.getSelectedItem() == "  Autor")
        {
            readJTableAcervoAutor(campoPesquisaAcervo.getText());
        }
        else if(cbPesquisaAcervo.getSelectedItem() == "  Data de publicação")
        {
            readJTableAcervoPublicacao(campoPesquisaAcervo.getText());
        }
        else if(cbPesquisaAcervo.getSelectedItem() == "  Editora")
        {
            readJTableAcervoEditora(campoPesquisaAcervo.getText());
        }
        else{
        JOptionPane.showMessageDialog(null, "Erro");
        }
    }//GEN-LAST:event_btPesquisarAcervoActionPerformed

    private void tabelaAcervoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAcervoMouseClicked
        if (tabelaAcervo.getSelectedRow() != -1) {
            
            campoTipo.setText(tabelaAcervo.getValueAt(tabelaAcervo.getSelectedRow(), 1).toString());
            campoAssunto.setText(tabelaAcervo.getValueAt(tabelaAcervo.getSelectedRow(), 2).toString());
            campoTitulo.setText(tabelaAcervo.getValueAt(tabelaAcervo.getSelectedRow(), 3).toString());
            campoAutor.setText(tabelaAcervo.getValueAt(tabelaAcervo.getSelectedRow(), 4).toString());
            campoPublicacao.setText(tabelaAcervo.getValueAt(tabelaAcervo.getSelectedRow(), 5).toString());
            campoEditora.setText(tabelaAcervo.getValueAt(tabelaAcervo.getSelectedRow(), 6).toString());
    } 
    }//GEN-LAST:event_tabelaAcervoMouseClicked

    private void btPesquisarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarEmpActionPerformed
        //    Ainda falta terminar esse, não deu para eu fazer
    }//GEN-LAST:event_btPesquisarEmpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Acervo;
    private javax.swing.JPanel CadastroAdmin;
    private javax.swing.JPanel Emprestimos;
    private javax.swing.JPanel Users;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditAdm;
    private javax.swing.JButton btListAdmin;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btPesquisarAcervo;
    private javax.swing.JButton btPesquisarAdm;
    private javax.swing.JButton btPesquisarEmp;
    private javax.swing.JTextField campoAssunto;
    private javax.swing.JTextField campoAutor;
    private javax.swing.JTextField campoEditora;
    private javax.swing.JTextField campoEmailAdm;
    private javax.swing.JTextField campoNomeAdm;
    private javax.swing.JTextField campoPesquisaAcervo;
    private javax.swing.JTextField campoPesquisaEmp;
    private javax.swing.JTextField campoPublicacao;
    private javax.swing.JTextField campoSenhaAdm;
    private javax.swing.JTextField campoTipo;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JComboBox<String> cbPesquisaAcervo;
    private javax.swing.JComboBox<String> cbPesquisaAdm;
    private javax.swing.JComboBox<String> cbPesquisaUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaAcervo;
    private javax.swing.JTable tabelaEmpAdm;
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
