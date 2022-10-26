import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(years(generateRandomAge(),-19));
        System.out.println(years(generateRandomAge(),19));
        System.out.println(years(generateRandomAge(),13));
        System.out.println(years(generateRandomAge(),22));
        System.out.println(years(generateRandomAge(),3));
    }

    public static String years(int old, int degree) {
        if (old >= 20 && old <= 45 && degree >= -20 && degree <= 30){
            return ("Можно идти гулять");

        }else if(old < 20 && degree >= 0 && degree <= 28){
            return ("Можно идти гулять2");

        }else if (old > 45 && degree > -10 && degree < 25) {
            return ("Можно идти гулять3");

        }else {
          return ("Оставайтесь дома");
        }
    }
    public static int generateRandomAge(){
        Random rand = new Random();
        int ran = rand.nextInt(100);
        return ran += 1;
    }

}

