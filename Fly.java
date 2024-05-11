public interface Fly {
    void takeOff();

    void ascend(int altitude);

    default void glide() {
        System.out.println("glides into the air");
    }

    void descend(int altitude);

    void land();
}
