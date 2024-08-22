class Hello
{
  void shape(int i)
  {
    System.out.println("Triangle:"+i);
   }
    void shape(float j)
  {
   System.out.println("Rectangle:"+j);
  }
   void shape(long k)
   {
   System.out.println("Square:"+k);
   }
}
 class Test 
{  
    public static void main(String[] args)
    {
    Hello t=new Hello();
    t.shape(10);
    t.shape(12.3f);
    t.shape(3331);
    }
}
