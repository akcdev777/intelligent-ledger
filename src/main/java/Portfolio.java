import  java.util.ArrayList;
public class Portfolio {

    private String portfolioId;
    private String userId; // Foreign key to associate with the User entity
    private String portfolioName;
    private ArrayList<Asset> assets;
    private ArrayList<Transaction> transactions;


    // Constructor
    public Portfolio(String portfolioId, String userId, String portfolioName) {
        this.portfolioId = portfolioId;
        this.userId = userId;
        this.portfolioName = portfolioName;
        this.assets = new ArrayList<Asset>();
        this.transactions = new ArrayList<Transaction>();
    }

    //Default Constructor
    public Portfolio() {
        this.portfolioId = "";
        this.userId = "";
        this.portfolioName = "";
        this.assets = new ArrayList<Asset>();
        this.transactions = new ArrayList<Transaction>();
    }

    // Getters and Setters
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPortfolioName() {
        return this.portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public ArrayList<Asset> getAssets() {
        return this.assets;
    }

    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    // Methods
    public void addAsset(Asset asset) {
        this.assets.add(asset);
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

    public void removeAsset(Asset asset) {
        this.assets.remove(asset);
    }

    public void removeTransaction(Transaction transaction) {
        this.transactions.remove(transaction);
    }

    public void printPortfolio() {
        System.out.println("Portfolio ID: " + this.portfolioId);
        System.out.println("User ID: " + this.userId);
        System.out.println("Portfolio Name: " + this.portfolioName);
        System.out.println("Assets: ");
        for (Asset asset : this.assets) {
            asset.printAsset();
        }
        System.out.println("Transactions: ");
        for (Transaction transaction : this.transactions) {
            transaction.printTransaction();
        }
    }

}
