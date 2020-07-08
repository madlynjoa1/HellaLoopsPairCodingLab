package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String getTriangle= "";
        String newLine= "\n";
        for(int i =1; i < numberOfRows; i++){
        for(int a = 1; a <= i; a++ ){
             getTriangle += "*";
        }
        getTriangle+= newLine ;
    }
        return getTriangle;
    
    }

    public static String getRow(int numberOfStars){
        String getRow= "";
        String star= "";
        for(int i = 0; i< numberOfStars; i++ ){    
            star="*";
            getRow+= star;
        }
        return getRow;
    }

    public static String getSmallTriangle() {
        String getTriangle= "";
        String newLine= "\n";
        for(int i = 1; i < 5 ; i++){
        for(int a = 1; a <= i; a++ ){
             getTriangle += "*";
        }
        getTriangle+= newLine ;
    }
        return getTriangle;
    
    }
   

    public static String getLargeTriangle() {
        String getTriangle= "";
        String newLine= "\n";
        for(int i = 1; i <= 9 ; i++){
        for(int a = 1; a <= i; a++ ){
             getTriangle += "*";
        }
        getTriangle+= newLine ;
    }
        return getTriangle;
    
    }
    
}
