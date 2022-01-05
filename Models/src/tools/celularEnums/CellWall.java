package src.tools.celularEnums;

public enum CellWall {
    VARIOUS_STRUCTURES, EITHER_NO_CELL_WALLS_OR_BASIC, BASIC_STRUCTURE;

    public String toString() {
        
        switch(this){
            case VARIOUS_STRUCTURES:
                return "Various structures";
            case EITHER_NO_CELL_WALLS_OR_BASIC:
                return "Either no cell walls or a basic structure";
            case BASIC_STRUCTURE:
                return "Basic structure";
                
            default:
                return null;
        }
    }
}
