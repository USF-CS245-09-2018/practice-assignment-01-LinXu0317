public class FactorialIterative implements Factorial {
    int total = 1;
     public int factorial(int n){
         int result=1,i=1;
         while(i<=n){
             result=result*i;
             i++;
         }
         return result;
//     }
//         if( n ==0){
//             total = 1;
//         }
//         else if(n == 1){
//             total = 1;
//         }
//         else {
//         for (int i = 1; i <= n; i++) {
//             total = total*i;
//             }
////         }
//         return total; this approach does not work, I fail to see why lol
    }
}
