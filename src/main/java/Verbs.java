public enum Verbs {
    WINCES("winces"),
    GRINS("grins"),
    BITESTONGUE("bites their tongue"),
    WINKS("winks"),
    FLEX("flexes their arms"),
    PINCH("pinches themselves"),
    SCREAMS("screams expletive"),
    WHISTLES("whistles innocently"),
    CLAPS("claps their hands sarcastically");

    private final String value;

    Verbs (String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
