package UniNoten;

public class UniNoten {

    public int[] nicht_ausreichend(int[] inputArray){

        int j=0;
        int notwendig=0;
        for(int i=0; i<inputArray.length; i++){
            if(inputArray[i]<40) {
                notwendig++;
            }
        }
        int[] notenArray=new int[notwendig];
        for(int i=0; i<inputArray.length; i++){
            if(inputArray[i]<40) {
                notenArray[j]=inputArray[i];
                j++;
            }
        }
        return notenArray;
    }
    public double duschschnittliche_note(int[] inputArray){
        double notenAverage=0.0;
        for(int i=0; i<inputArray.length; i++){
            notenAverage=notenAverage+inputArray[i];
        }
        notenAverage=notenAverage/inputArray.length;
        return notenAverage;
    }

    public int[] abgerundete_noten(int[] inputArray){
        int[] kopieArray=new int[inputArray.length];
        for(int i=0; i<inputArray.length; i++){
            if((inputArray[i]/5*5+5)-inputArray[i]<3 && inputArray[i]>29) kopieArray[i]=inputArray[i]/5*5+5;
            else kopieArray[i]=inputArray[i];
        }
        return kopieArray;
    }

    public int maximale_abgerundete_note(int [] inputArray){
        int[] kopieArray=this.abgerundete_noten(inputArray);
        int maxnote=-999;
        for(int i=0; i<kopieArray.length; i++)
            if(kopieArray[i]>maxnote) maxnote=kopieArray[i];
        return maxnote;
    }

}
