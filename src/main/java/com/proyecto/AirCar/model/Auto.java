package com.proyecto.AirCar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Auto")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auto")
    private Long id_auto;

    @Column(name = "marca")
    private String marca;

    @Column(name = "placa")
    private String placa;

    @Column(name = "num_licencia")
    private Integer num_licencia;

    @Column(name = "foto")
    private String foto;

    @Column(name = "modelo")
    private Integer modelo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tipo_auto")
    private String tipo_auto;

    @Column(name = "estado_auto")
    private Boolean estado_auto;

    public Auto() {
    }

    public Auto(Long id_auto, String marca, String placa, Integer num_licencia, String foto, Integer modelo, String descripcion, String tipo_auto, Boolean estado_auto) {
        this.id_auto = id_auto;
        this.marca = marca;
        this.placa = placa;
        this.num_licencia = num_licencia;
        this.foto = foto;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.tipo_auto = tipo_auto;
        this.estado_auto = estado_auto;
    }

    public Long getId_auto() {
        return id_auto;
    }

    public void setId_auto(Long id_auto) {
        this.id_auto = id_auto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getNum_licencia() {
        return num_licencia;
    }

    public void setNum_licencia(Integer num_licencia) {
        this.num_licencia = num_licencia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo_auto() {
        return tipo_auto;
    }

    public void setTipo_auto(String tipo_auto) {
        this.tipo_auto = tipo_auto;
    }

    public Boolean getEstado_auto() {
        return estado_auto;
    }

    public void setEstado_auto(Boolean estado_auto) {
        this.estado_auto = estado_auto;
    }
}

