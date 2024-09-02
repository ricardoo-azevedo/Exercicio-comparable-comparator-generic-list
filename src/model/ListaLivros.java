package model;
//com atributos / sem ser generico
import model.Livro;
import java.util.ArrayList;
import java.util.List;

public class ListaLivros {
    /*Principal e unico atributo dessa classe é uma lista do tipo que ela vai armazenar */
    private List<Livro> listaDeLivros;

    /*Construtor padrão personalizado onde sua função vai ser criar um novo arrayList toda vez q um objeto dessa classe seja instanciado */
    public ListaLivros(){
        listaDeLivros = new ArrayList<>();

    }
    /*metodo de adicionar um livro atraves dos atributos requeridos de livro */
    public void adicionarLivro(Long id, String titulo, String autor, String editora, String genero){
        listaDeLivros.add(new Livro(id, titulo, autor, editora, genero));
    }

    /*metodo para listar todos os objetos que estão na lista dessa classe */
    public void listarLivro(){
        if(!listaDeLivros.isEmpty()){
            for(Livro l: listaDeLivros){
                System.out.println(l);
            }
        }else{
            System.out.println("[LISTA VAZIA]");
        }
    }
    
    /*metodo para pesquisar algum livro com apenas tres atributos que julgo importante */
    public void pesquisarLivro(long id, String titulo, String genero){
        boolean encontrado = false;
        if(!listaDeLivros.isEmpty()){
            for(Livro l: listaDeLivros){
                if(l.getId() == id && l.getTitulo().equalsIgnoreCase(titulo)){
                    if(l.getGenero().equalsIgnoreCase(genero)){
                        encontrado = true;
                        System.out.println(l);
                        break;
                    }else if(encontrado = false){

                        System.out.println("[NÃO ENCONTRADO]");
                    }
                }
            }
        }else{
            System.out.println("[LISTA VAZIA]");
        }
    }


    /*metodo para remover algum livro, onde a base de identificação sera todos os atributos do livro que voce vai querer remover */
    public void removerLivro(Long id, String titulo, String autor, String editora, String genero){
        List<Livro> outraLista = new ArrayList<>();
        for(Livro l: listaDeLivros){
            if(l.getId() == id && l.getTitulo().equalsIgnoreCase(titulo)){
                if(l.getAutor().equalsIgnoreCase(autor) && l.getEditora().equalsIgnoreCase(editora)){
                    if(l.getGenero().equalsIgnoreCase(genero)){
                        outraLista.add(l);
                    }
                }
            }
        }
    listaDeLivros.removeAll(outraLista);
    System.out.println("[LIVRO REMOVIDO]");
    }

}
