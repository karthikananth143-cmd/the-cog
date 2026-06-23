public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Ananth");
        Observer webUser = new WebApp("Karthik");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockData("TCS", 4200.50);

        stockMarket.setStockData("Infosys", 1650.75);

        stockMarket.deregisterObserver(webUser);

        System.out.println("\nWeb App Observer Removed");

        stockMarket.setStockData("Wipro", 310.25);
    }
}