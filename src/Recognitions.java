
public class Recognitions {
	
	String[] ItemTypes = new String[20];
	String[] ItemSlots = new String[30];
	String[] ItemQualities = new String[20];
	String[] ItemBinds = new String[20];
	double[] ItemSpeeds = new double[30];
	String[] ItemSocketBonusType = new String[20];
	String[] ItemProfession = new String[10];

	public Recognitions() {
		
		MakeItemTypes();
		MakeItemSlots();
		MakeItemQualities();
		MakeItemBinds();
		MakeItemSpeeds();
		MakeSocketBonusTypes();
		MakeItemProfessions();
		
	}
	
	private void MakeItemProfessions() {
		
		int X = 0;
		X++;
		ItemProfession[X] = "Blacksmithing";
		X++;
		ItemProfession[X] = "Weaponsmith";
		X++;
		ItemProfession[X] = "Armorsmith";
		
	}

	private void MakeSocketBonusTypes() {
		
		int X = 0;
		X++;
		ItemSocketBonusType[X] = "Intellect";
		X++;
		ItemSocketBonusType[X] = "Stamina";
		X++;
		ItemSocketBonusType[X] = "Spirit";
		X++;
		ItemSocketBonusType[X] = "Spell Power";
		X++;
		ItemSocketBonusType[X] = "Agility";
		X++;
		ItemSocketBonusType[X] = "Strength";
		X++;
		ItemSocketBonusType[X] = "Haste Rating";
		X++;
		ItemSocketBonusType[X] = "Critical Strike Rating";
		X++;
		ItemSocketBonusType[X] = "Hit Rating";
		X++;
		ItemSocketBonusType[X] = "Attack Power";
		X++;
		ItemSocketBonusType[X] = "Expertise Rating";
		X++;
		ItemSocketBonusType[X] = "Penetration Rating";
		X++;
		ItemSocketBonusType[X] = " mana per 5 sec";
		
	}

	private void MakeItemSpeeds() {
		
		int X = 0;
		X++;
		ItemSpeeds[X] = 1.1;
		X++;
		ItemSpeeds[X] = 1.2;
		X++;
		ItemSpeeds[X] = 1.3;
		X++;
		ItemSpeeds[X] = 1.4;
		X++;
		ItemSpeeds[X] = 1.5;
		X++;
		ItemSpeeds[X] = 1.6;
		X++;
		ItemSpeeds[X] = 1.7;
		X++;
		ItemSpeeds[X] = 1.8;
		X++;
		ItemSpeeds[X] = 1.9;
		X++;
		ItemSpeeds[X] = 2.0;
		X++;
		ItemSpeeds[X] = 2.1;
		X++;
		ItemSpeeds[X] = 2.2;
		X++;
		ItemSpeeds[X] = 2.3;
		X++;
		ItemSpeeds[X] = 2.4;
		X++;
		ItemSpeeds[X] = 2.5;
		X++;
		ItemSpeeds[X] = 2.6;
		X++;
		ItemSpeeds[X] = 2.7;
		X++;
		ItemSpeeds[X] = 2.8;
		X++;
		ItemSpeeds[X] = 2.9;
		X++;
		ItemSpeeds[X] = 3.0;
		X++;
		ItemSpeeds[X] = 3.1;
		X++;
		ItemSpeeds[X] = 3.2;
		X++;
		ItemSpeeds[X] = 3.3;
		X++;
		ItemSpeeds[X] = 3.4;
		X++;
		ItemSpeeds[X] = 3.5;
		X++;
		ItemSpeeds[X] = 3.6;
		X++;
		ItemSpeeds[X] = 3.7;
		X++;
		ItemSpeeds[X] = 3.8;
		X++;
		ItemSpeeds[X] = 3.9;
		
	}

	private void MakeItemBinds() {

		int X = 0;
		X++;
		ItemBinds[X] = "Binds when picked up";
		X++;
		ItemBinds[X] = "Binds when equipped";
		
	}

	private void MakeItemQualities() {
		
		int X = 0;
		X++;
		ItemQualities[X] = "greyname";
		X++;
		ItemQualities[X] = "GreyQuality";
		X++;
		ItemQualities[X] = "WhiteQuality";
		X++;
		ItemQualities[X] = "PurpleQuality";
		
	}

	private void MakeItemTypes() {
		
		int X = 0;
		X++;
		ItemTypes[X] = "Sword";
		X++;
		ItemTypes[X] = "Mace";
		X++;
		ItemTypes[X] = "Axe";
		X++;
		ItemTypes[X] = "Dagger";
		X++;
		ItemTypes[X] = "Staff";
		X++;
		ItemTypes[X] = "Shirt";
		X++;
		ItemTypes[X] = "Cloth";
		X++;
		ItemTypes[X] = "Leather";
		X++;
		ItemTypes[X] = "Mail";
		X++;
		ItemTypes[X] = "Plate";
		X++;
		ItemTypes[X] = "Miscellaneous";
		X++;
		ItemTypes[X] = "Wand";
		X++;
		ItemTypes[X] = "Bow";
		X++;
		ItemTypes[X] = "Gun";
		X++;
		ItemTypes[X] = "Crossbow";
		X++;
		ItemTypes[X] = "Totem";
		X++;
		ItemTypes[X] = "Libram";
		X++;
		ItemTypes[X] = "Idol";
		X++;
		ItemTypes[X] = "Sigil";
		X++;
		ItemSlots[X] = "Shield";
		X++;
		ItemSlots[X] = "Throwing";
		
	}
	
	private void MakeItemSlots() {
		
		int X = 0;
		X++;
		ItemSlots[X] = "Main Hand";
		X++;
		ItemSlots[X] = "One-Hand";
		X++;
		ItemSlots[X] = "Held In Hand";
		X++;
		ItemSlots[X] = "Off Hand";
		X++;
		ItemSlots[X] = "Two-Hand";
		X++;
		ItemSlots[X] = "Staff";
		X++;
		ItemSlots[X] = "Shirt";
		X++;
		ItemSlots[X] = "Legs";
		X++;
		ItemSlots[X] = "Feet";
		X++;
		ItemSlots[X] = "Chest";
		X++;
		ItemSlots[X] = "Hands";
		X++;
		ItemSlots[X] = "Waist";
		X++;
		ItemSlots[X] = "Bracers";
		X++;
		ItemSlots[X] = "Neck";
		X++;
		ItemSlots[X] = "Shoulder";
		X++;
		ItemSlots[X] = "Trinket";
		X++;
		ItemSlots[X] = "Relic";
		X++;
		ItemSlots[X] = "Wrist";
		X++;
		ItemSlots[X] = "Ranged";
		X++;
		ItemSlots[X] = "Range";
		X++;
		ItemSlots[X] = "Head";
		X++;
		ItemSlots[X] = "Finger";
		X++;
		ItemSlots[X] = "Back";
		X++;
		ItemSlots[X] = "Misc";
		X++;
		ItemSlots[X] = "Thrown";
		
		//misc
		//Currency
		//Mount
		//bow
		//quest item
		
	}
	
	public String LocateItemType(String Unknown) {
		
		int Location = -1;
		
		for (int X = 1; X < ItemTypes.length ; X++) {
			if ( ItemTypes[X] != null ) {
				Location = Unknown.indexOf(ItemTypes[X]);
				if ( Location != -1 ) {
					return ItemTypes[X];
				}
			}
		}
		return null;
	}

	public String LocateItemSlot(String Unknown) {
		
		int Location = -1;
		
		for (int X = 1; X < ItemSlots.length ; X++) {
			if ( ItemSlots[X] != null ) {
				Location = Unknown.indexOf(ItemSlots[X]);
				if ( Location != -1 ) {
					return ItemSlots[X];
				}
			}
		}
		return null;
	}

	public String LocateItemQuality(String Unknown) {
		
		int Location = -1;
		
		for (int X = 1; X < ItemQualities.length ; X++) {
			if ( ItemQualities[X] != null ) {
				Location = Unknown.indexOf(ItemQualities[X]);
				if ( Location != -1 ) {
					return ItemQualities[X];
				}
			}
		}
		return null;
	}

	public String LocateItemBind(String Unknown) {
		
		int Location = -1;
		
		for (int X = 1; X < ItemBinds.length ; X++) {
			if ( ItemBinds[X] != null ) {
				Location = Unknown.indexOf(ItemBinds[X]);
				if ( Location != -1 ) {
					return ItemBinds[X];
				}
			}
		}
		return null;
	}

	public boolean LocateItemUnique(String Unknown) {
		
		int Location = -1;
		Location = Unknown.indexOf("Unique");
		if ( Location != -1 ) {
			return true;
		}
		return false;
	}

	public int LocateItemLvl(String unknown) {
		
		int Location = -1;
		for (int X = 65; X <= 80 ; X++) {
			Location = unknown.indexOf("Requires Level "+X);
			if ( Location != -1 ) {
				return X;
			}
		}
		return 0;
	}

	public int LocateItemArmor(String unknown) {

		int Location = -1;
		int X = 3000;
		while ( X > 0 ) {
			Location = unknown.indexOf(X+" Armor");
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemStamina(String unknown) {

		int Location = -1;
		int X = 2000;
		while ( X > 0 ) {
			Location = unknown.indexOf(X+" Stamina");
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemIntellect(String unknown) {

		int Location = -1;
		int X = 300;
		while ( X > 0 ) {
			Location = unknown.indexOf(X+" Intellect");
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemSpirit(String unknown) {

		int Location = -1;
		int X = 300;
		while ( X > 0 ) {
			Location = unknown.indexOf(X+" Spirit");
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemAgility(String unknown) {

		int Location = -1;
		int X = 300;
		while ( X > 0 ) {
			Location = unknown.indexOf(X+" Agility");
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemStrength(String unknown) {

		int Location = -1;
		int X = 300;
		while ( X > 0 ) {
			Location = unknown.indexOf(X+" Strength");
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public boolean LocateItemEffect(String unknown) {

		int Location = -1;
		Location = unknown.indexOf("Effect");
		if ( Location != -1 ) {
			return true;
		}
		return false;
	}

	public int LocateItemSpell(String unknown) {
		
		int Location = -1;
		int X = 1000;
		while ( X > 0 ) {
			Location = unknown.indexOf("Increases spell power by "+X);
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemHaste(String unknown) {
		
		int Location = -1;
		int X = 1000;
		while ( X > 0 ) {
			Location = unknown.indexOf("Improves haste rating by "+X);
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemCrit(String unknown) {
		
		int Location = -1;
		int X = 1000;
		while ( X > 0 ) {
			Location = unknown.indexOf("Improves critical strike rating by "+X);
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemHit(String unknown) {
		
		int Location = -1;
		int X = 1000;
		while ( X > 0 ) {
			Location = unknown.indexOf("Improves hit rating by "+X);
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemAP(String unknown) {
		
		int Location = -1;
		int X = 1000;
		while ( X > 0 ) {
			Location = unknown.indexOf("Increases attack power by "+X);
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemExpR(String unknown) {
		
		int Location = -1;
		int X = 100;
		while ( X > 0 ) {
			Location = unknown.indexOf("Increases your expertise rating by "+X);
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemPenetR(String unknown) {
		
		int Location = -1;
		int X = 100;
		while ( X > 0 ) {
			Location = unknown.indexOf("Increases armor penetration rating by "+X);
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemMP5(String unknown) {
		
		int Location = -1;
		int X = 100;
		while ( X > 0 ) {
			Location = unknown.indexOf("Restores "+X+" mana per 5 sec.");
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemSocketY(String unknown) {
		
		int Sockets = 0;
		int Location1 = -1;
		int Location2 = -1;
		int Location3 = -1;
		
		Location1 = unknown.indexOf("Yellow Socket");
		if ( Location1 != -1 ) {
			Sockets ++;
		}
		Location2 = unknown.indexOf("Yellow Socket", (Location1+"Yellow Socket".length()));
		if ( Location2 > -1 ) {
			Sockets ++;
		}
		Location3 = unknown.indexOf("Yellow Socket", (Location2+"Yellow Socket".length()));
		if ( Location3 != -1 ) {
			Sockets ++;
		}

		return Sockets;
	}

	public int LocateItemSocketR(String unknown) {
		
		int Sockets = 0;
		int Location1 = -1;
		int Location2 = -1;
		int Location3 = -1;
		
		Location1 = unknown.indexOf("Red Socket");
		if ( Location1 != -1 ) {
			Sockets ++;
		}
		Location2 = unknown.indexOf("Red Socket", (Location1+"Red Socket".length()));
		if ( Location2 > -1 ) {
			Sockets ++;
		}
		Location3 = unknown.indexOf("Red Socket", (Location2+"Red Socket".length()));
		if ( Location3 != -1 ) {
			Sockets ++;
		}

		return Sockets;
	}

	public int LocateItemSocketB(String unknown) {
		
		int Sockets = 0;
		int Location1 = -1;
		int Location2 = -1;
		int Location3 = -1;
		
		Location1 = unknown.indexOf("Blue Socket");
		if ( Location1 != -1 ) {
			Sockets ++;
		}
		Location2 = unknown.indexOf("Blue Socket", (Location1+"Blue Socket".length()));
		if ( Location2 > -1 ) {
			Sockets ++;
		}
		Location3 = unknown.indexOf("Blue Socket", (Location2+"Blue Socket".length()));
		if ( Location3 != -1 ) {
			Sockets ++;
		}

		return Sockets;
	}

	public int LocateItemSocketM(String unknown) {
		
		int Location1 = -1;
		Location1 = unknown.indexOf("Meta Socket");
		if ( Location1 != -1 ) {
			return 1;
		}
		return 0;
	}

	public int LocateItemMinDmg(String unknown) {
		
		int Location = -1;
		int X = 1000;
		while ( X > 0 ) {
			Location = unknown.indexOf(X+" - ");
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public int LocateItemMaxDmg(String unknown) {
		
		int Location = -1;
		int X = 1000;
		while ( X > 0 ) {
			Location = unknown.indexOf(X+" Damage");
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public double LocateItemSpeed(String unknown) {
		
		int Location = -1;
		
		for (int X = 1; X < ItemSpeeds.length ; X++) {
			if ( ItemSpeeds[X] > 0 ) {
				Location = unknown.indexOf("Speed "+ItemSpeeds[X]);
				if ( Location != -1 ) {
					return ItemSpeeds[X];
				}
			}
		}
		return 0;
	}

	public String LocateItemSocketBonusType(String unknown) {
		
		int Location = -1;
		
		for (int X = 1; X < ItemSocketBonusType.length ; X++) {
			if ( ItemSocketBonusType[X] != null ) {
				Location = unknown.indexOf(ItemSocketBonusType[X]);
				if ( Location != -1 ) {
					//System.out.println("Fant "+ItemSocketBonusType[X]+" på plass #"+Location);
					return ItemSocketBonusType[X];
				}
			}
		}
		return null;
	}

	public int LocateItemSocketBonusAmount(String unknown) {
		
		//System.out.println("Leter etter socket bonus i string="+unknown);
		int Location = -1;
		int X = 20;
		while ( X > 0 ) {
			Location = unknown.indexOf("Socket Bonus: "+X);
			//System.out.println("Location for "+("Socket Bonus: "+X)+"="+Location);
			if ( Location != -1 ) {
				return X;
			}
			X --;
		}

		return 0;
	}

	public boolean LocateItemClass(String unknown, String Class) {

		//System.out.println("Leter etter "+Class);
		int Location = -1;
		Location = unknown.indexOf(Class);
		if ( Location != -1 ) {
			return true;
		}
		return false;
	}

	public String LocateItemProf(String unknown) {
		
		int Location = -1;
		
		for (int X = 1; X < ItemProfession.length ; X++) {
			if ( ItemProfession[X] != null ) {
				Location = unknown.indexOf(ItemProfession[X]);
				if ( Location != -1 ) {
					return "Blacksmithing";
				}
			}
		}
		return null;
	}
	
}
