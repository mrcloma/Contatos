package br.com.intelligencesoftware.contatos.model;

import java.io.Serializable;

/**
 * Created by Lanterna Verde on 27/08/2017.
 * manipula todas as informações de um objeto Pessoa
 */

public class Pessoa implements Serializable {
    private int id;
    private String nome, endereco, cpf, telefone1, telefone2, telefone3;

    public Pessoa() { //metodo construtor
    }

    //metodos GET e Set:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1= telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2= telefone2;
    }

    public String getTelefone3() {
        return telefone3;
    }

    public void setTelefone3(String telefone3) {
        this.telefone3= telefone3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() { //sobrescrevendo o toString pra retornar somente o campo nome
        return nome.toString();
    }
}