# Section 9 Exercises - Constructors, method overloading, encapsulation

## [🏧 Banking Operations](./application/BankingOperations.java)

### Exercise prompt

In a bank, to register a bank account, it's necessary to inform an account number, it's holder name and an initial
deposit value that the holder depositied while crating their account. That initial vakue, however, it's opitional,
therefore: if an account holder does not deposit any amount while registering their account, that account's initial value would be, naturally, zero.

Important: once created, an account number must not be changeable. Though an account holder's name may be modified (as a person's name may be changed after a marriage, for instance).

Finally, an account's balance must not modified freely in an arbitrary way. There must be a mechanism to protect
such a thing. An account's balance must only be increased due to deposits and only be diminished reduced due to
withdraws. Consider that for each withdraw value the bank applies an $5.00 tax. Note: an account may get to a negative
balance value if it's balance is not enough to perform a withdraw and/or pay the tax. 

You must make a program that executes an accounts registering process, allowing it's user to choose whether they
want to make an initial deposit or not. Then, prompt user to make a deposit and then to make a withdraw, always 
displaying updated data on account status after each operation.

## [🏨 Hostel Room Rent Register](./application/HostelTenantRegister.java)

### Exercise prompt
A hostel owner has ten rooms to rent for students. Those rooms are indentified by numbers  from 0 to 9.

Make a program that starts with 10 empty rooms and then read an 'N' quantity representing the   number that will rent rooms (N can be from 1 to 10). Then, register the rent of the N students.
For each rent register, inform name, email aswell which room as chosen (0 to 9). Suppose that  a vacant room is chosen. 

Finally, your program should print a report of all occupied hostel rooms, sorting them by room number.
