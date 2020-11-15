public class Main {

    public static void main(String[] args) {
        String format = "%-3s%6s\t%6s\t%6s%n";
        System.out.printf(format,"N","10*N","100*N","1000*n");
        for(int i = 1; i < 6; i++){
            String formatDec = "%-3d%6d\t%6d\t%6d%n";
            System.out.printf(formatDec,i, 10 * i, 100 * i, 1000 * i);
        }
    }
}
