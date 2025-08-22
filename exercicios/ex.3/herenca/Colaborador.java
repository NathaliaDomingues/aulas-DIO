public sealed abstract class Colaborador permits Gerente, Vendedor{
    //abstract: usada para atingir abstração.
    //sealed: só pode ser estendido por suas próprias subclasses explicitamente permitidas.
    //permits: usada em conjunto com sealedclasses e interfaces para definir explicitamente quais classes ou interfaces podem estendê-las ou implementá-las.

    private String codigo;
    private String endereco;
    private String nome;
    private int idade;
    private double salario;

    //codigo
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    //endereço
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(){
        this.endereco = endereco;
    }

    //nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //idade
    public int getIdade(){
        return idade;
    }
    public void setIdade(){
        this.idade = idade;
    }

    //salario
    public double getSalario(){
        return salario;
    }
    public void setSalario(){
        this.salario = salario;
    }
}