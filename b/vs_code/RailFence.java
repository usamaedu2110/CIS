package vs_code;
class RailFence {
    public static void main(String args[]) {
        String input = "Good afternoon user.";
        String output = "";
        int len = input.length();
        System.out.println("Input string: " + input);
        for (int i = 0; i < len; i += 2) {
            output += input.charAt(i);
        }
        System.out.println("Cipher text: " + output);
    }
}