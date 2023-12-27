public class Transaction {

    // Enum for TransactionType
    public enum TransactionType {
        BUY, SELL
    }
    private String transactionId;
    private String portfolioId; // Foreign key to associate with the Portfolio entity
    private String assetId; // Foreign key to associate with the Asset entity
    private LocalDateTime timestamp;
    private TransactionType type; // Enum: BUY or SELL
    private double quantity;
    private double price;
    private double fees;

    public void printTransaction() {
        System.out.println("Transaction");
    }
}
