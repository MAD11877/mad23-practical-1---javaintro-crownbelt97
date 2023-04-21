import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println();
    
    int num = in.nextInt();

    ArrayList<Integer> data = new ArrayList<>();
    
    for (int i = 0; i < num; i++)
      {
        int x = in.nextInt();
        data.add(x);
      }
    
    int maxcount = 0;
    int max_freq = 0;
    
    for (int j = 0; j < data.size(); j++ )
          {
            int count = 0;

            for (int y = 0; y < data.size(); y++) {
              if(data.get(j) == data.get(y)) {
                count++;
              }
            }

            if (count > maxcount) {
              maxcount = count;
              max_freq = data.get(j);
            }
          }
    System.out.println(max_freq);
    
  }
}
