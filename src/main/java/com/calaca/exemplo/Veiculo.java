package com.calaca.exemplo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String tipo;
		private String ano;
		private String cor;
		
		
		private Veiculo() {
			super();
		}
		private Veiculo(String tipo, String ano, String cor) {
			super();
			this.tipo = tipo;
			this.ano = ano;
			this.cor = cor;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getAno() {
			return ano;
		}
		public void setAno(String ano) {
			this.ano = ano;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
	
}
