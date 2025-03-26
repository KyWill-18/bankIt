# bankIt

## HasMenu()
```
public interface HasMenu{
        String menu();
        void start();
}
```


## Menu()
```
Welcome To Your Account!

0) Exit
1) Check Balance
2) Make a Deposit
3) Make a Withdrawal

Please pick 0, 1, 2, or 3!
```


## Start()
```
while(keepGoing)

if userChoice == ("0")
    print("Have A Good Day! Goodbye!");
    keepGoing = false

else if userChoice == ("1")
    print("Please Hold Checking Balance...")
    checkBalance();

else if userChoice == ("2")
    print("Making A Deposit! Got It!")
    makeDeposit();

else if userChoice == ("3")
    print("Making A Withdrawal! Got It!")
    makeWithdrawal

else
    print("invalid input"
```


## makeDeposit()
```
print("How much would you like to deposit?")
getDouble()
this.balance += deposit
print("New Balance" + newBa;)
```


## makeWithdrawal
```
print("How much would you like to withdrawal?")
getDouble()
this.balance -= withdrawal
print("New Balance" + newBal)
```


## calcInterest(Savings)
```
extends CheckingAccount

this.balance * interestRate
setBalance(this.balance + interest)
print("New Balance" + getBalanceString())
```
