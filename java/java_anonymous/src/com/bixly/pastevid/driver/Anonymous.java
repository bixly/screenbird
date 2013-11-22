/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.your-keystore-here.pastevid.driver;

import com.your-keystore-here.pastevid.util.DebugUtil;
import javax.swing.JApplet;

/**
 *
 * @author cevaris
 */
public class Anonymous extends JApplet {
    
    
    @Override
    public void init() {
        DebugUtil.out("Testing Run");
        DebugUtil.error("Testing Run");
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Anonymous().init();
    }
}
