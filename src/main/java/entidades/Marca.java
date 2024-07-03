package entidades;

public class Marca {
    //2 metodos constructores
    //se llamaron igual a la clase son publicos
    //sirven para crear objetos de la clase
    private int id;
    private String nomMarca;

    public Marca(){
        this.id=-1;
        this.nomMarca="no especificado";
    }
    public Marca(String nomMarca){
        this.nomMarca=nomMarca;
    }
    public void MostrarMarca(){
        System.out.println("Marca:" +this.id + "" + this.nomMarca);
    }
public void setId(int id){
        this.id=id;
}
public int getId(){
        return this.id;
}
public void setNomMarca(String nomMarca){
        this.nomMarca=nomMarca;
}
public String getNomMarca(){
        return this.nomMarca;
}
public String toString(){
        return "marca"+ this.id +""+ this.nomMarca;
}

}




