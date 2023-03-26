public class Main {
    public static void main(String[] args) {

        String[] company = {"John","Bob", "Max","Anna","Fred","Sam"};
        String[] company2 = {"Jack","Mat", "Mary"};

        String target = "Anna";

        int result = findIndexOfWord(company,target);
        System.out.println(result);


        System.out.println("------------------------");

        String word1 = "Nina";
        String word2 = "Galya";
        System.out.println(word1.equals(word2));
    }
    public static int findIndexOfWord(String[] words,String target){
        for (int i = 0; i < words.length; i++) {
            if (target.equals(words[i])) {
                return i;
            }
        }
        return -1;
    }

}