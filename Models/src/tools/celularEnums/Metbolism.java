package src.tools.celularEnums;

public enum Metbolism {
    PHOTOSYNTHESIS;

    public String toString() {
        
        switch (this) {
            case PHOTOSYNTHESIS:
                return "this feeds by Photosynthesis";
        
            default:
                break;
        }
    }
}
