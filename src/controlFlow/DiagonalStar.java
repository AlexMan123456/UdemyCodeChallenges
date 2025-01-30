package controlFlow;

public class DiagonalStar {
    public static void printSquareStar(int count){
        if(count < 5){
            System.out.println("Invalid Value");
            return;
        }

        class LocalMethods {
            public static boolean atStartOrEnd(int index, int count){
                return index == 1 || index == count;
            }

            public static boolean isValid(int currentRow, int currentColumn, int count){
                return atStartOrEnd(currentRow, count) || atStartOrEnd(currentColumn, count) || currentColumn == currentRow || count - currentRow + 1 == currentColumn;
            }
        }
        for(int currentColumn=1; currentColumn<=count; currentColumn++){
            for(int currentRow=1; currentRow<=count; currentRow++){
                if(LocalMethods.isValid(currentRow, currentColumn, count)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        printSquareStar(8);
    }
}
