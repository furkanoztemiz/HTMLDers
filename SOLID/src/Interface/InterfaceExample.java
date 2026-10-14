package Interface;

interface Prizable {

    void fiat();

}

interface User {

    void nameSurname(String name, String surname);

}

interface MultimediaPlayer extends User, Prizable {

    void play();

    void pause();

    void stop();

    void setVolume(int volume);

    void skip(int seconds);

}

class VideoPlayer implements MultimediaPlayer {

    private int volume;
    private String videoTitle;

    public VideoPlayer(int volume, String videoTitle) {
        this.volume = 50;
        this.videoTitle = videoTitle;
    }

    @Override
    public void play() {
        System.out.println("Video oynatılıyor " + videoTitle);
    }

    @Override
    public void pause() {
        System.out.println("Video durduruldu  " + videoTitle);

    }

    @Override
    public void stop() {
        System.out.println("Video durduruldu" + videoTitle);
    }

    @Override
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {

            this.volume = volume;
            System.out.println("Volume değeri  =" + volume);

        } else {
            System.out.println("Belirtilen aralıkta ses değeri giriniz");
        }

    }

    @Override
    public void skip(int seconds) {

        System.out.println("Video " + seconds + " saniye ileri alındı " + videoTitle);

    }

    @Override
    public void nameSurname(String name, String surname) {

        System.out.println("Kullanıcı bilgileri =" + name + " " + surname);

    }

    @Override
    public void fiat() {
        System.out.println("ürünün fiyatı 100 tl dir");

    }

}

class AudioPlayer implements MultimediaPlayer {

    private int volume;
    private String audioTitle;

    public AudioPlayer(int volume, String audioTitle) {
        this.volume = 50;
        this.audioTitle = audioTitle;
    }

    @Override
    public void play() {
        System.out.println("Müzik çalar oynatılıyor");

    }

    @Override
    public void pause() {
        System.out.println("Müzik çalar duraklatıldı");

    }

    @Override
    public void stop() {
        System.out.println("Müzik çalar durduruldu");
    }

    @Override
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Geçersiz aralıktaki volume değeri!");
        }

    }

    @Override
    public void skip(int seconds) {
        System.out.println("Müzik " + seconds + "saniye ileri alındı." + audioTitle);

    }

    @Override
    public void nameSurname(String name, String surname) {

        System.out.println("Kullanıcı bilgileri  " + name + " " + surname);

    }

    @Override
    public void fiat() {
        System.out.println("Ürünün fiyatı 50 tl dir");
    }

}

public class InterfaceExample {

    public static void main(String[] args) {

        MultimediaPlayer videoplayer = new VideoPlayer(66, "SunyVideoPlayer");
        MultimediaPlayer audioplayer = new AudioPlayer(34, "SonyWalkman");

        videoplayer.nameSurname("furkan", "öztemiz");
        videoplayer.play();
        videoplayer.setVolume(99);
        videoplayer.skip(45);
        videoplayer.pause();
        videoplayer.stop();
        videoplayer.fiat();

        System.out.println("---------------------------");

        audioplayer.nameSurname("FURKAN", "ÖZTEMİZ");
        audioplayer.play();
        audioplayer.setVolume(44);
        audioplayer.skip(11);
        audioplayer.pause();
        audioplayer.stop();
        audioplayer.fiat();

    }

}
