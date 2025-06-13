public class profitLossCalculator {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice- costPrice;
        double profitPercentage = (profit/costPrice)*100;
        System.out.println("The Cost Price is INR "+ costPrice+"and selling price is INR "+ sellingPrice+"\n"+"Profit is INR "+ profit+"\n"+"profit Percentage is "+ profitPercentage + "%");
    }
}
