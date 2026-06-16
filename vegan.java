public class vegan{
    public static void main(String[] args) {
        int[] proteinGrams = {20, 15, 25};

// Double Tofu intake
proteinGrams[0] *= 2;

// Replace Lentils with 30g algae powder
proteinGrams[1] = 30;

// Print the last item dynamically
System.out.println(proteinGrams[proteinGrams.length - 1]);
    }
}