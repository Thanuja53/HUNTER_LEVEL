import java.util.*;
class target24 
{
  public static void main(String args[])
  {
    Scanner get=new Scanner(System.in);
    System.out.print("enter the target number");
    int no=get.nextInt();
    for(int i=0;i<args.length;i++)
    {
      for(int j=0;j<args.length;j++)
      {
        if(i!=j)
        {
          if(args[i]+args[j]==no)
          {
            System.out.println(+args[i]+"and"+args[j]);
          }
        }
      }
    }
  }
}
