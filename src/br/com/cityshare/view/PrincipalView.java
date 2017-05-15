/*Classe responsÃ¡vel por abrigar todas as chamadas para outras telas*/
package br.com.cityshare.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.cityshare.controller.GerClienteController;
import br.com.cityshare.controller.GerFrotaController;
import br.com.cityshare.controller.GerFuncionarioController;
import br.com.cityshare.controller.GerReservaController;
import br.com.cityshare.controller.GerVeiculoController;
import br.com.cityshare.controller.PrincipalController;
import br.com.cityshare.controller.RelClienteController;
import br.com.cityshare.controller.RelFuncionarioController;
import br.com.cityshare.controller.RelReservaController;
import br.com.cityshare.controller.RelVeiculoController;
import br.com.cityshare.controller.SobreDesenvolvedoresController;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JInternalFrame;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class PrincipalView extends javax.swing.JFrame {
	
	/*Métdo que inicia os componentes na tela*/
    public PrincipalView() {
        initComponents();
    }
    
    /*Método que compõe os componentes*/
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGerCliente = new javax.swing.JButton();
        btnGerFuncionario = new javax.swing.JButton();
        btnGerVeiculo = new javax.swing.JButton();
        btnGerFrota = new javax.swing.JButton();
        btnGerReserva = new javax.swing.JButton();
        btnRelCliente = new javax.swing.JButton();
        btnRelFuncionario = new javax.swing.JButton();
        btnRelFuncionario1 = new javax.swing.JButton();
        btnRelFuncionario2 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        mnGerenciamentos = new javax.swing.JMenu();
        subGerClientes = new javax.swing.JMenuItem();
        subGerFuncionarios = new javax.swing.JMenuItem();
        subGerVeiculos = new javax.swing.JMenuItem();
        subGerFrotas = new javax.swing.JMenuItem();
        subGerReservas = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();
        subRelClientes = new javax.swing.JMenuItem();
        subRelFuncionarios = new javax.swing.JMenuItem();
        subRelReservas = new javax.swing.JMenuItem();
        subRelVeiculos = new javax.swing.JMenuItem();
        mnSobre = new javax.swing.JMenu();
        subSobreCityshare = new javax.swing.JMenuItem();
        subSobreDesenvolvedores = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        subSobreSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("City Share");
        setBounds(new java.awt.Rectangle(0, 0, 700, 600));
        setFont(new java.awt.Font("Arial", 0, 12)); 
        setMinimumSize(new java.awt.Dimension(700, 600));
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        /*-----------------------------------INÍCIO DO CÓDIGO DO RODAPÉ-----------------------------------*/
        jPanel1.setFont(new java.awt.Font("Arial", 0, 12)); 
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desenvolvido por SoftWhere IT Solutions");

        lblHora.setFont(new java.awt.Font("Arial", 1, 12)); 
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("00:00:00");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cityshare/images/logoutIcon.png"))); 
        btnSair.setMaximumSize(new java.awt.Dimension(30, 30));
        btnSair.setMinimumSize(new java.awt.Dimension(30, 30));
        btnSair.setPreferredSize(new java.awt.Dimension(30, 30));
        btnSair.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				LogOff();				
			}
		});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
        			.addComponent(lblHora, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(lblHora, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1.setLayout(jPanel1Layout);
        /*-----------------------------------FIM DO CÓDIGO DO RODAPÉ-----------------------------------*/
        
        
        /*-----------------------------------INÍCIO DO CÓDIGO DO JDESKTOPPANE PRINCIPAL-----------------------------------*/
        jDesktopPane2.setBackground(new java.awt.Color(0, 153, 153));
        jDesktopPane2.setForeground(new java.awt.Color(0, 153, 153));
        jDesktopPane2.setFont(new java.awt.Font("Arial", 0, 12));
        jDesktopPane2.setMinimumSize(new java.awt.Dimension(700, 443));        

        /*-----------------------------------INÍCIO DO CÓDIGO DA TELA DE SAUDAÇÕES-----------------------------------*/
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Bem vindo!");
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(630, 350));
        jInternalFrame1.setVisible(true);

        jLabel3.setText("Logotipo");
        jLabel3.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel3.setMinimumSize(new java.awt.Dimension(80, 80));
        jLabel3.setName("Logotipo"); 
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); 
        jLabel4.setText("Bem vindo, o que deseja fazer?");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); 
        jLabel2.setText("Relatórios:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); 
        jLabel5.setText("Gerenciamentos:");

        btnGerCliente.setText("Cliente");
        btnGerCliente.setMaximumSize(new java.awt.Dimension(80, 80));
        btnGerCliente.setMinimumSize(new java.awt.Dimension(80, 80));
        btnGerCliente.setPreferredSize(new java.awt.Dimension(80, 80));
        /*Quando o botão for clicado chama o método privado da classe que abre a janela de Gerenciamento de cliente*/
        btnGerCliente.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirGerCliente();				
			}
		});

        btnGerFuncionario.setText("Funcionário");
        btnGerFuncionario.setMaximumSize(new java.awt.Dimension(80, 80));
        btnGerFuncionario.setMinimumSize(new java.awt.Dimension(80, 80));
        btnGerFuncionario.setPreferredSize(new java.awt.Dimension(80, 80));
        /*Quando o botão for clicado chama o método privado da classe que abre a janela de Gerenciamento de Funcionário*/
        btnGerFuncionario.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirGerFuncionario();				
			}
		});
        
        btnGerVeiculo.setText("Veículo");
        btnGerVeiculo.setMaximumSize(new java.awt.Dimension(80, 80));
        btnGerVeiculo.setMinimumSize(new java.awt.Dimension(80, 80));
        btnGerVeiculo.setPreferredSize(new java.awt.Dimension(80, 80));
        /*Quando o botão for clicado chama o método privado da classe que abre a janela de Gerenciamento de Veículo*/
        btnGerVeiculo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirGerVeículo();				
			}
		});
        
        btnGerFrota.setText("Frota");
        btnGerFrota.setMaximumSize(new java.awt.Dimension(80, 80));
        btnGerFrota.setMinimumSize(new java.awt.Dimension(80, 80));
        btnGerFrota.setPreferredSize(new java.awt.Dimension(80, 80));
        /*Quando o botão for clicado chama o método privado da classe que abre a janela de Gerenciamento de Frota*/
        btnGerFrota.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirGerFrota();				
			}
		});
        
        btnGerReserva.setText("Reserva");
        btnGerReserva.setMaximumSize(new java.awt.Dimension(80, 80));
        btnGerReserva.setMinimumSize(new java.awt.Dimension(80, 80));
        btnGerReserva.setPreferredSize(new java.awt.Dimension(80, 80));
        /*Quando o botão for clicado chama o método privado da classe que abre a janela de Gerenciamento de Reserva*/
        btnGerReserva.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirGerReserva();				
			}
		});
        
        btnRelCliente.setText("Clientes");
        btnRelCliente.setMaximumSize(new java.awt.Dimension(80, 80));
        btnRelCliente.setMinimumSize(new java.awt.Dimension(80, 80));
        btnRelCliente.setPreferredSize(new java.awt.Dimension(80, 80));
        /*Quando o botão for clicado chama o método privado da classe que abre a janela de Relatório de cliente*/
        btnRelCliente.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirRelCliente();				
			}
		});

        btnRelFuncionario.setText("Funcionários");
        btnRelFuncionario.setMaximumSize(new java.awt.Dimension(80, 80));
        btnRelFuncionario.setMinimumSize(new java.awt.Dimension(80, 80));
        btnRelFuncionario.setPreferredSize(new java.awt.Dimension(80, 80));
        /*Quando o botão for clicado chama o método privado da classe que abre a janela de Relatório de funcionário*/
        btnRelFuncionario.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirRelFuncionario();				
			}
		});
        
        btnRelFuncionario1.setText("Reservas");
        btnRelFuncionario1.setMaximumSize(new java.awt.Dimension(80, 80));
        btnRelFuncionario1.setMinimumSize(new java.awt.Dimension(80, 80));
        btnRelFuncionario1.setPreferredSize(new java.awt.Dimension(80, 80));
        /*Quando o botão for clicado chama o método privado da classe que abre a janela de Relatório de reserva*/
        btnRelFuncionario1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirRelReserva();				
			}
		});
        
        btnRelFuncionario2.setText("Veículos");
        btnRelFuncionario2.setMaximumSize(new java.awt.Dimension(80, 80));
        btnRelFuncionario2.setMinimumSize(new java.awt.Dimension(80, 80));
        btnRelFuncionario2.setPreferredSize(new java.awt.Dimension(80, 80));
        /*Quando o botão for clicado chama o método privado da classe que abre a janela de Relatório de veículo*/
        btnRelFuncionario2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirRelVeiculo();			
			}
		});
        
        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1Layout.setHorizontalGroup(
        	jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jInternalFrame1Layout.createSequentialGroup()
        			.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jInternalFrame1Layout.createSequentialGroup()
        					.addGap(35)
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(37)
        					.addComponent(jLabel4))
        				.addGroup(jInternalFrame1Layout.createSequentialGroup()
        					.addGap(19)
        					.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jInternalFrame1Layout.createSequentialGroup()
        							.addComponent(btnGerCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnGerFuncionario, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
        						.addGroup(Alignment.TRAILING, jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(jInternalFrame1Layout.createSequentialGroup()
        								.addComponent(btnRelCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(btnRelFuncionario, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
        							.addComponent(jLabel2)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(btnRelFuncionario1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnGerVeiculo, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(btnRelFuncionario2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnGerFrota, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnGerReserva, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
        					.addGap(59))
        				.addGroup(jInternalFrame1Layout.createSequentialGroup()
        					.addGap(20)
        					.addComponent(jLabel5)))
        			.addGap(88))
        );
        jInternalFrame1Layout.setVerticalGroup(
        	jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jInternalFrame1Layout.createSequentialGroup()
        			.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jInternalFrame1Layout.createSequentialGroup()
        					.addGap(35)
        					.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4))
        					.addGap(64)
        					.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnGerCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnGerFuncionario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnGerVeiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnGerFrota, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnGerReserva, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(37)
        					.addComponent(jLabel2)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnRelCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnRelFuncionario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnRelFuncionario1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnRelFuncionario2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jInternalFrame1Layout.createSequentialGroup()
        					.addGap(152)
        					.addComponent(jLabel5)))
        			.addContainerGap(31, Short.MAX_VALUE))
        );
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);

        jDesktopPane2.add(jInternalFrame1);
        jInternalFrame1.setBounds(30, 60, 630, 460);
        /*-----------------------------------INÍCIO DO CÓDIGO DA TELA DE SAUDAÇÕES-----------------------------------*/

        /*-----------------------------------INÍCIO DO CÓDIGO DO MENU-----------------------------------*/
        mnGerenciamentos.setText("Gerenciamentos");

        subGerClientes.setText("Gerenciamento de Clientes");
        mnGerenciamentos.add(subGerClientes);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Gerenciamento de Cliente*/
        subGerClientes.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirGerCliente();				
			}
		});

        subGerFuncionarios.setText("Gerenciamento de Funcionários");
        mnGerenciamentos.add(subGerFuncionarios);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Gerenciamento de Funcionário*/
        subGerFuncionarios.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirGerFuncionario();				
			}
		});

        subGerVeiculos.setText("Gerenciamento de Veículos");
        mnGerenciamentos.add(subGerVeiculos);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Gerenciamento de Veículo*/
        subGerVeiculos.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirGerVeículo();				
			}
		});

        subGerFrotas.setText("Gerenciamento de Frotas");
        mnGerenciamentos.add(subGerFrotas);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Gerenciamento de Frota*/
        subGerFrotas.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirGerFrota();				
			}
		});

        subGerReservas.setText("Gerenciamento de Reservas");
        mnGerenciamentos.add(subGerReservas);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Gerenciamento de Reserva*/
        subGerReservas.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirGerReserva();				
			}
		});

        menuBar.add(mnGerenciamentos);

        mnRelatorios.setText("Relatórios");

        subRelClientes.setText("Relatórios de Clientes");
        mnRelatorios.add(subRelClientes);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Relatório de Cliente*/
        subRelClientes.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirRelCliente();				
			}
		});

        subRelFuncionarios.setText("Relatórios de Funcionários");
        mnRelatorios.add(subRelFuncionarios);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Relatório de Funcionario*/
        subRelFuncionarios.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirRelFuncionario();				
			}
		});

        subRelReservas.setText("Relatórios de Reservas");
        mnRelatorios.add(subRelReservas);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Relatório de Reserva*/
        subRelReservas.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirRelReserva();				
			}
		});

        subRelVeiculos.setText("Relatórios de Veículos");
        mnRelatorios.add(subRelVeiculos);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Relatório de Veículo*/
        subRelVeiculos.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirRelVeiculo();				
			}
		});

        menuBar.add(mnRelatorios);

        mnSobre.setText("Sobre");

        subSobreCityshare.setText("City Share");
        mnSobre.add(subSobreCityshare);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Sobre a City Share*/
        subSobreCityshare.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
								
			}
		});

        subSobreDesenvolvedores.setText("Desenvolvedores");
        mnSobre.add(subSobreDesenvolvedores);
        /*Quando o submenu for clicado chama o método privado da classe que abre a janela de Sobre os desenvolvedores*/
        subSobreDesenvolvedores.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AbrirSobreDev();				
			}
		});
        
        mnSobre.add(jSeparator1);

        subSobreSair.setText("Sair");
        mnSobre.add(subSobreSair);
        /*Quando o submenu for clicado chama o método privado da classe para sair do sistema*/
        subSobreSair.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				LogOff();				
			}
		});

        menuBar.add(mnSobre);

        setJMenuBar(menuBar);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jDesktopPane2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jDesktopPane2, GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        getContentPane().setLayout(layout);
        jDesktopPane2.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{jInternalFrame1, jInternalFrame1.getContentPane(), jLabel3, jLabel4, btnRelCliente, btnRelFuncionario, jLabel2, btnRelFuncionario1, btnGerCliente, btnGerFuncionario, btnGerVeiculo, btnGerFrota, btnRelFuncionario2, btnGerReserva, jLabel5}));

        setSize(new java.awt.Dimension(716, 739));
        setLocationRelativeTo(null);
        /*-----------------------------------FIM DO CÓDIGO DO MENU-----------------------------------*/
        
        /*-----------------------------------FIM DO CÓDIGO DO JDESKTOPPANE PRINCIPAL-----------------------------------*/
    }
    
    /*-----------------------------------Métodos especiais da classe-----------------------------------*/    
    /*Método para quando a janela for inicializada*/
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        /*Faz com que a tela redimencione de acordo com as dimensões do monitor*/
        this.setExtendedState(MAXIMIZED_BOTH);
        
        /*Preenche o rodapé com a data e hora do sistema*/
        PrincipalController dh = new PrincipalController(this);
        lblHora.setText(dh.BuscarDataHora());
    }
    
    /*Método que executa a ação do botão de LogOff*/
    private void LogOff(){
    	PrincipalController tela = new PrincipalController(new PrincipalView());
    	tela.FecharPrincipal();
    }
    
    /*Método que executa ação de chama da tela de Gerenciamento de Cliente*/
    private void AbrirGerCliente(){
    	GerClienteController tela = new GerClienteController(new GerClienteView());
    	tela.AbrirGerCliente();
    }
    
    /*Método que executa ação de chama da tela de Gerenciamento de Funcionário*/
    private void AbrirGerFuncionario(){
    	GerFuncionarioController tela = new GerFuncionarioController(new GerFuncionarioView());
    	tela.AbrirGerFuncionario();
    }
    
    /*Método que executa ação de chama da tela de Gerenciamento de Frota*/
    private void AbrirGerFrota(){
    	GerFrotaController tela = new GerFrotaController(new GerFrotaView());
    	tela.AbrirGerFrota();
    }
    
    /*Método que executa ação de chama da tela de Gerenciamento de Reserva*/
    private void AbrirGerReserva(){
    	GerReservaController tela = new GerReservaController(new GerReservaView());
    	tela.AbrirGerReserva();
    }
    
    /*Método que executa ação de chama da tela de Gerenciamento de Veículo*/
    private void AbrirGerVeículo(){
    	GerVeiculoController tela = new GerVeiculoController(new GerVeiculoView());
    	tela.AbrirGerVeiculo();
    }
    
    /*Método que executa ação de chama da tela de Relatório de Veículo*/
    private void AbrirRelVeiculo(){
    	RelVeiculoController tela = new RelVeiculoController(new RelVeiculosView());
    	tela.AbrirRelVeiculo();
    }
    
    /*Método que executa ação de chama da tela de Relatório de Cliente*/
    private void AbrirRelCliente(){
    	RelClienteController tela = new RelClienteController(new RelClientesView());
    	tela.AbrirRelCliente();
    }
    
    /*Método que executa ação de chama da tela de Relatório de Reserva*/
    private void AbrirRelReserva(){
    	RelReservaController tela = new RelReservaController(new RelReservasView());
    	tela.AbrirRelReserva();
    }
    
    /*Método que executa ação de chama da tela de Relatório de Funcionario*/
    private void AbrirRelFuncionario(){
    	RelFuncionarioController tela = new RelFuncionarioController(new RelFuncionariosView());
    	tela.AbrirRelFuncionario();
    }  
    
    /*Método que executa ação de chama da tela de sobre os desenvolvedores*/
    private void AbrirSobreDev(){
    	SobreDesenvolvedoresController tela = new SobreDesenvolvedoresController(new SobreDesenvolvedoresView());
    	tela.AbrirSobreDesenvolvedores();
    }  
    
    /*Método para encerrar todas as janelas internas que estiverem abertas*/
    public void EncerrarTodasJanelas(){
    	JInternalFrame[] janelas = jDesktopPane2.getAllFrames();
    	for(int i=0; i<janelas.length; i++){
    		try{
    			//janelas<i>.dispose();  
    		}catch(Exception e){
    			e.printStackTrace();
    		}
    	}
    }
    

    /*-----------------------------------Declaração de variáveis-----------------------------------*/
    private javax.swing.JButton btnGerCliente;
    private javax.swing.JButton btnGerFrota;
    private javax.swing.JButton btnGerFuncionario;
    private javax.swing.JButton btnGerReserva;
    private javax.swing.JButton btnGerVeiculo;
    private javax.swing.JButton btnRelCliente;
    private javax.swing.JButton btnRelFuncionario;
    private javax.swing.JButton btnRelFuncionario1;
    private javax.swing.JButton btnRelFuncionario2;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblHora;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnGerenciamentos;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenu mnSobre;
    private javax.swing.JMenuItem subGerClientes;
    private javax.swing.JMenuItem subGerFrotas;
    private javax.swing.JMenuItem subGerFuncionarios;
    private javax.swing.JMenuItem subGerReservas;
    private javax.swing.JMenuItem subGerVeiculos;
    private javax.swing.JMenuItem subRelClientes;
    private javax.swing.JMenuItem subRelFuncionarios;
    private javax.swing.JMenuItem subRelReservas;
    private javax.swing.JMenuItem subRelVeiculos;
    private javax.swing.JMenuItem subSobreCityshare;
    private javax.swing.JMenuItem subSobreDesenvolvedores;
    private javax.swing.JMenuItem subSobreSair;
}