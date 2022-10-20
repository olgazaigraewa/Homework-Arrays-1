public class Main {
    public static void main(String[] args) {
        //Задача 1-2
        System.out.println("Задача 1-2");
        int[] prizes = new int[3];
        prizes[0] = 1;
        int bronzePrizes = prizes[0];
        System.out.print(bronzePrizes + ", ");
        prizes[1] = 2;
        int silverPrizes = prizes[1];
        System.out.print(silverPrizes + ", ");
        prizes[2] = 3;
        int goldPrizes = prizes[2];
        System.out.print(goldPrizes);
        System.out.println("    ");
        double[] weights = {1.57, 7.654, 9.986};
        double firstYearWeight = weights[0];
        System.out.print(firstYearWeight + ", ");
        double secondYeaWeight = weights[1];
        System.out.print(secondYeaWeight + ", ");
        double thirdYeaWeight = weights[2];
        System.out.print(thirdYeaWeight);
        System.out.println("    ");
        char[] letters = {97, 98, 99, 100};
        char letterA = letters[0];
        System.out.print(letterA + ", ");
        char letterB = letters[1];
        System.out.print(letterB + ", ");
        char letterC = letters[2];
        System.out.print(letterC + ", ");
        char letterD = letters[3];
        System.out.print(letterD);
        System.out.println("    ");
        //Задача 3
        System.out.println("Задача 3");
        System.out.print(goldPrizes + ", ");
        System.out.print(silverPrizes + ", ");
        System.out.print(bronzePrizes);
        System.out.println("    ");
        System.out.print(thirdYeaWeight + ", ");
        System.out.print(secondYeaWeight + ", ");
        System.out.print(firstYearWeight);
        System.out.println("    ");
        System.out.print(letterD + ", ");
        System.out.print(letterC + ", ");
        System.out.print(letterB + ", ");
        System.out.print(letterA + ", ");
        System.out.println("    ");
        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < prizes.length; i++) {
            if (prizes[i]%2!=0){
                prizes[i] += 1;
            }System.out.println(prizes[i]);
        }


    }
}
