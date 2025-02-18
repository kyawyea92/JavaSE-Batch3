package com.batch3.day13;

public enum WeekDays implements ZooTrainTour{
	MONDAY("Mon"){
		public String getSmartMessage() {
			return "Today is Weekday";
		}
	},
	TUESDAY("TUE"){
		public String getSmartMessage() {
			return "Today is Weekday";
		}
	},
	WEDNESDAY("WED") {
		public String getSmartMessage() {
			return "Today is Weekday";
		}
	},THURSDAY("THUR"){
		public String getSmartMessage() {
			return "Today is Weekday";
		}
	},FRIDAY("FRI"){
		public String getSmartMessage() {
			return "Today is Weekday";
		}
	},SATURDAY("SAT"){
		public String getSmartMessage() {
			return "Today is Weekend";
		}
	},SUNDAY("SUN"){
		public String getSmartMessage() {
			return "Today is Weekday";
		}
	};
	
	private String shortName;
	
	private WeekDays(String shortName){
		this.shortName = shortName;
	}
	
	public String getShortName() {
		return this.shortName;
	}
	
	
	//abstract String getSmartMessage();
	@Override
	public void methodA() {
		System.out.println("This is methoA override from ZooTrainTour interface.");
	}
}
