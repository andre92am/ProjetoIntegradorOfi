package com.integrador.ProjetoRentCarsInt.model.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.integrador.ProjetoRentCarsInt.model.Carro;
import com.integrador.ProjetoRentCarsInt.model.Categorias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class CarroDTO {

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
    private Categorias idCategoria;

    public CarroDTO(Carro carro){
        this.id = carro.getId();
        this.modelo = carro.getModelo();
        this.marca = carro.getMarca();
        this.cor = carro.getCor();
        this.endereco = carro.getEndereco();
        this.cidade = carro.getCidade();
        this.descricaop1 = carro.getDescricaop1();
        this.descricaop2 = carro.getDescricaop2();
        this.descricaop3 = carro.getDescricaop3();
        this.qntdPassageiros = carro.getQntdPassageiros();
        this.arcondicionado = carro.getArcondicionado();
        this.cambio = carro.getCambio();
        this.qntdPortas = carro.getQntdPortas();
        this.airbag = carro.getAirbag();
        this.qualificacao = carro.getQualificacao();
        this.nota = carro.getNota();
        this.idCategoria = carro.getIdCategoria();

    }

}
