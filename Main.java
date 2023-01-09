/* DESCRIPTION OF CLASS
Demonstrates creating Stock objects, setting their price,
adding them to the portfolio, and retrieving a Stock from
the portfolio via its symbol as well as a loop iterating
through the Portfolio (and printing out the stock object info.)
*/

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();                         //Creating Portfolio object to retrieve hashmap
        HashMap<String,Stock> portfolioMap = portfolio.getPortfolio(); //Retrieving and accessing hashmap

        Stock amd = new Stock("AMD");                                  //Creating stock objects
        amd.setPrice(72.28);                                           //Setting price
        portfolioMap.put("AMD",amd);                                   //Adding to portfolio map

        Stock intc = new Stock("INTC");
        intc.setPrice(29.47);
        portfolioMap.put("INTC",intc);

        Stock spce = new Stock("SPCE");
        spce.setPrice(5.35);
        portfolioMap.put("SPCE",spce);

        Stock coke = new Stock("COKE");
        coke.setPrice(461.53);
        portfolioMap.put("COKE",coke);

        Stock rcl = new Stock("RCL");
        rcl.setPrice(59.89);
        portfolioMap.put("RCL",rcl);

        Stock nclh = new Stock("NCLH");
        nclh.setPrice(17.63);
        portfolioMap.put("NCLH",nclh);

        //Retrieving a Stock from portfolio via its symbol
        System.out.println(portfolioMap.get("AMD"));
        System.out.println("---------------");
        
        //For each loop to iterate through Portfolio
        portfolioMap.forEach((key,value) -> {
            System.out.println("Symbol: " + key);
            System.out.println(" Price: $" + value.getPrice());
        });
    }
}