import java.util.ArrayList;

public class Customer {
    String name;
    private ArrayList<Double> transactions ;
    
    public Customer(String name,double initialAmount) {
        this.name = name;
         this.transactions = new ArrayList<Double>();
         addTransactions(initialAmount);
    }
    
    public String getName() {
        return name;
    }
    
    public void addTransactions(double amount){
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    
    
}
