package com.your-keystore-here.pastevid.screencap.components;

/**
 * @author Bixly
 */
public interface IAudioSubject {

    public void addObserver(IAudioObserver o);

    public void removeObserver(IAudioObserver o);
    
    public Boolean isCompiling();
    
}