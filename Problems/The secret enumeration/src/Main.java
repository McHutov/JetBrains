public class Main {

    public static void main(String[] args) {
        int strCnt = 0;
        for (Secret s : Secret.values()) {
            strCnt += s.name().startsWith("STAR") ? 1 : 0;
        }
        System.out.println(strCnt);
    }
}


