import listaduplaencadeada.ListaEncadeadaDupla;
import org.junit.jupiter.api.Test;

public class ListaEncadedaDuplaTeste {
    @Test
    public void ListaEncadeadaTeste(){
        ListaEncadeadaDupla lista = new ListaEncadeadaDupla<>();

        lista.add('2');
        lista.add('3');
        lista.add(4);
        lista.add(5);
        lista.addinicio(99);
        lista.add(78);

        System.out.println("Lista completa antes de ser removida: "+lista);

        System.out.println(" ");
        System.out.println("Ordem dos numeros a serem removidos");

        Object teste = lista.getAndRemove('2');
        Object teste2 = lista.getAndRemove('3');
        Object teste3 = lista.getAndRemove(99);
        Object teste4 = lista.getAndRemove(4);
        Object teste5 = lista.getAndRemove(78);
        Object teste6 = lista.getAndRemove(5);
        //o que eu mudei


        //ordem dos numeros que foram tirados
        System.out.println(teste);
        System.out.println(teste2);
        System.out.println(teste3);
        System.out.println(teste4);
        System.out.println(teste5);
        System.out.println(teste6);

        System.out.println(" ");

        System.out.println("Essa são os valores da lista depois de removidos: "+lista);


        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Adcionando outros elementos na lista");

        lista.add(5);
        lista.add(365);
        lista.add(364);

        System.out.println(" ");
        System.out.println("Nova lista adcionada"+lista);









    }
}
