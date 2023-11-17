# Risk Management Algorithm

This Java application demonstrates a basic risk management algorithm for a bank. The algorithm evaluates the risk exposure of a loan portfolio and takes action if the risk exceeds the defined threshold.

## Overview

The risk management algorithm consists of the following components:

- **Loan Class**: Represents a loan with attributes such as loan amount and associated risk.

- **Risk Management Algorithm**: The main class containing the algorithm. It calculates the risk exposure of a loan portfolio, compares it with the maximum allowable risk exposure, and makes decisions accordingly.

- **createLoanPortfolio() Method**: Generates a sample loan portfolio with random loan amounts and risks for demonstration purposes.

## Usage

1. Run the `RiskManagementAlgorithm` class.

2. The algorithm generates a sample loan portfolio using the `createLoanPortfolio()` method.

3. It calculates the current risk exposure by considering the risk associated with each loan in the portfolio.

4. If the current risk exposure is within the acceptable limits (defined by `MAX_RISK_EXPOSURE`), it prints a message indicating that. Otherwise, it suggests implementing risk mitigation measures.

## Components

### Loan Class

Represents a loan with two attributes:

- `loanAmount`: The amount of the loan.
- `risk`: The associated risk of the loan.

### Risk Management Algorithm

- `MAX_RISK_EXPOSURE`: The maximum allowable risk exposure threshold (hypothetical value for illustration).

- `calculateRiskExposure(List<Loan> loanPortfolio)`: Calculates the total risk exposure in the loan portfolio.

- `createLoanPortfolio(int numberOfLoans)`: Generates a sample loan portfolio with random loan amounts and risks.

### Main Method

- Generates a sample loan portfolio.

- Calculates the current risk exposure.

- Makes decisions based on the risk exposure:

    - If within acceptable limits, prints a message indicating that.
    - If exceeded, suggests implementing risk mitigation measures.

## Example

```bash
java RiskManagementAlgorithm