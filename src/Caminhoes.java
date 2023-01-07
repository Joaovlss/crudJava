public class Caminhoes extends Automovel {
    private String carroceria;
    private int eixo;
    private float carga;
    //=====================================
    public Caminhoes() {
    }

    public Caminhoes(String veiculo, String marca, String modelo, String chassi, String cor, int ano, String renavam,
            String placa, float valorbase, String carroceria, int eixo, float carga) {
        super(veiculo, marca, modelo, chassi, cor, ano, renavam, placa, valorbase);
        this.carroceria = carroceria;
        this.eixo = eixo;
        this.carga = carga;
    }
    //==========================================
    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getEixo() {
        return eixo;
    }

    public void setEixo(int eixo) {
        this.eixo = eixo;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
    //===========================================
    @Override
    public void print(){
        System.out.println("\tTipo: Caminhão");
        System.out.println("\tA marca: "+getMarca());
        System.out.println("\tO modelo: "+getModelo());
        System.out.println("\tO chassi: "+getChassi());
        System.out.println("\tA cor: "+getCor());
        System.out.println("\tO ano: "+getAno());
        System.out.println("\tRenavam: "+getRenavam());
        System.out.println("\tPlaca: "+getPlaca());
        System.out.println("\tCarroceria: "+getCarroceria());
        System.out.println("\tNumero de eixos: "+getEixo());
        System.out.println("\tQuantidade de carga:"+getCarga());
        System.out.println("\tO valor desse caminhão é: "+valor(total));
        System.out.println("=======================================");
    }

     @Override
    public float valor(float total) {
        if(getAno() > 2015 && getEixo() >= 3){
            total = (float) (getValorbase() + (getValorbase() * 0.15));
        }else if (getEixo() == 2) {
           total = (float) (getValorbase() + (getValorbase() * 0.12));
        }else{
            total = (float) (getValorbase() + (getValorbase() * 0.10));
        }
        return total;

    }
}