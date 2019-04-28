import java.util.Scanner;


public class Interview {
	
	String name = "";
	int alter = 0;
	boolean single = true;
	int c = 0;
	
	public Interview(){
		
		this.name = getName();
		this.alter = getAlter();
		c=0;
		this.single = getStatus();
		
		if (single == false){
			System.out.println("Herzlichen Glückwunsch "+name+"! Du brauchst meine Hilfe nicht!");
			wait(10);
			return;
		}
		if (alter <= 14 || alter >=88){
			System.out.println("Das ist in deinem Alter nicht so schlimm. Machs gut! :)");
			wait(10);
			return;
		}
		if (single == true){
			
			int length = getLength();
			System.out.println("Was meinst du, wie konnte es dazu kommen?");
			Scanner scanner = new Scanner(System.in);
			System.out.print(" > ");
			String gelaber = scanner.nextLine();
			System.out.println("Erzähl mir bitte etwas genauer davon.");
			System.out.print(" > ");
			gelaber = scanner.nextLine();
			System.out.println("Hast du in den letzten "+length+" Monaten versucht jemanden besser kennen zu lernen?");
			System.out.print(" > ");
			gelaber = scanner.nextLine();
			System.out.println("Ich habe genug gehört, ich danke für dein Vertrauen!");
			wait(1);
			System.out.print("\nWerte Antworten aus");
			wait(1); System.out.print("."); wait(1); System.out.print("."); wait(2); System.out.print(".");
			wait(1);
			System.out.print("\nVergleiche mit vorherigen Patienten");
			wait(1); System.out.print("."); wait(1); System.out.print("."); wait(1); System.out.print(".");
			wait(1);
			System.out.print("\nErstelle psychologisches Gutachten");
			wait(3); System.out.print("."); wait(3); System.out.print("."); wait(3); System.out.print(".");
			wait(1);
			System.out.print("\nPrüfe Ergebnisse");
			wait(1); System.out.print("."); wait(1); System.out.print("."); wait(1); System.out.print(".");
			wait(2);
			System.out.print("\nFormatiere Endbericht");
			wait(1); System.out.print("."); wait(1); System.out.print("."); wait(1); System.out.print(".");
			wait(1);
			
			c=0;	
			giveAdvice();
			
		}
		
		
	}
	
	public String getName(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie Ihren Namen ein: ");
		System.out.print(" > ");
		String name = scanner.nextLine();
		return name;
	}
	
	public int getAlter(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie Ihr Alter an: ");
		System.out.print(" > ");
		int alter = 0;
	    if (scanner.hasNextInt()) {
	    	
	        	alter = scanner.nextInt();
	        	if (alter < 0){
	        	System.out.println("Gib etwas sinnvolles ein, "+name+".");
	        	alter = getAlter();
	    	}
	        
	    } else {
	        System.out.println("Nun sei nicht so, es geht doch nur um dein Alter.");
	        alter = getAlter();
	    }
		return alter;
	}
	
	public boolean getStatus(){
	
	System.out.println("Sind Sie derzeit in einer Beziehung?");
	Scanner scanner = new Scanner(System.in);
	System.out.print(" > ");
	String antwort = scanner.nextLine();
	boolean status = true;
		
		if(antwort.contains("Ja") || antwort.contains("ja") || antwort.contains("jo")){
			status = false;
			
		}else if(antwort.contains("nein") ||  antwort.contains("Nein") || antwort.equals("ne") || antwort.contains("Nö")){
			status = true;
			
		}else{
			switch(c%2){
			case 0: System.out.println("Ja, oder nein, " + name + "?");
					c++;
					status = getStatus();
					break;
			
			case 1: System.out.println("Wenn das hier funktionieren soll, musst du schon ehrlich sein!");
					c++;
					status = getStatus();
					break;
				}
			}
		
		return status;
	}
	
	public int getLength(){
		Scanner scanner = new Scanner(System.in);
		int length = 0;
		System.out.println("Seit wie vielen Monaten bist du denn schon single, "+name+"?");
		System.out.print(" > ");
	    if (scanner.hasNextInt()) {
	        length = scanner.nextInt() ; 
	        if (length<0){
	        	System.out.println("Gib bitte etwas sinnvolles ein.");
	        	length = getLength();
	        }
	    } else {
	        System.out.println("Bitte gib einen Zahlenwert an.");
	        length = getLength();

	    }
		//int length = scanner.nextInt();
		return length;
	}
	
	public void giveAdvice(){
		System.out.println("\nFür dich und deine Situation konnte ein individueller Ratschlag konstruiert werden. Möchtest du ihn einsehen?");
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > ");
		String antwort = scanner.nextLine();
			
			if(antwort.contains("Ja") || antwort.contains("ja")){
				wait(1);
				System.out.println("Sei einfach du selbst!");
				wait(10);
			}else if(antwort.contains("nein") ||  antwort.contains("Nein") || antwort.equals("ne") || antwort.contains("Nö")){
				switch(c){
				case 0: System.out.println("Das solltest du dir noch einmal überlegen ...");
						c++;
						giveAdvice();
						break;
				
				case 1: System.out.println("Damit wäre unser gesamten Gespräch umsonst gewesen :(");
						c++;
						giveAdvice();
						break;
				
				case 2: System.out.println("Dann eben nicht. Ich wünsche dir viel Glück auf deinem weiteren Lebensweg!");
						wait(10);
						return;
					}	
			}else{	
						System.out.println("Ja, oder nein, " + name + "?");
						giveAdvice();
			}
		}
		
		
	
	
	public void wait(int second){
		try{
		    Thread.sleep(second*1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
}
