import java.util.*;

class Pattern
{
 
 public void Pattern(int iRow,int iCol)
 {
   int i=0,j=0;
   
   for(i=0;i<iRow;i++)
   {
     for(j=0;j<iCol;j++)
     {
         if((i==0)||(j==0)||(i==iCol-1)||(j==iCol-1)||(i+j==iCol-1))
         {
           System.out.print("*  ");
         }
         else
         {
           System.out.print("   ");
         }
        
       }
       System.out.println();
     }
     
     System.out.println();
   }
   
 }

  

class program3
{
     public static void main (String arg [])
     {
        Scanner sobj = new Scanner (System.in);
        int iNo1=0,iNo2=0;
        
        System.out.println("Enter the no of Rows:");
        iNo1 = sobj.nextInt();
        System.out.println("Enter the no of Coloums:");
        iNo2 = sobj.nextInt();
        
        Pattern pobj = new Pattern();
        pobj.Pattern(iNo1,iNo2);
        
        
     }

}


