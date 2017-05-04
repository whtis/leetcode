class Main {
    public static void main(String[] args) {
        E53 e = new E53();
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        p(e.maxSubArray(nums));


    }

    public static void p(Object o) {
        System.out.println(o);
    }
}
