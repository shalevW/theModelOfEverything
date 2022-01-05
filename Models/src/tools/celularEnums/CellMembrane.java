package src.tools.celularEnums;

public enum CellMembrane {
    ETHER_LINKED_LIPIDS, ESTER_LINKED_LIPIDS;

    public String toString(){
    switch (this) {
        case ETHER_LINKED_LIPIDS:
            return "Ether linked Lipids";
        case ESTER_LINKED_LIPIDS:
            return "Ester linked Lipids";
        default:
            break;
    }}
}
