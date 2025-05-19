
package string_app_2025;


public class String_App_2025 {

    public static void main(String[] args) {
       
  //using string
        String str = "";
        for(int i =0; i < 5; i++)
        {
            str = str + i + " "; 
        }
        System.out.println("Outcome of Loop using String: " + str);
        
        //striingbuilder
        StringBuilder strBuilder = new StringBuilder();
        for(int j = 0; j <5 ; j++)
        {
            strBuilder.append(j).append("  ");
        }
        System.out.println("Using StringBuilder " + strBuilder);
        
        
    }
    
}
