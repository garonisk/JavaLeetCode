public class LengthOfLastWord {

        public int lengthOfLastWord(String s) {
            s = s.trim().replaceAll("\\s+", " ");
            String[] arr = s.split(" ");
            int index = arr.length - 1 ;
            return arr[index].length();

    }
}
