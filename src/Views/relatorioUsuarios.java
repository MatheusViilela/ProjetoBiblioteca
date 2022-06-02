package Views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class relatorioUsuarios extends JFrame
{
   private DefaultTableModel modelo;
   private JTable tabela;
   private String nome,cpf,email,cidade,rua,telefone,senha,cep,n,uf,bairro;
   
   public relatorioUsuarios()
   {
	   modelo = new DefaultTableModel();
	   tabela = new JTable(modelo);  
	   modelo.addColumn("Nome");
	   modelo.addColumn("CPF");
	   modelo.addColumn("Email");
	   modelo.addColumn("Cidade");
           modelo.addColumn("Rua");
	   modelo.addColumn("Telefone");
	   modelo.addColumn("Senha");
	   modelo.addColumn("CEP");
           modelo.addColumn("N");
	   modelo.addColumn("UF");
	   modelo.addColumn("Bairro");
	 
	   
	   setTitle("Relatório de usuarios");
	   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   
	   try
	   {
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","");
		   Statement stm = con.createStatement();
		   ResultSet res = stm.executeQuery("Select * from usuarios");
		   while(res.next())
		   {
			   nome = res.getString("Nome");
                           cpf = res.getString("CPF");
                           email = res.getString("Email");
			   cidade = res.getString("Cidade");
                           rua = res.getString("Rua");
                           telefone = res.getString("Telefone");
                           senha = res.getString("Senha");
                           cep = res.getString("cep");
                           n = res.getString("N");
                           uf = res.getString("Uf");
                           bairro = res.getString("Bairro");
			   
			  
			   modelo.addRow(new Object[] {nome,cpf,email,cidade,rua,telefone,senha,cep,n,uf,bairro});
		   }
	   }
	   catch(ClassNotFoundException ex)
	   {
		   JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
	   }
	   catch(SQLException ex)
	   {
		   JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
	   }
	   tabela.setPreferredScrollableViewportSize(new Dimension(700,400));
	   Container c = getContentPane();
	   c.setLayout(new FlowLayout());
	   JScrollPane scarollPane = new JScrollPane(tabela);
	   c.add(scarollPane);
	   setSize(800,500);
	   setVisible(true);
	   
	  
	   JButton btnConsultar = new JButton("Fechar");
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();				
			}
			
		});
		btnConsultar.setBounds(36, 401, 124, 23);
		c.add(btnConsultar);
	   
	   
   }
    
}
