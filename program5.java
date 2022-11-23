import java.util.*;

class StringDemo
{
  public boolean StrPallindrome (String str)
  {
    int iStart=0,iCnt=0,i=0;
    char itemp;
    char Arr[] = str.toCharArray();
    int iEnd=Arr.length-1;
   
    for(i=0;i<Arr.length;i++)
    {
      if((Arr[i]>='A')&&(Arr[i]<='Z'))
      {
        Arr[i] =(char)((int)Arr[i]+32);
        //System.out.println(""+Arr[i]);
      }
    }
    
    while(iStart<iEnd)
    {
      if(Arr[iStart]==Arr[iEnd])
      {
        iCnt++;
      }
      iStart++;
      iEnd--;
    }
    if(iCnt==iStart)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}

class program5
{
     public static void main (String arg [])
     {
        Scanner sobj = new Scanner (System.in);
        String str;
        boolean bRet;
        
        System.out.println("Enter String");
        str = sobj.nextLine();
        
        StringDemo dobj = new StringDemo();
        bRet = dobj.StrPallindrome (str);
        if (bRet==true)
        {
         System.out.println("String is Palindrome:");
        }
        else
        {
         System.out.println("String is not Palindrome:");
        }
     
     
     }

}


