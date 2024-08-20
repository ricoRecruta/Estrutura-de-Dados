package listaduplaencadeada;

import listaencadeadasimples.ListaEncadeada;

public class ListaEncadeadaDupla<Dado> {
    private No head = null;
    private No tail = null ;
    private No current;
    private int tamanho = 0;

    public class No{
        private Dado elemento;
        private No next = null;
        private No previus = null;

        public No(Dado elemento){
            this.elemento = elemento;
        }

        public String toString(){
            return ""+elemento;
        }
    }



    public void add(Dado elemento){
        No newNo = new No(elemento);

        current = tail;
        tail = newNo;

        if(current == null)  head = tail;
        else{
            current.next = newNo;
            tail.previus = current;
            tamanho++;
        }
    }

    public void addinicio(Dado elemento){
        No newNo = new No(elemento);

        current = head;
        head = newNo;

        if(current == null) tail = head;
        else{
            head.next = current;
            current.previus = head;
            tamanho++;
        }
    }

    public Dado get(Dado elemento){
        current = head;

        while(current != null && current.elemento != elemento ){
            current = current.next;
        }

        if(current == null) return null;
        else{
            return current.elemento;
        }
    }

    public Dado getAndRemove(Dado elemento){
        No currentTail = tail;
        if(head == null) return null;

        current = head;
        //o que eu vou mudar para mandar
            /*while (current != null && current.elemento != elemento) {
                current = current.next;
            }

            if(current == head){
                head = head.next;
                tamanho --;
                return current.elemento;
            } else if(currentTail != null && current == currentTail){ // erro na hora de encontrar um jeito de achar a cauda
                current.previus.next = null;
                tamanho --;
                return current.elemento;
            }
            else{
                assert current != null;
                current.next.previus = current.previus;
                current.previus.next = current.next;
                tamanho--;
                return current.elemento;
            }*/
        /*    while (current != null && current.elemento != elemento) current = current.next;
            if (current != null) {
                if (current == head) {
                    head = head.next;
                    head.previus = null;
                }
                else if (current == tail){
                    tail = tail.previus;
                    tail.next = null;
                }
                else {
                    current.previus.next = current.next;
                    current.next.previus = current.previus;
                }

                tamanho--;
                return current.elemento;
            }
            else return null; */
        while (current != null && !current.elemento.equals(elemento)) {
            current = current.next;
        }

        if (current != null) {
            if (current == head) {
                head = head.next;
                if (head != null) {
                    head.previus = null;
                } else {
                    tail = null; // Caso onde a lista fica vazia
                }
            } else if (current == tail) {
                tail = tail.previus;
                if (tail != null) {
                    tail.next = null;
                } /* else {
                    head = null; // Caso onde a lista fica vazia
                }*/
            } else {
                current.previus.next = current.next;
                current.next.previus = current.previus;
            }

            tamanho--;
            return current.elemento;
        } else {
            return null;
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
