package aulinha;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        int counter = 10;

        // while
//        while(counter < 5) {
//            System.out.println("o contador é: " + counter);
//            counter++;
//        }
        // do while
//        do {
//            System.out.println("o contador é: " + counter);
//            counter++;
//        } while(counter < 5);
        // for
        for(int i = 0; i < 10; i++) {
            if(i == 2) {
                System.out.println("PULEI O 2");
                // break;
                continue;
            }
            System.out.println("o contador é: " + i);
        }
    }
}
