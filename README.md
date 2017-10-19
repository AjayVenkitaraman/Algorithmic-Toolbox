# Algorithmic-Toolbox
Implementation of some problems from the Algorithmic Toolbox (an online course offered by the University of California, San Diego) in Java

The problems as per the order of commit are:

1. Fractional Knapsack problem:
	* This problem is a classic problem of the greedy algorithm family. This problem consists of a knapsack which can 		carry a maximum specific *capacity*, a set of *weights* which are associated to a set of profit *value*.
	* The goal is to find the maximum profit which can be made by putting the respective weights in the sack, within         the specified weight limit of the sack.
    * The optimum profit is obtained when we consider the profit to weight ratio of every element and put the               elements in the non-increasing order of the profit to weight ratio.
2. Coin Change problem:
	* In this problem, we have an amount (in cents)*n* for which we need to make change. The constraint is that the 	  denominations of the coins can be 1 cent, 5 cents or 10 cents only.
    * The goal is to find the minimum number of coins (*count*), the total value of which equals the value of *n*.
