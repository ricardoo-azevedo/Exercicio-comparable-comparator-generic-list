package model;


    /*implementando o comparable do tipo da propria classe, para a classe saber por si só como se ordenar*/ 
public class Livro implements Comparable<Livro>{
    
    /*metodo sobrescrito do comparable que vai ser usado para ordenar os livros pelo titulo */
    @Override
    public int compareTo(Livro o) {/*se ligar que se o atributo titulo estiver apos o objeto.getTitulo(), a ordenação ficara de modo decrescente */
                /*CharSequence se dar por ser uma interface que pode definir uma sequencia de caracteres de uma maneira especifica */
        return CharSequence.compare(titulo, o.getTitulo());
    }

    private long id;
    private String titulo;
    private String autor;
    private String editora;
    private String genero;
    

    public Livro(long id, String titulo, String autor, String editora, String genero){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;

    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /*toString pra não retornar o endereço da memoria ao inves das informações do objeto */
    @Override
    public String toString() {
    return " [ID: "+id+" | TITULO: "+titulo+" | AUTOR: "+autor+" | EDITORA: "+editora+" | GENERO: "+genero+"] ";
    }

   


}
