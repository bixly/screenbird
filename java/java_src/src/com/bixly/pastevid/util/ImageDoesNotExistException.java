/*
 * ImageDoesNotExistException.java
 *
 * Version 1.0
 * 
 * 17 May 2013
 */
package com.your-keystore-here.pastevid.util;

/**
 * Custom exception for missing images.
 * @author cevaris
 */
class ImageDoesNotExistException extends Exception {

    public ImageDoesNotExistException(String string) {
        super(string);
    }
    
}
