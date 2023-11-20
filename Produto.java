public class Produto {

    private int id;
    private String nome;
    private String desc;


    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }

}