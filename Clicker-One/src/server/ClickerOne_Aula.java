/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;

/**
 *
 * @author gabri_000
 */
public class ClickerOne_Aula {

    private ArrayList<Questao> Aula = new ArrayList<Questao>();
    
    public class Questao {

        private String nomeAula;
        private String codigoProfessor;
        private String alternativaCorreta;
        private String Questao;
        private ArrayList<String> Alternativas;
        private ArrayList<String> Respostas;

        public Questao(String nomeAula, String codigoProfessor, String alternativaCorreta, String Questao, ArrayList<String> Alternativas) {
            this.nomeAula = nomeAula;
            this.codigoProfessor = codigoProfessor;
            this.alternativaCorreta = alternativaCorreta;
            this.Questao = Questao;
            this.Alternativas = Alternativas;
        }

        public void set_nomeAula(String nomeAula) {
            this.nomeAula = nomeAula;
        }

        public void set_codigoProfessor(String codigoProfessor) {
            this.codigoProfessor = codigoProfessor;
        }

        public void set_alternativaCorreta(String alternativaCorreta) {
            this.alternativaCorreta = alternativaCorreta;
        }

        public void set_questao(String Questao) {
            this.Questao = Questao;
        }

        public void set_alternativas(ArrayList<String> Alternativas) {
            this.Alternativas = Alternativas;
        }

        public void set_resposta(ArrayList<String> Respostas) {
            this.Respostas = Respostas;
        }

        public String get_nomeAula() {
            return (this.nomeAula);
        }

        public String get_codigoProfessor() {
            return (this.codigoProfessor);
        }

        public String get_alternativaCorreta() {
            return (this.alternativaCorreta);
        }

        public String get_questao() {
            return (this.Questao);
        }

        public ArrayList<String> get_alternativas() {
            return (this.Alternativas);
        }

        public ArrayList<String> get_respostas() {
            return (this.Respostas);
        }
    }
}
