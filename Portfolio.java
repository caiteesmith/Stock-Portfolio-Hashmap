/* DESCRIPTION
- Keep Stock objects in a Map
- Provide support that allows a Portfolio to be iterated through by symbol.
*/

import java.util.HashMap;

public class Portfolio {
    HashMap<String,Stock> portfolioMap = new HashMap<>();

    public HashMap<String,Stock> getPortfolio() {
        return portfolioMap;
    }
}