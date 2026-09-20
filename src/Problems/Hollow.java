package Problems;

public class Hollow {
    public static void main(String[] args){
        int n=5;
        square(n);
        System.out.println();
        triangle(n);
        System.out.println();
        pyramid(n);
    }
    static void square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 ||i==n-1 ||j==0 ||j==n-1)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void triangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==i||i==n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++) System.out.print("  ");
            for(int j=0;j<2*i+1;j++) System.out.print("* ");
            System.out.println();
        }
    }
}
