package com.integrador.ProjetoRentCarsInt.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_carros")

public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Carros_IDs")
    private Long id;

    private String modelo;

    private String marca;

    private String cor;

    private String endereco;

    private String cidade;

    private String descricaop1;

    private String descricaop2;

    private String descricaop3;

    private int qntdPassageiros;

    private String arcondicionado;

    private String cambio;

    private int qntdPortas;

    private String airbag;

    private int qualificacao;

    private String nota;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categorias_id", referencedColumnName = "Categorias_IDs")
    private Categorias idCategoria;

    @ManyToOne
    @JoinColumn(name = "carroIMGurl_id",referencedColumnName = "carrosIMGurl_IDs")
    private CarroIMGurl idCarroIMGurl;

    public Carro(String modelo, String marca, String cor, String endereco, String cidade, String descricaop1, String descricaop2, String descricaop3, Integer qntdPassageiros, String arcondicionado, String cambio, Integer qntdPortas, String airbag, Integer qualificacao, String nota, Categorias idCategoria) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.endereco = endereco;
        this.cidade = cidade;
        this.descricaop1 = descricaop1;
        this.descricaop2 = descricaop2;
        this.descricaop3 = descricaop3;
        this.qntdPassageiros = qntdPassageiros;
        this.arcondicionado = arcondicionado;
        this.cambio = cambio;
        this.qntdPortas = qntdPortas;
        this.airbag = airbag;
        this.qualificacao = qualificacao;
        this.nota = nota;
        this.idCategoria = idCategoria;
    }

    public Carro(String modelo, String marca, String cor, String endereco, String cidade, String descricaop1, String descricaop2, String descricaop3, Integer qntdPassageiros, String arcondicionado, String cambio, Integer qntdPortas, String airbag, Integer qualificacao, String nota) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.endereco = endereco;
        this.cidade = cidade;
        this.descricaop1 = descricaop1;
        this.descricaop2 = descricaop2;
        this.descricaop3 = descricaop3;
        this.qntdPassageiros = qntdPassageiros;
        this.arcondicionado = arcondicionado;
        this.cambio = cambio;
        this.qntdPortas = qntdPortas;
        this.airbag = airbag;
        this.qualificacao = qualificacao;
        this.nota = nota;
    }
}