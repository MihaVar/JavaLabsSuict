# Лабораторна робота 5

## Опис програми

Програма написана мовою **Java**. Являє собою надійну та стійку до помилок програму, яка імітує спрощену банківську систему. Ця система включає створення рахунків, фінансові операції та функції зведення рахунків. Програма може елегантно обробляти різні типи помилок, не ламаючись. Реалізовані спеціалізовані класи винятків для обробки спеціалізованих сценаріїв помилок.

## Опис роботи

1. Ініціалізувати програму.
2. Створити клас [BankAccount] з полями accountNumber, accountName і balance.
3. Реалізувати методи **deposit(double amount)**, **withdraw(double amount)** та **getAccountSummary()**.
4. Створити класи винятків:
- [AccountNotFoundException];
- [InsufficientFundsException];
- [NegativeAmountException].
5. Реалізувати клас [Bank], що зберігає колекцію об'єктів з [BankAccount].
6. Реалізувати в класі [Bank] методи **createAccount(String accountName, double initialDeposit)**, **findAccount(int accountNumber)** і **transferMoney(int fromAccountNumber, int toAccountNumber, double amount)**.
7. Винятки обробляються в кожному методі. 
8. Написати тести в класі [BankTest]:
- Створення акаунта;
- Пошук акаунта;
- Переведення коштів.  
9. Написати тести в класі [BankAccountTest]:
- Зняття грошей;
- Отримання балансу;
- Отримання інформації про акаунт;
- Поклад грошей на депозит.

## Висновок

**Під час виконання лабораторної роботи я покращив навички розробки програмного забезпечення мовою Java.**

[BankAccount]: src/main/java/org/example/BankAccount.java
[AccountNotFoundException]: src/main/java/org/example/AccountNotFoundException.java
[InsufficientFundsException]: src/main/java/org/example/InsufficientFundsException.java
[NegativeAmountException]: src/main/java/org/example/NegativeAmountException.java
[Bank]: src/main/java/org/example/Bank.java
[BankTest]: src/test/java/BankTest.java
[BankAccountTest]: src/test/java/BankAccountTest.java