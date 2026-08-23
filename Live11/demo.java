
class demo {

    public int sum() {
        return 2 + 2;
    }

    public static void main(String[] args) {
        demo c = new demo();
        // System.out.println(c.sum());
    }

}

class d {

    void print() {
        demo c2 = new demo();
        System.out.println(c2.sum());
    }
}
