package com.curso.ecommerce.model;

import java.util.Date;

public class Orden {
    private Integer id;
    private Date fechaCreacion;
    private Date fechaRecibida;
    private double total;

    public Orden() {
    }

    public Orden(Integer id, Date fechaCreacion, Date fechaRecibida, double total) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaRecibida() {
        return fechaRecibida;
    }

    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "id=" + id +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaRecibida=" + fechaRecibida +
                ", total=" + total +
                '}';
    }
}
