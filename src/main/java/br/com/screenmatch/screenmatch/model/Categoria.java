package br.com.screenmatch.screenmatch.model;

public enum Categoria {

    ACAO("action"),
    ROMANCE("romance"),
    COMEDIA("comedy"),
    CRIME("crime"),
    DRAMA("drama"),
    AVENTURA("adventure");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
