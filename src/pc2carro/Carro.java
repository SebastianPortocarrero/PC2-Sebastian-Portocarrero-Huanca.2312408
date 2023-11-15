/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc2carro;

public class Carro {
    // Atributos
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String placa;
    private String tipoCarro;
    private String anoFabricacion;
    private boolean seguroATerceros;

    // Constructor
    public Carro(String modelo, String color, boolean pinturaMetalizada, String placa, String tipoCarro, String anoFabricacion, boolean seguroATerceros) {
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada; // 0 no metalizada, 1 metalizada
        this.placa = placa;
        this.tipoCarro = tipoCarro;
        this.anoFabricacion = anoFabricacion;
        this.seguroATerceros = seguroATerceros; // 0 a terceros, 1 a todo riezgo
    }

    // Métodos getter y setter (para acceder y modificar los atributos)

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPinturaMetalizada() {
        return pinturaMetalizada;
    }

    public void setPinturaMetalizada(boolean pinturaMetalizada) {
        this.pinturaMetalizada = pinturaMetalizada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public String getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(String anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public boolean isSeguroATerceros() {
        return seguroATerceros;
    }

    public void setSeguroATerceros(boolean seguroATerceros) {
        this.seguroATerceros = seguroATerceros;
    }


}
