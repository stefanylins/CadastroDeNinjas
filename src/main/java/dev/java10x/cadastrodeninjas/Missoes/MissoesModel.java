package dev.java10x.cadastrodeninjas.Missoes;

import dev.java10x.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    @OneToMany(mappedBy = "missoes") //OneToMany ele faz um relacionamento de um para muitos, ou seja, uma missão pode ter muitos ninjas
    private List<NinjaModel> ninjas;

}
