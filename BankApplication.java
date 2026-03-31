class BankApplication {
    static void checkBalance() throws Exception {
        throw new Exception("Error in transaction");
    }

    public static void main(String[] args) {
        try {
            checkBalance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}