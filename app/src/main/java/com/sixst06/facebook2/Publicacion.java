package com.sixst06.facebook2;

public class Publicacion {
    private String imgPerfil;
    private String NombrePerfil;
    private String Hora;
    private String descripcion;
    private String imgPublicacion;
    private String likes;
    private String shares;
    private String btnMeGusta;
    private String btnComentar;
    private String btnCompartir;

    public Publicacion() {
    }

    public Publicacion(String imgPerfil, String nombrePerfil, String hora, String descripcion, String imgPublicacion, String likes, String shares, String btnMeGusta, String btnComentar, String btnCompartir) {
        this.imgPerfil = imgPerfil;
        NombrePerfil = nombrePerfil;
        Hora = hora;
        this.descripcion = descripcion;
        this.imgPublicacion = imgPublicacion;
        this.likes = likes;
        this.shares = shares;
        this.btnMeGusta = btnMeGusta;
        this.btnComentar = btnComentar;
        this.btnCompartir = btnCompartir;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getShares() {
        return shares;
    }

    public void setShares(String shares) {
        this.shares = shares;
    }

    public String getBtnMeGusta() {
        return btnMeGusta;
    }

    public void setBtnMeGusta(String btnMeGusta) {
        this.btnMeGusta = btnMeGusta;
    }

    public String getBtnComentar() {
        return btnComentar;
    }

    public void setBtnComentar(String btnComentar) {
        this.btnComentar = btnComentar;
    }

    public String getBtnCompartir() {
        return btnCompartir;
    }

    public void setBtnCompartir(String btnCompartir) {
        this.btnCompartir = btnCompartir;
    }

    public String getNombrePerfil() {
        return NombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        NombrePerfil = nombrePerfil;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }
}
