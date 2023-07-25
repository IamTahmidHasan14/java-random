package random;

public class Convert {

    public static String decToBin(int dec) {
        String res = "", bin = "";
        while (dec != 0){
            int r = dec %2;
            res += r;
            dec /= 2;
        }
        for (int i = res.length()-1; i>=0; --i)
            bin += res.charAt(i);
        return bin;
    }
    public static int binToDec(String bin){
        int sum=0;
        int n = bin.length();
        for (int i=0; i<n; ++i)
            sum += (bin.charAt(i)-48) * Math.pow(2, n-(i+1));
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(decToBin(11));
        System.out.println(binToDec("1101"));
    }
}
