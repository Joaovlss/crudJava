public class Carros extends Automovel {
    private String tipo;
    private int nPortas;
    //=======================================
    public Carros() {

    }

    public Carros(String veiculo, String marca, String modelo, String chassi, String cor, int ano, String renavam,
            String placa, float valorbase, String tipo, int nPortas) {
        super(veiculo, marca, modelo, chassi, cor, ano, renavam, placa, valorbase);
        this.tipo = tipo;
        this.nPortas = nPortas;
    }
    //=======================================
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }
    //===========================================
    @Override
    public float valor(float total) {
        if (getAno() > 2015) {
            total =  getValorbase() + (float) (getValorbase() * 0.07); 
        }else{
            total =  getValorbase() + (float) (getValorbase() * 0.04);
        }
        return total;
    }

    @Override
    public void print(){
        System.out.println("\tTipo: Carro");
        System.out.println("\tA marca: "+getMarca());
        System.out.println("\tO modelo: "+getModelo() );
        System.out.println("\tO chassi: "+getChassi());
        System.out.println("\tA cor: "+getCor());
        System.out.println("\tO ano: "+getAno());
        System.out.println("\tRenavam: "+getRenavam());
        System.out.println("\tPlaca: "+getPlaca());
        System.out.println("\tO tipo: "+getTipo());
        System.out.println("\tQuantidade de portas: "+getnPortas());
        System.out.println("\tO preço desse carro é: "+valor(total));
        System.out.println("=======================================");
    }

}