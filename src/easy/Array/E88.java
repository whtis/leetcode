package easy.Array;

/**
 * Created by wht on 2017/5/11.
 */
public class E88 {

    /* 这种方法可以AC，但是需要注意最后需要使用for循环更改nums1的值，如果使用下面语句替代，调试时看到的是正确答案，但是无法AC
    ````
    nums1 = ints;
    ````
    想了想原因，应该是nums1和ints都是数组对象，既然是对象，那么ints传递给nums1的就是一个引用，此时应该nums1引用指向的是正确答案，
    但从leetcode返回的结果上来看，nums1还是初始的值，这问题应该出在验证答案的方式上，有可能是检查nums1原始的内存中的值，那样只传
    递引用肯定是无法AC的

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ints = new int[m + n];
        for (int i = 0; i < m; i++) {
            ints[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            ints[m + i] = nums2[i];
        }
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            nums1[i] = ints[i];
        }
    }
    */

    /*
    由于原题目给出了nums1大小是足够的，因此上面的写法可以简化为
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++)
            nums1[i+m] = nums2[i];
        Arrays.sort(nums1);
    }
     */

    /*
    下面是高票答案
     */
}
