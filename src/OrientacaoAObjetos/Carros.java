package OrientacaoAObjetos;

public class Carros {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Saveiro";
        carro1.modelo = "Surf";
        carro1.ano = 2009;

        carro2.nome = "Opala";
        carro2.modelo = "SS";
        carro2.ano = 1989;

        System.out.println("Informações do primeiro carro: ");
        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano + "\n");
        System.out.println("Informações do segundo carro: ");
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}

