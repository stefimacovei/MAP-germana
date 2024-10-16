package GroßeZahlen;

import java.util.Scanner;

public class GrosseZahlen {
    public int[] addierung(int[] zahl1, int[] zahl2){
        int[] summe=new int[zahl1.length+1];
        for(int i=0; i<summe.length; i++) summe[i]=0;
        int carry=0;
        for(int i=zahl1.length-1; i>=0; i--){
            if((zahl1[i]+zahl2[i]+carry)<10) {
                summe[i+1] = zahl1[i] + zahl2[i] + carry;
                carry=0;
            }
            else {
                summe[i+1]=(zahl1[i]+zahl2[i]+carry)%10;
                carry=(zahl1[i]+zahl2[i]+carry)/10;
            }
        }
        if(carry!=0) summe[1]=carry;
        return summe;
    }
    public int[] differenz(int[] zahl1, int[] zahl2){
        int[] diff=new int[zahl1.length];
        for(int i=0; i<diff.length; i++) diff[i]=0;
        //int borrow=0;
        for(int i=zahl1.length-1; i>=0; i--){
            if(zahl1[i]>=zahl2[i]) diff[i]=zahl1[i]-zahl2[i];
            else {
                int borrowIndex = i - 1;
                while (borrowIndex >= 0 && zahl1[borrowIndex] == 0) {
                    if(borrowIndex!=0) zahl1[borrowIndex] = 9;
                    borrowIndex--;
                }
                if (borrowIndex >= 0) {
                    zahl1[borrowIndex]--;
                }
                diff[i] = (zahl1[i] + 10) - zahl2[i];
            }
        }
        return diff;
    }
    public int[] multiplikation(int[] zahl, int quantor){
        int[] mult=new int[zahl.length+1];
        for(int i=0; i<mult.length; i++) mult[i]=0;
        int carry=0;
        for(int i=zahl.length-1; i>=0; i--){
            mult[i+1]=(zahl[i]*quantor+carry)%10;
            carry=(zahl[i]*quantor+carry)/10;
        }if(carry>0) mult[1]=carry;
        return mult;
    }
    public int[] division(int[] zahl, int quantor){
        int[] div=new int[zahl.length];
        for(int i=0; i<div.length; i++) div[i]=-1;
        int name2=zahl[1];
        int name1=0;
        int i=1, j=0;
        while(i<zahl.length){
            div[j]=name2/quantor;
            name1=div[j]*quantor;
            if(i<zahl.length-1) name2=(name2-name1)*10+zahl[i+1];
            i++;
            j++;
        }
        return div;
    }

}
