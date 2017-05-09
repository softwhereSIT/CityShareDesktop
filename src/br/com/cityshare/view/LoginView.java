/*Classe LoginView, responsÃ¡vel por toda a parte visual da tela de login*/
package br.com.cityshare.view;

import br.com.cityshare.controller.LoginController;

@SuppressWarnings("serial")
public class LoginView extends javax.swing.JFrame {
	
	/*Método que inicia os componentes na tela*/
    public LoginView() {
        initComponents();
    }
    
    /*Método que compõe os componentes*/
    private void initComponents() {
        lblLogotipo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("City Share - Login");
        setBounds(new java.awt.Rectangle(0, 0, 300, 300));
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(300, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cityshare/images/logo_city_share.png"))); // NOI18N
        getContentPane().add(lblLogotipo);
        lblLogotipo.setBounds(101, 22, 197, 58);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("E-mail:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 100, 42, 30);

        txtEmail.setText("Digite aqui seu e-mail");
        getContentPane().add(txtEmail);
        txtEmail.setBounds(150, 100, 150, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 140, 45, 30);

        txtSenha.setText("Digite sua senha");
        txtSenha.setToolTipText("Digite sua senha");
        getContentPane().add(txtSenha);
        txtSenha.setBounds(150, 140, 152, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Esqueceu a senha? Contate o suporte");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 250, 330, 15);

        btnEntrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(220, 190, 70, 23);

        btnCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(110, 190, 90, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cityshare/images/wallpaperLogin.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel4.setMinimumSize(new java.awt.Dimension(300, 300));
        jLabel4.setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 410, 300);

        setSize(new java.awt.Dimension(416, 316));
        setLocationRelativeTo(null);
    }
    
    /*Método que executa o a verificação de login*/
    @SuppressWarnings("deprecation")
	private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {
    	/*Guarda os txto digitado nas respectivas variáveis*/
    	String email = txtEmail.getText();
    	String senha = txtSenha.getText();
    	
    	LoginController login = new LoginController(this);
    	login.Verificacao(email, senha);    	
    }

    /*Método para a opção de cancelar*/
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    /*Declaração de variáveis*/
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
}