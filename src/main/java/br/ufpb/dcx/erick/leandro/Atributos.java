package br.ufpb.dcx.erick.leandro;

public enum Atributos {
    FOR("Força"),
    DES("Destreza"),
    CON("Cosntituição"),
    INT("Inteligência"),
    SAB("Sabedoria"),
    CAR("Carisma");

    private String desc;
    Atributos(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }
}
