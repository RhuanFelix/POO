public class Principal {
    public static void main(String[] args) {
        Mercadinho mercadinho = new Mercadinho();

        mercadinho.adicionarCliente(new ClienteRegular("João", 100));
        mercadinho.adicionarCliente(new ClienteVip("Antonio", 200, "6172636"));
        mercadinho.adicionarCliente(new ClienteOuroVip("Maria", 200, "6172636", "rua..."));
        mercadinho.adicionarCliente(new ClienteRegular("José", 300));

        mercadinho.imprimirClientes();
        
        System.out.println("Valor total das compras de todos os clientes: " + mercadinho.calcularTotal());
    }
}