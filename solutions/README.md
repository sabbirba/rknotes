# Solutions

This folder contains single-main Java solutions for the string and array tasks from the notes.

Files created:
- StringTask1A_ReverseWhile.java - reverse string using while
- StringTask1B_ReverseFor.java - reverse string using for
- StringTask1C_ReverseFromIndex.java - reverse substring from index
- StringTask1D_ReverseUntilChar.java - reverse until character
- StringTask2A_CheckChar.java - check if char exists
- StringTask2B_ReplaceWithX.java - replace char with X
- StringTask3_EvenOddPositions.java - split characters by index parity
- StringTask4_RemoveDuplicates.java - remove duplicate chars
- StringTask5_SplitByIndexOrChar.java - split by index or first char
- StringTask6_UppercaseToEnd.java - move uppercase letters to end (no spaces)
- ArrayTask1_Maximum.java - find maximum
- ArrayTask2_Minimum.java - find minimum
- ArrayTask3_PosNegSplit.java - split positives and negatives
- ArrayTask4_OddEvenSplit.java - split odd and even values
- ArrayTask5_BubbleSort.java - bubble sort ascending

Compile with `javac FileName.java` and run with `java FileName`.
Solutions for selected tasks from RKN Notes (String and Array sections)

Files:
- `StringTasks.java`  -> Menu-driven implementations for Task1..Task6 (string problems)
- `ArrayTasks.java`   -> Menu-driven implementations for Task1..Task5 (array problems)

How to compile and run (macOS, zsh):

javac StringTasks.java ArrayTasks.java
java StringTasks
java ArrayTasks

Notes and assumptions:
- Input is handled via standard input (Scanner). Follow prompts.
- For Task1B the notes say "food loop"; implemented as a standard for-loop reverse.
- Task3 (string even/odd): indices treated as 0-based; this matches the sample in notes.
- Task3/4 array splitting create fixed-size arrays of length roughly half; output trims unused slots.
- These are small educational programs; no external libraries used.
