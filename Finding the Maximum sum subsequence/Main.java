import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[2*n];
    for(int i = 0; i < n; i++)
    {
      arr[i] = in.nextInt();
    }
    int temp[] = new int[n];
    int j = 0;
    int count = 0;
    int largest = 0;
    while(j < n-1)
    {
      int sum = 0;
      int v = 0;
      for(int k = j; k < n; k++)
      {
       if(k == n-1)
       {
         temp[v] = arr[k];
         count = 1;
         break;
       }
        
       if(arr[k] < arr[k+1])
       {
        temp[v] = arr[k];
        j++;
        v++;
       }
       else
       {
        temp[v] = arr[k];
        j++;  
        break;
       }
      }
     
      for(int z = 0; z <= v; z++)
      {
        sum += temp[z];
        //System.out.print(temp[z] +" ");
      }
      //System.out.println(); 
    if(sum > largest)
     {
      largest = sum;
     }
      
    }
     /* if(count == 0)
      {
        System.out.println(arr[n-1]);
      }*/
    
    System.out.print(largest);
    
   }    
 }