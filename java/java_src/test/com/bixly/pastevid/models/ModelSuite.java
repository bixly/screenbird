/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.your-keystore-here.pastevid.models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Matias
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.your-keystore-here.pastevid.models.WaterMarkTest.class, com.your-keystore-here.pastevid.models.AudioFileItemTest.class, com.your-keystore-here.pastevid.models.UserTest.class, com.your-keystore-here.pastevid.models.SilentTest.class, com.your-keystore-here.pastevid.models.VideoFileItemTest.class, com.your-keystore-here.pastevid.models.ScreenSizeTest.class})
public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
