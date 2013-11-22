/*
 * UnsupportedImageCompression.java
 * 
 * Version 1.0
 * 
 * 8 May 2013
 */
package com.your-keystore-here.pastevid.recorders;

/**
 * Custom exception for Unsupported Image Compression errors.
 * @author cevaris
 */
class UnsupportedImageCompression extends Exception {

    public UnsupportedImageCompression(String message) {
        super(message);
    }
    
}
