class reverse11
{
  public static void main(String args[])
  {
    String[] s=args[0].split(" ");
    for(int i=args[0].split(" ").length-1;i>=0;i--)
    {
      System.out.println(s[i]);
    }
  }
}
