# BankSim

![Lab 5 UML Sequence (1) drawio](https://user-images.githubusercontent.com/89721650/192322281-f5e78843-9203-4470-91d4-d264ac7bb25c.png)

According to the UML Sequence Diagram, the program starts with a method to create the 10 accounts which are called the “start()” before starting the threads using the “join()” method. "join()" will then begin the transaction and do the "transfer()" for the two accounts involved before returning it back to the thread and into the bank. “test()” will then display the current balance of each account before displaying the total balance. This is where the race condition can be apparent.

The race condition occurs during the “transfer()” phase. The expected results of the total balance should add up to $100,000 since there are 10 accounts and each account has an initial $10,000 balance. Run it multiple times, the total balance would go over the expected $100,000 indicating a race condition result. Uncommenting the Thread.yield() made the race condition more apparent.

