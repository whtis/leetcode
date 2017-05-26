package HashTable;

/**
 * Created by wht on 2017/5/21.
 */
public class E204 {
    /*
    第一个判断可有可无，但是加上貌似一定情况下运行时间会有所减少

    this could be called Sieve of Eratosthenes
https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

https://www.youtube.com/watch?v=eKp56OLhoQs 然后视频里的题设和204有点不同，204是要求less than n，视频里是contain n
     */
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        int[] isPrimes = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimes[i] == 0)
                count++;
            for (int j = 2; i * j < n; j++) {
                isPrimes[i * j] = 1;
            }
        }
        return count;
    }
}
