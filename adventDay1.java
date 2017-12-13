import java.util.Scanner;
import java.util.*;


public class adventDay1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> nums = new ArrayList<Integer>();

    String numVals = sc.nextLine();

    //  Character.getNumericValue(c);
    for(int i = 0; i < numVals.length(); i++ )
    {
      char convert = numVals.charAt(i);
      int inte = Character.getNumericValue(convert);
      System.out.println("inte value: " + inte);
      nums.add(new Integer(inte));
    }

    int weirdSum = 0;
    int trans2 = 0;
    int trans = 0;

    System.out.println("numVals length " + numVals.length());

    for(int j = 0; j < numVals.length(); j++)
    {
        trans = nums.get(j);

        if(j != (numVals.length() - 1))
        {
          trans2 = nums.get(j + 1);
        }
        else
        {
          trans2 = nums.get(0);
        }
        if(trans == trans2)
        {
          weirdSum = weirdSum + trans;
          System.out.println("Value added to weirdSum: " + trans);
        }

    }

    //System.out.println("weirdSum is equal to: " + weirdSum);
    System.out.printf("Weird sum is equal to:%3d \n", weirdSum);



  }

}
