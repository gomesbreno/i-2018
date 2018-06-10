/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracaobancodedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Breno
 */
public class IndividuoDAO {

    public void create(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            //salvando o sorrogate key
            stmt = con.prepareStatement("INSERT INTO individuo (surrogate_key)VALUES(?)");
            stmt.setInt(1, i.sorrogate_key);

            stmt.executeUpdate();
            System.out.println("Item salvo com sucesso");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void createDadoDemografico(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtDadoDemografico = null;

        try {
            //salvando dados demograficos
            stmtDadoDemografico = con.prepareStatement("INSERT INTO dado_demografico (id_usuario,sexo,nome_mae,"
                    + "nome_pai,situacao_familiar,cor,comentario,fonte_notificacao_obito,"
                    + "nascimento_pluralidade,nascimento_ordem,nascimento_seguimento)VALUES(?,?,?,?,?,?"
                    + ",?,?,?,?,?)");
            stmtDadoDemografico.setInt(1, i.sorrogate_key);
            stmtDadoDemografico.setString(2, i.dadoDemografico.sexo);
            stmtDadoDemografico.setString(3, i.dadoDemografico.nomeMae);
            stmtDadoDemografico.setString(4, i.dadoDemografico.nomePai);
            stmtDadoDemografico.setString(5, i.dadoDemografico.situacaoFamiliar);
            stmtDadoDemografico.setString(6, i.dadoDemografico.cor);
            stmtDadoDemografico.setString(7, i.dadoDemografico.comentario);
            stmtDadoDemografico.setInt(8, 1);
            stmtDadoDemografico.setString(9, i.dadoDemografico.nascimentoPluralidade);
            stmtDadoDemografico.setInt(10, 2);
            stmtDadoDemografico.setString(11, i.dadoDemografico.nascimentoSeguimento);

            stmtDadoDemografico.executeUpdate();

            System.out.println("Item salvo com sucesso em dado demografico");

        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtDadoDemografico);
        }
    }

    public void createNome(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtNome = null;

        try {
            //salvando dados demograficos
            stmtNome = con.prepareStatement("INSERT INTO nome (surrogate_key,titulos,nomes,"
                    + "sobrenomes,sufixos,preferido,uso_condicional)VALUES(?,?,?,?,?,?"
                    + ",?)");
            stmtNome.setInt(1, i.sorrogate_key);
            stmtNome.setString(2, i.nome.titulos);
            stmtNome.setString(3, i.nome.nomes);
            stmtNome.setString(4, i.nome.sobrenomes);
            stmtNome.setString(5, i.nome.sufixos);
            stmtNome.setString(6, i.nome.preferido);
            stmtNome.setString(7, i.nome.usoCondicional);

            stmtNome.executeUpdate();

            System.out.println("Item salvo com sucesso em nome");

        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtNome);
        }
    }

    public void createEndereco(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtEndereco = null;

        try {
            //salvando dados demograficos
            stmtEndereco = con.prepareStatement("INSERT INTO endereco (surrogate_key,bairo,distrito,"
                    + "codigo_municipal,estado,cep,caixa_postal,pais,tipo)VALUES(?,?,?,?,?,?"
                    + ",?,?,?)");
            stmtEndereco.setInt(1, i.sorrogate_key);
            stmtEndereco.setString(2, i.endereco.bairro);
            stmtEndereco.setString(3, i.endereco.distrito);
            stmtEndereco.setString(4, i.endereco.codigoMunicipal);
            stmtEndereco.setString(5, i.endereco.estado);
            stmtEndereco.setString(6, i.endereco.cep);
            stmtEndereco.setString(7, i.endereco.caixaPostal);
            stmtEndereco.setString(8, i.endereco.pais);
            stmtEndereco.setString(9, i.endereco.tipo);

            stmtEndereco.executeUpdate();

            System.out.println("Item salvo com sucesso em tipo");

        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtEndereco);
        }
    }

    public void createUtilizador(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtUtilizador = null;

        try {

            stmtUtilizador = con.prepareStatement("INSERT INTO utilizacao (id_individuo,uso,data_inicial,data_final)VALUES(?,?,?,?)");
            stmtUtilizador.setInt(1, i.sorrogate_key);
            stmtUtilizador.setString(2, i.utilizacao.uso);
            stmtUtilizador.setString(3, i.utilizacao.dataInicial);
            stmtUtilizador.setString(4, i.utilizacao.dataFinal);

            stmtUtilizador.executeUpdate();
            System.out.println("Item salvo com sucesso em utilizacao");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtUtilizador);
        }
    }

    public void createDataObito(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtData = null;

        try {

            stmtData = con.prepareStatement("INSERT INTO data (id_individuo,id_dado_demografico,data,acuracia)VALUES(?,?,?,?)");
            stmtData.setInt(1, i.sorrogate_key);
            stmtData.setInt(2, 1);
            stmtData.setString(3, i.dadoDemografico.obito.data);
            stmtData.setString(4, i.dadoDemografico.obito.acuracia);

            stmtData.executeUpdate();
            System.out.println("Item salvo com sucesso em tada obito");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtData);
        }
    }

    public void createDataOrdem(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtData = null;

        try {

            stmtData = con.prepareStatement("INSERT INTO data (id_individuo,id_dado_demografico,data,acuracia)VALUES(?,?,?,?)");
            stmtData.setInt(1, i.sorrogate_key);
            stmtData.setInt(2, 2);
            stmtData.setString(3, i.dadoDemografico.nascimentoOrdem.data);
            stmtData.setString(4, i.dadoDemografico.nascimentoOrdem.acuracia);

            stmtData.executeUpdate();
            System.out.println("Item salvo com sucesso em tada ordem");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtData);
        }
    }

    public void createIdentificador(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtIdentificador = null;

        try {

            stmtIdentificador = con.prepareStatement("INSERT INTO identificador (surrogate_key,designacao,area,emissor,data,tipo)VALUES(?,?,?,?,?,?)");
            stmtIdentificador.setInt(1, i.sorrogate_key);
            stmtIdentificador.setString(2, i.identificador.designacao);
            stmtIdentificador.setString(3, i.identificador.area);
            stmtIdentificador.setString(4, i.identificador.emissor);
            stmtIdentificador.setString(5, i.identificador.data);
            stmtIdentificador.setString(6, i.identificador.tipo);

            stmtIdentificador.executeUpdate();
            System.out.println("Item salvo com sucesso em identificador");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtIdentificador);
        }
    }

    public void createTituloEleitoral(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtTitulo = null;

        try {

            stmtTitulo = con.prepareStatement("INSERT INTO titulo_eleitoral (idtitulo_eleitoral,secao,zona)VALUES(?,?,?)");
            stmtTitulo.setInt(1, i.sorrogate_key);
            stmtTitulo.setString(2, i.tituloEleitoral.secao);
            stmtTitulo.setString(3, i.tituloEleitoral.zona);

            stmtTitulo.executeUpdate();
            System.out.println("Item salvo com sucesso em titulo de eleitor");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtTitulo);
        }
    }

    public void createCertidao(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtCertidao = null;

        try {

            stmtCertidao = con.prepareStatement("INSERT INTO certidao (id_individuo,tipo,cartorio,livro,folha,termo)VALUES(?,?,?,?,?,?)");
            stmtCertidao.setInt(1, i.sorrogate_key);
            stmtCertidao.setString(2, i.certidao.tipo);
            stmtCertidao.setString(3, i.certidao.cartorio);
            stmtCertidao.setString(4, i.certidao.livro);
            stmtCertidao.setString(5, i.certidao.folha);
            stmtCertidao.setString(6, i.certidao.termo);

            stmtCertidao.executeUpdate();
            System.out.println("Item salvo com sucesso em certidão");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtCertidao);
        }
    }

    public void createCTPS(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtCTPS = null;

        try {

            stmtCTPS = con.prepareStatement("INSERT INTO ctps (id_individuo,serie,estado)VALUES(?,?,?)");
            stmtCTPS.setInt(1, i.sorrogate_key);
            stmtCTPS.setString(2, i.ctps.serie);
            stmtCTPS.setString(3, i.ctps.estado);

            stmtCTPS.executeUpdate();
            System.out.println("Item salvo com sucesso em ctps");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtCTPS);
        }
    }

    public void createVinculo(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtVinculo = null;

        try {

            stmtVinculo = con.prepareStatement("INSERT INTO vinculo (id_individuo,relacionamento,data_inicio,data_fim)VALUES(?,?,?,?)");
            stmtVinculo.setInt(1, i.sorrogate_key);
            stmtVinculo.setString(2, i.vinculo.relacionamento);
            stmtVinculo.setString(3, i.vinculo.dataInicio);
            stmtVinculo.setString(4, i.vinculo.dataFim);

            stmtVinculo.executeUpdate();
            System.out.println("Item salvo com sucesso em vinculo");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtVinculo);
        }
    }

    public void createLinhaDeEndereco(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtLinhaDeEndereco = null;

        try {

            stmtLinhaDeEndereco = con.prepareStatement("INSERT INTO linha_de_endereco (id_individuo,ordem,linha)VALUES(?,?,?)");
            stmtLinhaDeEndereco.setInt(1, i.sorrogate_key);
            stmtLinhaDeEndereco.setString(2, i.linhaDeEndereco.ordem);
            stmtLinhaDeEndereco.setString(3, i.linhaDeEndereco.ordem);

            stmtLinhaDeEndereco.executeUpdate();
            System.out.println("Item salvo com sucesso em ordem");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtLinhaDeEndereco);
        }
    }

    public void createNacionalidade(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtNacionalidade = null;

        try {

            stmtNacionalidade = con.prepareStatement("INSERT INTO nacionalidade (id_individuo,municipio,estado,pais,data_entrada_pais)VALUES(?,?,?,?,?)");
            stmtNacionalidade.setInt(1, i.sorrogate_key);
            stmtNacionalidade.setString(2, i.nacionalidade.municipio);
            stmtNacionalidade.setString(3, i.nacionalidade.estado);
            stmtNacionalidade.setString(4, i.nacionalidade.pais);
            stmtNacionalidade.setString(5, i.nacionalidade.dataEntradaPais);

            stmtNacionalidade.executeUpdate();
            System.out.println("Item salvo com sucesso em nacionalidade");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtNacionalidade);
        }
    }

    public void createComunicacao(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtComunicacao = null;

        try {

            stmtComunicacao = con.prepareStatement("INSERT INTO comunicacao (id_individuo,municipio,estado,pais,data_entrada_pais)VALUES(?,?,?,?,?)");
            stmtComunicacao.setInt(1, i.sorrogate_key);
            stmtComunicacao.setString(2, i.nacionalidade.municipio);
            stmtComunicacao.setString(3, i.nacionalidade.estado);
            stmtComunicacao.setString(4, i.nacionalidade.pais);
            stmtComunicacao.setString(5, i.nacionalidade.dataEntradaPais);

            stmtComunicacao.executeUpdate();
            System.out.println("Item salvo com sucesso em comunicação");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtComunicacao);
        }
    }

    public void createRepresentacao(Individuo i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmtRepresentacao = null;

        try {

            stmtRepresentacao = con.prepareStatement("INSERT INTO representacao (id_individuo,utilizacao,alternativa)VALUES(?,?,?)");
            stmtRepresentacao.setInt(1, i.sorrogate_key);
            stmtRepresentacao.setString(2, i.representacao.utilizacao);
            stmtRepresentacao.setString(3, i.representacao.alternativa);

            stmtRepresentacao.executeUpdate();
            System.out.println("Item salvo com sucesso em representacao");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar: " + ex);
            //Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmtRepresentacao);
        }
    }
    
    public Individuo getIndividuoCtps(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM ctps WHERE id_individuo = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.ctps.estado = rs.getString("estado");
            i.ctps.serie  = rs.getString("serie");
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return i;
    }
    
    public Individuo getIndividuoCertidao(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM certidao WHERE id_individuo = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.certidao.cartorio = rs.getString("cartorio");
            i.certidao.folha = rs.getString("folha");
            i.certidao.livro = rs.getString("livro");
            i.certidao.termo = rs.getString("termo");
            i.certidao.tipo = rs.getString("tipo");
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return i;
    }
    
    public Individuo getIndividuoComunicacao(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM comunicacao WHERE id_individuo = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.comunicacao.detalhe = rs.getString("detalhe");
            i.comunicacao.meio = rs.getString("meio");
            i.comunicacao.preferencia = rs.getString("preferencia");
            i.comunicacao.uso = rs.getString("uso");
            
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return i;
    }
    
    public Individuo getIndividuoDadoDemografico(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM dado_demografico WHERE id_usuario = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.dadoDemografico.comentario = rs.getString("comentario");
            i.dadoDemografico.cor = rs.getString("cor");
            i.dadoDemografico.nascimentoOrdem.acuracia = rs.getString("nascimento_ordem");
            i.dadoDemografico.nascimentoPluralidade = rs.getString("nascimento_pluralidade");
            i.dadoDemografico.nascimentoSeguimento = rs.getString("nascimento_segmento");
            i.dadoDemografico.nomeMae = rs.getString("nome_mae");
            i.dadoDemografico.nomePai = rs.getString("nome_pai");
            i.dadoDemografico.sexo = rs.getString("sexo");
            i.dadoDemografico.situacaoFamiliar = rs.getString("situacao_familiar");
            
            
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return i;
    }
    
    public Individuo getIndividuoDadoEndereco(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM endereco WHERE surrogate_key = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.endereco.bairro = rs.getString("bairro");
            i.endereco.caixaPostal = rs.getString("caixa_postal");
            i.endereco.cep = rs.getString("cep");
            i.endereco.codigoMunicipal = rs.getString("codigo_municipal");
            i.endereco.distrito = rs.getString("distrito");
            i.endereco.estado = rs.getString("estado");
            i.endereco.pais = rs.getString("pais");
            i.endereco.tipo = rs.getString("tipo");
                                                
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return i;
    }
    
    public Individuo getIndividuoDadoIdentificador(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM idenficador WHERE surrogate_key = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.identificador.area = rs.getString("area");
            i.identificador.data = rs.getString("data");
            i.identificador.designacao = rs.getString("designacao");
            i.identificador.emissor = rs.getString("emissor");
            i.identificador.tipo = rs.getString("tipo");
                                                            
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        
        return i;
    }
    
    public Individuo getIndividuoDadoLinhaDeEndereco(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM linha_de_endereco WHERE id_individuo = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.linhaDeEndereco.linha = rs.getString("linha");
            i.linhaDeEndereco.ordem = rs.getString("ordem");
                                                                        
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
                
        return i;
    }
    
    public Individuo getIndividuoNacionalidade(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM nacionalidade WHERE id_individuo = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.nacionalidade.dataEntradaPais = rs.getString("data_entrada_pais");
            i.nacionalidade.estado = rs.getString("estado");
            i.nacionalidade.municipio = rs.getString("municipio");
            i.nacionalidade.pais = rs.getString("pais");
                                                                        
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
                
        return i;
    }
    
    public Individuo getIndividuoNome(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM nome WHERE surrogate_key = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.nome.nomes = rs.getString("nomes");
            i.nome.preferido = rs.getString("preferido");
            i.nome.sobrenomes = rs.getString("sobrenomes");
            i.nome.sufixos = rs.getString("sufixos");
            i.nome.titulos = rs.getString("titulos");
            i.nome.usoCondicional = rs.getString("uso_condicional");
                                                                        
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
                
        return i;
    }
    
    public Individuo getIndividuoRepresentacao(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM representacao WHERE id_individuo = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.representacao.alternativa = rs.getString("alternativa");            
            i.representacao.utilizacao = rs.getString("utilizacao");            
                                                                        
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
                
        return i;
    }
    
    public Individuo getIndividuoTitulo(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM representacao WHERE idtitulo_eleitoral = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.tituloEleitoral.secao = rs.getString("secao");            
            i.tituloEleitoral.zona = rs.getString("zona");            
                                                                                    
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
                
        return i;
    }
    
    public Individuo getIndividuoUtilizacao(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM utilizacao WHERE id_individuo = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.utilizacao.dataInicial = rs.getString("data_inicial");            
            i.utilizacao.dataFinal = rs.getString("data_final");
            i.utilizacao.uso = rs.getString("uso");
                                                                                                
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
                
        return i;
    }
    
    public Individuo getIndividuoVinculo(Individuo i){
                
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;        
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM vinculo WHERE id_individuo = "+i.sorrogate_key);
            rs = stmt.executeQuery();
            
            i.vinculo.dataFim = rs.getString("data_fim");            
            i.vinculo.dataInicio = rs.getString("data_inicio");
            i.vinculo.relacionamento = rs.getString("relacionamento");
                                                                                                            
            return i;            
            
        } catch (SQLException ex) {
            Logger.getLogger(IndividuoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
                
        return i;
    }
}


