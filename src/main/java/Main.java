public class Main {

    public static void main(String[] args) {

        FixerHTTPManager fixerHTTPManager = new FixerHTTPManager();

        fixerHTTPManager.setLatestRates();
        System.out.println(fixerHTTPManager.getLatestRates());

    }

}
