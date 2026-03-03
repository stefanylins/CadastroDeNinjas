package dev.java10x.cadastrodeninjas;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter //Lombok ele gera os getters e setters automaticamente para os atributos da classe
@Entity //Entity ele transforma uma classe em uma entidade do banco de dados
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id //Id ele pega o atributo id e transforma ele em uma chave primária do banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GeneratedValue ele gera um valor automaticamente para o id
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel(){

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

}
