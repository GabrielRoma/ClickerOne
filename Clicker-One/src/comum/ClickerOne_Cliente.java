/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comum;

/**
 *
 * @author gabri_000
 */
public class ClickerOne_Cliente {

    private String Nome;
    private String RA;
    private String Senha;
    private String estiloDeConta;

    public ClickerOne_Cliente(String Nome, String RA, String Senha, String estiloDeConta) {
        this.Nome = Nome;
        this.RA = RA;
        this.Senha = Senha;
        this.estiloDeConta = estiloDeConta;
    }

    public void set_Nome(String Nome) {
        this.Nome = Nome;
    }

    public void set_RA(String RA) {
        this.RA = RA;
    }

    public void set_Senha(String Senha) {
        this.Senha = Senha;
    }

    public void set_estiloDeConta(String estiloDeConta) {
        this.estiloDeConta = estiloDeConta;
    }

    public String get_Nome() {
        return (this.Nome);
    }

    public String get_RA() {
        return (this.RA);
    }

    public String get_Senha() {
        return (this.Senha);
    }

    public String get_estiloDeConta() {
        return (this.estiloDeConta);
    }
}
