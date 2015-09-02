/****
Copyright (c) 2015 The Jackson Laboratory

This is free software: you can redistribute it and/or modify it 
under the terms of the GNU General Public License as published by  
the Free Software Foundation, either version 3 of the License, or  
(at your option) any later version.
 
This software is distributed in the hope that it will be useful,  
but WITHOUT ANY WARRANTY; without even the implied warranty of 
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU 
General Public License for more details.

You should have received a copy of the GNU General Public License 
along with this software.  If not, see <http://www.gnu.org/licenses/>.
****/

package org.jax.cs.jcmsWebInstaller;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 *
 * @author cnh
 */
public class InstallMySQLPanel extends JCMSPanel {

    public InstallMySQLPanel(JDesktopPane desktopPane, JFrame frame) {
        super.JCMSPanel(desktopPane, frame);
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblJCMSWebInstallation = new javax.swing.JLabel();
        lblWindows = new javax.swing.JLabel();
        lblMAC = new javax.swing.JLabel();
        lblLINUX = new javax.swing.JLabel();
        lblMySQLDownload = new javax.swing.JLabel();

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonNextActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonNextActionPerformed(evt);
            }
        });

        txtMessage.setEditable(false);
        txtMessage.setColumns(20);
        txtMessage.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtMessage.setLineWrap(true);
        txtMessage.setRows(5);
        txtMessage.setTabSize(5);
        txtMessage.setText("JCMS Web stores all system data in a relational database.  MySQL Community Server is the repository for all system data.  Please install MySQL Community Server at this time.\n\nDownload MySQL Community Server for your specific platform from MySQL website. \n  \"http://dev.mysql.com/downloads/mysql/\"\n\nIf you have MySQL Community Server already installed just make sure you have a database administrator account before you proceed.  \n\nPlease note:  \nIf your database is on a remote server you still need to install MySQL Community Server on this server to remotely create or upgrade an existing database.\n");
        txtMessage.setWrapStyleWord(true);
        txtMessage.setCaretPosition(0);
        jScrollPane1.setViewportView(txtMessage);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Install MySQL Community Server");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblJCMSWebInstallation.setText("MySQL Community Server installation instructions:");

        lblWindows.setForeground(new java.awt.Color(0, 0, 255));
        lblWindows.setText("Windows");
        lblWindows.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblWindows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblWindowsMouseClicked(evt);
            }
        });

        lblMAC.setForeground(new java.awt.Color(0, 0, 255));
        lblMAC.setText("MAC");
        lblMAC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMACMouseClicked(evt);
            }
        });

        lblLINUX.setForeground(new java.awt.Color(0, 0, 255));
        lblLINUX.setText("LINUX");
        lblLINUX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLINUX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLINUXMouseClicked(evt);
            }
        });

        lblMySQLDownload.setForeground(new java.awt.Color(0, 0, 255));
        lblMySQLDownload.setText("MySQL Community Server download");
        lblMySQLDownload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMySQLDownload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMySQLDownloadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMySQLDownload)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblJCMSWebInstallation)
                        .addGap(28, 28, 28)
                        .addComponent(lblWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMAC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLINUX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextButton)))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMySQLDownload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJCMSWebInstallation)
                    .addComponent(lblWindows)
                    .addComponent(lblMAC)
                    .addComponent(lblLINUX))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(backButton))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonNextActionPerformed
        if (new Utils().isOSWindows())
            this.nextPanel(this, this.getJcmsView().getConfigureMySQLPanel(), this.getJcmsView());
        else
            this.nextPanel(this, this.getJcmsView().getDatabaseSetupPanel(), this.getJcmsView());
    }//GEN-LAST:event_nextButtonNextActionPerformed

    private void backButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonNextActionPerformed
        this.previousPanel(this, this.getJcmsView());
    }//GEN-LAST:event_backButtonNextActionPerformed

    private void lblWindowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWindowsMouseClicked
        BrowserLaunch.openURL(this.getPropertiesDTO().getMySQLInstallWindowsURL());
    }//GEN-LAST:event_lblWindowsMouseClicked

    private void lblMACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMACMouseClicked
        BrowserLaunch.openURL(this.getPropertiesDTO().getMySQLInstallMacURL());
    }//GEN-LAST:event_lblMACMouseClicked

    private void lblLINUXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLINUXMouseClicked
        BrowserLaunch.openURL(this.getPropertiesDTO().getMySQLInstallLinuxURL());        
    }//GEN-LAST:event_lblLINUXMouseClicked

    private void lblMySQLDownloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMySQLDownloadMouseClicked
        BrowserLaunch.openURL(this.getPropertiesDTO().getMySQLDownloadsURL());
        
    }//GEN-LAST:event_lblMySQLDownloadMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJCMSWebInstallation;
    private javax.swing.JLabel lblLINUX;
    private javax.swing.JLabel lblMAC;
    private javax.swing.JLabel lblMySQLDownload;
    private javax.swing.JLabel lblWindows;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}