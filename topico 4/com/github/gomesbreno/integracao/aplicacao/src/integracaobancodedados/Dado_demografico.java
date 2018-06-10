/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracaobancodedados;

/**
 *
 * @author Breno
 */
public class Dado_demografico {
    public String sexo;
    public String nomeMae;
    public String nomePai;
    public String situacaoFamiliar;
    public String cor;
    public String comentario;
    public Data obito;
    public String nascimentoPluralidade;
    public Data nascimentoOrdem;
    public String nascimentoSeguimento;
    
    public void Dado_demografico(String sexo, String nomeMae,String nomePai,
            String situacaoFamiliar,String cor,String comentario,String obitoData,String obitoAcuracia,
            String nascimentoPluralidade,String nascimentoOrdemData, String nascimentoOrdemAcuracia,
            String nascimentoSeguimento){
        this.sexo = sexo;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.situacaoFamiliar = situacaoFamiliar;
        this.cor = cor;
        this.comentario = comentario;
        this.obito.data = obitoData;
        this.obito.acuracia = obitoAcuracia;
        this.nascimentoPluralidade = nascimentoPluralidade;
        this.nascimentoOrdem.data = nascimentoOrdemData;
        this.nascimentoOrdem.acuracia = nascimentoOrdemAcuracia;
        this.nascimentoSeguimento = nascimentoSeguimento;        
    }
}
