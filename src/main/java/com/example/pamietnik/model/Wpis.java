package com.example.pamietnik.model;

import javax.persistence.*;

@Entity
@Table(name = "wpisy")
public class Wpis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "tresc_wpisu")
    private String trescWpisu;

    @Column(name = "uzytkownik")
    private String uzytkownik;

    @Column(name = "wpis_publiczny")
    private boolean wpisPubliczny;

    public Wpis(){super();}

    public Wpis(String trescWpisu, String uzytkownik, boolean wpisPubliczny){
        this.trescWpisu = trescWpisu;
        this.uzytkownik = uzytkownik;
        this.wpisPubliczny = wpisPubliczny;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTrescWpisu() {
        return trescWpisu;
    }

    public void setTrescWpisu(String trescWpisu) {
        this.trescWpisu = trescWpisu;
    }

    public String getUzytkownik() {
        return uzytkownik;
    }

    public void setUzytkownik(String uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    public boolean isWpisPubliczny() {
        return wpisPubliczny;
    }

    public void setWpisPubliczny(boolean wpisPubliczny) {
        this.wpisPubliczny = wpisPubliczny;
    }
}
