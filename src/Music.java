

import java.util.Scanner;


public class Music {

    private String musicName;
    private int numCopies;
    private boolean isDownload;

    public Music() {
        this.musicName = "Empty";
        this.numCopies = 0;
        this.isDownload = false;
    }

    public Music(String musicName, int numCopies, boolean isDownload) {
        this.musicName = musicName;
        this.numCopies = numCopies;
        this.isDownload = isDownload;
    }

    public Music(String musicName) {
        this.musicName = musicName;
        this.numCopies = 3;
        this.isDownload = true;
    }

    public String getMusicName() {
        return musicName;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public boolean getIsDownload() {
        return isDownload;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    public void setIsDownload(boolean download) {
        this.isDownload = download;
    }
}






