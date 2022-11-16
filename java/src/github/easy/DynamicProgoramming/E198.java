package easy.DynamicProgoramming;

public class E198 {
    /*
    top vote answer for explanation
     */
//    public int rob(int[] nums) {
//        int ifRobbedPrevious = 0;    // max monney can get if rob current house
//        int ifDidntRobPrevious = 0; // max money can get if not rob current house
//
//        // We go through all the values, we maintain two counts, 1) if we rob this cell, 2) if we didn't rob this cell
//        for (int i = 0; i < nums.length; i++) {
//            // If we rob current cell, previous cell shouldn't be robbed. So, add the current value to previous one.
//            int currRobbed = ifDidntRobPrevious + nums[i];
//
//            // If we don't rob current cell, then the count should be max of the previous cell robbed and not robbed
//            int currNotRobbed = Math.max(ifDidntRobPrevious, ifRobbedPrevious);
//
//            // Update values for the next round
//            ifDidntRobPrevious = currNotRobbed;
//            ifRobbedPrevious = currRobbed;
//        }
//
//        return Math.max(ifRobbedPrevious, ifDidntRobPrevious);
//    }

    /*
    my solution
    本题需要注意的是没抢的房间和抢的房间是动态可变的，取决于每次遍历时值的大小
     */

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        //针对第一间房子，有两种情况，抢或者不抢
        int notRob = 0;
        int rob = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //对之后的每一间房子，如果不抢这间房子，那么最大值取决于之前的没有抢的值和抢的值之间最大的
            //如果抢这一间，那么值应该是之前没抢的（因为相邻的不能抢）所有值，加上抢的这一间
            int temp = notRob;
            notRob = Math.max(notRob, rob);
            rob = temp + nums[i];
        }
        //最后对抢的方案做一下大小比较，返回最大的即是结果
        return Math.max(notRob, rob);
    }
}
