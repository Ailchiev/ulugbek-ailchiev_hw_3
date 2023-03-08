public class Main {
    public static void main(String[] args) {
        double[] randNums = {4.7,-3.2,6.7,8.9,2.1,-3.2,-7.3,9.2,6.4,5.7,6.9,3.4,-2.7,4.5,8.6};

        double summa = 0.0;
        int kollichestvo = 0;
        for (int i = 0; i < randNums.length; i++) {
            if (randNums[i]<0){
                for (int j = i+1; j<randNums.length; j++){
                    if(randNums[j]>0){
                        summa = summa+randNums[j];
                        kollichestvo++;
                        }
                    }
                break;
                }
            }
        System.out.println("summa  "+summa);
        System.out.println("kollichestvo  "+kollichestvo);
        System.out.println("summa/kollichestvo  "+summa/kollichestvo);
        }
    }
