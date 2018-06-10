/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracaobancodedados;

import java.util.Scanner;

/**
 *
 * @author Breno
 */
public class IntegracaoBancoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Individuo i = new Individuo();

        System.out.println("Digite 1 para cadastrar um usuário, ou 2 para listalo ");
        int op = leitor.nextInt();

        switch (op) {
            case 1:
                System.out.println("sorrogate_key do individuo");
                //i.sorrogate_key = leitor.nextInt();
                int sorrogate_key = leitor.nextInt();
                i.sorrogate_key = sorrogate_key;

                //dados demograficos
                System.out.println("Dados demográficos");
                System.out.println("sexo: ");
                String sexo = leitor.nextLine();
                i.dadoDemografico.sexo = sexo;
                System.out.println("nome da mãe: ");
                String nomeMae = leitor.nextLine();
                i.dadoDemografico.nomeMae = nomeMae;
                System.out.println("nome so pai: ");
                String nomePai = leitor.nextLine();
                i.dadoDemografico.nomePai = nomePai;
                System.out.println("situação familiar: ");
                String situacaoFamiliar = leitor.nextLine();
                i.dadoDemografico.situacaoFamiliar = situacaoFamiliar;
                System.out.println("cor: ");
                String cor = leitor.nextLine();
                i.dadoDemografico.cor = cor;
                System.out.println("comentário: ");
                String comentario = leitor.nextLine();
                i.dadoDemografico.comentario = comentario;
                System.out.println("data(fonte de notificação óbito): ");
                String obitoData = leitor.nextLine();
                i.dadoDemografico.obito.data = obitoData;
                System.out.println("acurácia(fonte de notificação óbito): ");
                String obitoAcuracia = leitor.nextLine();
                i.dadoDemografico.obito.acuracia = obitoAcuracia;
                System.out.println("nascimento pluralidade: ");
                String nascimentoPluralidade = leitor.nextLine();
                i.dadoDemografico.nascimentoPluralidade = nascimentoPluralidade;
                System.out.println("data(nascimento ordem): ");
                String nascimentoOrdemData = leitor.nextLine();
                i.dadoDemografico.nascimentoOrdem.data = nascimentoOrdemData;
                System.out.println("acurácia(fonte de notificação nascimento): ");
                String nascimentoOrdemAcuracia = leitor.nextLine();
                i.dadoDemografico.nascimentoOrdem.acuracia = nascimentoOrdemAcuracia;
                System.out.println("nascimento seguimento: ");
                String nascimentoSeguimento = leitor.nextLine();
                i.dadoDemografico.nascimentoSeguimento = nascimentoSeguimento;

                //Endereço
                System.out.println("Endereço");
                System.out.println("Bairro: ");
                String bairro = leitor.nextLine();
                i.endereco.bairro = bairro;
                System.out.println("distrito: ");
                String distrito = leitor.nextLine();
                i.endereco.distrito = distrito;
                System.out.println("código do município: ");
                String codigo = leitor.nextLine();
                i.endereco.codigoMunicipal = codigo;
                System.out.println("estado: ");
                String estado = leitor.nextLine();
                i.endereco.estado = estado;
                System.out.println("CEP: ");
                String cep = leitor.nextLine();
                i.endereco.cep = cep;
                System.out.println("Caixa postal: ");
                String caixaPostal = leitor.nextLine();
                i.endereco.caixaPostal = caixaPostal;
                System.out.println("país: ");
                String pais = leitor.nextLine();
                i.endereco.pais = pais;
                System.out.println("tipo: ");
                String tipo = leitor.nextLine();
                i.endereco.tipo = tipo;

                //nome
                System.out.println("Nome");
                System.out.println("titulos: ");
                String titulos = leitor.nextLine();
                i.nome.titulos = titulos;
                System.out.println("nomes: ");
                String nomes = leitor.nextLine();
                i.nome.nomes = nomes;
                System.out.println("sobrenomes: ");
                String sobrenomes = leitor.nextLine();
                i.nome.sobrenomes = sobrenomes;
                System.out.println("sufixos: ");
                String sufixos = leitor.nextLine();
                i.nome.sufixos = sufixos;
                System.out.println("predeferido: ");
                String preferido = leitor.nextLine();
                i.nome.preferido = preferido;
                System.out.println("uso condicional: ");
                String condicional = leitor.nextLine();
                i.nome.usoCondicional = condicional;

                //identificador
                System.out.println("Identificação");
                System.out.println("designação: ");
                String designacao = leitor.nextLine();
                i.identificador.designacao = designacao;
                System.out.println("área: ");
                String area = leitor.nextLine();
                i.identificador.area = area;
                System.out.println("emissor: ");
                String emissor = leitor.nextLine();
                i.identificador.emissor = emissor;
                System.out.println("data: ");
                String data = leitor.nextLine();
                i.identificador.data = data;
                System.out.println("tipo: ");
                String tipoId = leitor.nextLine();
                i.identificador.tipo = tipoId;

                //utilização
                System.out.println("utilização");
                System.out.println("uso: ");
                String uso = leitor.nextLine();
                i.utilizacao.uso = uso;
                System.out.println("data inicial: ");
                String dataInicial = leitor.nextLine();
                i.utilizacao.dataInicial = dataInicial;
                System.out.println("data final: ");
                String dataFinal = leitor.nextLine();
                i.utilizacao.dataFinal = dataFinal;

                //titulo eleitoral
                System.out.println("Título eleitoral");
                System.out.println("seção");
                String titulo = leitor.nextLine();
                i.tituloEleitoral.secao = titulo;
                System.out.println("zona");
                String zona = leitor.nextLine();
                i.tituloEleitoral.zona = zona;

                //Certidão
                System.out.println("Certidão");
                System.out.println("Tipo: ");
                String tipoCertidao = leitor.nextLine();
                i.certidao.tipo = tipoCertidao;
                System.out.println("cartório: ");
                String cartorio = leitor.nextLine();
                i.certidao.cartorio = cartorio;
                System.out.println("livro: ");
                String livro = leitor.nextLine();
                i.certidao.livro = livro;
                System.out.println("folha: ");
                String folha = leitor.nextLine();
                i.certidao.folha = folha;
                System.out.println("Termo: ");
                String termo = leitor.nextLine();
                i.certidao.termo = termo;

                //CTPS
                System.out.println("CTPS");
                System.out.println("série: ");
                String serie = leitor.nextLine();
                i.ctps.serie = serie;
                System.out.println("estado: ");
                String estadoCtps = leitor.nextLine();
                i.ctps.estado = estadoCtps;

                //Vínculo
                System.out.println("Vínculo");
                System.out.println("Relacionamento");
                String relacionamento = leitor.nextLine();
                i.vinculo.relacionamento = relacionamento;
                System.out.println("data inicio");
                String dataInicio = leitor.nextLine();
                i.vinculo.dataInicio = dataInicio;
                System.out.println("data fim");
                String dataFim = leitor.nextLine();
                i.vinculo.dataFim = leitor.nextLine();

                //Linha de endereço
                System.out.println("Linha de endereço");
                System.out.println("ordem: ");
                String ordem = leitor.nextLine();
                i.linhaDeEndereco.ordem = ordem;
                System.out.println("linha: ");
                String linha = leitor.nextLine();
                i.linhaDeEndereco.linha = linha;

                //nacionalidade
                System.out.println("Nacionalidade");
                System.out.println("município: ");
                String municipio = leitor.nextLine();
                i.nacionalidade.municipio = municipio;
                System.out.println("estado: ");
                String estadoNas = leitor.nextLine();
                i.nacionalidade.estado = estadoNas;
                System.out.println("país: ");
                String paisNas = leitor.nextLine();
                i.nacionalidade.pais = paisNas;
                System.out.println("data entrada no país: ");
                String entrada = leitor.nextLine();
                i.nacionalidade.dataEntradaPais = entrada;

                //comunicação
                System.out.println("Comunicação");
                System.out.println("meio: ");
                String meio = leitor.nextLine();
                i.comunicacao.meio = meio;
                System.out.println("preferência: ");
                String preferencia = leitor.nextLine();
                i.comunicacao.preferencia = preferencia;
                System.out.println("detalhe: ");
                String detalhe = leitor.nextLine();
                i.comunicacao.detalhe = detalhe;
                System.out.println("uso: ");
                String usoComu = leitor.nextLine();
                i.comunicacao.uso = usoComu;

                //Representação
                System.out.println("Representação");
                System.out.println("utilização: ");
                String utilizacao = leitor.nextLine();
                i.representacao.utilizacao = utilizacao;
                System.out.println("alternativa: ");
                String alternativa = leitor.nextLine();
                i.representacao.alternativa = alternativa;

                //salvando no banco de dados
                IndividuoDAO dao = new IndividuoDAO();
                dao.create(i);
                dao.createCTPS(i);
                dao.createCertidao(i);
                dao.createComunicacao(i);
                dao.createDadoDemografico(i);
                dao.createDataObito(i);
                dao.createDataOrdem(i);
                dao.createEndereco(i);
                dao.createIdentificador(i);
                dao.createLinhaDeEndereco(i);
                dao.createNacionalidade(i);
                dao.createNome(i);
                dao.createRepresentacao(i);
                dao.createTituloEleitoral(i);
                dao.createUtilizador(i);
                dao.createVinculo(i);
                break;
            case 2:
                IndividuoDAO daoLista = new IndividuoDAO();
                Individuo individuo = new Individuo();
                System.out.println("Digite o sorrogate key do individuo que deseja procurar");
                int sorrogate = leitor.nextInt();   
                individuo.sorrogate_key = sorrogate;
                individuo = daoLista.getIndividuoCertidao(individuo);
                individuo = daoLista.getIndividuoComunicacao(individuo);
                individuo = daoLista.getIndividuoCtps(individuo);
                individuo = daoLista.getIndividuoDadoDemografico(individuo);
                individuo = daoLista.getIndividuoDadoEndereco(individuo);
                individuo = daoLista.getIndividuoDadoIdentificador(individuo);
                individuo = daoLista.getIndividuoDadoLinhaDeEndereco(individuo);
                individuo = daoLista.getIndividuoNacionalidade(individuo);
                individuo = daoLista.getIndividuoNome(individuo);
                individuo = daoLista.getIndividuoRepresentacao(individuo);
                individuo = daoLista.getIndividuoTitulo(individuo);
                individuo = daoLista.getIndividuoVinculo(individuo);
                individuo = daoLista.getIndividuoUtilizacao(individuo);
                
                System.out.println("nome: "+individuo.nome.nomes);
                System.out.println("preferido: "+individuo.nome.preferido);
                System.out.println("sobrenome: "+individuo.nome.sobrenomes);
                System.out.println("sufixos: "+individuo.nome.sufixos);
                System.out.println("titulos: "+individuo.nome.titulos);
                System.out.println("uso condicional: "+individuo.nome.usoCondicional);
                
                System.out.println("comentário: "+individuo.dadoDemografico.comentario);
                System.out.println("cor: "+individuo.dadoDemografico.cor);
                System.out.println("pluralidade: "+individuo.dadoDemografico.nascimentoPluralidade);
                System.out.println("nascimento segmento: "+individuo.dadoDemografico.nascimentoSeguimento);
                System.out.println("nome da mãe: "+individuo.dadoDemografico.nomeMae);
                System.out.println("nome do pai: "+individuo.dadoDemografico.nomePai);
                System.out.println("sexo: "+individuo.dadoDemografico.sexo);
                System.out.println("situação familiar: "+individuo.dadoDemografico.situacaoFamiliar);
                
                System.out.println("situação familiar: "+individuo.endereco.bairro);
                System.out.println("caixa postal: "+individuo.endereco.caixaPostal);
                System.out.println("cep: "+individuo.endereco.cep);
                System.out.println("codigo municipal: "+individuo.endereco.codigoMunicipal);
                System.out.println("distrito: "+individuo.endereco.distrito);
                System.out.println("estado: "+individuo.endereco.estado);
                System.out.println("pais: "+individuo.endereco.pais);
                System.out.println("tipo: "+individuo.endereco.tipo);
                
                System.out.println("situação área: "+individuo.identificador.area);
                System.out.println("situação data: "+individuo.identificador.data);
                System.out.println("situação designação: "+individuo.identificador.designacao);
                System.out.println("situação emissor: "+individuo.identificador.emissor);
                System.out.println("situação tipo: "+individuo.identificador.tipo);
                
                System.out.println("cartório: "+individuo.certidao.cartorio);
                System.out.println("folha: "+individuo.certidao.folha);
                System.out.println("livro: "+individuo.certidao.livro);
                System.out.println("termo: "+individuo.certidao.termo);
                System.out.println("tipo: "+individuo.certidao.tipo);
                
                System.out.println("seção: "+individuo.tituloEleitoral.secao);
                System.out.println("zona: "+individuo.tituloEleitoral.zona);
                
                System.out.println("estado: "+individuo.ctps.estado);
                System.out.println("série: "+individuo.ctps.serie);
                
                System.out.println("data fim(vinculo): "+individuo.vinculo.dataFim);
                System.out.println("data inicio(vinculo): "+individuo.vinculo.dataInicio);
                System.out.println("relacionamento: "+individuo.vinculo.relacionamento);
                
                System.out.println("linha: "+individuo.linhaDeEndereco.linha);
                System.out.println("ordem: "+individuo.linhaDeEndereco.ordem);
                
                System.out.println("data inicial(utilização): "+individuo.utilizacao.dataFinal);
                System.out.println("data final(utilização): "+individuo.utilizacao.dataInicial);
                System.out.println("situação familiar: "+individuo.utilizacao.uso);
                
                System.out.println("Alterada: "+individuo.representacao.alternativa);
                System.out.println("utilização: "+individuo.representacao.utilizacao);
                
                System.out.println("Data entrada no país: "+individuo.nacionalidade.dataEntradaPais);
                System.out.println("estado: "+individuo.nacionalidade.estado);
                System.out.println("municipio: "+individuo.nacionalidade.municipio);
                System.out.println("país: "+individuo.nacionalidade.pais);                                
                
                System.out.println("detalher: "+individuo.comunicacao.detalhe);
                System.out.println("meio: "+individuo.comunicacao.meio);
                System.out.println("preferencial: "+individuo.comunicacao.preferencia);
                System.out.println("uso: "+individuo.comunicacao.uso);
                                                                
                break;                                
        }
    }

}
