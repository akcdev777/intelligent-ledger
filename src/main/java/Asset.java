public class Asset {

    private String assetId;
    private String symbol; // Asset symbol (e.g., AAPL, BTC)
    private String name;
    private String description;

    // Constructor
    public Asset(String assetId, String symbol, String name, String description) {
        this.assetId = assetId;
        this.symbol = symbol;
        this.name = name;
        this.description = description;
    }

    // Default Constructor
    public Asset() {
        this.assetId = "";
        this.symbol = "";
        this.name = "";
        this.description = "";
    }

    // Getters and Setters
    public String getAssetId() {
        return this.assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Methods

    @Override
    public String toString() {
        return "Asset{" +
                "assetId='" + assetId + '\'' +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}//End of Asset class
