/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri_000
 */
public class ClickerOne_Cliente {

    private File Arquivo = new File("Usuarios.txt");
    private String Nome;
    private String RA;
    private String Senha;
    private String estiloDeConta;

    public ClickerOne_Cliente() {

    }

    public ClickerOne_Cliente(String RA, String Senha) {
        this.RA = RA;
        this.Senha = Senha;
    }

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

    public boolean GravaUsuario(ClickerOne_Cliente cliente) {
        try {
            ArrayList<ClickerOne_Cliente> listaDeClientes = new ArrayList<>();
            String nome, ra, senha, EstiloDeConta, linha;
            if (Arquivo.exists()) {
                FileReader fr = new FileReader(Arquivo);
                BufferedReader br = new BufferedReader(fr);
                while (true) {
                    nome = br.readLine();
                    ra = br.readLine();
                    senha = br.readLine();
                    EstiloDeConta = br.readLine();
                    if (nome == null) {
                        break;
                    }
                    ClickerOne_Cliente Cliente = new ClickerOne_Cliente(nome, ra, senha, EstiloDeConta);
                    listaDeClientes.add(Cliente);
                }
            }
            listaDeClientes.add(cliente);
            PrintWriter pw = new PrintWriter(Arquivo);
            for (ClickerOne_Cliente Aux : listaDeClientes) {
                ClickerOne_Cliente cadaCliente = (ClickerOne_Cliente) Aux;
                pw.println(cadaCliente.get_Nome());
                pw.println(cadaCliente.get_RA());
                pw.println(cadaCliente.get_Senha());
                pw.println(cadaCliente.get_estiloDeConta());
            }

            pw.flush();
            pw.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean VerificaUsuario(String Ra) {
        try {
            ArrayList<ClickerOne_Cliente> listaDeClientes = new ArrayList<>();
            String nome, ra, senha, EstiloDeConta;
            FileReader fr = new FileReader(Arquivo);
            BufferedReader br = new BufferedReader(fr);
            while (true) {
                nome = br.readLine();
                ra = br.readLine();
                senha = br.readLine();
                EstiloDeConta = br.readLine();
                if (nome == null) {
                    break;
                }
                ClickerOne_Cliente Cliente = new ClickerOne_Cliente(nome, ra, senha, EstiloDeConta);
                listaDeClientes.add(Cliente);
            }

            for (ClickerOne_Cliente Aux : listaDeClientes) {
                ClickerOne_Cliente cadaCliente = (ClickerOne_Cliente) Aux;
                if (cadaCliente.get_RA().equals(Ra)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean VerificaLogin(ClickerOne_Cliente cliente) {
        try {
            ArrayList<ClickerOne_Cliente> listaDeClientes = new ArrayList<>();
            String nome, ra, senha, EstiloDeConta, linha;
            if (Arquivo.exists()) {
                FileReader fr = new FileReader(Arquivo);
                BufferedReader br = new BufferedReader(fr);
                while (true) {
                    nome = br.readLine();
                    ra = br.readLine();
                    senha = br.readLine();
                    EstiloDeConta = br.readLine();
                    if (nome == null) {
                        break;
                    }
                    ClickerOne_Cliente Cliente = new ClickerOne_Cliente(nome, ra, senha, EstiloDeConta);
                    listaDeClientes.add(Cliente);
                }
            }

            for (ClickerOne_Cliente Aux : listaDeClientes) {
                ClickerOne_Cliente cadaCliente = (ClickerOne_Cliente) Aux;
                if (cadaCliente.get_RA().equals(cliente.RA) && cadaCliente.get_Senha().equals(cliente.Senha)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public ClickerOne_Cliente PerfilDoCliente(ClickerOne_Cliente cliente) {
        try {
            ArrayList<ClickerOne_Cliente> listaDeClientes = new ArrayList<>();
            String nome, ra, senha, EstiloDeConta, linha;
            if (Arquivo.exists()) {
                FileReader fr = new FileReader(Arquivo);
                BufferedReader br = new BufferedReader(fr);
                while (true) {
                    nome = br.readLine();
                    ra = br.readLine();
                    senha = br.readLine();
                    EstiloDeConta = br.readLine();
                    if (nome == null) {
                        break;
                    }
                    ClickerOne_Cliente Cliente = new ClickerOne_Cliente(nome, ra, senha, EstiloDeConta);
                    listaDeClientes.add(Cliente);
                }
            }

            for (ClickerOne_Cliente Aux : listaDeClientes) {
                ClickerOne_Cliente cadaCliente = (ClickerOne_Cliente) Aux;
                if (cadaCliente.get_RA().equals(cliente.RA)) {
                    return cadaCliente;
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean UpdateUsuario(ClickerOne_Cliente cliente) {
        try {
            ClickerOne_Cliente Clientes = cliente;
            int aux = 0;
            ArrayList<ClickerOne_Cliente> listaDeClientes = new ArrayList<>();
            String nome, ra, senha, EstiloDeConta;
            FileReader fr = new FileReader(Arquivo);
            BufferedReader br = new BufferedReader(fr);
            while (true) {
                nome = br.readLine();
                ra = br.readLine();
                senha = br.readLine();
                EstiloDeConta = br.readLine();
                if (nome == null) {
                    break;
                }
                ClickerOne_Cliente Cliente = new ClickerOne_Cliente(nome, ra, senha, EstiloDeConta);
                listaDeClientes.add(Cliente);
            }
            
            PrintWriter pw = new PrintWriter(Arquivo);
            for (ClickerOne_Cliente Aux : listaDeClientes) {
                ClickerOne_Cliente cadaCliente = (ClickerOne_Cliente) Aux;
                if (cadaCliente.get_RA().equals(Clientes.get_RA())) {
                    pw.println(Clientes.get_Nome());
                    pw.println(cadaCliente.get_RA());
                    pw.println(Clientes.get_Senha());
                    aux = 1;
                } else {
                    pw.println(cadaCliente.get_Nome());
                    pw.println(cadaCliente.get_RA());
                    pw.println(cadaCliente.get_Senha());
                }
                pw.println(cadaCliente.get_estiloDeConta());

            }
            pw.flush();
            pw.close();

            return aux != 0;
        } catch (IOException e) {
            return false;
        }
    }
}
