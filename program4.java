import java.util.*;

class StringDemo
{
  public String StrRevTogX(String str)
  {
    int iStart=0,i=0;
    char itemp;
    char Arr[] = str.toCharArray();
    int iEnd=Arr.length-1;
   
    while(iStart<iEnd)
    {
      itemp=Arr[iStart];
      Arr[iStart]=Arr[iEnd];
      Arr[iEnd]=itemp;
      iStart++;
      iEnd--;
    }
    for (i=0;i<Arr.length;i++)
    {
      if((Arr[i]>='A')&&(Arr[i]<='Z'))
      {
        Arr[i]=(char)((int)Arr[i]+32);
      }
      else if ((Arr[i]>='a')&&(Arr[i]<='z'))
      {
        Arr[i]=(char)((int)Arr[i]-32);
      }
    
    }
    
    return new String (Arr);
  }
}

class program4
{
     public static void main (String arg [])
     {
        Scanner sobj = new Scanner (System.in);
        String str;
        String iRet;
        
        System.out.println("Enter String");
        str = sobj.nextLine();
        
        StringDemo dobj = new StringDemo();
        iRet = dobj.StrRevTogX(str);
        System.out.println("Reversed String:"+iRet);
               
     
     
     }

}


