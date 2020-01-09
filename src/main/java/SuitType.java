public enum SuitType {
    HEARTS(4),
    CLUBS(3),
    DIAMONDS(2),
    SPADES(1);


    private final int value;

    SuitType(int value){
        this.value = value;
    }


    public int getValue() {
        return value;
    }
}
