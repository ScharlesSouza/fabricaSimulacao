import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cronometro {
	
	
	int qnt_segundos, velocidade;
	final SimpleDateFormat HHmmss = new SimpleDateFormat("HH:mm:ss.SSS");
	
	public Cronometro(Integer qnt_segundos, Integer velocidade) {
		this.qnt_segundos = qnt_segundos;
		this.velocidade = velocidade;
		
		
		
		for(int i =1; i<=qnt_segundos;i++){
	           
             
			 try {
				Thread.sleep(velocidade);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                
			 
			 	if(i%5==0) {
			 		System.out.println("\n"+HHmmss.format(new Date()) +" => "+ i+" P�o produzido! ");
			 		
			 	}else {
			 		
			 	}
		}
	}
	
	

	public void imprime() {
		
                
	}
	
	public Calendar carregarMascara(int momento){
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSS");
		Date data = null;
		try {
			data = formato.parse("01/01/1980 00:00:00.000");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//01/01/1980 00:00:00
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.SECOND, momento);
		return calendar;
		
		
	}

}