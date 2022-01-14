public class MainAtvHeranca {

    public static void main(String args[]) {

        Cliente cliente = new Cliente("Jhon", "223-111", 22, 1, 3000);
        Vendedor vendedor = new Vendedor("Silas", "331-491", 36, "Efetuar vendas por telemarketing", 1700,1);
        Gerente gerente = new Gerente("Marcio", "222-333", 54, "Gerir equipe do telemarketing", "Vendas","Telemarketing");

        System.out.println(cliente);
        System.out.println("\n\n");
        System.out.println(vendedor);
        System.out.println("\n\n");
        System.out.println(gerente);


    }
}