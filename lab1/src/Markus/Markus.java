package Markus;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Arrays;

public class Markus {
    int[] usb, tastatur;

    public Markus() {
        Scanner scanner = new Scanner(System.in);
        int grosse1, grosse2;
        System.out.println("Wieviele USBs?: ");
        grosse1 = scanner.nextInt();
        System.out.println("Wieviele Tastaturen?: ");
        grosse2 = scanner.nextInt();
        usb = new int[grosse1];
        tastatur = new int[grosse2];
        System.out.println("Wir lesen die erste: ");
        for (int i = 0; i < grosse1; i++) {
            usb[i] = scanner.nextInt();
        }
        System.out.println("Wir lesen die zweite: ");
        for (int i = 0; i < grosse2; i++) {
            tastatur[i] = scanner.nextInt();
        }
        System.out.println("danke!!!");
    }

    public int billige_tastatur() {
        int minwert = 9999;
        for (int i = 0; i < tastatur.length - 1; i++) {
            if (tastatur[i] < minwert) minwert = tastatur[i];
        }
        return minwert;
    }

    public int teuerster_gegenstand() {
        int maxwert = 0; ///nimic nu costa 0 lei!!!!!
        for (int i = 0; i < tastatur.length - 1; i++) {
            if (tastatur[i] > maxwert) maxwert = tastatur[i];
        }
        for (int i = 0; i < usb.length - 1; i++) {
            if (usb[i] > maxwert) maxwert = usb[i];
        }
        return maxwert;
    }

    public int max_budget(int budget) {
        //fuck you marcus!!!!
        int maxwert = 0;
        for (int i = 0; i < usb.length - 1; i++) {
            if (usb[i] > maxwert && usb[i] < budget) maxwert = usb[i];
        }
        return maxwert;
    }

    public int combo(int budget) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : tastatur) {
            minHeap.add(num);
        }
        int[] sortedtastatur = new int[tastatur.length];
        for (int i = 0; i < tastatur.length; i++) {
            sortedtastatur[i] = minHeap.remove();
        }
        int differenz = 0;
        int maxcombo = -1;
        Arrays.sort(usb);
        for (int i = 0; i < usb.length; i++) {
            differenz = budget - usb[i];
            if (differenz < 0) {
                break;
            }
            int idx = this.binary_search(sortedtastatur, differenz);
            if (idx != -1) {
                if(sortedtastatur[idx]+usb[i]>maxcombo)maxcombo=sortedtastatur[idx]+usb[i];
            }
        }
        return maxcombo;
    }

    int binary_search(int[]array, int budget){
        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] <= budget) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

}