import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public static void main(String[] args) {
    Scanner info = new Scanner(System.in);

    System.out.println("Введите количество проихведений(>=3)");
    int arrSize = info.nextInt();
    Music[] musics = new Music[arrSize];
    if (arrSize < 3) {
        System.out.println("Количество произведений меньше 3");


    } else {
        int indexArr = 0;
        musics[indexArr] = new Music("SkyFall", 1_000_000, true);
        ;
        musics[++indexArr] = new Music("Slim Shady", 5_000_000, false);
        musics[++indexArr] = new Music("Slim Shady");

        for (int i = ++indexArr; i < arrSize; i++) {
            musics[i] = new Music();
            System.out.print("Название произведения: ");
            musics[i].setMusicName(info.next());
            System.out.print("Количество проданных копий: ");
            musics[i].setNumCopies(info.nextInt());
            System.out.print("Можно ли скачать в интернете: (T or F): ");
            musics[i].setIsDownload(((info.next().equals("T")) ? true : false));

        }


        WriterInfo musicInfo = new WriterInfo();
        musicInfo.getInfo(musics[1]);
        musicInfo.setInfo(musics[1], info);
        musicInfo.getInfo(musics[1]);

        System.out.print("Общее кол-во проданных копий: " + musicInfo.allQuantity(musics));
        System.out.print(" Общее кол-во произведений которые можно скачать: "
                + musicInfo.allQuantDownload(musics));
    }
}