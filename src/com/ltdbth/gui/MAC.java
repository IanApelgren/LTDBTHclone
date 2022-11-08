/*
 * @author Ian Apelgren 
 * @author James Cooke
 * MAC is a network tool that displays your networks mac addresses to the console 
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *houses all components for MAC 
 */
public class MAC extends javax.swing.JFrame {


    /**
     * Creates new form appPages
     */
    public MAC() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    private void initComponents() {
    	String name = null;
    	
    	
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        RunButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        nameLabel = new javax.swing.JLabel();
        description = new javax.swing.JTextArea();
        PictureLabel2 = new javax.swing.JLabel();

        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        //launch button action listener
        RunButton.setText("Launch");
        RunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					RunButtonActionPerformed(evt);
				} catch (IOException e) {
					e.printStackTrace();
				}
            }
        });

        //back button action listener
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                
                .addGap(126, 126, 126)
                .addComponent(RunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(RunButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    )
                .addContainerGap())
        );

        DscriptionTextArea.setBackground(new java.awt.Color(102, 204, 255));
        DscriptionTextArea.setColumns(20);
        DscriptionTextArea.setLineWrap(true);
        DscriptionTextArea.setRows(20);
        DscriptionTextArea.setText("Output will go here");
        DscriptionTextArea.setWrapStyleWord(true);
        DscriptionTextArea.setAutoscrolls(false);
        DscriptionTextArea.setBorder(null);
        DscriptionTextArea.setFocusable(false);
        DscriptionTextArea.setOpaque(false);
        jScrollPane1.setViewportView(DscriptionTextArea);

        nameLabel.setFont(new java.awt.Font("Georgia", 1, 36)); 
        nameLabel.setText("MAC Address finder and lookup");

        description.setBackground(new java.awt.Color(102, 204, 255));
        description.setColumns(20);
        description.setLineWrap(true);
        description.setRows(20);
        description.setWrapStyleWord(true);
        description.setAutoscrolls(false);
        description.setBorder(null);
        description.setFocusable(false);
        description.setOpaque(false);
        description.setSize(300, 536);
        description.setText("A MAC address is a unique number assigned to network control devices like a computer's "
        		+ "wifi adapter and can be used to see exactly what is on your network. If you check this often you can "
        		+ "get a feel for how many devices you have and will be able to notice if a device that shouldn't be there is. "
        		+ "Use the lookup function to find the manufacturer of the device. ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PictureLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(PictureLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    //houses action event for launch button read imput from cmd to diplay in app
    public void RunButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException { 
    	Process p = Runtime.getRuntime().exec("arp -a");
    	
    	BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
    	
    	
    	StringJoiner joiner = new StringJoiner("\n");
    	String line = null;
    	
    	while ((line = stdInput.readLine()) != null) {
    		joiner.add(line);
    		
    	}
    	String output = joiner.toString();
    	DscriptionTextArea.setText(output);
    	
    	
	}

    
    //houses action event for install button
    public void InstallButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	JOptionPane.showMessageDialog(this, "ipconfig uses cmd which is native to windows.");
	}

    //houses action event for back button
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	new NetworkToolsPage().setVisible(true);
    	this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAC().setVisible(true);
            }
        });
        
    }

    // Variables declaration
    private javax.swing.JButton BackButton;
    private javax.swing.JTextArea DscriptionTextArea;
    private JTextArea description;
    private javax.swing.JLabel PictureLabel2;
    private javax.swing.JButton RunButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    
}
