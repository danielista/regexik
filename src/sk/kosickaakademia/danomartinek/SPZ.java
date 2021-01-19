package sk.kosickaakademia.danomartinek;

public class SPZ {

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

}
