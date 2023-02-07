// Matchsticks game
// https://practice.geeksforgeeks.org/problems/-matchsticks-game4906/1?page=2&category[]=Mathematical&sortBy=accuracy
public class Matchsticks {
    static int matchGame(Long N) {
        if (N % 5 == 0) return -1;
        return (int) (N % 5);
    }
    public static void main(String[] args) {
        System.out.println(matchGame(48l));
    }
}
