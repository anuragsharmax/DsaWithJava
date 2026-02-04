package Recursion;

public class StringByRec {
    static void main(String[] args) {
//        addStr("","abcdaah");
        System.out.println(skipOnlyApp("cricappleappketer"));
    }

    static void addStr(String ans, String que) {
        if(que.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=que.charAt(0);
        if(ch=='a'){
            addStr(ans,que.substring(1));
        }else{
            addStr(ans+ch,que.substring(1));
        }
    }
    static String skip(String que){
        if(que.isEmpty()){
            return "";
        }
        char ch=que.charAt(0);
        if(ch=='a'){
            return skip(que.substring(1));
        }else{
            return ch+skip(que.substring(1));
        }
    }
    static String skipOnlyApp(String que){
        if(que.isEmpty()) {
            return "";
        }
            if(que.startsWith("app")&&!que.startsWith("apple")){
                return skipOnlyApp(que.substring(3));
            }else{
                return que.charAt(0)+skipOnlyApp(que.substring(1));
            }
        }


}

