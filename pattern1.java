public class pattern1 {
    public static void main(String args[]){
//               1 
//             2 1 2 
//           3 2 1 2 3 
//         4 3 2 1 2 3 4 
//       5 4 3 2 1 2 3 4 5 
//     6 5 4 3 2 1 2 3 4 5 6 
//   7 6 5 4 3 2 1 2 3 4 5 6 7 
// 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 
//         for(int i=1;i<=8;i++){
//             for(int l=i+1;l<=8;l++)
//             System.out.print("  ");
//             for(int k=i;k>1;k--)
//             System.out.print(k+" ");
//             for(int j=1;j<=i;j++)
//             System.out.print(j+" ");
//             System.out.println();


// 7*****7
// 75***57
// 753*357
// 7531357
// 753*357
// 75***57
// 7*****7
int k=7,l=7,t=5;
for(int c=0;c<4;c++){
for(int i=7;i>=k;i-=2){
System.out.print(i);
}
for(int s=t;s>0;s--) System.out.print("*");
for(int i=l;i<8;i+=2){
    if(i==1) continue;
System.out.print(i);
}
k-=2;
l-=2;
t-=2;
System.out.println();
}
k=3;
l=3;
t=1;
for(int c=0;c<3;c++){
    for(int i=7;i>=k;i-=2){
        System.out.print(i);
        }
        for(int s=t;s>0;s--) System.out.print("*");
        for(int i=l;i<8;i+=2){
            if(i==1) continue;
        System.out.print(i);
        }
        k+=2;
        l+=2;
        t+=2;
        System.out.println();
}
        }
}
