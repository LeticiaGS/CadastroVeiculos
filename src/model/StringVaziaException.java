/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author leleb
 */
public class StringVaziaException extends RuntimeException{
    
    @Override
    public String getMessage() {
        return ("Atenção! Verifique se preencheu adequadamente os campos!");
    }
}
