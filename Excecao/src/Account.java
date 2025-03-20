public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount){
        if(amount > withdrawLimit){
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if(amount > balance){
            throw new DomainException("Not enough balance");
        }
        balance -= amount;
        System.out.println("New balance: " + String.format("%.2f", balance));
    }
}

