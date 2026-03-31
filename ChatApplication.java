class ChatApplication {
    public static void main(String[] args) {

        Thread sender = new Thread(() -> {
            System.out.println("Sending messages...");
        });

        Thread receiver = new Thread(() -> {
            System.out.println("Receiving messages...");
        });

        sender.start();
        receiver.start();
    }
}