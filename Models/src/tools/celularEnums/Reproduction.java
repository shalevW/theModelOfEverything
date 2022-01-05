package src.tools.celularEnums;

public enum Reproduction {
    SEXUAL, A_SEXUAL;

    public String toString() {
        
        switch (this) {
            case SEXUAL:
                return "Sexual reproduction";
            case A_SEXUAL:
                return "A_Sexual reproduction";
        
            default:
                break;
        }
    }
}
