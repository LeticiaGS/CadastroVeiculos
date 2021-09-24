/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Veiculo;

/**
 *
 * @author leleb
 */
public class VeiculoDAO {
    Connection con= null;
    
     public void inserirVeiculo(Veiculo ve)
    {
        try {
            con = new Conexao().getConnection();
            String sql = "Insert into Veiculos (MARCA,MODELO,PLACA,COR,ANOFABRICACAO) values (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, ve.getMarca());
            stmt.setString(2, ve.getModelo());
            stmt.setString(3, ve.getPlaca());
            stmt.setString(4, ve.getCor());
            stmt.setInt(5, ve.getAnoFabricacao());
            stmt.execute();
            stmt.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro de conexão"+ex);
        } 
        finally
        {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Não foi possível fechar a conexão");
            }
        }
    }
     
    public void excluir(String placa) {

        try {
            con = new Conexao().getConnection();
            String sql = "DELETE FROM Veiculos WHERE PLACA = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, placa);
            stmt.execute();
            stmt.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro: "+ex.toString());
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar conexão: "+ex.toString());
            }
        }
    }
    
    public ArrayList<Veiculo> buscar() throws SQLException, ClassNotFoundException  {
        ResultSet rs = null;
        ArrayList<Veiculo> lista = new ArrayList();
        
           con = new Conexao().getConnection();
           String sql = "SELECT * FROM Veiculos";
           PreparedStatement stmt = con.prepareStatement(sql);
           rs = stmt.executeQuery();
           while (rs.next())
           {
               String marca = rs.getString("marca");
               String modelo = rs.getString("modelo");
               String placa = rs.getString("placa");
               String cor = rs.getString("cor");
               int anoFabricacao = rs.getInt("anoFabricacao");
               Veiculo ve = new Veiculo(marca, modelo, placa, cor, anoFabricacao);
               lista.add(ve);
           }
           stmt.close();
           con.close();   
           return lista;
    }
    
    public void atualizarVeiculo(Veiculo ve)
    {
        try {
            con = new Conexao().getConnection();
            String sql = "UPDATE Veiculos SET MARCA=?,MODELO=?,COR=?,ANOFABRICACAO=? WHERE PLACA=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, ve.getMarca());
            stmt.setString(2, ve.getModelo());
            stmt.setString(3, ve.getCor());
            stmt.setInt(4, ve.getAnoFabricacao());
            stmt.setString(5, ve.getPlaca());
            stmt.execute();
            stmt.close();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro de conexão"+ex);
        } 
        finally
        {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Não foi possível fechar a conexão");
            }
        }
    }
    
    public ArrayList<Veiculo> buscaAno (int ano ) throws SQLException, ClassNotFoundException {
        ResultSet rs = null;
        ArrayList<Veiculo> lista = new ArrayList();
        
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM Veiculos where anoFabricacao like ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ano);
        rs = stmt.executeQuery();
        while (rs.next())
           {
               String marca = rs.getString("marca");
               String modelo = rs.getString("modelo");
               String placa = rs.getString("placa");
               String cor = rs.getString("cor");
               int anoFabricacao = rs.getInt("anoFabricacao");
               Veiculo ve = new Veiculo(marca, modelo, placa, cor, anoFabricacao);
               lista.add(ve);
           }
           stmt.close();
           con.close();   
           return lista;
    }
    
    public ArrayList<Veiculo> buscaMarca (String nomeMarca ) throws SQLException,ClassNotFoundException {
        ResultSet rs = null;
        ArrayList<Veiculo> lista = new ArrayList();
        
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM Veiculos where marca like ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, nomeMarca);
        rs = stmt.executeQuery();
        while (rs.next())
           {
               String marca = rs.getString("marca");
               String modelo = rs.getString("modelo");
               String placa = rs.getString("placa");
               String cor = rs.getString("cor");
               int anoFabricacao = rs.getInt("anoFabricacao");
               Veiculo ve = new Veiculo(marca, modelo, placa, cor, anoFabricacao);
               lista.add(ve);
           }
           stmt.close();
           con.close();   
           return lista;
    }
    
    public ArrayList<Veiculo> buscaPlaca (String nomePlaca ) throws SQLException,ClassNotFoundException {
        ResultSet rs = null;
        ArrayList<Veiculo> lista = new ArrayList();
        
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM Veiculos where placa like ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1,nomePlaca+"%");
        rs = stmt.executeQuery();
        while (rs.next())
           {
               String marca = rs.getString("marca");
               String modelo = rs.getString("modelo");
               String placa = rs.getString("placa");
               String cor = rs.getString("cor");
               int anoFabricacao = rs.getInt("anoFabricacao");
               Veiculo ve = new Veiculo(marca, modelo, placa, cor, anoFabricacao);
               lista.add(ve);
               System.out.println(ve.getPlaca());
           }
           stmt.close();
           con.close();   
           return lista;
    }
}
