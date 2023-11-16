# Dog Ranking Program

The Dog Ranking Program is a simple Java application that allows you to manage information about dogs, including their names, weights, and ranking results.

## Features

- Set and retrieve dog information such as name and weight.
- Record ranking results for a dog.
- Calculate and display the average ranking for a dog.
- Display a summary of a dog's information, including average ranking.

## Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/dog-ranking-program.git
    ```

2. Compile and run the program:

    ```bash
    cd dog-ranking-program
    javac Main.java
    java Main
    ```

3. Follow the on-screen prompts to interact with the program.

## Dog Class

### Attributes

- `name` (String): The name of the dog.
- `weight` (double): The weight of the dog.
- `rankingsArr` (double[]): An array to store ranking results.

### Methods

- `setName(String name)`: Set the name of the dog.
- `setWeight(double weight)`: Set the weight of the dog.
- `setRankingResults(int... rankings)`: Set the ranking results for the dog.
- `getAverageRanking()`: Calculate and return the average ranking of the dog.
- `getResultsArr()`: Get the array of ranking results.
- `toString()`: Generate a string representation of the dog's information.


## Acknowledgments

- Thanks to Wiley Edge for inspiration.

