/* Projeto interdiciplinar - Cruzeiro do Sul - 2l
 * 
 * Projeto do segundo semestre de ADS
 * Disciplinas Envolvidas:
 * TDA – Técnicas de Desenvolvimento de Algoritmos (Prof.)
 * POO – Programação Orientada a Objetos (Prof.ª Jéssica Barbara da Silva Ribas)
 * 
 * Nome projeto: Javacar
 * 
 * Feito por:
 * Andréa Alves dos Santos - RGM:29895324
 * Gabriel de Oliveira Rodrigues - RGM:29641748
 * João Victor Lopes Santana Santos - RGM:31169686
 * Jordi Mello Llinares - RGM:5829771480
 * Luciana da Silva Lucindo - RGM:28831322
 * Nelson Gabriel Costa Leme da Silva - RGM:5829767512
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //importando os metodos Date
        SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date data = new Date();
        // importe do Scanner
        Scanner leia = new Scanner(System.in);
        // Criando os ArrayList
        ArrayList<Automovel> lista = new ArrayList<>();
        // Criando as variaveis
        int opcao, escolha, atualizar, deletar;
        float total = 0;

        System.out.println("\n\nPrograma iniciado em: "+formata.format(data));

        do {
            // Instanciando os objetos
            Carros carro = new Carros();
            Automovel caminhao =  new Caminhoes();
            // inicio do programa e menu
            System.out.print("\n\n|---------------------------------|\n");
            System.out.print("| Opção 1 - Novo Cadastro         |\n");
            System.out.print("| Opção 2 - Atualizar             |\n");
            System.out.print("| Opção 3 - Produtos cadastrados  |\n");
            System.out.print("| Opção 4 - Deletar cadastro      |\n");
            System.out.print("| Opção 5 - Sair                  |\n");
            System.out.print("|---------------------------------|\n");
            System.out.print(" Digite uma opção: ");
            opcao = leia.nextInt();
            
            switch (opcao) {
            case 1:
                // Menu de cadastro de carros ou caminhoes
                System.out.println("=======================================");
                System.out.println("\nOpção Novo Cadastro Selecionado\n");
                System.out.println("Escolha o tipo de veiculo que deseja cadastrar");
                System.out.println("Opção 1 = Carro");
                System.out.println("Opção 2 = Caminhão");
                System.out.print("Digite a opção: ");
                escolha = leia.nextInt();

                switch (escolha) {
                    case 1://cadastro de carro
                        System.out.println("\n=== Cadastrar Carro ===");
                        carro.setVeiculo("Carro");
                        System.out.print("A marca: ");
                        carro.setMarca(leia.next());
                        System.out.print("O modelo: ");
                        carro.setModelo(leia.next());
                        System.out.print("O chassi: ");
                        carro.setChassi(leia.next());
                        System.out.print("A cor: ");
                        carro.setCor(leia.next());
                        System.out.print("O ano: ");
                        carro.setAno(leia.nextInt());
                        System.out.print("Renavam: ");
                        carro.setRenavam(leia.next());
                        System.out.print("Placa: ");
                        carro.setPlaca(leia.next());
                        System.out.print("O tipo: ");
                        ((Carros) carro).setTipo(leia.next());
                        System.out.print("Quantidade de portas: ");
                        ((Carros) carro).setnPortas(leia.nextInt());
                        System.out.print("Digite o valor base: ");
                        carro.setValorbase(leia.nextFloat());
                        carro.valor(total);
                    
                        lista.add(carro);
                        break;
                    case 2://cadastro de caminhao
                        System.out.println("\n=== Cadastrar Caminhão ===");
                        caminhao.setVeiculo("Caminhão");
                        System.out.print("A marca: ");
                        caminhao.setMarca(leia.next());
                        System.out.print("O modelo: ");
                        caminhao.setModelo(leia.next());
                        System.out.print("O chassi: ");
                        caminhao.setChassi(leia.next());
                        System.out.print("A cor: ");
                        caminhao.setCor(leia.next());
                        System.out.print("O ano: ");
                        caminhao.setAno(leia.nextInt());
                        System.out.print("Renavam: ");
                        caminhao.setRenavam(leia.next());
                        System.out.print("Placa: ");
                        caminhao.setPlaca(leia.next());
                        System.out.print("Carroceria: ");
                        ((Caminhoes) caminhao).setCarroceria(leia.next());
                        System.out.print("Quantidade de eixos: ");
                        ((Caminhoes) caminhao).setEixo(leia.nextInt());
                        System.out.print("Quantidade que consegue carregar: ");
                        ((Caminhoes) caminhao).setCarga(leia.nextFloat());
                        System.out.print("Digite o valor base: ");
                        caminhao.setValorbase(leia.nextFloat());
                        caminhao.valor(total);

                        lista.add(caminhao);
                        break;
                    default:
                        System.out.println("\n===OPÇÃO INVALIDA===");
                        break;
                }
                break;

            case 2://atualização
                int posicao;
                System.out.println("=======================================");
                System.out.println("Atualização de Cadastro\n");
                System.out.print("Qual o numero do veiculo deseja atualizar? ");
                atualizar = leia.nextInt();

                if (lista.get(atualizar).getVeiculo() == "Carro") {
                    System.out.println("----------------");
                    System.out.println("1 - Marca");
                    System.out.println("2 - Modelo");
                    System.out.println("3 - Chassi");
                    System.out.println("4 - Cor");
                    System.out.println("5 - Ano");
                    System.out.println("6 - Renavam");
                    System.out.println("7 - PLaca");
                    System.out.println("8 - Tipo");
                    System.out.println("9 - Numero de Portas");
                    System.out.println("10 - Valor base");
                    System.out.println("----------------");
                    System.out.print("O que deseja atualizar? ");
                    posicao = leia.nextInt();

                    switch (posicao) {
                        case 1:
                            System.out.print("Nova marca: ");
                            String nmarca = leia.next();
                            lista.get(atualizar).setMarca(nmarca);
                            break;
                        case 2:
                            System.out.print("Novo modelo: ");
                            String nmodelo = leia.next();
                            lista.get(atualizar).setModelo(nmodelo);
                            break;
                        case 3:
                            System.out.print("Novo chassi: ");
                            String nchassi = leia.next();
                            lista.get(atualizar).setChassi(nchassi);
                            break;
                        case 4:
                            System.out.print("Nova cor: ");
                            String ncor = leia.next();
                            lista.get(atualizar).setCor(ncor);
                            break;
                        case 5:
                            System.out.print("Ano correto: ");
                            int nano = leia.nextInt();
                            lista.get(atualizar).setAno(nano);    
                            break;
                        case 6:
                            System.out.print("Novo renavam: ");
                            String nrenavam = leia.next();
                            lista.get(atualizar).setRenavam(nrenavam);
                            break;
                        case 7:
                            System.out.print("Nova placa: ");
                            String nplaca = leia.next();
                            lista.get(atualizar).setPlaca(nplaca);
                            break;
                        case 8:
                            System.out.print("Novo tipo: ");
                            String ntipo = leia.next();
                            ((Carros) lista.get(atualizar)).setTipo(ntipo);
                            break;
                        case 9:
                            System.out.print("Quantidade de portas corretas: ");
                            int nnportas = leia.nextInt();
                            ((Carros) lista.get(atualizar)).setnPortas(nnportas);
                            break;
                        case 10:
                            System.out.print("Valor base correto: ");
                            int nvalor = leia.nextInt();
                            lista.get(atualizar).setValorbase(nvalor);
                            carro.valor(total);
                            break;
                        default:
                            break;
                    }
                }
                if (lista.get(atualizar).getVeiculo() == "Caminhão") {
                    System.out.println("----------------");
                    System.out.println("1 - Marca");
                    System.out.println("2 - Modelo");
                    System.out.println("3 - Chassi");
                    System.out.println("4 - Cor");
                    System.out.println("5 - Ano");
                    System.out.println("6 - Renavam");
                    System.out.println("7 - PLaca");
                    System.out.println("8 - Carroceria");
                    System.out.println("9 - Quantidade de eixos");
                    System.out.println("10 - Quantidade de carga");
                    System.out.println("11 - Valor base:");          
                    System.out.println("----------------");
                    System.out.print("O que deseja atualizar? ");
                    posicao = leia.nextInt();

                    switch (posicao) {
                        case 1:
                            System.out.print("Nova marca: ");
                            String nmarca = leia.next();
                            lista.get(atualizar).setMarca(nmarca);
                            break;
                        case 2:
                            System.out.print("Novo modelo: ");
                            String nmodelo = leia.next();
                            lista.get(atualizar).setModelo(nmodelo);
                            break;
                        case 3:
                            System.out.print("Novo chassi: ");
                            String nchassi = leia.next();
                            lista.get(atualizar).setChassi(nchassi);
                            break;
                        case 4:
                            System.out.print("Nova cor: ");
                            String ncor = leia.next();
                            lista.get(atualizar).setCor(ncor);
                            break;
                        case 5:
                            System.out.print("Ano correto: ");
                            int nano = leia.nextInt();
                            lista.get(atualizar).setAno(nano);    
                            break;
                        case 6:
                            System.out.print("Novo renavam: ");
                            String nrenavam = leia.next();
                            lista.get(atualizar).setRenavam(nrenavam);
                            break;
                        case 7:
                            System.out.print("Nova placa: ");
                            String nplaca = leia.next();
                            lista.get(atualizar).setPlaca(nplaca);
                            break;
                        case 8:
                            System.out.print("Nova carroceria: ");
                            String ncarroceria = leia.next();
                            ((Caminhoes) lista.get(atualizar)).setCarroceria(ncarroceria);
                            break;
                        case 9:
                            System.out.print("Nova quantidade de eixos: ");
                            int neixo = leia.nextInt();
                            ((Caminhoes) lista.get(atualizar)).setEixo(neixo);
                            break;
                        case 10:
                            System.out.print("Nova quantidade de carga: ");
                            Float ncarga = leia.nextFloat();
                            ((Caminhoes) lista.get(atualizar)).setCarga(ncarga);
                            break;
                        case 11:
                            System.out.print("Valor base correto: ");
                            Float nvalor = leia.nextFloat();
                            lista.get(atualizar).setValorbase(nvalor);
                            break;
                        default:
                            break;
                    }
                    
                }
                break;
            
            case 3://listagem de produtos
                System.out.println("=======================================");
                System.out.println("\nLista dos Produtos Cadastrados\n");
                for(int i = 0; i < lista.size(); i++){
                    System.out.println("Veiculo: "+i);
                    lista.get(i).print();
                }
                break;

            case 4://Deletar por index da arrylist
                System.out.println("=======================================");
                System.out.println("Vamos Deletar");
                System.out.println("");
                System.out.print("Qual o numero do veiculo que voce deseja deletar? ");
                deletar = leia.nextInt();
                lista.remove(deletar);
                System.out.println("Item deletado com sucesso");
                break;
                
            case 5://opção de sair
                System.out.println("\nAté logo!");
                System.out.println("=======================================");
                leia.close();
                break;

            default:
                System.out.println("\n===OPÇÃO INVALIDA===");
                opcao = 0;
                break;
            }
        } while (opcao < 5);

        System.out.println("\nPrograma finalizado em: "+formata.format(data)+"\n");
    }
}
