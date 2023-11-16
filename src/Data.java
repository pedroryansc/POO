import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Data {
	public static void main(String[] args) {
		
		Date hj = new Date();
		System.out.println("Date: " + hj);
		
		// hj.setDate(); é um método descontinuado
		
		// Melhor forma:
		
		Calendar calendario = Calendar.getInstance(); // "getInstance()" é um Método estático, ou seja, pertence à classe
		calendario.set(Calendar.DAY_OF_MONTH, 5);
		calendario.set(Calendar.MONTH, 0);
		calendario.set(Calendar.YEAR, 2005);
		calendario.set(Calendar.HOUR_OF_DAY, 11);
		calendario.set(Calendar.MINUTE, 24);
		calendario.set(Calendar.SECOND, 41);
		Date dt = calendario.getTime();
		System.out.println("(Calendar) Pedrinho nasceu em: " + dt);
		
		LocalDate data = LocalDate.now();
		System.out.println("LocalDate: " + data);
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println("LocalDateTime: " + dataHora);
		
		Instant data0 = Instant.now();
		System.out.println("Instant: " + data0);
		
		LocalDate dataForm = LocalDate.parse("1978-04-24");
		System.out.println("LocalDate.parse: " + dataForm);
		
		LocalDateTime dhForm = LocalDateTime.parse("1978-04-24T15:27:21");
		System.out.println("LocalDateTime.parse: " + dhForm);
		
		Instant dh0 = Instant.parse("1978-04-24T15:27:21-03:00");
		System.out.println("Instant.parse: " + dh0);
		
		/*
		 * Erro:
		 * 
		 * LocalDate dataE = LocalDate.parse("24/04/1978");
		 * System.out.println(dataE);
		*/
		
		DateTimeFormatter dtfDateBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataBrasil = LocalDate.parse("24/04/1978", dtfDateBrasil);
		System.out.println("DateTimeFormatter: " + dataBrasil);
		
		DateTimeFormatter dataHoraBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime dhBrasil = LocalDateTime.parse("24/04/1978 15:01:27", dataHoraBrasil);
		System.out.println("DateTimeFormatter com hora: " + dhBrasil);
		
		LocalDate dataOf = LocalDate.of(1978, 4, 24);
		System.out.println("LocalDate.of: " + dataOf);
		
		LocalDateTime dataHoraOf = LocalDateTime.of(1978, 4, 24, 15, 45, 58);
		System.out.println("LocalDateTime.of: " + dataHoraOf);
		
		LocalDate dataFormat = LocalDate.parse("1978-04-24");
		DateTimeFormatter dataBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Format: " + dataFormat.format(dataBr));
		
		Instant insFormat = Instant.parse("1978-04-24T01:27:47Z");
		DateTimeFormatter dhInstant =
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		System.out.print("Instant format: " + dhInstant.format(insFormat));
		
		/* Lista das "Timezones":
		 * ZoneId.getAvailableZoneIds().forEach((String name) -> {
		 * 		System.out.println(name);
		 * });
		*/
		
		
	}
}