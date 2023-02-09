public class IndividualCharacters  
{  
    public static void main(String[] args) {  
        String string = "characters ";  
  
        System.out.println("Individual characters from given string: ");  
  
   
        for(int i = 0; i < string.length(); i++){  
            System.out.print(string.charAt(i) + " ");  
        }  
    }  
}  