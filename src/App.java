import java.util.ArrayList;
import java.util.Collections;

import model.ListaLivros;
import model.Livro;
import util.GenericList;
import util.OrdenarPorId;

public class App {
    public static void main(String[] args) throws Exception {

        /*DISCLAIMER Usei o chatgpt apenas nessa classe main para poder testar mais rapidamente se todas as funcionalidades que implementei estão funcionando (preciso aprender testes unitarios logo para simplificar a verificação das minhas implementações)
         * 
         * Todo o codigo do teste manual nessa classe foi feita com i.a (so to avisando pra ser justo):
        */

        // Testando a classe Livro
        Livro livro1 = new Livro(3, "Livro C", "Autor C", "Editora C", "Genero C");
        Livro livro2 = new Livro(1, "Livro A", "Autor A", "Editora A", "Genero A");
        Livro livro3 = new Livro(2, "Livro B", "Autor B", "Editora B", "Genero B");

        System.out.println("Testando Comparable em Livro:");
        System.out.println("Comparando livro1 e livro2: " + livro1.compareTo(livro2)); // Deve mostrar valor positivo
        System.out.println("Comparando livro2 e livro3: " + livro2.compareTo(livro3)); // Deve mostrar valor negativo
        System.out.println("Comparando livro3 e livro1: " + livro3.compareTo(livro1)); // Deve mostrar valor negativo

        // Testando OrdenarPorId
        System.out.println("\nTestando OrdenarPorId:");
        var listaDeLivros = new ArrayList<Livro>();
        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);

        System.out.println("Antes da ordenação:");
        for (Livro livro : listaDeLivros) {
            System.out.println(livro);
        }

        Collections.sort(listaDeLivros, new OrdenarPorId());

        System.out.println("\nApós a ordenação por ID:");
        for (Livro livro : listaDeLivros) {
            System.out.println(livro);
        }

        // Testando ListaLivros
        System.out.println("\nTestando ListaLivros:");
        ListaLivros listaLivros = new ListaLivros();
        listaLivros.adicionarLivro(4L, "Livro D", "Autor D", "Editora D", "Genero D");
        listaLivros.adicionarLivro(5L, "Livro E", "Autor E", "Editora E", "Genero E");
        listaLivros.adicionarLivro(6L, "Livro F", "Autor F", "Editora F", "Genero F");

        System.out.println("Listando livros adicionados:");
        listaLivros.listarLivro();

        System.out.println("\nPesquisando livro com ID 4, Titulo 'Livro D' e Genero 'Genero D':");
        listaLivros.pesquisarLivro(4L, "Livro D", "Genero D");

        System.out.println("\nRemovendo livro com ID 4, Titulo 'Livro D', Autor 'Autor D', Editora 'Editora D' e Genero 'Genero D':");
        listaLivros.removerLivro(4L, "Livro D", "Autor D", "Editora D", "Genero D");

        System.out.println("\nListando livros após remoção:");
        listaLivros.listarLivro();

        // Testando GenericList
        System.out.println("\nTestando GenericList:");
        GenericList<Livro> genericList = new GenericList<>();
        genericList.adicionar(livro1);
        genericList.adicionar(livro2);
        genericList.adicionar(livro3);

        System.out.println("Listando itens na lista genérica:");
        genericList.listar();

        System.out.println("\nPesquisando 'Livro C' na lista genérica:");
        genericList.pesquisar(livro1);

        System.out.println("\nRemovendo 'Livro C' da lista genérica:");
        genericList.remover(livro1);

        System.out.println("\nListando itens na lista genérica após remoção:");
        genericList.listar();
    }
}
