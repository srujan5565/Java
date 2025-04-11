class pe20{
    public static void main(String[] args) {
        int sum=0,i,j,carry,temp=1;
        int arr[]=new int[500];
        for(i=0;i<500;i++)
        {
            arr[i]=0;
        }
        arr[0]=1;
        for(i=1;i<=100;i++)
        {
            carry=0;
            for(j=0;j<500;j++)
            {
                temp=arr[j]*i+carry;
                carry=0;
                if(temp>9)
                {
                    arr[j]=temp%10;
                    carry=temp/10;
                }
                else{
                    arr[j]=temp;
                }
            }
        }
        for(i=499;i>=0;i--)
        {
            System.out.print(arr[i]);
            sum+=arr[i];
        }
        System.out.println("\n\nsum = ");
        System.out.println(sum);
    }
}