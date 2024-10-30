# Bank Management System

This Bank Management System is a Java-based application designed to manage basic banking operations, including account creation, deposits, withdrawals, and balance inquiries. It utilizes Java Swing for the graphical user interface (GUI) and integrates with a MySQL database for data storage.

## Features

- **User Authentication**: Secure login functionality for users.
- **Account Management**: Create, view, edit, and delete customer accounts.
- **Transaction Handling**: Facilitate deposits, withdrawals, and transfers between accounts.
- **Balance Inquiry**: Allows users to check account balances.
- **Change PIN**: Enables users to securely change their account PIN.
- **Mini Statement**: Users can view a concise summary of their recent transactions.
- **User-Friendly Interface**: Intuitive GUI for easy navigation and interaction.

## Technologies Used

- **Java**: Core programming language.
- **Java Swing**: For building the graphical user interface.
- **MySQL**: Backend database management system for storing account and transaction information.
- **JDBC (Java Database Connectivity)**: Facilitates interaction with the MySQL database.

## Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/Ayushhgit/BANK-MANAGEMENT-SYSTEM-JAVA-.git
   ```

2. **Set up the MySQL database**:
   - Create a new database named `bank_management`.
   - Import the provided `database.sql.txt` file to set up the necessary tables and data.

3. **Configure database connection**:
   - Modify the `conn.java` file to include your MySQL database credentials.

4. **Compile and run the application**:
   - Compile the Java files using your preferred IDE or command line.
   - Run the application to launch the GUI.

## Usage

1. **Launch the application**:
   - Run the `Main.java` class to start the GUI.

2. **Log in**:
   - Enter your credentials to access the system.

3. **Navigate through the system**:
   - Use the GUI to perform various banking operations such as account creation, deposits, withdrawals, balance inquiries, and more.

## Project Structure

BANK-MANAGEMENT-SYSTEM-JAVA-
├── Bank Management System
│   ├── src
│   │   ├── conn.java
│   │   ├── Login.java
│   │   ├── Signup1.java
│   │   ├── Signup2.java
│   │   ├── Signup3.java
│   │   ├── Deposit.java
│   │   ├── Withdrawal.java
│   │   ├── FastCash.java
│   │   ├── MiniStatement.java
│   │   ├── PinChange.java
│   │   ├── BalanceEnquiry.java
│   │   └── Transaction.java
│   └── icons
│       ├── logo.jpg
│       └── other icons
├── lib
│   └── mysql-connector-java-8.0.32.jar
├── output
│   └── screenshots
├── .gitignore
├── LICENSE
├── README.md
└── database.sql.txt

## Future Enhancements

- **Enhanced Security**: Implement data encryption and two-factor authentication.
- **Responsive Design**: Improve the GUI for better responsiveness across different screen sizes.
- **Additional Features**: Include functionalities like fund transfers between accounts and detailed transaction reports.

## Contributing

Contributions are welcome! Please follow these steps to contribute:

1. **Fork the repository**.

2. **Create a new branch**:

   ```bash
   git checkout -b feature-name
   ```

3. **Make your changes and commit them**:

   ```bash
   git commit -m "Add feature-name"
   ```

4. **Push to your fork and submit a pull request**.

## License

This project is licensed under the [MIT License](LICENSE).
