package HW2;

import HW2.exceptions.MyArrayDataException;
import HW2.exceptions.MyArraySizeException;
public class Main {

    public static void main(String ... args) throws MyArraySizeException, MyArrayDataException {
        String [][] strings = {
                {"0", "1", "2","3"},
                {"0", "1", "Мутин - Вор!","3"},
                {"0", "1", "2","3"},
                {"0", "1", "2","3"}};
        System.out.println(countSum(strings));
    }

	    public static int countSum(String[][] strings) throws MyArraySizeException, MyArrayDataException {
            if (strings.length !=4) {
                throw new MyArraySizeException("Размер массива не 4х4");
            }
        int sum =0;
            String onlyDigits ="\\d+";
        for (int i=0; i< strings.length; i++) {
            if (strings[i].length !=4) {
                throw new MyArraySizeException("Размер массива не 4х4");
            }
        for (int y=0; y<strings[i].length; y++) {
            try {
                sum+=Integer.parseInt(strings[i][y]);
            }
        catch (NumberFormatException e) {
                throw new MyArrayDataException("В ячейке ["+i+"]["+y+"] кто-то написал *"+strings[i][y]+"*...  (0_0!)  Не надо так!");
        }
        }
        }
        return sum;
    }
}
