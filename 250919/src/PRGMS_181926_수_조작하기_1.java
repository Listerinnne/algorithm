public class PRGMS_181926_수_조작하기_1 {

    public int solution0(int n, String control) {
        for(int i=0; i<control.length(); i++){
            switch(control.charAt(i)){
                case 'w' :
                    ++n;
                    break;
                case 's' :
                    --n;
                    break;
                case 'd' :
                    n += 10;
                    break;
                case 'a' :
                    n -= 10;
                    break;
            }
        }
        return n;
    }

    public int solution1(int n, String control) {
        char[] arr = control.toCharArray();
        for(char a : arr){
            switch(a){
                case 'w' : ++n;
                    break;
                case 's' : --n;
                    break;
                case 'd' : n+=10;
                    break;
                case 'a' : n-=10;
                    break;
            }
        }
        return n;
    }
}
