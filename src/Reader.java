import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;


public class Reader {
	
	String InProcess = "";
	//String UbehandletTekst = "";
	String UkjentTekst = "";
	int FoersteSpace = 0;
	String ForresteOrd = "";
	boolean Identified = false;
	Item ActiveItem;
	int Items = 0;
	Item[] ItemList = new Item[5000];

	public Reader() throws IOException {

		System.out.println("Reader started");
		CopyFromServer();
		//FilterItems();
		//SaveItemToFile();
		//ReadItemsFromFile();
		//SaveItemToFile();
		//ReadItemsFromFile();
		System.out.println("Reader finished");
	}
	
	private void ReadItemsFromFile() {
		
		System.out.println("Leser fra fil");
		try {
			File filen = new File ( "Items reformated.txt" );
			FileInputStream fstream = new FileInputStream ( filen );
			DataInputStream in = new DataInputStream ( fstream );
			int X = 0;
			while ( in.available ( ) != 0 ) {
				X ++;
				ItemList[X] = new Item();
				ItemList[X].Name = in.readLine();
				System.out.println("Satte inn item: "+ItemList[X].Name);
				ItemList[X].ItemType = in.readLine();
				ItemList[X].Slot = in.readLine();
				ItemList[X].Quality = in.readLine();
				ItemList[X].MinDmg = Integer.parseInt(in.readLine());
				ItemList[X].MaxDmg = Integer.parseInt(in.readLine());
				ItemList[X].Bind = in.readLine();
				ItemList[X].Unique = Boolean.parseBoolean(in.readLine());
				ItemList[X].LevelReq = Integer.parseInt(in.readLine());
				ItemList[X].Effect = Boolean.parseBoolean(in.readLine());
				ItemList[X].Bind = in.readLine();
				
				ItemList[X].Armor = Integer.parseInt(in.readLine());
				ItemList[X].Stamina = Integer.parseInt(in.readLine());
				ItemList[X].Intellect = Integer.parseInt(in.readLine());
				ItemList[X].Spirit = Integer.parseInt(in.readLine());
				ItemList[X].Agility = Integer.parseInt(in.readLine());
				ItemList[X].Strength = Integer.parseInt(in.readLine());
				ItemList[X].SpellPower = Integer.parseInt(in.readLine());
				ItemList[X].HasteRating = Integer.parseInt(in.readLine());
				ItemList[X].CritRating = Integer.parseInt(in.readLine());
				ItemList[X].HitRating = Integer.parseInt(in.readLine());
				ItemList[X].AttackPower = Integer.parseInt(in.readLine());
				ItemList[X].ExpertRate = Integer.parseInt(in.readLine());
				ItemList[X].PenetRate = Integer.parseInt(in.readLine());
				ItemList[X].MP5 = Integer.parseInt(in.readLine());
				
				ItemList[X].SocketYellow = Integer.parseInt(in.readLine());
				ItemList[X].SocketRed = Integer.parseInt(in.readLine());
				ItemList[X].SocketBlue = Integer.parseInt(in.readLine());
				ItemList[X].SocketMeta = Integer.parseInt(in.readLine());
				ItemList[X].SocketBonusType = in.readLine();
				ItemList[X].SocketBonusAmount = Integer.parseInt(in.readLine());
				
				ItemList[X].MinDmg = Integer.parseInt(in.readLine());
				ItemList[X].MaxDmg = Integer.parseInt(in.readLine());
				ItemList[X].WpnSpeed = Double.parseDouble(in.readLine());
				
				ItemList[X].Unknown = in.readLine();
				
				for ( int Y = 1 ; Y <= 10 ; Y++ ) {
					String Klassen = in.readLine();
					//System.out.println("Leste inn req for "+Klassen);
					//boolean Required = ItemList[X].Classes.get(Klassen); // her er verdien.);
					ItemList[X].Classes.put(Klassen, Boolean.parseBoolean(in.readLine()));
					//utfil.println(Required); // her er verdien.); // her er verdien.
				}
				ItemList[X].RequiredProf = in.readLine();
			}
			System.out.println("Items lest: "+X);
			in.close ( );
		} catch ( Exception e ) {
			System.out.println("Kunne ikke lese fra fil");
			System.out.println ( "Exception message: " + e.getMessage ( ) );
			System.out.println ( "Exception cause: " + e.getCause ( ) );
			System.out.println ( "Exception class: " + e.getClass ( ) );
			if ( e.getStackTrace ( ) != null ){
				System.out.println ( "Exception origin: ");
				System.out.println ( "Class: " + e.getStackTrace ( )[0].getClassName ( ) );
				System.out.println ( "Method: " + e.getStackTrace ( )[0].getMethodName ( ) );
				System.out.println ( "Line: " + e.getStackTrace ( )[0].getLineNumber ( ) );
			}
			for ( int y = 1 ; y < e.getStackTrace().length ; y++ ) {
				System.out.println (" ");
				System.out.println ( "Origin stack "+y+": ");
				System.out.println ( "Class: " + e.getStackTrace ( )[y].getClassName ( ) );
				System.out.println ( "Method: " + e.getStackTrace ( )[y].getMethodName ( ) );
				System.out.println ( "Line: " + e.getStackTrace ( )[y].getLineNumber ( ) );
			}
		}
		System.out.println("Ferdig å lese fra fil");
	}

	public void CopyFromServer() {
		
		//String EmptyItem = "  <?xml version="1.0" encoding="UTF-8" ?> - <wowitem>   <display";
		System.out.println("Copying items from server");
		try {
			PrintStream utfil;
			File slettfil2 = new File ( "Items from server.txt" );
			slettfil2.delete ( );//tømmer fila
			FileOutputStream appendFilen = new FileOutputStream ( "Items.txt", true );
			utfil = new PrintStream ( appendFilen );
			for ( int X = 0 ; X < 50000 ; X ++ ) {
				URL url = new URL("http://wow.allakhazam.com/cluster/ifull.pl?id="+X);
				InputStream stream = url.openStream();
				StringBuffer buffer = new StringBuffer();
				int p = 0;
				boolean Continue = true;
				while ( ((p = stream.read()) != -1) && Continue ) {
					buffer.append((char)p);
				}
				utfil.append(buffer);

			}
			utfil.close ( );
		} catch ( Exception e ) {
			
		}
		System.out.println("Server copying finished");
	}
	
	public void FilterItems() {
		
		System.out.println("Filtering items");
		//File filen = new File ( "Filtered from HTML.txt" );
		File filen = new File ( "Items Filtered.txt" );
		String Content = "";
		try {
			FileInputStream fstream = new FileInputStream ( filen );
			DataInputStream in = new DataInputStream ( fstream );
			//StringBuffer buffer = new StringBuffer();
			System.out.println("in.available()="+in.available());
			while ( in.available() != 0 ) {
				//UbehandletTekst = UbehandletTekst + in.readLine();
				//ProcessText(in.readLine());
				Content = Content + (in.readLine());
				//System.out.println("Content="+Content.length());
			}
			//System.out.println(UbehandletTekst);
			in.close ( );
		} catch ( Exception T ) {
			System.out.println("Kunne ikke lese fil b");
			System.out.println ( "Throwable message: " + T.getMessage ( ) );
			System.out.println ( "Throwable cause: " + T.getCause ( ) );
			System.out.println ( "Throwable class: " + T.getClass ( ) );
		}
		//ProcessText(Content);
		System.out.println("Finished filtering items");
		ProcessText2(Content);
	}
	
	public void ProcessText2(String NyInput) {
		
		System.out.println("Processing text");
		InProcess = InProcess + NyInput;
		
		//System.out.println("Index of space: "+UbehandletTekst.indexOf(" "));
		//System.out.println("InProcess="+InProcess);
		if (InProcess.indexOf(" ") == 0 ) {
			InProcess = (String) InProcess.subSequence(1, InProcess.length());
		}
		
		while (InProcess.length() >= 9 ) {
			//System.out.println("A "+InProcess);
			//System.out.println(UbehandletTekst.indexOf(" "));
			int FirstNew = InProcess.indexOf("-NEWITEM-");
			Identified = false;
			if ( FirstNew == 0) {
				if ( ActiveItem != null ) {
					ActiveItem.StartIdentifier();
				}
				ActiveItem = new Item();
				Items ++;
				ItemList[Items] = ActiveItem;
				InProcess = (String) InProcess.subSequence(9, InProcess.length());
			} else {
				if ( ActiveItem != null ) {
					if ( FirstNew == -1 ) {
						//System.out.println("a Fyller info i item: "+(String) InProcess.subSequence(0, InProcess.length()));
						ActiveItem.InputInfo(InProcess);

						InProcess = "";
					} else {
						//System.out.println("b Fyller info i item: "+(String) InProcess.subSequence(0, FirstNew));
						ActiveItem.InputInfo((String) InProcess.subSequence(0, FirstNew));

						InProcess = (String) InProcess.subSequence(FirstNew, InProcess.length());
					}
				}
			}

			//System.out.println("B "+InProcess);
			//System.out.println(InProcess.indexOf(" "));
			while (InProcess.indexOf(" ") == 0 ) {
				InProcess = (String) InProcess.subSequence(1, InProcess.length());
			}
		}
		
		System.out.println("B");
		for (int X = 0; X < ItemList.length ; X++ ) {
			if ( ItemList[X] != null ) {
				//System.out.println("Skal sjekke item #"+X);
				ItemList[X].CheckItem();
			}
		}
		System.out.println("Finished processing items");
	}
	
	public boolean IsNewItem(String Text) {
		
		if ( Text.equals("-NEWITEM-")) {
			return true;
		}
		if ( Text.equals("whitename")) {
			return true;
		}
		return false;
		
	}
	
	public boolean IsItemSlot (String Text) {
		
		if ( Text.equals("Sword")) {
			return true;
		}
		return false;
	}
	
	public void SaveItemToFile() {
		
		System.out.println("Saving items to reformated file");
		try {
			File slettfil2 = new File ( "Items reformated.txt" );
			slettfil2.delete ( );//tømmer fila
			PrintStream utfil;
			FileOutputStream Skrivefilen = new FileOutputStream ( "Items reformated.txt", false );
			utfil = new PrintStream ( Skrivefilen );
			int Accepted = 0;
			//System.out.println("A. ItemList.length="+ItemList.length);
			for (int X = 0; X < ItemList.length ; X++ ) {
				if ( ItemList[X] != null ) {
					//System.out.println("B");
					//ItemList[X].StartIdentifier();
					ItemList[X].CheckItem();
					//System.out.println("Sjekker item, Valuable="+ItemList[X].Valuable);
					if ( ItemList[X].Valuable == true ) {
						Accepted ++;
						utfil.println(ItemList[X].Name);
						utfil.println(ItemList[X].ItemType);
						utfil.println(ItemList[X].Slot);
						utfil.println(ItemList[X].Quality);
						utfil.println(ItemList[X].MinDmg);
						utfil.println(ItemList[X].MaxDmg);
						utfil.println(ItemList[X].Bind);
						utfil.println(ItemList[X].Unique);
						utfil.println(ItemList[X].LevelReq);
						utfil.println(ItemList[X].Effect);
						utfil.println(ItemList[X].Bind);
						
						utfil.println(ItemList[X].Armor);
						utfil.println(ItemList[X].Stamina);
						utfil.println(ItemList[X].Intellect);
						utfil.println(ItemList[X].Spirit);
						utfil.println(ItemList[X].Agility);
						utfil.println(ItemList[X].Strength);
						utfil.println(ItemList[X].SpellPower);
						utfil.println(ItemList[X].HasteRating);
						utfil.println(ItemList[X].CritRating);
						utfil.println(ItemList[X].HitRating);
						utfil.println(ItemList[X].AttackPower);
						utfil.println(ItemList[X].ExpertRate);
						utfil.println(ItemList[X].PenetRate);
						utfil.println(ItemList[X].MP5);
						
						utfil.println(ItemList[X].SocketYellow);
						utfil.println(ItemList[X].SocketRed);
						utfil.println(ItemList[X].SocketBlue);
						utfil.println(ItemList[X].SocketMeta);
						utfil.println(ItemList[X].SocketBonusType);
						utfil.println(ItemList[X].SocketBonusAmount);
						
						utfil.println(ItemList[X].MinDmg);
						utfil.println(ItemList[X].MaxDmg);
						utfil.println(ItemList[X].WpnSpeed);
						
						utfil.println(ItemList[X].Unknown);
						//System.out.println("Hasnext?="+ItemList[X].keyIterator.hasNext());
						while ( ItemList[X].keyIterator.hasNext()) {
							String Klassen = (String) ItemList[X].keyIterator.next(); // her er nøkkelen.
							boolean Required = ItemList[X].Classes.get(Klassen); // her er verdien.);
							utfil.println(Klassen); // her er nøkkelen.
							utfil.println(Required); // her er verdien.); // her er verdien.
						}
						utfil.println(ItemList[X].RequiredProf);
					} else {
						//System.out.println("Item ikke godkjent, Valuable="+ItemList[X].Valuable);
					}
					//System.out.println("Accepted items: "+Accepted);
				} else {
					//System.out.println("C");
				}
				//System.out.println("D");
			}
			utfil.close ( );
		} catch ( Exception e ) {
			System.out.println("Exception");
			System.out.println("Kunne ikke lese fil b");
			System.out.println ( "Throwable message: " + e.getMessage ( ) );
			System.out.println ( "Throwable cause: " + e.getCause ( ) );
			System.out.println ( "Throwable class: " + e.getClass ( ) );
			if ( e.getStackTrace ( ) != null ){
				System.out.println ( "Exception origin: ");
				System.out.println ( "Class: " + e.getStackTrace ( )[0].getClassName ( ) );
				System.out.println ( "Method: " + e.getStackTrace ( )[0].getMethodName ( ) );
				System.out.println ( "Line: " + e.getStackTrace ( )[0].getLineNumber ( ) );
			}
		}
		
		System.out.println("Finished saving to file");
	}

	public Item FindItem(String string) {

		for (int X = 0; X < ItemList.length ; X++ ) {
			if ( ItemList[X] != null ) {
				if ( ItemList[X].Name.equals(string)) {
					return ItemList[X];
				}
			}
		}
		return null;
	}
	
}
