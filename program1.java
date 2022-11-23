import java.util.*;

class StringDemo
{
  public String StrNCat(String str,String dest, int iCnt)
  {
    int i=0,iCnt2=0;
    char Arr[] = str.toCharArray();
    char Brr[] = dest.toCharArray();
    char Crr[];
    int iSize;
    iSize = Arr.length + iCnt;
   
    Crr = new char[iSize]; 
    for(i=0;i<Crr.length;i++)
    {
       if(i<Arr.length)
      {
        Crr[i]=Arr[i];
      }
      else
      {
        Crr[i]=Brr[iCnt2];
        iCnt2++;
      }
    
    } 
   
    
    return new String (Crr);
  }
}

class program1
{
     public static void main (String arg [])
     {
        Scanner sobj = new Scanner (System.in);
        String str;
        String str2;
        String iRet;
        int iLimit =0;
        
        System.out.println("Enter First String");
        str = sobj.nextLine();
        System.out.println("Enter Second String");
        str2 = sobj.nextLine();
        System.out.println("Number of charater to copy:");
        iLimit = sobj.nextInt();
        
        StringDemo dobj = new StringDemo();
        iRet = dobj.StrNCat(str,str2,iLimit);
        System.out.println("New String:"+iRet);
               
     
     
     }

}


