public class Main {
    public static void main(String[] args) {
        String message1 = "Sample out put line 1";
        String message2 = "Sample out put line 2";

        Logger logger = Logger.getInstance();

        logger.log(message1);
        logger.log(message2);
    }
}
