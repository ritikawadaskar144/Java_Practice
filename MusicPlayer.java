class MusicPlayer extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Progress " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        MusicPlayer t = new MusicPlayer();
        System.out.println("Playing song...");
        t.start();
    }
}