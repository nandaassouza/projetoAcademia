package br.com.academia.enumClass;

public enum DayWeekEnum {
	SUN("DOMINGO"),
	MON("SEGUNDA"),
	TUE("TERÇA"),
	WEN("QUARTA"),
	THU("QUINTA"),
	FRI("SEXTA"),
	SAT("SÁBADO");
	 
    public String dia;
    DayWeekEnum(String dia) {
    	this.dia = dia;
    }
	
}
