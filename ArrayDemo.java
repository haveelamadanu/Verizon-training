import java.io.*;
class ArrayDemo
{
 public static void main(String args[])
{
int[][] test = {{1,2,3},{2,3,4},{3,4,5}};
int r,c;
for(r=0;r<3;r++)
{
for(c=0;c<3;c++)
{
System.out.print(test[r][c]);
}
System.out.println("\n\n");
}

}
}