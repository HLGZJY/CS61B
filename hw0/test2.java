/**public class ClassNameHere {
    /** Returns the maximum value from m. 
    public static int max(int[] m) {
        for(int i=1;i<6;i++){
            int maximum=m[0];
            if(m[i]>maximum){
                maximum=m[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));      
    }
}*/
public class ClassNameHere {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        // Check if the array is not empty
        if (m.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int maximum = m[0]; // Initialize maximum with the first element

        for (int i = 1; i < m.length; i++) {
            if (m[i] > maximum) {
                maximum = m[i];
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));      
    }
}
