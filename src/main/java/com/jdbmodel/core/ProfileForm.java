package com.jdbmodel.core;

import com.jdbmodel.dao.DbProfile;
import java.awt.Dialog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProfileForm extends javax.swing.JDialog {
    
    DbProfile pro = null;

    public ProfileForm(Dialog owner, boolean modal) {
        super(owner, modal);
        initComponents();
        setTitle("Database Connection");
        setLocationRelativeTo(null);
        setResizable(false);
        
        this.getRootPane().setDefaultButton(okButton);
        okButton.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        aliasBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        dbList = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hostName = new javax.swing.JTextField();
        portBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        usernameBox = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        paramBox = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        passwordBox = new javax.swing.JPasswordField();

        jLabel9.setText("jLabel9");

        aliasBox.setText("MySQL");

        jLabel4.setText("Alias:");

        okButton.setText("Connect");
        okButton.setSelected(true);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        dbList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MySQL", "Oracle" }));
        dbList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbListActionPerformed(evt);
            }
        });

        jLabel5.setText("Database:");

        jLabel3.setText("Authentication");

        jLabel7.setText("Server Location");

        jLabel8.setText("Host Name:");

        jLabel10.setText("Port:");

        hostName.setText("localhost");

        portBox.setText("3306");

        jLabel11.setText("Username:");

        jLabel12.setText("Password:");

        usernameBox.setText("root");

        jCheckBox1.setText("Remember");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Database");

        jLabel14.setText("Schema:");

        jButton3.setText("Ping");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10)))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameBox)
                                    .addComponent(portBox)
                                    .addComponent(hostName, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(paramBox)
                                    .addComponent(passwordBox))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jButton3)))
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(hostName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(portBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jButton3)))
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paramBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Database", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dbList, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aliasBox, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aliasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO implement
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        DbProfile profile = new DbProfile();
        
        // fill struct
        if (aliasBox.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please set the alias field.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            profile.setAlias(aliasBox.getText());
        }
        //TODO: check if such alias laready exists
        //TODO: add this profile to profiles list
        
        if (hostName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please set the hostname field.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            profile.setHostname(hostName.getText());
        }
        
        if (usernameBox.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please set the username field.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            profile.setUsername(usernameBox.getText());
        }
        
        profile.setPassword(passwordBox.getPassword()); // password can be empty
        
        //TODO: use parameter name here
        if (paramBox.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please set the database field.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            profile.setParameter(paramBox.getText());
        }
        
        try {
            profile.setPort(Integer.parseInt(portBox.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid port number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //TODO: make this configurable from an XML file
        String rdbms = (String)dbList.getSelectedItem();
        profile.setType(rdbms);
        
        if (rdbms.equals("MySQL")) {
            profile.setDriver("com.mysql.jdbc.Driver");
            profile.setConnectionString("jdbc:mysql://<HOST>:<PORT>/<PARAM>");
        } else if (rdbms.equals("Oracle")) {
            profile.setDriver("oracle.jdbc.driver.OracleDriver");
            profile.setConnectionString("jdbc:oracle:thin:@<HOST>:<PORT>:<PARAM>");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid database configuration.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // last step - init connection
        if (!doConnect(profile)) {
            return;
        }
        
        pro = profile;
        this.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private boolean doConnect(DbProfile profile) {
        // this will load the driver, each DB has its own driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Unable to load database driver", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        String connectString = profile.getConnectionString()
                .replaceAll("<HOST>", profile.getHostname())
                .replaceAll("<PORT>", Integer.toString(profile.getPort()));
        if (!profile.getParameter().trim().isEmpty()) {
            connectString = connectString.replaceAll("<PARAM>", profile.getParameter());
        }
        
        try {
            System.out.println("testing: " + connectString);
            Connection connection = DriverManager.getConnection(connectString, 
                    profile.getUsername(), String.copyValueOf(profile.getPassword()));
            profile.setConnection(connection);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Could not establish connection:\n" + e.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }        
    }
    
    private void dbListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbListActionPerformed
        // item has changed - replace with default values
        
        //TODO: make this configurable from an XML file
        String rdbms = (String)dbList.getSelectedItem();
        if (rdbms.equals("MySQL")) {
            aliasBox.setText("MySQL");
            portBox.setText("3306");
        } else if (rdbms.equals("Oracle")) {
            aliasBox.setText("Oracle");
            portBox.setText("1521");
        }
        
        hostName.setText("localhost");
        usernameBox.setText("root");
        passwordBox.setText("");
        paramBox.setText("");
    }//GEN-LAST:event_dbListActionPerformed

    public DbProfile getProfile() {
        return pro;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aliasBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox dbList;
    private javax.swing.JTextField hostName;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField paramBox;
    private javax.swing.JPasswordField passwordBox;
    private javax.swing.JTextField portBox;
    private javax.swing.JTextField usernameBox;
    // End of variables declaration//GEN-END:variables
}
