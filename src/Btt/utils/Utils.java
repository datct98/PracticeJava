package Btt.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public long inputLong(Scanner scanner){
        while (true){
            try {
                return Long.parseLong(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Input wrong, please try again");
            }finally {
                System.out.println();
            }
        }
    }

    public double inputDouble(Scanner scanner) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.parse("");
        return Double.parseDouble(scanner.nextLine());
    }
}
