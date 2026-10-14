
import java.util.HashMap;
import java.util.Map;

// Banka sınıfı, müşteri hesaplarını yönetir

class Bank {

    // Banka hesapları
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    // Hesap açma işlemi
    public void createAccount(String accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, initialBalance);
        accounts.put(accountNumber, account);
    }

    // Hesap bilgilerini getirme işlemi
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}

// Account sınıfı, müşteri hesabını temsil eder
class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// ATM sınıfı, kullanıcı işlemlerini yönetir
class ATM {

    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void deposit(String accountNumber, double amount) {
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Hesap bulunamadı.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Hesap bulunamadı.");
        }
    }

    public double checkBalance(String accountNumber) {
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Hesap bulunamadı.");
            return -1.0;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount("12345", 1000.0);

        ATM atm = new ATM(bank);

        // Para yatırma işlemi
        atm.deposit("12345", 500.0);

        // Para çekme işlemi
        atm.withdraw("12345", 200.0);

        // Bakiye sorgulama işlemi
        double balance = atm.checkBalance("12345");
        System.out.println("Hesap bakiyesi: " + balance);
    }
}
