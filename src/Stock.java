public class Stock {
   private String symbol;
   private String name;
   private double previousClosingPrice;
   double currentPrice;

   public Stock(){

   }

    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

     public void setPreviousClosingPrice(double previousClosingPrice){
       this.previousClosingPrice = previousClosingPrice;
     }

     public void setCurrentPrice(double currentPrice){
       this.currentPrice = currentPrice;
     }
    // Return the percentage changed from previousClosingPrice to currentPrice
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) /
                previousClosingPrice) * 100;
    }

    public String getSymbolAndName(){

       return symbol + " " +name;
    }
}