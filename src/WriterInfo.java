
import java.util.Scanner;

public class WriterInfo {
    private int allQuantity = 0;
    private int allQuantDownload = 0;

    public void getInfo(Music music) {
        System.out.println("Музыкальное произведение " + music.getMusicName() + " имеет " +
                music.getNumCopies() + " проданных копий и его " + (music.getIsDownload() ? "можно " : "нельзя ") +
                "скачать mp3 в интернете.");
    }

    public void setInfo(Music music, Scanner scan) {
        System.out.println("Музыкальное произведение: ");
        music.setMusicName(scan.next());
        System.out.println("Количество проданных копий: ");
        music.setNumCopies(scan.nextInt());
        System.out.println("Можно ли скачать в интернете: (T or F)");
        music.setIsDownload((scan.next().equals("T")) ? true : false);

    }

    public int allQuantity(Music[] musics) {

        for (Music elem : musics) {
            allQuantity += elem.getNumCopies();
        }
        return allQuantity;
    }

    public int allQuantDownload(Music[] musics) {
        for (Music elem : musics) {
            if (elem.getIsDownload()) {
                allQuantDownload++;
            }
        }
        return allQuantDownload;
    }

}
