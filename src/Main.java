import HashTable.E500;

class Main {
    public static void main(String[] args) {
        E500 e = new E500();
        String[] strings = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] s = e.findWords(strings);
        int k = 0;
    }

    public static void p(Object o) {
        System.out.println(o);
    }
}
