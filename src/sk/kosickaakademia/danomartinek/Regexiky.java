package sk.kosickaakademia.danomartinek;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class Regexiky {


    public static void suborDatumyKontrola(String filePath){

        String value = "";
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                value = myReader.nextLine();
                System.out.println(value + " " + checkValue(value));
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error with file occurred.");
            e.printStackTrace();
        }
    }


    public static boolean checkValue(String value){
        if (value == null)
            return false;
        Pattern pattern = Pattern.compile("^(([1-9]\\d+|\\d)[\\.,]([1-9]\\d|\\d[1-9])|([1-9]\\d+))$|^[0]$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }





    public static boolean skuska2 (){
        System.out.println("toto je MASTER");
        return true;
    }

        public boolean isValidOP (String text) {
        if(text == null) return false;
        text = text.toUpperCase().trim();
        if (text.length() != 8) return false;
        for (int i =0; i<=1; i++){
            if(!Character.isLetter(text.charAt(i))) return false;
        }
        for (int i=2; i<=7; i++)
            if(!Character.isLetterOrDigit(text.charAt(i))) return false;
        return true;
    }


    public boolean isValidSPZ (String text) {
        if(text == null) return false;


        text = text.toUpperCase().trim();

        if (text.length() != 7) return false;

        for (int i =0; i<=1; i++){
            if(!Character.isLetter(text.charAt(i))) return false;
        }

        for (int i=2; i<=6; i++)
            if(!Character.isLetterOrDigit(text.charAt(i))) return false;



        return true;
    }


    public static boolean skuska (){
        System.out.println("dano je najlepsi");
        return true;
    }






}
