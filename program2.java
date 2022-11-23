import java.util.*;

class StringDemo
{
  public boolean StrCmpX(String str,String dest)
  {
    int i=0,iCnt=0;
    char Arr[] = str.toCharArray();
    char Brr[] = dest.toCharArray();
    
    if(Arr.length!=Brr.length)
    {
      return false;
    }
    
    for(i=0;i<Arr.length;i++)
     {
       if(Arr[i]==Brr[i])
       {
         iCnt++;
       }
     }
    if (i==iCnt)
      {return true;}
    else
       {return false;}
  }
}

class program2
{
     public static void main (String arg [])
     {
        Scanner sobj = new Scanner (System.in);
        String str;
        String str2;
        boolean bRet;
        
        System.out.println("Enter First String");
        str = sobj.nextLine();
        System.out.println("Enter Second String");
        str2 = sobj.nextLine();
        
        StringDemo dobj = new StringDemo();
        bRet = dobj.StrCmpX(str,str2);
        if(bRet==true)
         {
          System.out.println("All Elements are same");
        } else
         {
          System.out.println("All Elements are not same");
        }
     }
}


