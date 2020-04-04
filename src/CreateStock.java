import java.util.Scanner;

public class CreateStock {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name, symbol;
        double previousClosingPrice, currentPrice;

        System.out.print("Enter the symbol of the stock: ");
        symbol = keyboard.nextLine();
        System.out.print("Enter the name of the stock: ");
        name = keyboard.nextLine();

        Stock stock1 = new Stock(symbol, name);

        System.out.print("Enter the previous closing price of the stock: ");
        previousClosingPrice = keyboard.nextDouble();

        System.out.print("Enter the current price of the stock: ");
        currentPrice = keyboard.nextDouble();

        stock1.setPreviousClosingPrice(previousClosingPrice);
        stock1.setCurrentPrice(currentPrice);

        System.out.println("\nStock Details: " + stock1.getSymbolAndName());
        System.out.printf("Price-change percentage: %.2f%%\n", stock1.getChangePercent());
    }
}
