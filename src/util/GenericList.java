package util;
// sem atributos/ generica
import java.util.ArrayList;
import java.util.List;

/*Classe generica de uma lista para ser reaproveitada para diversos tipos */
public class GenericList<T>{

    /*principal e unico atributo dessa classe é uma lista de um tipo generico */
    private List<T> lista;

    /*construtor padrão personalizado dessa classe, onde toda vez q um objeto dessa classe for instanciado, vai criar automaticamente um novo arrayList */
    public GenericList(){
        lista = new ArrayList<>();
    }

    /*metodo de adicionar um objeto a lista, pegando como parametro objeto que voce quer adicionar ja instanciado */
    public void adicionar(T object){
        lista.add(object);
    }

    /*metodo de listar todos os objetos pertencentes a lista */
    public void listar(){
        if(!lista.isEmpty()){
            for(T t: lista){
                System.out.println(t);
            }
        }else{
            System.out.println("[LISTA VAZIA]");
        }
    }

    /*metodo de pesquisar as informações de um objeto especifico, tomando como referencia o proprio objeto*/
    public void pesquisar(T object){
        boolean encontrado = false;
        if(!lista.isEmpty()){
            for(T t: lista){
                if(t.equals(object)){
                    encontrado = true;
                    System.out.println(t);
                    break;
                }else if(encontrado = false){
                    System.out.println("[NÃO ENCONTRADO]");
                }
            }
        }else{
            System.out.println("[LISTA VAZIA]");
        }
    }
    /*metodo de remover um objeto da lista */
    public void remover(T object){
        lista.remove(object);
        System.out.println("[REMOVIDO COM SUCESSO]");
    }
    

    






}
