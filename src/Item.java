import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Item {

	String Name;
	String Quality;
	String Slot;
	String ItemType;
	String Bind;
	boolean Unique = false;
	int LevelReq = 0;
	boolean Effect = false;
	
	int Armor = 0;
	int Stamina = 0;
	int Intellect = 0;
	int Spirit = 0;
	int Agility = 0;
	int Strength = 0;
	int SpellPower = 0;
	int HasteRating = 0;
	int CritRating = 0;
	int HitRating = 0;
	int AttackPower = 0;
	int ExpertRate = 0;
	int PenetRate = 0;
	int MP5 = 0;
	
	int SocketYellow = 0;
	int SocketRed = 0;
	int SocketBlue = 0;
	int SocketMeta = 0;
	String SocketBonusType;
	int SocketBonusAmount = 0;
	
	int MinDmg = 0;
	int MaxDmg = 0;
	double WpnSpeed = 0;
	
	String Unknown = "";
	
	boolean Valuable = true;
	
	HashMap<String, Boolean> Classes = new HashMap<String, Boolean>();
	Set set = Classes.entrySet();
    Iterator keyIterator = set.iterator();
    
    String RequiredProf = "";
    
    
    Identifier Class_Identifier = new Identifier(Unknown);
	
	public Item() {
		
		//System.out.println("-> Lagde nytt item");
		/*
		Classes.put("Death Knight", false);
		Classes.put("Druid", false);
		Classes.put("Hunter", false);
		Classes.put("Mage", false);
		Classes.put("Paladin", false);
		Classes.put("Priest", false);
		Classes.put("Rogue", false);
		Classes.put("Shaman", false);
		Classes.put("Warlock", false);
		Classes.put("Warrior", false);
		
	    Classes = new HashMap();
	    keyIterator = Classes.keySet().iterator();
		*/
	}
	
	public void InputInfo(String Text) {
		
		Unknown = Unknown + Text+" ";
		//System.out.println("- Unknown info updated: "+Unknown);
		
	}
	
	public void StartIdentifier() {
		
		//System.out.println("Full tekst: "+Unknown);
		
		
		Quality = Class_Identifier.FindItemQuality(Unknown);
		if ( Quality != null ) {
			//System.out.println("Dette item er Quality: "+Quality);
			Unknown = Unknown.replaceFirst(Quality, "");
		}
		
		int StartItemName = 0;
		int EndItemName = Unknown.indexOf("SpanSpan");
		if ( EndItemName > -1 ) {
			//System.out.println("SpanSpan="+EndItemName);
			Name = (String) Unknown.subSequence(StartItemName, EndItemName);
			//System.out.println("Item name er: "+Name);
			Unknown = Unknown.replaceFirst(Name, "");
			Unknown = Unknown.replaceFirst("SpanSpan", "");
		}
		
		Unknown = Unknown.replace("-n-", "");
		Unknown = Unknown.replace("Span", "");
		Unknown = Unknown.replace("+", "");
		
		Bind = Class_Identifier.FindItemBind(Unknown);
		if ( Bind != null ) {
			//System.out.println("Dette item er Bind: "+Bind);
			Unknown = Unknown.replaceFirst(Bind, "");
		}
		
		Slot = Class_Identifier.FindItemSlot(Unknown);
		if ( Slot != null ) {
			//System.out.println("Dette item er Slot: "+Slot);
			Unknown = Unknown.replaceFirst(Slot, "");
		}
		
		ItemType = Class_Identifier.FindItemType(Unknown);
		if ( ItemType != null ) {
			Unknown = Unknown.replaceFirst(ItemType, "");
			//System.out.println("Dette item er ItemType: "+ItemType);
		}
		
		Unique = Class_Identifier.FindItemUnique(Unknown);
		if ( Unique == true ) {
			Unknown = Unknown.replaceFirst("Unique", "");
			//System.out.println("Dette item er Unique: "+Unique);
		}
		
		LevelReq = Class_Identifier.FindItemLvl(Unknown);
		if ( LevelReq > 0 ) {
			Unknown = Unknown.replaceFirst("Requires Level "+LevelReq, "");
			//System.out.println("Dette item er LevelReq: "+LevelReq);
		}
		
		//stats
		Armor = Class_Identifier.FindItemArmor(Unknown);
		if ( Armor > 0 ) {
			Unknown = Unknown.replaceFirst(Armor+" Armor", "");
			//System.out.println("Dette item har Armor="+Armor);
		}
		
		Stamina = Class_Identifier.FindItemStamina(Unknown);
		if ( Stamina > 0 ) {
			Unknown = Unknown.replaceFirst(Stamina+" Stamina", "");
			//System.out.println("Dette item har Stamina="+Stamina);
		}
		
		Intellect = Class_Identifier.FindItemIntellect(Unknown);
		if ( Intellect > 0 ) {
			Unknown = Unknown.replaceFirst(Intellect+" Intellect", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		Spirit = Class_Identifier.FindItemSpirit(Unknown);
		if ( Spirit > 0 ) {
			Unknown = Unknown.replaceFirst(Spirit+" Spirit", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		Agility = Class_Identifier.FindItemAgility(Unknown);
		if ( Agility > 0 ) {
			Unknown = Unknown.replaceFirst(Agility+" Agility", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		Strength = Class_Identifier.FindItemStrength(Unknown);
		if ( Strength > 0 ) {
			Unknown = Unknown.replaceFirst(Strength+" Strength", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		Effect = Class_Identifier.FindItemEffect(Unknown);
		if ( Effect == true ) {
			Unknown = Unknown.replaceFirst("Effect", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		SpellPower = Class_Identifier.FindItemSpell(Unknown);
		if ( SpellPower > 0 ) {
			Unknown = Unknown.replaceFirst("Increases spell power by "+SpellPower, "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		HasteRating = Class_Identifier.FindItemHaste(Unknown);
		if ( HasteRating > 0 ) {
			Unknown = Unknown.replaceFirst("Improves haste rating by "+HasteRating, "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		CritRating = Class_Identifier.FindItemCrit(Unknown);
		if ( CritRating > 0 ) {
			Unknown = Unknown.replaceFirst("Improves critical strike rating by "+CritRating, "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		HitRating = Class_Identifier.FindItemHit(Unknown);
		if ( HitRating > 0 ) {
			Unknown = Unknown.replaceFirst("Improves hit rating by "+HitRating, "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		AttackPower = Class_Identifier.FindItemAP(Unknown);
		if ( AttackPower > 0 ) {
			Unknown = Unknown.replaceFirst("Increases attack power by "+AttackPower, "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		ExpertRate = Class_Identifier.FindItemExpR(Unknown);
		if ( ExpertRate > 0 ) {
			Unknown = Unknown.replaceFirst("Increases your expertise rating by "+ExpertRate, "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		PenetRate = Class_Identifier.FindItemPenetR(Unknown);
		if ( PenetRate > 0 ) {
			Unknown = Unknown.replaceFirst("Increases armor penetration rating by "+PenetRate, "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		MP5 = Class_Identifier.FindItemMP5(Unknown);
		if ( MP5 > 0 ) {
			Unknown = Unknown.replaceFirst("Restores "+MP5+" mana per 5 sec.", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		//sockets
		SocketYellow = Class_Identifier.FindItemSocketY(Unknown);
		if ( SocketYellow > 0 ) {
			Unknown = Unknown.replace("Yellow Socket", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		SocketRed = Class_Identifier.FindItemSocketR(Unknown);
		if ( SocketRed > 0 ) {
			Unknown = Unknown.replace("Red Socket", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		SocketBlue = Class_Identifier.FindItemSocketB(Unknown);
		if ( SocketBlue > 0 ) {
			Unknown = Unknown.replace("Blue Socket", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		SocketMeta = Class_Identifier.FindItemSocketM(Unknown);
		if ( SocketMeta > 0 ) {
			Unknown = Unknown.replace("Meta Socket", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		SocketBonusType = Class_Identifier.FindItemSocketBonusType(Unknown);
		if ( SocketBonusType != null ) {
			Unknown = Unknown.replace(SocketBonusType, "");
			//System.out.println("Dette item har SocketBonusType="+SocketBonusType);
		}
		
		SocketBonusAmount = Class_Identifier.FindItemSocketBonusAmount(Unknown);
		if ( SocketBonusAmount > 0 ) {
			Unknown = Unknown.replace("Socket Bonus: "+SocketBonusAmount, "");
			//System.out.println("Dette item har SocketBonusAmount="+SocketBonusAmount);
		}
		
		MinDmg = Class_Identifier.FindItemMinDmg(Unknown);
		if ( MinDmg > 0 ) {
			Unknown = Unknown.replace(MinDmg+" - ", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		MaxDmg = Class_Identifier.FindItemMaxDmg(Unknown);
		if ( MaxDmg > 0 ) {
			Unknown = Unknown.replace(MaxDmg+" Damage", "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		WpnSpeed = Class_Identifier.FindItemSpeed(Unknown);
		if ( WpnSpeed > 0 ) {
			Unknown = Unknown.replace("Speed "+WpnSpeed, "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}

		//System.out.println("--> Ukjent tekst: "+Unknown);
		
	}
	
	public void CheckItem() {
		

	    
		Classes.put("Death Knight", false);
		Classes.put("Druid", false);
		Classes.put("Hunter", false);
		Classes.put("Mage", false);
		Classes.put("Paladin", false);
		Classes.put("Priest", false);
		Classes.put("Rogue", false);
		Classes.put("Shaman", false);
		Classes.put("Warlock", false);
		Classes.put("Warrior", false);
		
	    keyIterator = Classes.keySet().iterator();
		/*		
		Classes.put("Druid", Class_Identifier.FindItemClass(Unknown, "Druid"));
		Classes.put("Hunter", Class_Identifier.FindItemClass(Unknown, "Hunter"));
		Classes.put("Mage", Class_Identifier.FindItemClass(Unknown, "Hunter"));
		Classes.put("Paladin", Class_Identifier.FindItemClass(Unknown, "Paladin"));
		Classes.put("Priest", Class_Identifier.FindItemClass(Unknown, "Priest"));
		Classes.put("Rogue", Class_Identifier.FindItemClass(Unknown, "Rogue"));
		Classes.put("Shaman", Class_Identifier.FindItemClass(Unknown, "Rogue"));
		Classes.put("Warlock", Class_Identifier.FindItemClass(Unknown, "Rogue"));
		Classes.put("Warrior", Class_Identifier.FindItemClass(Unknown, "Warrior"));
		*/
		//System.out.println("keyIterator.hasNext()?="+keyIterator.hasNext());
	    int RequiredC = 0;
		while (keyIterator.hasNext()) {
			String Klassen = (String) keyIterator.next(); // her er nøkkelen.
			Classes.put(Klassen, Class_Identifier.FindItemClass(Unknown, Klassen));
			boolean Required = Classes.get(Klassen); // her er verdien.);
			if ( Required == true ) {
				Unknown = Unknown.replace(Klassen, "");
				RequiredC ++;
			}
		}
		if ( RequiredC == 0 ) {
			keyIterator = Classes.keySet().iterator();
			while (keyIterator.hasNext()) {
				String Klassen = (String) keyIterator.next(); // her er nøkkelen.
				Classes.put(Klassen, true);
			}
		}
		keyIterator = Classes.keySet().iterator();
		
		RequiredProf = Class_Identifier.FindItemProf(Unknown);
		if ( RequiredProf != null ) {
			Unknown = Unknown.replace(RequiredProf, "");
			//System.out.println("Dette item har Intellect="+Intellect);
		}
		
		/*
		System.out.println("Name="+Name);
		System.out.println("Quality="+Quality);
		System.out.println("Slot="+Slot);
		System.out.println("ItemType="+ItemType);
		System.out.println("Mindmg="+MinDmg);
		System.out.println("Maxdmg="+MaxDmg);
		System.out.println("Speed="+WpnSpeed);
		System.out.println("Bind="+Bind);
		System.out.println("Unique="+Unique);
		System.out.println("LevelReq"+LevelReq);
		System.out.println("Effect="+Effect);
		
		System.out.println("Armor="+Armor);
		System.out.println("Stamina="+Stamina);
		System.out.println("Intellect="+Intellect);
		System.out.println("Spirit="+Spirit);
		System.out.println("Agility="+Agility);
		System.out.println("Strength="+Strength);
		System.out.println("SpellPower="+SpellPower);
		System.out.println("HasteRating="+HasteRating);
		System.out.println("CritRating="+CritRating);
		System.out.println("HitRating"+HitRating);
		System.out.println("AttackPower="+AttackPower);
		System.out.println("ExpertRate="+ExpertRate);
		System.out.println("PenetRate="+PenetRate);
		System.out.println("MP5="+MP5);
		
		System.out.println("SocketYellow="+SocketYellow);
		System.out.println("SocketRed="+SocketRed);
		System.out.println("SocketBlue="+SocketBlue);
		System.out.println("SocketMeta="+SocketMeta);
		System.out.println("SocketBonusType="+SocketBonusType);
		System.out.println("SocketBonusAmount="+SocketBonusAmount);
		
		System.out.println("MinDmg="+MinDmg);
		System.out.println("MaxDmg="+MaxDmg);
		System.out.println("WpnSpeed="+WpnSpeed);
		
		System.out.println("--> Ukjent tekst: "+Unknown);
		*/
		
		if ( this.Name == null ) {
			System.out.println("Name="+Name+" "+this.ItemType);
		} else {
			if ( this.Name.indexOf("BlueQuality ") > -1 ) {
				Name = Name.substring((Name.indexOf("BlueQuality ")+"BlueQuality ".length()), Name.length());
				this.Quality = "BlueQuality";
			}
		}
		//System.out.println("Slot="+Slot);
		//System.out.println("ItemType="+ItemType);
		//System.out.println("Slot="+Slot=null);
		if ( (this.Slot == null) && (this.ItemType == null) ) {
			this.Valuable = false;
		}
		//if ( (this.Slot.equals("null")) && (this.ItemType.equals("null")) ) {
		//	this.Valuable = false;
		//}
		if ( this.LevelReq < 78 ) {
			this.Valuable = false;
		}
		
	}
	
}
