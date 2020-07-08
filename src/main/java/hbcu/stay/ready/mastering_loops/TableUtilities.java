package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
//    public static String rightPadding(String str, int num) {
//        return String.format("%1$-" + num + "s", str);
//    }
    public static String getSmallMultiplicationTable() {
        String newLine= "\n";
        String format = "";
        Integer num= 1;
        for(int i= 1; i<=5; i++){
            for(int mult=1;mult<=5;mult++) {
               //getSmall=getSmall+ "  "+ i * mult + " |";
                num=i*mult;
                format+= String.format("%3d"+" |",num);
                if(mult == 5){
                    format+= newLine;
                }
            }
        }
        return format;
    }

    public static String getLargeMultiplicationTable() {
        String newLine= "\n";
        String format = "";
        Integer num= 1;
        for(int i= 1; i<=10; i++){
            for(int mult=1;mult<=10;mult++) {
                //getSmall=getSmall+ "  "+ i * mult + " |";
                num=i*mult;
                format+= String.format("%3d"+" |",num);
                if(mult == 10){
                    format+= newLine;
                }
            }
        }
        return format;
    }

    public static String getMultiplicationTable(int tableSize) {
        String newLine= "\n";
        String format = "";
        Integer num= 1;
        for(int i= 1; i<=tableSize; i++){
            for(int mult=1;mult<=tableSize;mult++) {
                //getSmall=getSmall+ "  "+ i * mult + " |";
                num=i*mult;
                format+= String.format("%3d"+" |",num);
                if(mult == tableSize){
                    format+= newLine;
                }
            }
        }
        return format;
    }
}
