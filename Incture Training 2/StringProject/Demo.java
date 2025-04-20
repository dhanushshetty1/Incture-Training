package StringProject;

import java.util.Scanner;

class TooYoung extends RuntimeException{
    public TooYoung(String s){
        super(s);
    }
}
class TooOld extends RuntimeException{
    public TooOld(String s){
        super(s);
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ur age");
        int age = sc.nextInt();

        if(age < 25){
            throw new TooYoung("you r young");
        }
        else if(age >=25 && age <45){
            System.out.println("you sre eligible");
        }
        else{
            throw new TooOld("you r old");
        }
    }
}
