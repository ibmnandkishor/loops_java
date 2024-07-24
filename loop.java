//while loop

// class First{
//     public static void main(String args[]){
//         int a=1;
//         while(a<=10){
//             System.out.println(a);
//             a++;
//         }
//     }
// }

//For loop

class First{
    public static void main(String args[]){
        int a=0; 
        int sum=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                // a=a+1;
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}