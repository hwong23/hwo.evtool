
public class Propuesta {
   public static void main(String args[]) {
      String str = "jan/-feb/-march";
      String[] temp;
      String delimeter = "/-";
      temp = str.split(delimeter);
      
      for(int i = 0; i < temp.length; i++) {
         System.out.println(temp[i]);
      }

          String s1 = "t u t or i a l s"; 
          String[] words = s1.split("\\s"); 
          for(String w:words) {
             System.out.println(w);  
          }  
   }
}
