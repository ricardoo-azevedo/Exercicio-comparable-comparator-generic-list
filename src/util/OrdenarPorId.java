package util;

import java.util.Comparator;

import model.Livro;
/*Uma Classe especifica criada para implementar o Comparator do tipo Livro, onde seu metodo sera usado de maneira utilitaria para que possa ordenar os objetos da lista pelos seus ids */
public class OrdenarPorId implements Comparator<Livro> {

    @Override           /*Dois objetos do tipo Livro serão pedidos no parametros para a comparação entre oas atributos de ids deles */
    public int compare(Livro o1, Livro o2) {
       return Long.compare(o1.getId(), o2.getId());
    }

    

    
    
    
}
