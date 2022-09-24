public class T
{
   public static void main(String[] args)
   {
         String str="shashi";
         String str2="";
         for(int i=0;i<str.length();i++)
         {
            if(i%2==1)
            {
                continue;
            }
            str2=str2+str.charAt(i);
         }
         System.out.println(str2);
System.out.println(str.replace('h','@'));
   }
}