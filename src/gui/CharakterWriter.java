package gui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.Charakter;
import model.Zauberwirker;

class CharakterWriter {
	private CharakterWriter() {}
	
	static void writeCharakter(Charakter charakter) throws IOException {
		FileWriter fw = new FileWriter(charakter.getName()+".txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Name: " + charakter.getName() + "      " + "Volk: " + charakter.getVolk().getVolksName() + "      " + "Klasse: " + charakter.getCharakterKlasse().getKlassenName());
		bw.write("\n");
		bw.write("Volksfähigkeiten: " + charakter.getVolk().getVolksFaehigkeit() + "    " + "Geschlecht: " + charakter.getGeschlecht());
		bw.write("\n");
		bw.write("Attribute: ");
		bw.write("\n");
		bw.write("Körper: " + charakter.getKoerper() + "    " + "Agilität: " + charakter.getAgilitaet() + "    " + "Geist: " + charakter.getGeist());
		bw.write("\n");
		bw.write("Eigenschaften: ");
		bw.write("\n");
		bw.write("Stärke: " + charakter.getStaerke() + "    " + "Bewegung: " + charakter.getBewegung() + "    " + "Verstand: " + charakter.getVerstand());
		bw.write("\n");
		bw.write("Härte: " + charakter.getHaerte() + "    " + "Geschickt: " + charakter.getGeschick() + "    " + "Aura: " + charakter.getAura());
		bw.write("\n");
		bw.write("Kampfwerte: ");
		bw.write("\n");
		bw.write("Lebenskraft: " + charakter.getLebenskraft() + "    " + "Abwehr: " + charakter.getAbwehr() + "    " + "Initiative: " + charakter.getInitiative() + 
				"    " + "Laufen: " + charakter.getLaufen());
		bw.write("\n");
		bw.write("Schlagen: " + charakter.getSchlagen() + "    " + "Schießen: " + charakter.getSchiessen() + "    " + "Zaubern: " + charakter.getZaubern() + 
				"    " + "Zielzauber: " + charakter.getZielzauber());
		bw.write("\n");
		bw.write("Erster Talentpunkt: " + charakter.getErsterTalentpunkt() + "    " + "Zweiter Talentpunkt: " + charakter.getZweiterTalentpunkt());
		if (charakter.getCharakterKlasse().getKlassenName().equals("Zauberwirker")) {
			bw.write("\n");
			Zauberwirker zauberwirker = (Zauberwirker) charakter.getCharakterKlasse();
			bw.write("Zauberwirkertyp: " + zauberwirker.getZauberWirkerTyp() + "    " + "Startzauber: " + zauberwirker.getStartZauber());
		}
		
		bw.close();
		fw.close();
	}
}