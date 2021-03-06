package projetoHotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import reserva.Hotel;

public class Principal {

	public static void main(String[] args) {
		
		String inputTipoCliente = entrada("Em qual perfil de cliente você se encaixa? (Regular/Vip)");
		String inputDataInicio = entrada("Quando você iniciará a estadia? (DD/MM/YYYY)");
		String inputDataFim = entrada("Até quando pretende ficar? (DD/MM/YYYY)");
		
		Cliente Cliente = Cliente.valueOf(inputCliente);
				
		GerenciadorDeDatas gerenciaDatas = new GerenciadorDeDatas();
		Date dataInicio = gerenciaDatas.toDate(inputDataInicio);
		Date dataFim = gerenciaDatas.toDate(inputDataFim);
		List<Date> periodo = gerenciaDatas.getPeriodo(dataInicio, dataFim);

		ArrayList<Hotel> hoteis = new ArrayList<Hotel>();
		hoteis.add(new Hotel("lakewood", 3, 110d, 80d, 90d, 80d));
		hoteis.add(new Hotel("Bridgewood", 4, 160d, 110d, 60d, 50d));
		hoteis.add(new Hotel("Ridgewood", 5, 220d, 100d, 150d, 40d));

		GerenciadorDeTaxa gerenciaTaxa = new GerenciadorDeTaxa();
		Tarifa melhorTarifa = gerenciaTaxa.getMelhorTarifa(tipoCliente, periodo, hoteis);
		System.out.println("O hotel mais barato para este período é " + melhorTarifa.getHotel());
		System.out.println("O preço fica em " + melhorTarifa.getPreco());
	}
	
	private static String entrada(String info) {
		System.out.print(info + " ");
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String s = bufferRead.readLine();
			return s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

}
