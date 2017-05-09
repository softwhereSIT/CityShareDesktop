/*Classe respons�vel pela parte visual da tela Sobre os desenvolvedores*/
package br.com.cityshare.view;

@SuppressWarnings("serial")
public class SobreDesenvolvedoresView extends javax.swing.JFrame {

	/*M�todo que inicia os componentes na tela*/
    public SobreDesenvolvedoresView() {
        initComponents();
    }
    
    /*M�todo quue comp�e os componentes*/
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSobre = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre - City Share");
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        txtSobre.setColumns(20);
        txtSobre.setRows(5);
        txtSobre.setMaximumSize(new java.awt.Dimension(380, 380));
        txtSobre.setMinimumSize(new java.awt.Dimension(380, 380));
        txtSobre.setPreferredSize(new java.awt.Dimension(380, 380));
        jScrollPane1.setViewportView(txtSobre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(416, 439));
        setLocationRelativeTo(null);
    }

    /*Declara��o de vari�veis*/
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtSobre;
}