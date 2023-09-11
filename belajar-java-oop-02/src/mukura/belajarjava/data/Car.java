package mukura.belajarjava.data;

/*
* Materi Interface
* */
public interface Car extends HasBrand, IsMaintenance {
    void drive();
    int getTier();

    // default method
    default boolean isBig(){
        return false;
    }
}
