/*
 * RecordFromHereSB.java
 *
 * Version 1.0
 * 
 * Created on Mar 29, 2012, 2:07:27 PM
 * 16 May 2013
 */
package com.your-keystore-here.pastevid.screencap.components.preview;

import com.your-keystore-here.pastevid.util.ResourceUtil;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 * Default RecordFromHere panel for Windows and Mac environments
 * @author jjmon_000
 */
public class RecordFromHereSB extends javax.swing.JPanel 
                              implements IRecordFromHere, MouseListener {
    
    private PreviewPlayer jpPreviewPlayer = null;
    
    /**
     * Creates new form RecordFromHereSB.
     */
    public RecordFromHereSB(PreviewPlayer player) {
        initComponents();
        this.jpPreviewPlayer = player;
        this.jLabel1.addMouseListener(this);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new Color(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(148, 34));
        setMinimumSize(new java.awt.Dimension(148, 34));
        setPreferredSize(new java.awt.Dimension(148, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/preview/preview_slider_panel_normal.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(148, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(148, 34));
        jLabel1.setPreferredSize(new java.awt.Dimension(148, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public void setLabelTextTimeCurrent(String text) {
        // No longer implemented.
    }

    public void mouseClicked(MouseEvent e) {
        this.jpPreviewPlayer.startRecordingFromHere();
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
        this.jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.jLabel1.setIcon(new ImageIcon(getClass().getResource(ResourceUtil.RECORD_FROM_HERE_HOVER)));
        this.repaint();
    }

    public void mouseExited(MouseEvent e) {
        this.jLabel1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        this.jLabel1.setIcon(new ImageIcon(getClass().getResource(ResourceUtil.RECORD_FROM_HERE_NORMAL)));
        this.repaint();
    }
}
