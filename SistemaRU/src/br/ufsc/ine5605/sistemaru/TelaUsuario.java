/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.sistemaru;

/**
 *
 * @author 12041789921
 */
public class TelaUsuario extends TelaPadrao{
    private ControladorUsuario controladorUsuario;

    public TelaUsuario(ControladorUsuario controladorUsuario) {
        this.controladorUsuario = controladorUsuario;
    }

    public ControladorUsuario getControladorUsuario() {
        return controladorUsuario;
    }
    
    
    
    
    @Override
    public void mostraConteudoTela() {
        int opcao = -1;
        do{
            System.out.println("");
            System.out.println("############################");
            System.out.println("######  MENU USUARIO  ######");
            System.out.println("############################");
            System.out.println();
            System.out.println("DIA ATUAL: " + controladorUsuario.diaAtual());
            System.out.println();
            System.out.println("[1] ALMOÇAR");
            System.out.println("[2] JANTAR");
            System.out.println("[3] CONSULTAR SALDO");
            System.out.println("[4] GERAR RELATÓRIO ");
            System.out.println("[0] DESLOGAR");
            
            try{
                opcao = leInteiro();
            }catch(InputInvalidoException e){
                System.out.println(e);
                continue;
            }
            
            switch(opcao){
                case 1: 
                        try{
                            controladorUsuario.validaRefeicao(0);
                        }catch(Exception e){System.out.println(e);}
                        break;
                case 2: 
                        try{
                            controladorUsuario.validaRefeicao(1);
                        }catch(Exception e){System.out.println(e);}
                        break;
                        
                case 3: mostraTelaSaldo();
                        break;
                        
                case 4: controladorUsuario.relatorioRefeicao();
                        break;
                
            }
            
         
        }while (opcao!=0);
        
    }
    
    public void mostraConteudoTelaAdm() {
        int opcao = -1;
        do{
            System.out.println("");
            System.out.println("############################");
            System.out.println("######  MENU USUARIO  ######");
            System.out.println("############################");
            System.out.println();
            System.out.println("DIA ATUAL: " + controladorUsuario.diaAtual());
            System.out.println();
            System.out.println("[1] ALMOÇAR");
            System.out.println("[2] JANTAR");
            System.out.println("[3] CONSULTAR SALDO");
            System.out.println("[4] GERAR RELATÓRIO");
            System.out.println("[5] ENTRAR NO MENU DE ADMINISTRADOR");
            System.out.println("[0] DESLOGAR");
            
            try{
                opcao = leInteiro();
            }catch(InputInvalidoException e){
                System.out.println(e);
                continue;
            }
            
            switch(opcao){
                case 1: 
                        try{
                            controladorUsuario.validaRefeicao(0);
                        }catch(Exception e){System.out.println(e);}
                        break;
                case 2: 
                        try{
                            controladorUsuario.validaRefeicao(1);
                        }catch(Exception e){System.out.println(e);}
                        break;
                        
                case 3: mostraTelaSaldo();
                        break;
                        
                case 4: controladorUsuario.relatorioRefeicao();
                        break;
                        
                case 5: controladorUsuario.getControladorPrincipal().getControladorAdm().getTelaAdm().mostraConteudoTela();
                
            }
         
        }while (opcao!=0);
    }

    public void mostraTelaSaldo() {
        System.out.println("SALDO ATUAL DISPONIVEL: R$ "+controladorUsuario.consultarSaldo());
    }

    public void mostraSucessoRefeicao() {
        System.out.println("SUA REFEIÇÃO FOI REALIZADA COM SUCESSO");
        mostraTelaSaldo();
    }

    void mostraRelatorioUsuario(int nRefeicoesMes1, int nRefeicoesMes2, int nRefeicoesMes3) {
        System.out.println();
        System.out.println("#######################");
        System.out.println("#####  RELATÓRIO  #####");
        System.out.println("#######################");
        System.out.println();
        
        System.out.println("REFEIÇÕES NO MES: "+nRefeicoesMes1);
        System.out.println("REFEIÇÕES NO ÚLTIMO MES: "+nRefeicoesMes2);
        System.out.println("REFEIÇÕES NO PENÚLTIMO MES: "+nRefeicoesMes3);
        System.out.println("");
        System.out.println("#######################");
    }
}
