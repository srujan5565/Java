import java.util.Scanner;
public class AllPatterns {
    static void square(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                System.out.print('*' + "  ");
            }
            System.out.println();
        }
    }

    static void increasing(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }

    static void decreasing(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = row; col <= n; col++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }

    static void triangle(int n) {
        for(int row = 1; row <= n; row++) {
            // decreasing with spaces
            for(int col = row; col <= n-1; col++)
                System.out.print(" " + "  ");
            // increasing with stars
            for(int col = 1; col <= row-1; col++)
                System.out.print("*" + "  ");
            // increasing with stars
            for(int col = 1; col <= row; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void hill_1(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++)
                System.out.print("*" + "  ");
            for(int col = row; col <= n-1; col++)
                System.out.print(" " + "  ");
            for(int col = 1; col <= row; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void hill_2(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++)
                System.out.print("*" + "  ");
            for(int col = row; col <= n-1; col++)
                System.out.print(" " + "  ");
            for(int col = row; col <= n-1; col++)
                System.out.print(" " + "  ");
            for(int col = 1; col <= row; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void diamond(int n) {
        for(int row = 1; row <= n-1; row++) {
            for(int col = row; col <= n-1; col++)
                System.out.print(" " + "  ");
            for(int col = 1; col <= row-1; col++)
                System.out.print("*" + "  ");
            for(int col = 1; col <= row; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row-1; col++)
                System.out.print(" " + "  ");
            for(int col = row; col <= n-1; col++)
                System.out.print("*" + "  ");
            for(int col = row; col <= n; col++)
                System.out.print("*" + "  ");
            System.out.println();
        }
    }

    static void h_lines(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row == 1 || row == n)
                    System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }

    static void v_lines(int n, char symbol) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col == 1 || col == n)
                    System.out.print(symbol + "  ");
                else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }
    }

    static void backward_slash(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row == col)
                    System.out.print("*" + "  ");
                else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }
    }

    static void forward_slash(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row+col == n+1)
                    System.out.print("*" + "  ");
                else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }
    }

    static void h_square(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col ++) {
                if(row == 1 || col == 1 || row == n || col == n)
                    System.out.print("*" + "  ");
                else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }
    }

    static void cross(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(row == col || row+col == n+1)
                    System.out.print("*" + "  ");
                else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }
    }

    static void arrow(int n) {
        for(int row = 1; row <= n-1; row++) {
            for(int col = 1; col <= n; col++) {
                if(col == 1 || row == col)
                    System.out.print("*" + "  ");
                else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }

        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                if(col == 1 || row == 1 || row+col == n+1)
                    System.out.print("*" + "  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    static void fountain(int n) {
        for(int row = 1; row <= n-1; row++) {
            for(int col = 1; col <= n-1; col++) {
                if(row == col)
                    System.out.print(row + "  ");
                else
                    System.out.print(" " + "  ");
            }
            for(int col = 1; col <= n; col++) {
                if(row+col == n+1)
                    System.out.print(row + "  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n-1; col++) {
                if(row+col == n+1)
                    System.out.print(col + "  ");
                else
                    System.out.print(" " + "  ");
            }
            for(int col = 1; col <= n; col++) {
                if(row == col)
                    System.out.print(n-col+1 + "  ");
                else
                    System.out.print(" " + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner snr = new Scanner(System.in);
        int n = snr.nextInt();
//        char symbol = snr.next().charAt(0);

        fountain(n);
        arrow(n);
        cross(n);
        h_square(n);
        forward_slash(n);
        backward_slash(n);
        v_lines(n,'a');
        h_lines(n);
        hill_2(n);
        square(n);
        increasing(n);
        decreasing(n);
        hill_1(n);

    }
}