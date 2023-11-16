# StateCapitals Java Console Application

## Overview

The `StateCapitals` program is a Java console application that demonstrates the use of a `HashMap` to store and manage state/capital pairs. It fulfills specific requirements, including printing state names, capital names, and state/capital pairs.

## Usage

1. **Run the Program:**
    - Compile and run the `StateCapitals.java` file using a Java compiler and runtime environment.

2. **Output:**
    - The program will display the following information:
        - List of states.
        - List of capitals.
        - State/capital pairs.

## Example Output

```plaintext
STATES:
=======
Alabama
Alaska
Arizona
Arkansas
California
Colorado
Connecticut
Delaware
Florida
Georgia

CAPITALS:
=========
Montgomery
Juneau
Phoenix
Little Rock
Sacramento
Denver
Hartford
Dover
Tallahassee
Atlanta

STATE/CAPITAL PAIRS:
====================
Alabama - Montgomery
Alaska - Juneau
Arizona - Phoenix
Arkansas - Little Rock
California - Sacramento
Colorado - Denver
Connecticut - Hartford
Delaware - Dover
Florida - Tallahassee
Georgia - Atlanta
Adding More State/Capital Pairs

To add more state/capital pairs, modify the StateCapitals class by adding entries to the stateCapitals map in the main method:
``
    stateCapitals.put("New State", "New Capital");
    // Add more state/capital pairs as needed
``