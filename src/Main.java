import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


                int number, basValue, tempNumber, result=0; //define integer value

                Scanner doa = new Scanner(System.in);
                System.out.print("Enter the Number: "); //get value from user
                number = doa.nextInt();

                tempNumber = number; //number of digits
                while(tempNumber != 0){
                    tempNumber /= 10;
                }
                tempNumber=number;
                while(tempNumber != 0){ //sum of digits
                    basValue = tempNumber % 10;
                    result+=basValue;
                    tempNumber /= 10;
                }

                System.out.println("Sum Of Digits: " + result);
    }
}


