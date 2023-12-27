public class NewsFeed {

    private String newsId;
    private String assetId; // Foreign key to associate with the Asset entity
    private String headline;
    private String content;
    private LocalDateTime timestamp;

    //Constructor
    public NewsFeed(String newsId, String assetId, String headline, String content, LocalDateTime timestamp) {
        this.newsId = newsId;
        this.assetId = assetId;
        this.headline = headline;
        this.content = content;
        this.timestamp = timestamp;
    }

    //Default Constructor
    public NewsFeed() {
        this.newsId = "";
        this.assetId = "";
        this.headline = "";
        this.content = "";
        this.timestamp = new LocalDateTime();
    }

    //Getters and Setters
    public String getNewsId() {
        return this.newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getAssetId() {
        return this.assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getHeadline() {
        return this.headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    //Methods

    @Override
    public String toString() {
        return "NewsFeed{" +
                "newsId='" + newsId + '\'' +
                ", assetId='" + assetId + '\'' +
                ", headline='" + headline + '\'' +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public void printNewsFeed() {
        System.out.println("NewsFeed");
    }


}
