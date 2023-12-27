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

    // Constructor
    public Transaction(String transactionId, String portfolioId, String assetId, LocalDateTime timestamp, TransactionType type, double quantity, double price, double fees) {
        this.transactionId = transactionId;
        this.portfolioId = portfolioId;
        this.assetId = assetId;
        this.timestamp = timestamp;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.fees = fees;
    }

    // Default Constructor
    public Transaction() {
        this.transactionId = "";
        this.portfolioId = "";
        this.assetId = "";
        this.timestamp = new LocalDateTime();
        this.type = TransactionType.BUY;
        this.quantity = 0;
        this.price = 0;
        this.fees = 0;
    }


    public void printTransaction() {
        System.out.println("Transaction");
    }
}
