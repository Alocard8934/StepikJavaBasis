package JavaBasicsStepik;

public class Metod5 {
     public static void main(String[] args) {
   
        int height = 7;
        String str = "#";
        char sim = str.charAt(0);
        if (height <= 0) {
            System.out.println("ERROR");
      } else {
           for(int i = height; i > 0; i--){
               if(i%2==0){
              for(int j = 0; j<i; j+=2){
                 
                  System.out.print(" ");
              }
              for(int x = height; x > i; x--){
                 System.out.print(sim);
                  
                  }  }    else{continue;}                                      
System.out.print("\n");
           }}
    }
}
