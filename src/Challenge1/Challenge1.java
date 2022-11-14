package Challenge1;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        RandomNum string1 = new RandomNum();
        ArrayOrder arrayOrder = new ArrayOrder();
        String type;
        String order;

        //Exercise 1

        System.out.print("Input TypeA or TypeB : ");
        type = scan.nextLine();

        if (type.equalsIgnoreCase("typeA") || type.equalsIgnoreCase("typeB")) {
            String res = string1.stringRandom(type);
            System.out.println(res);
        } else {
            System.out.println("Wrong Answer");
        }

        //Exercise 2

        System.out.print("Input order ASC or DESC: ");
        order = scan.nextLine();

        int array[][] = arrayOrder.arrrayOrder(order);

        if (order.equalsIgnoreCase("asc") || order.equalsIgnoreCase("desc")) {
            //print array
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Wrong answer");
        }
    }

}

//Exercise 1
class RandomNum {
    String stringNum = "";

    public String stringRandom(String type) {

        for (int i = 0; i < 8; i++) {
            int num = (int) (Math.random() * 10);
            String numS = Integer.toString(num);
            stringNum = stringNum + numS;
        }
        if (type.equalsIgnoreCase("TypeA")) {
            stringNum = "54" + stringNum;
            return stringNum;
        } else if (type.equalsIgnoreCase("TypeB")) {
            stringNum = "08" + stringNum;

        }
        return stringNum;
    }
}


// Exercise 2
class ArrayOrder {
    int array[][] = new int[3][3];

    public int[][] arrrayOrder(String order) {

        //fill array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        if (order.equalsIgnoreCase("ASC")) {
            // asc
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (array[i][j] < array[x][y]) {
                                int t = array[i][j];
                                array[i][j] = array[x][y];
                                array[x][y] = t;
                            }
                        }
                    }
                }

            }
        } else if (order.equalsIgnoreCase("DESC")) {
            // desc
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (array[i][j] > array[x][y]) {
                                int t = array[i][j];
                                array[i][j] = array[x][y];
                                array[x][y] = t;
                            }
                        }
                    }

                }
            }
        }
        return array;
    }
}


