/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.your-keystore-here.pastevid.screencap.components.preview;

import com.your-keystore-here.pastevid.editors.VideoScrubManager;
import com.your-keystore-here.pastevid.util.TimeUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author cevaris
 */
public class RecordFromHereLinuxTest {
    
    private static PreviewPlayer jpPreviewPlayer;
    
    public RecordFromHereLinuxTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        VideoScrubManager scrubManager = new VideoScrubManager();
        PreviewPlayerForm jfPreviewPlayer = new PreviewPlayerForm(scrubManager);
        jpPreviewPlayer = jfPreviewPlayer.getPlayerPanel();
        jpPreviewPlayer.showRecordFromHerePanel();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setLabelTextTimeCurrent method, of class RecordFromHereLinux.
     */
    @Test
    public void testSetLabelTextTimeCurrent() {
        System.out.println("setLabelTextTimeCurrent");
        String text = "00:01";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
        text = "00:02";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
        text = "00:03";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
        text = "00:04";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
        text = "00:05";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
        text = "00:04";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
        text = "00:03";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
        text = "00:02";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
        text = "00:01";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
        text = "00:00";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
        text = "GOOOAL!!!";
        jpPreviewPlayer.setLabelTextTimeCurrent(text);
        TimeUtil.skipToMyLou(1);
        
    }
}
