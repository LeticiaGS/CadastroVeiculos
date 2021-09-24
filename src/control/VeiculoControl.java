/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.VeiculoDAO;
import model.Veiculo;

/**
 *
 * @author leleb
 */
public class VeiculoControl {
    
    public void inserir (String marca, String modelo, String placa, String cor, int ano) 
    {
        Veiculo ve = new Veiculo(marca,modelo, placa, cor, ano);
        VeiculoDAO veDao = new VeiculoDAO();
        veDao.inserirVeiculo(ve);
    }

    public void excluir(String placa) {
        VeiculoDAO veDao = new VeiculoDAO();
        veDao.excluir(placa);
    }
    
    public ArrayList<Veiculo> buscar () throws SQLException, ClassNotFoundException
   {
       VeiculoDAO veDao = new VeiculoDAO();
       return (veDao.buscar());
   }
    
   public void atualizar (String marca, String modelo, String placa, String cor, int ano) 
    {
        Veiculo ve = new Veiculo(marca,modelo, placa, cor, ano);
        VeiculoDAO veDao = new VeiculoDAO();
        veDao.atualizarVeiculo(ve);
    }
   
   public ArrayList<Veiculo> buscarAno (int ano) throws SQLException, ClassNotFoundException
   {
       VeiculoDAO veDao = new VeiculoDAO();
       return (veDao.buscaAno(ano));
   }
   
   public ArrayList<Veiculo> buscarMarca (String nomeMarca) throws SQLException, ClassNotFoundException
   {
       VeiculoDAO veDao = new VeiculoDAO();
       return (veDao.buscaMarca(nomeMarca));
   }
   
   public ArrayList<Veiculo> buscarPlaca (String nomePlaca) throws SQLException, ClassNotFoundException
   {
       VeiculoDAO veDao = new VeiculoDAO();
       return (veDao.buscaPlaca(nomePlaca));
   }
}
