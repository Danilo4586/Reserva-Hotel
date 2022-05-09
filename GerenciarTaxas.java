package projetoHotel;

import static reserva.Cliente.Regular;
import static reserva.Cliente.Reward;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciarTaxas {
	
	public Taxa getMelhorTarifa(Cliente Cliente, List<Date> periodo, List<Hotel> hoteis) {

		List<Taxa> listaDeTarifas = new ArrayList<Taxa>();

		for (Hotel hotel : hoteis) {
			Taxa taxa = calculaTaxaDoHotel(Cliente, periodo, hotel);
			listaDeTaxa.add(taxa);
		}

		Taxa menorTaxa = calculaMenorTaxa(listaDeTaxa);

		return menorTaxa;
	}

	private Taxa calculaMenorTaxa(List<Taxa> listaDeTaxa) {

		Taxa menorTaxa = null;

		for (Taxa taxa : listaDeTaxa) {
			if (menorTaxa == null || taxa.getPreco() < menorTaxa.getPreco()) {
				menorTaxa = taxa;
			} else if (taxa.getPreco().equals(menorTaxa.getPreco()) && taxa.getHotel().getClassificacao() > menorTarifa.getHotel().getClassificacao()) {
				menorTaxa = taxa;
			}
		}

		return menorTaxa;
	}

	private Taxa calculaTarifaDoHotel(Cliente Cliente, List<Date> periodo, Hotel hotel) {

		GerenciadorDeDatas gerenciadorDeDatas = new GerenciadorDeDatas();
		Double preco = 0d;
		for (Date data : periodo) {
			if (Cliente == Regular) {
				if (gerenciadorDeDatas.isFimDeSemanaReward(data)) {
					preco += hotel.getFimSemanaRegular();
				} else {
					preco += hotel.getDiaRegular();
				}
			} else if (Cliente == Reward ) {
				if (gerenciadorDeDatas.isFimDeSemana(data)) {
					preco += hotel.getFimSemanaReward();
				} else {
					preco += hotel.getDiaReward();
				}
			}
		}

		Taxa taxa = new Taxa(hotel, preco);

		return taxa;
	}
	
	private static Hotel getHotelPeloNome(String nome, ArrayList<Hotel> hoteis) {
        for (Hotel hotel: hoteis) {
            if (hotel.getNome().equals(nome)) {
                return hotel;
            }
        }
        return null;
    }

}
