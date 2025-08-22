public class Main {
    public static void main(String[] args) {
        Colaborador gerente = new Gerente();
        imprimirColaborador(new Gerente());
        imprimirColaborador(new Vendedor());

//        gerente.setNome("Alana");
//        gerente.setLogin("Alana@gmail.com");
//        gerente.setSenha("987654");
//
//        System.out.println(gerente.getNome());
//        System.out.println(gerente.getLogin());
//        System.out.println(gerente.getSenha());
    }

    public static void imprimirColaborador(Colaborador colaborador){

        System.out.printf("=====%s=====\n", colaborador.getClass().getCanonicalName());
//        if (colaborador instanceof Gerente gerente) {
//            //instanceof: verifica se um objeto é uma intancia de uma determinada classe.
//            colaborador.setNome("Alana");
//            gerente.setLogin("Alana@gmail.com");
//            gerente.setSenha("987654");
//
//            //getClass: nesse caso, para seperar as classes.
//            System.out.println(colaborador.getNome());
//            System.out.println(gerente.getLogin());
//            System.out.println(gerente.getSenha());
//            System.out.println("==========");
//        }

        //OU

        switch (colaborador){
            case Gerente gerente -> {
                gerente.setCodigo("290");
                gerente.setNome("Alana");
                gerente.setLogin("Alana@gmail.com");
                gerente.setSenha("987654");
                gerente.setSalario(5000);
                gerente.setComissao(1200);

                System.out.println("Código: " + colaborador.getCodigo());
                System.out.println("Salário: " + colaborador.getSalario());
                System.out.println("Nome: " + colaborador.getNome());
                System.out.println("Login: " + gerente.getLogin());
                System.out.println("Senha: " + gerente.getSenha());
                System.out.println("Comissão: " + gerente.getComissao());
            }


            case Vendedor vendedor -> {
                vendedor.setCodigo("987");
                vendedor.setNome("Mario");
                vendedor.setSalario(2800);
                vendedor.setPorcentual(10);

                System.out.println("Código: " + vendedor.getCodigo());
                System.out.println("Salário: " + vendedor.getSalario());
                System.out.println("Nome: " + vendedor.getNome());
                System.out.println("Porcentual por vendas: " + vendedor.getPorcentual());
            }
        }
    }

}