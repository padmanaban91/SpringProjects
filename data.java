public class MyClass {
    public static void main(String args[]) {
        int[] values= new int[] {12,54,3,87,23};
        int start = 0, end = values.length - 1;
        
        /*
        Bubble Sort
        int[] values= new int[] {12,54,3,87,23};
        System.out.println(values.length);
        for(int i = 0; i < values.length; i++) {
            for(int j = i+1; j < values.length; j++) {
                if(values[i] > values[j]) {
                    values[i] = values[i] + values[j];
                    values[j] = values[i] - values[j];
                    values[i] = values[i] - values[j];
                }
            }
        }
        for(int i=0;i<values.length;i++) {
            System.out.print(values[i] + " ");
        }
        */
        
        /*
        FActorial for loop
        System.out.println("Factorial by for loop");
        int valu = 0;
        int factorial = 1;
        while(valu > 0 ) {
            factorial = factorial * valu;
            valu = valu - 1;
        }
        System.out.println("Factorial: " + factorial);
        */
    }
}
