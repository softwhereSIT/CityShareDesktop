/*Classe responsável pela parte visual da tela de Gerenciamento de Funcionário*/
package br.com.cityshare.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import br.com.cityshare.controller.GerFuncionarioController;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class GerFuncionarioView extends javax.swing.JFrame {
	/*Variável para abrigar o mod*/
	String modo = "";
	
	/*Método que inicia os componentes na tela*/
	public GerFuncionarioView() {		
		modo = "Novo";
		
        try {
			initComponents();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /*Método que compões os componentes*/
    private void initComponents() throws ParseException {
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
                
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Funcionário");
        setMinimumSize(new java.awt.Dimension(700, 600));
        setResizable(false);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cityshare/images/deleteIcon.png"))); // NOI18N
        btnExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExcluir.setMaximumSize(new java.awt.Dimension(80, 80));
        btnExcluir.setMinimumSize(new java.awt.Dimension(80, 80));
        btnExcluir.setPreferredSize(new java.awt.Dimension(80, 80));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cityshare/images/pencilIcon.png"))); // NOI18N
        btnEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.setMaximumSize(new java.awt.Dimension(80, 80));
        btnEditar.setMinimumSize(new java.awt.Dimension(80, 80));
        btnEditar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnEditar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				modo = "Editar";				
			}
		});

        btnDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cityshare/images/detailsIcon.png"))); // NOI18N
        btnDetalhes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDetalhes.setMaximumSize(new java.awt.Dimension(80, 80));
        btnDetalhes.setMinimumSize(new java.awt.Dimension(80, 80));
        btnDetalhes.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("GERENCIAMENTO DE FUNCIONÁRIO");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cityshare/images/addIcon.png"))); // NOI18N
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setMaximumSize(new java.awt.Dimension(80, 80));
        btnAdd.setMinimumSize(new java.awt.Dimension(80, 80));
        btnAdd.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAdd.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				modo = "Novo";				
			}
		});

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cityshare/images/saveIcon.png"))); // NOI18N
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.setMaximumSize(new java.awt.Dimension(80, 80));
        btnSalvar.setMinimumSize(new java.awt.Dimension(80, 80));
        btnSalvar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnSalvar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					EnviarDados();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}								
			}
		});

        jScrollPane2.setBorder(null);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(600, 600));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(600, 600));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setAutoscrolls(true);
        jPanel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(575, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(575, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(575, 600));
        
        JPanel panelDadosPessoais = new JPanel();
        panelDadosPessoais.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dados Pessoais:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
                
        panelDadosProfissionais = new JPanel();
        panelDadosProfissionais.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Dados Profissionais:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        
        JPanel panelTodosFuncionarios = new JPanel();
        panelTodosFuncionarios.setBorder(new TitledBorder(null, "Todos Funcion\u00E1rios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelDadosProfissionais, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panelTodosFuncionarios, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(panelDadosPessoais, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panelDadosProfissionais, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panelTodosFuncionarios, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addGap(65)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(214, Short.MAX_VALUE))
        );
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodosClientes = new javax.swing.JTable();
        
                tblTodosClientes.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                    },
                    new String [] {
                        "CÓDIGO", "NOME", "DATA DE NASCIMENTO", "DATA DE ADMISSÃO"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false
                    };
        
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
                tblTodosClientes.setRowHeight(20);
                jScrollPane1.setViewportView(tblTodosClientes);
                GroupLayout gl_panelTodosFuncionarios = new GroupLayout(panelTodosFuncionarios);
                gl_panelTodosFuncionarios.setHorizontalGroup(
                	gl_panelTodosFuncionarios.createParallelGroup(Alignment.LEADING)
                		.addGroup(gl_panelTodosFuncionarios.createSequentialGroup()
                			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                			.addContainerGap())
                );
                gl_panelTodosFuncionarios.setVerticalGroup(
                	gl_panelTodosFuncionarios.createParallelGroup(Alignment.LEADING)
                		.addGroup(gl_panelTodosFuncionarios.createSequentialGroup()
                			.addContainerGap()
                			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                			.addContainerGap())
                );
                panelTodosFuncionarios.setLayout(gl_panelTodosFuncionarios);
        jLabel8 = new javax.swing.JLabel();
        
                jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                jLabel8.setText("Data de admissão:");
                
                txtDtAdmissao = new JFormattedTextField();
                txtDtAdmissao.setColumns(10);
                
                JLabel lblCargo = new JLabel("Cargo:");
                
                /*CargoDao lstCargos = new CargoDao();
                System.out.println(lstCargos.ListarCargos());*/
				JComboBox<Object> cboCargo = new JComboBox<Object>();
				
                
                GroupLayout gl_panelDadosProfissionais = new GroupLayout(panelDadosProfissionais);
                gl_panelDadosProfissionais.setHorizontalGroup(
                	gl_panelDadosProfissionais.createParallelGroup(Alignment.LEADING)
                		.addGroup(gl_panelDadosProfissionais.createSequentialGroup()
                			.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                			.addPreferredGap(ComponentPlacement.RELATED)
                			.addComponent(txtDtAdmissao, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                			.addGap(45)
                			.addComponent(lblCargo)
                			.addPreferredGap(ComponentPlacement.RELATED)
                			.addComponent(cboCargo, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                			.addContainerGap())
                );
                gl_panelDadosProfissionais.setVerticalGroup(
                	gl_panelDadosProfissionais.createParallelGroup(Alignment.LEADING)
                		.addGroup(gl_panelDadosProfissionais.createSequentialGroup()
                			.addGroup(gl_panelDadosProfissionais.createParallelGroup(Alignment.BASELINE)
                				.addComponent(jLabel8)
                				.addComponent(txtDtAdmissao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                				.addComponent(lblCargo)
                				.addComponent(cboCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                			.addContainerGap(136, Short.MAX_VALUE))
                );
                panelDadosProfissionais.setLayout(gl_panelDadosProfissionais);
        jLabel3 = new javax.swing.JLabel();
        
                jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                jLabel3.setText("Nome:");
                txtNome = new javax.swing.JTextField();
                
                        txtNome.setText("Digite o nome completo do funcionário");
                        jLabel6 = new javax.swing.JLabel();
                        
                        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                        jLabel6.setText("Data de nascimento:");
                        
                        JFormattedTextField txtDtNasc = new JFormattedTextField();
                        jLabel9 = new javax.swing.JLabel();
                        
                                jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                                jLabel9.setText("RG:");
                        txtRg = new JFormattedTextField();
                        jLabel10 = new javax.swing.JLabel();
                        
                                jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                                jLabel10.setText("CPF:");
                        txtCpf = new JFormattedTextField();
                        jLabel11 = new javax.swing.JLabel();
                        
                                jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                                jLabel11.setText("E-mail:");
                        txtEmail = new javax.swing.JTextField();
                        
                                txtEmail.setText("Digite seu e-mail aqui");
                        jLabel12 = new javax.swing.JLabel();
                        
                                jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                                jLabel12.setText("Confirme o e-mail:");
                        txtConfEmail = new javax.swing.JTextField();
                        
                        txtConfEmail.setText("Digite novamente seu e-mail");
                        jLabel13 = new javax.swing.JLabel();
                        
                                jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                                jLabel13.setText("Senha:");
                        txtSenha = new javax.swing.JPasswordField();
                        
                                txtSenha.setText("jPasswordField1");
                        jLabel14 = new javax.swing.JLabel();
                        
                                jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                                jLabel14.setText("Confirme sua senha:");
                        txtConfSenha = new javax.swing.JPasswordField();
                        
                                txtConfSenha.setText("jPasswordField1");
                        GroupLayout gl_panelDadosPessoais = new GroupLayout(panelDadosPessoais);
                        gl_panelDadosPessoais.setHorizontalGroup(
                        	gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
                        		.addGroup(gl_panelDadosPessoais.createSequentialGroup()
                        			.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
                        				.addGroup(Alignment.TRAILING, gl_panelDadosPessoais.createSequentialGroup()
                        					.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        					.addPreferredGap(ComponentPlacement.RELATED)
                        					.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE))
                        				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
                        					.addComponent(jLabel6)
                        					.addPreferredGap(ComponentPlacement.RELATED)
                        					.addComponent(txtDtNasc, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                        				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
                        					.addComponent(jLabel9)
                        					.addPreferredGap(ComponentPlacement.RELATED)
                        					.addComponent(txtRg, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                        					.addGap(68)
                        					.addComponent(jLabel10)
                        					.addPreferredGap(ComponentPlacement.RELATED)
                        					.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
                        				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
                        					.addComponent(jLabel11)
                        					.addPreferredGap(ComponentPlacement.RELATED)
                        					.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
                        				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
                        					.addComponent(jLabel12)
                        					.addPreferredGap(ComponentPlacement.RELATED)
                        					.addComponent(txtConfEmail, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
                        				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
                        					.addComponent(jLabel13)
                        					.addPreferredGap(ComponentPlacement.RELATED)
                        					.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                        					.addGap(44)
                        					.addComponent(jLabel14)
                        					.addPreferredGap(ComponentPlacement.RELATED)
                        					.addComponent(txtConfSenha, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)))
                        			.addContainerGap())
                        );
                        gl_panelDadosPessoais.setVerticalGroup(
                        	gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
                        		.addGroup(gl_panelDadosPessoais.createSequentialGroup()
                        			.addGap(5)
                        			.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
                        				.addComponent(jLabel3)
                        				.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        			.addPreferredGap(ComponentPlacement.RELATED)
                        			.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
                        				.addComponent(jLabel6)
                        				.addComponent(txtDtNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        			.addPreferredGap(ComponentPlacement.RELATED)
                        			.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
                        				.addComponent(jLabel9)
                        				.addComponent(txtRg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        				.addComponent(jLabel10)
                        				.addComponent(txtCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        			.addPreferredGap(ComponentPlacement.RELATED)
                        			.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
                        				.addComponent(jLabel11)
                        				.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        			.addPreferredGap(ComponentPlacement.RELATED)
                        			.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
                        				.addComponent(jLabel12)
                        				.addComponent(txtConfEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        			.addPreferredGap(ComponentPlacement.RELATED)
                        			.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.BASELINE)
                        				.addComponent(jLabel13)
                        				.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        				.addComponent(jLabel14)
                        				.addComponent(txtConfSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        			.addContainerGap(21, Short.MAX_VALUE))
                        );
                        panelDadosPessoais.setLayout(gl_panelDadosPessoais);
        jPanel1.setLayout(jPanel1Layout);

        jScrollPane2.setColumnHeaderView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDetalhes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new Dimension(706, 540));
        setLocationRelativeTo(null);
    }
    
    /*Método para enviar os dados dos campos*/
    @SuppressWarnings("deprecation")
	private void EnviarDados() throws ParseException{
    	
    	/*Resgata o conteúdo digitado nos campos e o guarda nas respectivas variáveis*/
    	String nome = txtNome.getText().toString();
    	String rg = txtRg.getText().toString();
    	String cpf = txtCpf.getText().toString();
    	String dtNasc = txtDtNasc.getText().toString();
    	String dtAdm = txtDtAdmissao.getText().toString();
    	//String idCargo = cboCargo.getSelectedItem().toString();
    	String idCargo = "1";
    	String senha = txtSenha.getText().toString();
    	String email = txtEmail.getText().toString();
    	
    	String confSenha = txtConfSenha.getText().toString();
    	String confEmail = txtConfEmail.getText().toString();
    	
    	/*Caso o conteúdo da variável modo seja "Novo", verifica os campos e insere no banco*/
    	if(modo=="Novo"){
    		System.out.println("Adicionar funcionário");
    		
    		GerFuncionarioController func = new GerFuncionarioController(this);
    		func.InserirFuncionario(nome, rg, cpf, dtNasc, dtAdm, idCargo, senha, confSenha, email, confEmail);
    	}
    	    	
    	/*Caso o conteúdo da variável modo seja "Editar", preenche os campos com os dados do banco, verifica e atualiza no banco*/
    	if(modo=="Editar"){
    		System.out.println("Editar funcionário");
    	}
    }    
    
    /*Declaração de variáveis*/
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblTodosClientes;
    private javax.swing.JTextField txtConfEmail;
    private javax.swing.JPasswordField txtConfSenha;
    private JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private JFormattedTextField txtRg;
    private javax.swing.JPasswordField txtSenha;
    private JPanel panelDadosProfissionais;
    private JFormattedTextField txtDtAdmissao;
    private JFormattedTextField txtDtNasc;
}