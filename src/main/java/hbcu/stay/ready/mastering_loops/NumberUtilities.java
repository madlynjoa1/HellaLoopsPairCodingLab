package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String getEven = "";
        for(int i = start; i<stop;i++ ){
            if(i %2!= 0){
             getEven += i;
            }
            }
            return getEven;
    
    }
    public static String getOddNumbers(int start, int stop) {
        String getOdd = "";
        for(int i = start; i<stop;i++ ){
            if(i %2== 0){
             getOdd += i;
            }
            }
            return getOdd;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String getSquare = "";
        Integer num = 1;
        for(int i = start; i<stop;i=i+step ){
            num = i*i;
            getSquare=getSquare + num;
        }
        return getSquare;
    }

    public static String getRange(int stop) {
        String getRange = "";
        for(int i = 0; i<stop;i++){
            getRange += i;
        }


        return getRange;
    }

    public static String getRange(int start, int stop) {
        String getRange = "";
        for(int i = start; i<stop;i++){
            getRange += i;
        }


        return getRange;
    }


    public static String getRange(int start, int stop, int step) {
        String getRange = "";
        for(int i = start; i<stop;i+=step){
            getRange += i;
        }


        return getRange;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String getExponentiations = "";
        Integer num = 1;
        for(int i = start; i<stop;i=i+step ){
            //cast a math pow 
            num = (int)Math.pow(i, exponent);
            getExponentiations=getExponentiations + num;
        }
        return getExponentiations;
    }
}
