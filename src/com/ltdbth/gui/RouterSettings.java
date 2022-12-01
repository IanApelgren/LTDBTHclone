import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.StringJoiner;

/*
 * @author Ian Apelgren
 * @author James Cooke
 * router settings will pull your ip address then plug it in to a browser to pull up router settings.
 */

public class RouterSettings extends javax.swing.JFrame {

    /**
     * Creates new form RouterSettingsv2
     */
    public RouterSettings() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        launchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        
        
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Router Settings");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(102, 204, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setEnabled(false);

        description.setEditable(false);
        description.setBackground(new java.awt.Color(102, 204, 255));
        description.setColumns(20);
        description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        description.setLineWrap(true);
        description.setWrapStyleWord(true);
        description.setRows(5);
        description.setText("The router settings tool is designed to give you easy access to your network router. "
        		+ "It's important that both your router and wifi login have strong passwords as your router is the best "
        		+ "and often only line of defense preventing people from gaining access to your home network. Depending on "
        		+ "your provider there are often a plethora of other features included on your router's page such as traffic logs "
        		+ "and seeing devices connected to your network.\n"
        		+ "");
        description.setBorder(null);
        description.setFocusable(false);
        jScrollPane1.setViewportView(description);

        boolean winOS = Launcher.setOS();
    	if (winOS) 
    	{
    		jLabel2.setIcon(new javax.swing.ImageIcon(".\\src\\com\\ltdbth\\gui\\images\\routerSettings.png"));
    	}
    	else
    	{
    		jLabel2.setIcon(new javax.swing.ImageIcon("./src/com/ltdbth/gui/images/routerSettings.png"));
    	} 

        launchButton.setText("Launch");
        launchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					launchButtonActionPerformed(evt);
				} catch (IOException e) {
					
					e.printStackTrace();
				} catch (URISyntaxException e) {
					
					e.printStackTrace();
				}
            }
        });

        backButton.setText("Go Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(64, 64, 64)
                        .addComponent(launchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(launchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    //grabs your default gateway from ipconfig
    private void launchButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException, URISyntaxException {//GEN-FIRST:event_launchButtonActionPerformed
    	boolean winOS = Launcher.setOS();
    	
    	char c;
    	String s = "";
    	Process p;
    	if(winOS)
    	{
        	p = Runtime.getRuntime().exec("ipconfig");
    	}
    	else 
    	{
    		p = Runtime.getRuntime().exec("route get default");
    	}
    	
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
    	StringJoiner joiner = new StringJoiner("\n");
    	String line = null;
    	if (winOS)
    	{
    		//iterates through ipconfig. looks for default gateway. router IP is always displayed first
    		while ((line = stdInput.readLine()) != null) 
    		{
    			//if we find default gateway gets the ip from it
    			if(line.contains("   Default Gateway") == true) 
    			{
    				for (int i = 0; i != line.length() - 39; i++)
    				{		
    					c = line.charAt(i+39);	
    					s = s + c;
    				}
    				//prepares ip to be launched in browser
    				toWebsite(s);
    				break;
    			}
    			joiner.add(line);
    		
    		}
    	
    	}
    	else
    	{
    		StringBuilder output = new StringBuilder();
    		line = null;
    		
    		while((line = stdInput.readLine()) != null) {
    		       output.append(line);
    		}
    		
    		String result = output.toString();
    		String ip = "";
    		
    		for (int j = 73; j < 87; j++) {
    			ip += result.charAt(j);
    		}
    		
    		toWebsite(ip);
    		
    	}
    }

    //goes back to main splash
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	  new NetworkToolsPage().setVisible(true);
          this.dispose();
    }

    //prettys up input for being pushed to web
    public void toWebsite(String s) throws URISyntaxException, IOException
	{
		String website = "https://" + s;
		URI uriBase = new URI( website);
		java.awt.Desktop.getDesktop().browse(uriBase);
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
            java.util.logging.Logger.getLogger(RouterSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RouterSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RouterSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RouterSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RouterSettings().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton launchButton;
   
}
