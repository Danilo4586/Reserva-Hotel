package projetoHotel;

public class Hotel {
	
	private String nome;
	private int classificacao;
	private double diaRegular;
	private double diaReward;
	private double fimSemanaRegular;
	private double fimSemanaReward;
	
	public Hotel(String nome, int classificacao, double diaRegular, double diaReward, double fimSemanaRegular,
			double fimSemanaReward) {
		this.nome = nome;
		this.classificacao = classificacao;
		this.diaRegular = diaRegular;
		this.diaReward = diaReward;
		this.fimSemanaRegular = fimSemanaRegular;
		this.fimSemanaReward = fimSemanaReward;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getClassificacao() {
		return classificacao;
	}
	
	public double getDiaRegular() {
		return diaRegular;
	}

	public double getDiaReward() {
		return diaReward;
	}

	public double getFimSemanaRegular() {
		return fimSemanaRegular;
	}

	public double getFimSemanaReward() {
		return fimSemanaReward;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public void setDiaRegular(double diaRegular) {
		this.diaRegular = diaRegular;
	}

	public void setDiaReward(double diaReward) {
		this.diaReward = diaReward;
	}

	public void setFimSemanaRegular(double fimSemanaRegular) {
		this.fimSemanaRegular = fimSemanaRegular;
	}

	public void setFimSemanaReward(double fimSemanaReward) {
		this.fimSemanaReward = fimSemanaReward;
	}

	@Override
	public String toString() {
		return this.getNome();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classificacao;
		long temp;
		temp = Double.doubleToLongBits(diaRegular);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(diaReward);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fimSemanaRegular);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fimSemanaReward);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (classificacao != other.classificacao)
			return false;
		if (Double.doubleToLongBits(diaRegular) != Double.doubleToLongBits(other.diaRegular))
			return false;
		if (Double.doubleToLongBits(diaReward) != Double.doubleToLongBits(other.diaReward))
			return false;
		if (Double.doubleToLongBits(fimSemanaRegular) != Double.doubleToLongBits(other.fimSemanaRegular))
			return false;
		if (Double.doubleToLongBits(fimSemanaReward) != Double.doubleToLongBits(other.fimSemanaReward))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	

}
