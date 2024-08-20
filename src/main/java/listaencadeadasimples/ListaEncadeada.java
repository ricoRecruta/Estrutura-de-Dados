package listaencadeadasimples;

public class ListaEncadeada <Dado> {

    private No head = null;
    private No tail = null ;

    private No current;
    private int n = 0;

    public class No {
        private Dado elemento;
        private No next = null;

        public No(Dado elemento) {
            this.elemento = elemento;
        }

        public String toString(){
            return " "+elemento;
        }

    }

    private int tamanho;
    public void adicionar(Dado elemento){ // adciona no fim da lista

            No newNo = new No(elemento);

            current = tail;
            tail = newNo;

            if(current == null) head = tail;
            else{
                current.next = tail;
                n++;
            }
    }

    public void addInicio(Dado elemento){ // QUESTÃO 13 adciona no inicio da lista
        No newNo = new No(elemento);

        current = head;
        head = newNo;

        if(current == null) tail = head;
        else{
            newNo.next = current;
            n++;
        }

    }

    public Dado get(Dado elemento){ //  QUESTÃO 14

        current = head;
        while (current != null && current.elemento != elemento ) current = current.next;

        if(current == null) return null;
        return current.elemento;
    }

    public Dado getAndRemove(Dado elemento){

        current = head;
        No old = current;

        if(current.elemento ==  elemento){
            head = head.next;
            n--;
            return old.elemento;
        }

        while(current != null && current.elemento != elemento) {
            old = current;
            current = current.next;

        }

        if(current == null) return null;
        else{
            old.next = current.next;
            n--;
            return current.elemento;
        }

    }

    public String toString(){
        current = head;
        String str = " ";

        while(current != null){
            str = str +current.elemento+" ";
            current = current.next;
        }

        return str;
    }

}
