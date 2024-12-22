# Mortgage Calculator 2.0

A simple Java-based mortgage calculator that calculates the monthly mortgage payment based on user inputs. The program ensures input validation for the principal amount, interest rate, and loan period.

## Features
- Input validation for the principal amount (between $1,000 and $1,000,000).
- Input validation for the annual interest rate (between 1% and 30%).
- Input validation for the loan period (between 1 and 30 years).
- Calculates the monthly mortgage payment using the formula:
  \[
  M = P \times \frac{r(1 + r)^n}{(1 + r)^n - 1}
  \]
  Where:
  - \( M \) is the monthly mortgage payment.
  - \( P \) is the principal loan amount.
  - \( r \) is the monthly interest rate.
  - \( n \) is the number of payments.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/dev-owdenmag/Mortgage-Calculator.git
