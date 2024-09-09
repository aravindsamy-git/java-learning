package recursionImp;

public class SkipString {
    public static void main(String[] args) {
        skip1("","baccah");
    }

    static void skip1(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            skip1(p,up.substring(1));
        }else {
            skip1(p + ch ,up.substring(1));
        }
    }
}
