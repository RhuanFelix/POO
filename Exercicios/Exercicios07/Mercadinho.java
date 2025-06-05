public class Mercadinho {
    private Cliente[] clientes;
    private int i;

    public Mercadinho(){
        clientes = new Cliente[10];
        i = 0;
    }

    public void adicionarCliente(Cliente cliente){
        if (i < clientes.length) {
            clientes[i] = cliente;
            i++;
        } else {
            System.out.println("Não foi possível adicionar mais clientes!");
        }
    }

    public double calcularTotal(){
        double calcularTotal = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                calcularTotal += clientes[i].calcularPagamento();
            }
        }

        return calcularTotal;
    }

    public void imprimirClientes(){
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                System.out.println(clientes[i].toString());
            }
        }
    }
}