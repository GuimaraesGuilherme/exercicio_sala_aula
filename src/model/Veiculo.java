package model;

public class Veiculo {

    private int placa;
    private String marca;
    private String modelo;
    private String cor;
    private int vel_max;

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVel_max() {
        return vel_max;
    }

    public void setVel_max(int vel_max) {
        this.vel_max = vel_max;
    }

    public String toString() {
        return "Veiculo{" +
                "Placa=" + placa +
                ", Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Cor='" + cor + '\'' +
                ", Velocidade Maxima='" + vel_max + '\'' +

                '}';
    }
}




