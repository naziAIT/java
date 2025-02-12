public class firstexamweekly {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int sum=0;
        int max=arr[0];
        int min = arr[0];
        for(int i: arr){
            sum+=i;
        }
        System.out.println("Sum is - "+sum);
        for(int i : arr){
            if(i>max){
                max=i;
            }
            if (i<min){
                min=i;
            }
        }
        System.out.println("Max is - "+ max);
        System.out.println("Min is - "+min);
        double avr = sum / arr.length;
        System.out.println("Averange is - " +avr);
    }
}
