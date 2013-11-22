/*
 * RecorderMessage.java
 *
 * Version 1.0
 * 
 * Created on Mar 28, 2012, 10:15:16 AM
 * 23 May 2013
 */
package com.your-keystore-here.pastevid.screencap;

import javax.swing.JProgressBar;

/**
 * Custom JPanel displaying messages on the recorder.
 * @author cevaris
 */
public class RecorderMessage extends javax.swing.JPanel {

    public RecorderMessage() {
        initComponents();
        setEncodingBarVisible(false);
    }
    
    public void setEncodingBarVisible(boolean state){
        this.pbEncodingPrevVideo.setVisible(state);
    }

    public JProgressBar getPbEncodingPrevVideo() {
        return pbEncodingPrevVideo;
    }
    
    public void setText(String msg) {
        this.lblRecorderMessage.setText(msg);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrpRecorderMessage = new com.your-keystore-here.pastevid.util.view.JRoundedPanel();
        lblRecorderMessage = new javax.swing.JLabel();
        pbEncodingPrevVideo = new javax.swing.JProgressBar();

        setOpaque(false);

        lblRecorderMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblRecorderMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecorderMessage.setText("jLabel1");

        pbEncodingPrevVideo.setBorderPainted(false);

        javax.swing.GroupLayout jrpRecorderMessageLayout = new javax.swing.GroupLayout(jrpRecorderMessage);
        jrpRecorderMessage.setLayout(jrpRecorderMessageLayout);
        jrpRecorderMessageLayout.setHorizontalGroup(
            jrpRecorderMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jrpRecorderMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRecorderMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbEncodingPrevVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jrpRecorderMessageLayout.setVerticalGroup(
            jrpRecorderMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jrpRecorderMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jrpRecorderMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRecorderMessage)
                    .addComponent(pbEncodingPrevVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jrpRecorderMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jrpRecorderMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.your-keystore-here.pastevid.util.view.JRoundedPanel jrpRecorderMessage;
    private javax.swing.JLabel lblRecorderMessage;
    private javax.swing.JProgressBar pbEncodingPrevVideo;
    // End of variables declaration//GEN-END:variables
}
