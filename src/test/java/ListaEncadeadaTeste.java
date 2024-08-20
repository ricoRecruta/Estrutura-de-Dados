import listaencadeadasimples.ListaEncadeada;
import org.junit.jupiter.api.Test;

public class ListaEncadeadaTeste {

    @Test
    public void ListaEncadeadaSimplesTeste(){
        ListaEncadeada lista = new ListaEncadeada<>();

        lista.adicionar("5");
        lista.adicionar("6");
        lista.addInicio(4);
        System.out.println(lista);

        Object dado = lista.getAndRemove(4);
        System.out.println(lista);
        System.out.println(dado);
    }
}
