package NurArray;
import java.util.Scanner;

public class NurArray {
    private int[] numbers;

    public NurArray(int size) {
        numbers = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich bin hungrig für " + size + " Zählen:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    public int MaxZahl(){
        int maxwert=-9999;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>maxwert) maxwert=numbers[i];
        }
        return maxwert;
    }

    public int MinZahl(){
        int minwert=9999;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<minwert) minwert=numbers[i];
        }
        return minwert;
    }

    public int SumMax(){
        int minwert=this.MinZahl();
        int maxsum=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]!=minwert) maxsum=maxsum+=numbers[i];
        }
        return maxsum;
    }

    public int SumMin(){
        int maxwert=this.MaxZahl();
        int minsum=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]!=maxwert) minsum=minsum+=numbers[i];
        }
        return minsum;
    }

}
