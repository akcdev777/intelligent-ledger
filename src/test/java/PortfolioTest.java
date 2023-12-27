import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class PortfolioTest {

    @Test
    public void testPortfolioConstruction() {
        Portfolio portfolio = new Portfolio("portfolioId123", "userId456", "MyPortfolio");

        // Assert that the portfolio object is constructed correctly
        assertEquals("portfolioId123", portfolio.getPortfolioId());
        assertEquals("userId456", portfolio.getUserId());
        assertEquals("MyPortfolio", portfolio.getPortfolioName());
        assertTrue(portfolio.getAssets().isEmpty());
        assertTrue(portfolio.getTransactions().isEmpty());
    }

    @Test
    public void testPortfolioEquality() {
        Portfolio portfolio1 = new Portfolio("portfolioId123", "userId456", "MyPortfolio");
        Portfolio portfolio2 = new Portfolio("portfolioId123", "userId456", "MyPortfolio");
        Portfolio portfolio3 = new Portfolio("portfolioId456", "userId789", "AnotherPortfolio");

        // Assert equality for portfolio1 and portfolio2
        assertEquals(portfolio1, portfolio2);

        // Assert inequality for portfolio1 and portfolio3
        assertFalse(portfolio1.equals(portfolio3));
    }

    @Test
    public void testAddRemoveAsset() {
        Portfolio portfolio = new Portfolio("portfolioId123", "userId456", "MyPortfolio");
        Asset asset = new Asset("assetId123", "AAPL", "Apple Inc.", "Technology company");

        // Add an asset to the portfolio
        portfolio.addAsset(asset);
        assertEquals(1, portfolio.getAssets().size());

        // Remove the asset from the portfolio
        portfolio.removeAsset(asset);
        assertTrue(portfolio.getAssets().isEmpty());
    }

    @Test
    public void testAddRemoveTransaction() {
        Portfolio portfolio = new Portfolio("portfolioId123", "userId456", "MyPortfolio");
        Transaction transaction = new Transaction("transactionId123", "portfolioId123", "assetId456", LocalDateTime.now(), Transaction.TransactionType.BUY, 10, 100.0, 2.0);

        // Add a transaction to the portfolio
        portfolio.addTransaction(transaction);
        assertEquals(1, portfolio.getTransactions().size());

        // Remove the transaction from the portfolio
        portfolio.removeTransaction(transaction);
        assertTrue(portfolio.getTransactions().isEmpty());
    }

}
