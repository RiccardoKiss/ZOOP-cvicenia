/*
Cvičenie 2
 	
Úlohy:
Pre lepšiu organizáciu výsledkov svojej práce použite balíky v zmysle príkladov z prednášky.
Naprogramujte všetky príklady z predchádzajúcej prednášky. Snažte sa nekopírovat text kódu 
z dostupných snímkov. Každý riadok kódu okomentujte vhodným spôsobom. V texte komentára 
uvedte vysvetlenie/zdôvodnenie použitej časti kódu.
Vytvorte si vlastnú triedu s ľubovolným názvom a pridajte jej statickú metódu main. 
V metóde main napíšte príkaz/príkazy tak aby na konzole po spustení programu bol 
viditeľný nasledovný výstup:
Vlastné objekty označujeme ako inštancie príslušnej triedy
Napr. počítač s ktorým pracujem je objekt, inštanciou triedy počítačov
Inštancia je konkrétnou realizáciou svojej triedy
Má svoju identitu
Má svoj stav
Má svoje správanie
Rozšírte triedu Student z nášho príkladu z prednášky o dalšie atribúty. Pokúste sa vypísal ich hodnoty.
V rámci triedy Student vytvorte metódu, ktorá zavolá lubovolnú vhodnú metódu z Java API 10.
Pridajte do triedy Student dalšie vhodné metódy charakterizujúce potenciálne správanie sa študenta.
V jednoduchom cykle vytvorte desať inštancií triedy Student.
Upravte predchádzajúce riešenie tak aby bolo z vypisu na konzolu zretelné, že ide o autonómne objekty.
Rozšírte náš systém na admnistráciu kurzov o nové triedy.
*/
package cvicenie2;

public class Main {
	public static void main(String[] args) {
		/*Car car = new Car(100);
		Car car2 = new Car(500);
		car.getPrice();
		car2.getPrice();*/
		String[] firstNames = {"Jan", "Jozef", "Michal", "Peter", "Stefan", "Filip", "Richard", "Martin", "Denis", "Andrej"};
		String[] lastNames = {"Prvy", "Druhy", "Treti", "Stvrty", "Piaty", "Siesty", "Siedmy", "Osmy", "Deviaty", "Desiaty"};
	
		Student johny = new Student(11, "Johny", "Johnson", 1, 11, 1999);
		Student jack = new Student(12, "Jack", "Jackson", 2, 12, 2000);
		Student students[] = new Student[10];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(i+1, firstNames[i], lastNames[i], i, i, 1990+i);
			System.out.printf("\nID: %d\nName: %s %s\nDate of Birth: %d-%d-%d\n",
					students[i].id, students[i].firstName, students[i].lastName, students[i].birthDay, students[i].birthMonth, students[i].birthYear);
			
		}
	}
}
