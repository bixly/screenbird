/*
 * DragBox.java
 *
 * Version 1.0
 * 
 * Created on 10/08/2011, 16:15:32
 * 25 May 2013
 */
package com.your-keystore-here.pastevid.screencap.components.capturebox;

import com.your-keystore-here.pastevid.models.ScreenSize;
import com.your-keystore-here.pastevid.util.LogUtil;
import com.your-keystore-here.pastevid.util.ResourceUtil;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author Bixly
 */
public class DragBox extends javax.swing.JWindow {

    private CaptureBox captureBox;
    private ScreenSize currentScreenSize;

    public DragBox(CaptureBox captureBox) {
        this.captureBox = captureBox;
        initComponents();
        initSubroutine();
    }

    /**
     * The container for the previous implementation was a javax.swing.JWindow.
     * The Junit testing does not detect JWindow containers so this container
     * was converted for a JFrame implementation. This code is the extra code
     * for handling this conversion.
     */
    private void initSubroutine() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(ResourceUtil.LOGO_TASKBAR)));
        this.setBackground(new Color(128, 128, 128, (int)(255 * 0.55)));
        this.jpDrag.setBackground(new Color(128, 128, 128, (int)(255 * 0.55)));
        this.standardARToggle.setBackground(new Color(128, 128, 128, 0));
        this.widescreenARToggle.setBackground(new Color(128, 128, 128, 0));

        // Hack for handling draggable JFrames on Mac OSX
        this.getRootPane().putClientProperty("apple.awt.draggableWindowBackground", Boolean.FALSE);

        this.pack();
//        this.setVisible(true);
        this.setVisible(false);

        this.setAlwaysOnTop(true);
    }

    /**
     * Updates size and aspect ratio of the CaptureBox parent of this DragBox.
     * @param showBox true if DragBox is to be shown after the CaptureBox update.
     */
    public void updateCapturingBox(boolean showBox) {
        // Default widths and heights for the aspect ratios
        int wideWidth       = 800;
        int wideHeight      = 450;
        int standardWidth   = 530;
        int standardHeight  = 397;
        
        // Check that the CaptureBox is not locked
        if (this.captureBox.getLockCapturebox()) {
            return;
        }

        // Update CaptureBox based on selected aspect ratio
        if (this.widescreenARToggle.getModel().isSelected() ||
                !this.standardARToggle.getModel().isSelected()) {
            // Widescreen aspect ratio selected
            this.setCurrentScreenSize(new ScreenSize(ScreenSize.WIDE, wideWidth, wideHeight, ScreenSize.AR_WIDE));
            this.captureBox.setAspectRatio(CaptureBoxState.WIDESCREEN);
        } else {
            // Standard aspect ratio selected
            this.setCurrentScreenSize(new ScreenSize(ScreenSize.STANDARD, standardWidth, standardHeight, ScreenSize.AR_STANDARD));
            this.captureBox.setAspectRatio(CaptureBoxState.STANDARD_SCREEN);
        }

        // Reposition the dragbox
        this.captureBox.drawBox(currentScreenSize.getWidth(), currentScreenSize.getHeight(), showBox);
        this.setVisible(showBox);
    }

    /**
     * Sets the parent CaptureBox for this DragBox.
     * @param captureBox 
     */
    public void setCaptureBox(CaptureBox captureBox) {
        this.captureBox = captureBox;
    }

    /**
     * Returns the current screen size of the parent CaptureBox.
     * @return 
     */
    public ScreenSize getCurrentScreenSize() {
        return currentScreenSize;
    }

    /**
     * Saves the current size of the parent CaptureBox.
     * @param currentScreenSize size of the CaptureBox
     */
    public void setCurrentScreenSize(ScreenSize currentScreenSize) {
        this.currentScreenSize = currentScreenSize;
    }

    /**
     * Sets the aspect ratio setting of the parent CaptureBox and updates the
     * selected toggle on the DragBox.
     * @param captureBoxState state of the capture box
     */
    public void setAspectRatio(CaptureBoxState captureBoxState) {
        if (captureBoxState == CaptureBoxState.WIDESCREEN) {
            this.standardARToggle.setSelected(false);
            this.widescreenARToggle.setSelected(true);
        } else {
            this.standardARToggle.setSelected(true);
            this.widescreenARToggle.setSelected(false);
        }
        updateCapturingBox(false);
    }

    /**
     * Updates the dimensions of the parent CaptureBox displayed on the DragBox.
     * @param size 
     */
    public void updateSizeLabel(Dimension size) {
        // Retain original visibility setting
        boolean originalVisibility = this.isVisible();
        this.lblSize.setText(size.width + "x" + size.height);
        this.setVisible(originalVisibility);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDrag = new javax.swing.JPanel();
        standardARToggle = new javax.swing.JToggleButton();
        lblSize = new javax.swing.JLabel();
        widescreenARToggle = new javax.swing.JToggleButton();

        setAlwaysOnTop(true);
        setBackground(java.awt.Color.darkGray);
        setMinimumSize(new java.awt.Dimension(160, 100));
        setName("jfDragBox"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDrag.setBackground(java.awt.Color.gray);
        jpDrag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpDrag.setMaximumSize(new java.awt.Dimension(160, 100));
        jpDrag.setMinimumSize(new java.awt.Dimension(160, 100));
        jpDrag.setName("jpDragBox"); // NOI18N
        jpDrag.setPreferredSize(new java.awt.Dimension(160, 100));

        standardARToggle.setBackground(java.awt.Color.darkGray);
        standardARToggle.setForeground(java.awt.Color.white);
        standardARToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/capturebox/normal-inactive.png"))); // NOI18N
        standardARToggle.setSelected(true);
        standardARToggle.setToolTipText("Normal (4:3)");
        standardARToggle.setAlignmentY(0.0F);
        standardARToggle.setBorderPainted(false);
        standardARToggle.setContentAreaFilled(false);
        standardARToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        standardARToggle.setFocusable(false);
        standardARToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        standardARToggle.setIconTextGap(0);
        standardARToggle.setMaximumSize(new java.awt.Dimension(33, 32));
        standardARToggle.setMinimumSize(new java.awt.Dimension(33, 32));
        standardARToggle.setName("standardARToggle"); // NOI18N
        standardARToggle.setPreferredSize(new java.awt.Dimension(34, 32));
        standardARToggle.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/capturebox/normal-active.png"))); // NOI18N
        standardARToggle.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/capturebox/normal-hover.png"))); // NOI18N
        standardARToggle.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/capturebox/normal-active.png"))); // NOI18N
        standardARToggle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/capturebox/normal-active.png"))); // NOI18N
        standardARToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardARToggleActionPerformed(evt);
            }
        });

        lblSize.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSize.setForeground(new java.awt.Color(255, 255, 255));
        lblSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSize.setText("400x300");
        lblSize.setDoubleBuffered(true);
        lblSize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        widescreenARToggle.setBackground(java.awt.Color.darkGray);
        widescreenARToggle.setForeground(java.awt.Color.white);
        widescreenARToggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/capturebox/wide-inactive.png"))); // NOI18N
        widescreenARToggle.setToolTipText("Widescreen (16:9)");
        widescreenARToggle.setAlignmentY(0.0F);
        widescreenARToggle.setBorderPainted(false);
        widescreenARToggle.setContentAreaFilled(false);
        widescreenARToggle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        widescreenARToggle.setFocusable(false);
        widescreenARToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        widescreenARToggle.setIconTextGap(0);
        widescreenARToggle.setMaximumSize(new java.awt.Dimension(34, 32));
        widescreenARToggle.setMinimumSize(new java.awt.Dimension(34, 32));
        widescreenARToggle.setName("toggleScreenSize"); // NOI18N
        widescreenARToggle.setPreferredSize(new java.awt.Dimension(34, 32));
        widescreenARToggle.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/capturebox/wide-active.png"))); // NOI18N
        widescreenARToggle.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/capturebox/wide-hover.png"))); // NOI18N
        widescreenARToggle.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/capturebox/wide-active.png"))); // NOI18N
        widescreenARToggle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/your-keystore-here/pastevid/resources/sb/capturebox/wide-active.png"))); // NOI18N
        widescreenARToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widescreenARToggleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDragLayout = new javax.swing.GroupLayout(jpDrag);
        jpDrag.setLayout(jpDragLayout);
        jpDragLayout.setHorizontalGroup(
            jpDragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDragLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDragLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(standardARToggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(widescreenARToggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblSize, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpDragLayout.setVerticalGroup(
            jpDragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDragLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpDragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(standardARToggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(widescreenARToggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        getContentPane().add(jpDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

private void standardARToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardARToggleActionPerformed
    if (this.standardARToggle.isSelected()) {
        this.widescreenARToggle.setSelected(false);
    } else {
        this.widescreenARToggle.setSelected(true);
    }
    this.updateCapturingBox(true);
    if (this.captureBox != null) {
        this.captureBox.save();
    }
}//GEN-LAST:event_standardARToggleActionPerformed

    private void widescreenARToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widescreenARToggleActionPerformed
        if (this.widescreenARToggle.isSelected()) {
            this.standardARToggle.setSelected(false);
        } else {
            this.standardARToggle.setSelected(true);
        }
        this.updateCapturingBox(true);
        if (this.captureBox != null) {
            this.captureBox.save();
        }
    }//GEN-LAST:event_widescreenARToggleActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpDrag;
    private javax.swing.JLabel lblSize;
    private javax.swing.JToggleButton standardARToggle;
    private javax.swing.JToggleButton widescreenARToggle;
    // End of variables declaration//GEN-END:variables

    public void log(Object message) {
        LogUtil.log(DragBox.class, message);
    }
}
