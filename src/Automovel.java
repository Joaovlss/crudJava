public abstract class Automovel{
    private String veiculo;
    private String marca;
    private String modelo;
    private String chassi;
    private String cor;
    private int ano;
    private String renavam; 
    private String placa;
    private float valorbase;
    public float total;
    //==============================================================
    // Metodos construtores
    public Automovel(){

    }

    public Automovel(String veiculo, String marca, String modelo, String chassi, String cor, int ano, String renavam, String placa, float valorbase) {
        this.veiculo = veiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.cor = cor;
        this.ano = ano;
        this.renavam = renavam;
        this.placa = placa;
        this.valorbase = valorbase;
    }
    //=================================================
    // Metodos de acesso
    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
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

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getValorbase() {
        return valorbase;
    }

    public void setValorbase(float valorbase) {
        this.valorbase = valorbase;
    
    }

    public float valor(float total){
        return total;
    };

    public abstract void print();

}