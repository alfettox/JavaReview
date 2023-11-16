# Student Database Project

## Overview

This Java project demonstrates simple read and write operations on a student database stored in a text file. The project uses a `Student` class to represent student data and provides functionality to read from and write to an informal database file.

## Files

- `Student.java`: Represents the structure of a student and includes methods for getting and setting attributes.
- `StudentDB.java`: Contains methods for reading students from a file, writing students to a file, and a main program to demonstrate the functionality.

## How to Use

1. **Running the Program:**
    - Compile the Java files using a Java compiler, for example, `javac Student.java StudentDB.java`.
    - Run the main program with `java StudentDB`.

2. **Input Data:**
    - Ensure that the informal database file (`informalDatabase.txt`) is present in the project directory.
    - The file should follow the format: `<student id>::<first name>::<last name>::<cohort>`.

3. **Output:**
    - The program reads student data from the file, displays it, updates the cohort if needed, and adds a new student (if not already existing).
    - The updated data is then written back to the file.

## Example

### Original Database (`informalDatabase.txt`)

```plaintext
0001::John::Doe::Java - August 2014
0002::Sally::Smith::Java - April 2014
0003::John::Jones::.NET - Jan 2014
Output
yaml
Copy code
0001
STUDENT: 0001 John Doe Java - August 2014
FOUND, now I will update it
0002
STUDENT: 0002 Sally Smith Java - April 2014
0003
STUDENT: 0003 John Jones .NET - Jan 2014
New student added successfully.