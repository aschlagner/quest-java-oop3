public interface Fly {
    
    public void takeOff();

    public int ascend(int meters);

    public int descend(int meters);

    public void land();

    public default void glide() {
        System.out.println("glides into the air.");
    }

}
