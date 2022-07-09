package com.design.pattern.structual.proxy;

public class MediaFileProxy {
    private MediaFileImpl mediaFile;

    public MediaFileProxy(MediaFileImpl mediaFile) {
        this.mediaFile = mediaFile;
    }

    public void print(){
        mediaFile.print();
    }
}
