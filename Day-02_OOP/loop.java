class A {

    class B {
        public void test() {
            for (int i = 0; i <= 100; i += 2) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        A objA = new A();      // create object of A
        A.B objB = objA.new B(); // create object of inner class B
        objB.test();          // call method
    }
}
