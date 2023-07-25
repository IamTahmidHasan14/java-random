package random;

public class Random {

    public static void main(String[] args) {
        int i, r, a1=0, a2=0, a3=0, a4=0, a5=0, a6=0;
        int max = Integer.MIN_VALUE, maxd=-1;
        for(i=0; i<50; i++)
        {
            r = 1 + (int)(6 * Math.random());
            switch(r){
                case 1:
                    ++a1;
                    if(a1 > max){
                        max = a1;
                        maxd = 1;
                    }
                    break;
                case 2:
                    ++a2;
                    if(a2 > max){
                        max = a2;
                        maxd = 2;
                    }
                    break;
                case 3:
                    ++a3;
                    if(a3 > max){
                        max = a3;
                        maxd = 3;
                    }
                    break;
                case 4:
                    ++a4;
                    if(a4 > max){
                        max = a4;
                        maxd = 4;
                    }
                    break;
                case 5:
                    ++a5;
                    if(a5 > max){
                         max = a5;
                        maxd = 5;
                    }
                    break;
                case 6:
                    ++a6;
                    if(a6 > max){
                        max = a6;
                        maxd = 6;
                    }
                    break;
            }
        }
        System.out.printf("Face\tFreq\n");
        System.out.printf("1\t%d\n", a1);
        System.out.printf("2\t%d\n", a2);
        System.out.printf("3\t%d\n", a3);
        System.out.printf("4\t%d\n", a4);
        System.out.printf("5\t%d\n", a5);
        System.out.printf("6\t%d\n", a6);
        System.out.printf("Largest frequency = %d\n", maxd);
        
        System.out.printf("1 ");
        for(i=1; i<=a1; ++i){
            System.out.printf("*");
        }
        System.out.println("");
        System.out.printf("2 ");
        for(i=2; i<=a2; ++i){
            System.out.printf("*");
        }
        System.out.println("");
        System.out.printf("3 ");
        for(i=3; i<=a3; ++i){
            System.out.printf("*");
        }
        System.out.println("");
        System.out.printf("4 ");
        for(i=4; i<=a4; ++i){
            System.out.printf("*");
        }
        System.out.println("");
        System.out.printf("5 ");
        for(i=5; i<=a5; ++i){
            System.out.printf("*");
        }
        System.out.println("");
        System.out.printf("6 ");
        for(i=6; i<=a6; ++i){
            System.out.printf("*");
        }
        System.out.println("");
    }
}
