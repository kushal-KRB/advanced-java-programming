interface Sports {
    void play();
}

interface Music {
    void perform();
}
class Student implements Sports, Music {

    public void play() {
        System.out.println("Student plays football");
    }

    public void perform() {
        System.out.println("Student performs music");
    }
}