public enum SuitType {
    HEARTS(1),
    DIAMONDS(2),
    SPADES(3),
    CLUBS(4);

    private final int value;

    SuitType(int value){
        this.value = value;
    }
}
