import java.util.Scanner;

public class Diamond
{
   public static int checkSize()
   {
      Scanner keyboard = new Scanner(System.in);
      String str;
      System.out.print("Enter diamond size ('short', 'average', or 'tall'): ");
      str = keyboard.nextLine();

      if(str.equalsIgnoreCase("Short"))
         return 6;
      else if(str.equalsIgnoreCase("Average"))
         return 12;
      else if(str.equalsIgnoreCase("Tall"))
         return 24;
      else
         return -1;
   }

   public static void displayDiamond(int size, char ch)
   {
      int i, j, spaces;
      spaces = size;
      
      for(i = 1; i <= size; ++i)
      {
         for(j = 1; j <= spaces; ++j)
            System.out.print(" ");
         spaces -= 1;
            
         for(j = 1; j<= (2*i)-1; ++j)
            System.out.print(ch);
         System.out.println();
           
      }
      
      spaces = 1;
      
      for(i = 1; i <= size; ++i)
      {
         for(j = 1; j <= spaces; ++j)
            System.out.print(" ");
         spaces += 1;

         for(j = 1; j <= 2*(size+1-i)-1; ++j)
            System.out.print(ch);
         System.out.println(); 
      }
   }

   public static void displayHollowDiamond (int size, char ch)
   {
      int i, j, spaces;
      spaces = size;
      
      for(i = 1; i <= size; ++i)
      {
         for(j = 1; j <= spaces; ++j)
            System.out.print(" ");
         spaces-=1;
 
         for(j = 1; j <= (2*i)-1; ++j)
            if( j == 1 || j == (2*i)-1)
               System.out.print(ch);
            else
               System.out.print(" ");
            System.out.println();
      }

         spaces = 1;
         
      for(i = 1; i<= size; i++)
      {
         for(j = 1; j <= spaces; ++j)
            System.out.print(" ");
         spaces += 1;
         
         for(j = 1; j <= 2*(size+1-i)-1; ++j)
            if(j == 1 || j == 2*(size+1-i)-1)
               System.out.print(ch);
            else
               System.out.print(" ");
         System.out.println();
      }
   }


   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int size;
      do
      {
         size = checkSize();
      }
      while(size != 6 && size != 12 && size != 24);
      
      System.out.print("Enter a character: ");
      char ch = keyboard.next().charAt(0);
      displayDiamond(size, ch);
      displayHollowDiamond(size, ch);
   }
}
