import java.lang.StringBuilder;

public class PRGMS_181925_수_조작하기_2 {

    public String solution2(int[] numLog) {
        StringBuilder str = new StringBuilder();

        for(int i=0; i<numLog.length-1; i++){
            switch(numLog[i] - numLog[i+1]){
                case -1 : str.append("w");
                    break;
                case 1 : str.append("s");
                    break;
                case -10 : str.append("d");
                    break;
                case 10 : str.append("a");
                    break;
            }
        }
        return str.toString();
    }

    public String solution1(int[] numLog) {
        int len = numLog.length - 1;
        String str = "";

        for(int i=0; i<len; i++){
            switch(numLog[i] - numLog[i+1]){
                case -1 : str += "w";
                    break;
                case 1 : str += "s";
                    break;
                case -10 : str += "d";
                    break;
                case 10 : str += "a";
                    break;
            }
        }
        return str;
    }
}
