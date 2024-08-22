class DemoToken
{
 public static void main(String args[])
{
   StringTokenizer st=new StringTokenizer("keep smiling");
   int count=st.countTokens();
   System.out.print("No.oftokens:"+count);
   while(st.hasMoreTokens())
   {
   System.out.println(st.nextToken());
}
}
}  
    