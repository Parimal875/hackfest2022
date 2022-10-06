import java.util.*;
public class binary_string
{
    public static void main (String args [])
    {
        String A[]={"ams dhoni","briyanshika","crudranil","drj","evenum","fruds","grudddy"};
        int t=0;
        String s=" ";
        Scanner in=new Scanner(System.in);
        System.out.println("enter :-");
        s=in.nextLine();
        int low=0,high=A.length-1,mid=0,flag=0;
        do
        {
          mid =(high+low)/2;
          if (s.compareTo(A[mid])==0)
          {
            flag=1;
            break;
         }
            else if(s.compareTo(A[mid])<0)
             high =mid-1;
            else 
            low =mid+1;
         }
         while (low<=high);
         if(flag==1)
         System.out.println("got");
         else
         System.out.println("sorruy");
        


        
        
        
    }}