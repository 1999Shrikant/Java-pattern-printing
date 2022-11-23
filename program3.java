import java.util.*;

class StringDemo
{
  public boolean StrCmpX(String str,String dest,int iNo)
  {
    int i=0,iCnt=0;
    char Arr[] = str.toCharArray();
    char Brr[] = dest.toCharArray();
    
   
    for(i=0;i<iNo;i++)
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

class program3
{
     public static void main (String arg [])
     {
        Scanner sobj = new Scanner (System.in);
        String str;
        String str2;
        int iValue=0;
        boolean bRet;
        
        System.out.println("Enter First String");
        str = sobj.nextLine();
        System.out.println("Enter Second String");
        str2 = sobj.nextLine();
        System.out.println("Enter the Limit");
        iValue = sobj.nextInt();
        
        StringDemo dobj = new StringDemo();
        bRet = dobj.StrCmpX(str,str2,iValue);
        if(bRet==true)
         {
          System.out.println("All Elements are same");
        } else
         {
          System.out.println("All Elements are not same");
        }
     }
}


