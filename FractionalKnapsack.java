import java.util.Scanner;

public class FractionalKnapsack {
    private static void getOptimalValue(int n,double capacity, double[] values, double[] weights) {
    
    /******   this function calculates the optimal profit of the fractional knapsack problem by storing the ratios of the profit of the elements and their corresponding weights and choosing the elements with the best ratio   ******/
    
        double value1 = 0;
        double ratio[] = new double[n];
        double temp1,temp2,temp3;
        int i,j;
        for(i = 0; i < n; i++)
            {
                ratio[i] = values[i] / weights[i];             //gives the array of the ratios of the profits and the corresponding weights of the elements
            }
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                if(ratio[i] > ratio[j])                        /******   bubble sorts the ratio array and sorts the temporary arrays of profits of the elements and weights of the elements based on the condition of profit/weight ratio for adding to knapsack   ******/
                {
                    temp3 = ratio[j];
                    ratio[j] = ratio[i];
                    ratio[i] = temp3;
                    
                    temp1 = weights[j];
                    weights[j] = weights[i];
                    weights[i] = temp1;
                    
                    temp2 = values[i];
                    values[i] = values[j];
                    values[j] = temp2;
                }
            }
        }
        
        i = 0;

        while(capacity > 0)                                    //adds elements till capacity of knapsack is not full
        {
            if(i >= weights.length)
            break;
            if(capacity - weights[i] >= 0)                    //adds the entire element if weight of the element is less than or equal to the capacity of the knapsack
            {
                value1 = value1 + values[i];
                capacity -= weights[i];
            }
            else                                             //adds a fraction of the element, which corresponds to the remaining capacity of the knapsack
            {
                value1 = value1 + ((capacity) / (weights[i]) * values[i]);
                capacity = 0;
            }   
        i++;
        }

        System.out.println(value1);                         //value1 is the value of the optimal profit to be returned
        
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();                        //input the number of elements
        double capacity = scanner.nextDouble();             //input the capacity of the knapsack
        double[] values = new double[n];                    
        double[] weights = new double[n];
        for (int i = 0; i < n; i++)
            values[i] = scanner.nextDouble();               //input the profit values of the elements  
        for (int i = 0; i < n; i++)
            weights[i] = scanner.nextDouble();              //input the weights of the elements
        
        getOptimalValue(n, capacity, values, weights);       
    }
} 
