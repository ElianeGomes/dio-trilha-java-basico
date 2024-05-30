package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");

        System.out.println("****** Metodo analisarCandidato() ******");
        /*Teste metodo analisarCandidato()*/
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

        System.out.println("****** Metodo selecaoCandidatos() ******");
        selecaoCandidatos();

        System.out.println("****** Metodo imprimirSelecionados() ******");
        imprimirSelecionados();

        System.out.println("****** Metodo entrandoEmContato() ******");
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato:candidatos){//entra em contato com cada candidato
            entrandoEmContato(candidato);
        }
    }


    static void entrandoEmContato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{//loop continua ate que ligação seja atendida ou seja realizada 3 ligações
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso");
            }
        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com o "+candidato+" na "+tentativasRealizadas+" tentativa");
        }else {
            System.out.println("Não conseguimos contato com o "+candidato+", numero maximo de tentativas "+tentativasRealizadas+" realizada");
        }
    }

    //metodo auxiliar(gera um numero entre 1 e 3)
    static boolean atender(){
        return new Random().nextInt(3)==1;

    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprime a lista de candidatos informando o indice do elemento");

        for(int indice =0; indice < candidatos.length;indice++){
            System.out.println("O candidato de nº "+(indice+1)+ " é o "+candidatos[indice]);
        }

        System.out.println("**** Imprime a lista de candidatos utilizando o FOR EACH ****");
        for(String candidato:candidatos){/*Obs: não é possivel imprimir o idice*/
            System.out.println("O candidato selecionado foi "+candidato);

        }

    }

    static void selecaoCandidatos(){
        String []  candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados=0;
        int candidatoAtual=0;//é o indice do array(mostra em qual candidato está atualmente)
        double salarioBase = 2000.0;

        while (candidatosSelecionados <5 && candidatoAtual < candidatos.length){ //determina q loop para quando acabar a array acabar
            String candidato = candidatos[candidatoAtual];//Adiciona a variavel o nome do candidato a partir da posição no array(candidatoAtual)
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+candidato+" Solicitou este valor de salário "+salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga ");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido(){//metodo simula salario pretendido(cria salarios variados entre determinados valores)
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    //metodo statico não devolve resultado
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");

        }else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDADTO COM CONTRA PROPOSTA");

        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATO");
        }
    }

}