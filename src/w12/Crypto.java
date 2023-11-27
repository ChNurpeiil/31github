package w12;

public class Crypto {
    private String name;
    private String symbol;
    private double price;
    private long marketCap;
    private int rank;

    public Crypto(String name, String symbol, double price, long marketCap, int rank) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.marketCap = marketCap;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public int getRank() {
        return rank;
    }

    public void setName(String name) {
        if (name.length() < 3){
            System.out.println("Name must be at least 3 characters long.");
        }else {
            this.name = name;
        }

    }
    public void setSymbol(String symbol) {
        if (symbol.length()< 3 || symbol.length() >= 5){
            System.out.println("Symbol must be between 3 and 5 characters inclusive.");
        } else if (!symbol.toUpperCase().equals(symbol)) {
            System.out.println("Symbol must have all letters capitalized");
        }else{
            this.symbol = symbol;
        }

    }

    public void setPrice(double price) {
        if (price>= 0){
            this.price = price;
        }else{
            System.out.println("Price cannot be negative.");
        }

    }

    public void setMarketCap(long marketCap) {
        if (marketCap <=0){
            System.out.println("Market capitalization cannot be negative.");
        }
        else{
            this.marketCap = marketCap;
        }

    }

    public void setRank(int rank) {
        if (rank<=0){
            System.out.println("Rank cannot be negative");
        }else {
            this.rank = rank;
        }

    }

    public double calculateTotalValue(double quantity){

        if (quantity < 0){
            System.out.println("Quantity cannot be negative.");
        return 0;
        }else {
            return price * quantity;
        }

    }
    public void printCryptoDetails(){
        System.out.println(name + " (" + symbol + ") - Price: " + price + " USD, Market Cap: " + marketCap + ", Rank: " + rank);
    }

    public static void main(String[] args) {
        Crypto bitcoin = new Crypto("Bitcoin", "BTC", 50000.0,10000000000000l, 1);
        System.out.println(bitcoin.getName());
        System.out.println(bitcoin.getPrice());

        bitcoin.setPrice(-55000.0);
        bitcoin.setRank(-1);
        bitcoin.setName("AC");

//        double totalValue = bitcoin.calculateTotalValue(5.0);
//        System.out.println(totalValue);
        double totalValue = bitcoin.calculateTotalValue(-1);



        System.out.println(totalValue);
        bitcoin.printCryptoDetails();
    }
}
