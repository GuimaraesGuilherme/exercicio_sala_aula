package model;

public class Automovel_Builder {
    private Automovel automovel;
    private Veiculo veiculo;

    public void AutomovelBuilder() {
        this.automovel = new Automovel();
        this.veiculo = new Veiculo();
    }
    public static AutomovelBuilder builder() { return new AutomovelBuilder(); }

    public Automovel_Builder addAutomovel(int aut_aceleracao, int aut_deslocamento, int aut_capacidade, int aut_ano, int aut_portas) {
        automovel.setAut_aceleracao(aut_aceleracao);
        automovel.setAut_deslocamento(aut_deslocamento);
        automovel.setAut_capacidade(aut_capacidade);
        automovel.setAut_ano(aut_ano);
        automovel.setAut_portas(aut_portas);
        return this;
    }}